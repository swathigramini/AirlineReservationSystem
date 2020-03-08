package com.capgemini.airlinereservationsystem1.dao;

import java.util.List;

import com.capgemini.airlinereservationsystem1.bean.Admin;
import com.capgemini.airlinereservationsystem1.bean.Availability;
import com.capgemini.airlinereservationsystem1.bean.Flight;
import com.capgemini.airlinereservationsystem1.bean.Manager;
import com.capgemini.airlinereservationsystem1.bean.Passenger;
import com.capgemini.airlinereservationsystem1.bean.Ticket;

public interface AdminDao {
	public boolean adminLogin(String adminName, String adminPassword);

	boolean addManager(Manager manager);

	boolean addFlightCheck(String managerName);

	boolean deleteManager(String managerName);

	boolean updateFlightCheck(String managerName);

	boolean updateManager(Manager manager);

	List<Manager> viewManager();

}
