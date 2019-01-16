package com.cg.mpa.service;

import java.util.List;

import com.cg.mpa.exception.MPAException;
import com.cg.mpa.model.Mobile;

public interface MobileService {

	public boolean validateFields(Mobile mobile);

	public int insertDetails(Mobile mobile) throws MPAException;

	public List<String> viewDetails(Mobile mobile);

	

}
