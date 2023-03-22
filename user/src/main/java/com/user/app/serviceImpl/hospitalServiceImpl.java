package com.user.app.serviceImpl;

import com.user.app.service.hospitalService;

import java.util.List;

import com.user.app.dao.hospitalDao;

public class hospitalServiceImpl implements hospitalService{
	
	private hospitalDao HospitalDao;
	
	public hospitalServiceImpl(hospitalDao HospitalDao) {
        this.HospitalDao = HospitalDao;
    }

    public List getCitaById(Integer citaId) {
        return (List) HospitalDao.getCitaById(citaId);
    }

}