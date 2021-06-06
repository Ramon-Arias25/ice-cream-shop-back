package com.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Cone;
import com.models.Cup;
import com.models.Dispatch;
import com.models.IProductConfiguration;
import com.models.Pot;
import com.models.RequestIceCream;
import com.models.Taste;
import com.models.TerminalBox;
import com.repositories.IDispatchRepository;
import com.repositories.ITasteRepository;
import com.repositories.ITerminalBoxRepository;

@Service
public class ShopServices {
	final int MAX_CONE_COUNT_TASTE = 2;
	final int MAX_CUP_COUNT_TASTE = 3;
	final int MAX_POT_COUNT_TASTE = 4;

	List<RequestIceCream> listRequestIceCream = new ArrayList<>();

	@Autowired
	ITerminalBoxRepository terminalBoxRepository;

	@Autowired
	ITasteRepository tasteRepository;
	
	@Autowired
	IDispatchRepository dispatchRepository;

	public List<TerminalBox> getAllTerminalBoxes() {
		return terminalBoxRepository.findAll();
	}

	public List<Taste> getAllTastes() {
		return tasteRepository.findAll();
	}

	public List<IProductConfiguration> getProductConfiguration() {
		List<IProductConfiguration> listProductConfiguration = new ArrayList<>();
		Cone cone = new Cone();
		cone.setMaxCountTaste(MAX_CONE_COUNT_TASTE);
		listProductConfiguration.add(cone);

		Cup cup = new Cup();
		cup.setMaxCountTaste(MAX_CONE_COUNT_TASTE);
		listProductConfiguration.add(cup);

		Pot pot = new Pot();
		pot.setMaxCountTaste(MAX_CONE_COUNT_TASTE);
		listProductConfiguration.add(pot);

		return listProductConfiguration;
	}

	public void receiveDispatch(RequestIceCream requestIceCream) {
		listRequestIceCream.add(requestIceCream);
	}

	public List<RequestIceCream> getRequestIceCream() {
		return listRequestIceCream;
	}

	public void saveSale(Dispatch dispatch) {
		listRequestIceCream.remove(listRequestIceCream.get(dispatch.getId()-1));
		System.out.println(dispatch.toString());
		dispatchRepository.save(dispatch);
	}

	public Dispatch getDispacherForSales() {
		List<Dispatch> allDispatch = dispatchRepository.findAll();
		Map<Integer, List<Dispatch>> mapDispatch = allDispatch.stream().collect(Collectors.groupingBy(x -> x.getDispatcherId()));
		
		System.err.println("sfsfsf");
	//	Map<Integer, List<Dispatch>> mapDispatch = allDispatch.stream().collect(Collectors.groupingBy(Function.identity(),Like));
		
		return null;
	}
}
