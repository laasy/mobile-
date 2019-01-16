package com.cg.mpa.dao;

import java.util.List;

import com.cg.mpa.exception.MPAException;
import com.cg.mpa.model.Mobile;

public interface MobileDAO {

	public int insertDetails(Mobile mobile) throws MPAException;

	public List<String> viewDetails(Mobile mobile);

}
