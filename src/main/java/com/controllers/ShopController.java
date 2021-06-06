package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.models.Dispatch;
import com.models.RequestIceCream;
import com.models.Res;
import com.models.Taste;
import com.repositories.ITerminalBoxRepository;
import com.services.ShopServices;

@CrossOrigin
@RestController
public class ShopController {
	
	@Autowired
	ShopServices shopServices;
	
	@Autowired
	Res res;
	
	@Autowired
	ITerminalBoxRepository terminalBoxRepository;
	
	public ShopController(List<Taste> calendar) {
		super();
	}

	@GetMapping("/healtCheck")
	public String healtCheck() {
		return "healtCheck-Ice-Cream-shop-api";
	}
	
	@GetMapping("/termialBoxes")
	public ResponseEntity<?> getAllTerminalBoxes() {
		try {
			return ResponseEntity.ok(shopServices.getAllTerminalBoxes());
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/tastes")
	public ResponseEntity<?> getAllTastes() {
		try {
			return ResponseEntity.ok(shopServices.getAllTastes());
	
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/productConfiguration")
	public ResponseEntity<?> getProductConfiguration() {
		try {
			return ResponseEntity.ok(shopServices.getProductConfiguration());
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	@PostMapping("/saveOrder")
	public ResponseEntity<?> receiveDispatch(@RequestBody() RequestIceCream requestIceCream) {

		try {
			shopServices.receiveDispatch(requestIceCream);
			this.res.setMensaje("Elemento guardado!");
			return ResponseEntity.ok(res);

		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/getReceiveDispatch")
	public ResponseEntity<?> getReceiveDispatch() {

		try {
			return ResponseEntity.ok(shopServices.getRequestIceCream());
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	@PostMapping("/saveSale")
	public ResponseEntity<?> saveSale(@RequestBody() Dispatch dispatch) {

		try {
			shopServices.saveSale(dispatch);
			res.setMensaje("Elemento guardado!");
			return ResponseEntity.ok(res);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/getDispacherForSales")
	public ResponseEntity<?> getDispacherForSales() {

		try {
			return ResponseEntity.ok(shopServices.getDispacherForSales());
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
