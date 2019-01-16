package com.cg.mpa.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.mpa.dao.MobileDAO;
import com.cg.mpa.dao.MobileDAOImp;
import com.cg.mpa.exception.MPAException;
import com.cg.mpa.model.Mobile;

public class MobileServiceImp implements MobileService {

List<String> list=new ArrayList<>();
MobileDAO mobileDao=(MobileDAO) new MobileDAOImp();
	public boolean validateFields(Mobile mobile) {
		// TODO Auto-generated method stub
	
	return false;
	

}

@Override
public int insertDetails(Mobile mobile) throws MPAException {
	// TODO Auto-generated method stub
	return mobileDao.insertDetails(mobile);
}

@Override
public List<String> viewDetails(Mobile mobile) {
	// TODO Auto-generated method stub
	return mobileDao.viewDetails(mobile);
}
}