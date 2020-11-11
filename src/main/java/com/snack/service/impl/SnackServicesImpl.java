package com.snack.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snack.model.Menu;
import com.snack.model.Suppliment;
import com.snack.repository.MenuRepository;
import com.snack.repository.SupplimentRepository;
import com.snack.service.SnackServices;

@Service
public class SnackServicesImpl implements SnackServices {

	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	private SupplimentRepository suppRepository;
	
	@Override
	public Menu getMenuByName(String name) {
		
		return menuRepository.findByName(name);
	}

	@Override
	public Suppliment getSupplimentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
