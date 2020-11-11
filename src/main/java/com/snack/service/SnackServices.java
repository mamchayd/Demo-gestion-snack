package com.snack.service;

import com.snack.model.Menu;
import com.snack.model.Suppliment;

public interface SnackServices {
	public Menu getMenuByName(String name);
	public Suppliment getSupplimentByName(String name);

}
