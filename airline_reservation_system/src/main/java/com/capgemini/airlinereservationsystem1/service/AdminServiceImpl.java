package com.capgemini.airlinereservationsystem1.service;

import java.util.List;

import com.capgemini.airlinereservationsystem1.bean.Manager;
import com.capgemini.airlinereservationsystem1.bean.Passenger;
import com.capgemini.airlinereservationsystem1.dao.AdminDao;
import com.capgemini.airlinereservationsystem1.dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminService{
	
	AdminDao adminDao=new AdminDaoImpl();

	public boolean adminLogin(String adminName, String adminPassword) {
		return adminDao.adminLogin(adminName, adminPassword);
	}

	public boolean addManager(Manager manager) {
		return adminDao.addManager(manager);
	}

	public boolean addFlightCheck(String managerName) {
		return adminDao.addFlightCheck(managerName);
	}

	public boolean deleteManager(String managerName) {
		return adminDao.deleteManager(managerName);
	}

	public boolean updateFlightCheck(String managerName) {
		return adminDao.updateFlightCheck(managerName);
	}

	public void updateManager(Manager manager) {
		return;
	}

	public List<Manager> viewManager() {
		return adminDao.viewManager();
	}


}
