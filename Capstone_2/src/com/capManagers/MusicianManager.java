/**

 * 
 */
package com.capManagers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import capDomain.com.Users;
import capDomain.com.Musicians;
import exceptions.com.DBErrorException;

/**
 * @author javauser
 *
 */
public class MusicianManager {

	DataSource ds;

	public MusicianManager(DataSource ds) {
		super();
		this.ds = ds;
	}
	
	public ArrayList<Musicians> getVehicles() throws DBErrorException {
		ArrayList<Musicians> vehicles = new ArrayList<Musicians>();

		Connection connection = null;
		try {
			
			connection = ds.getConnection();

			PreparedStatement ps = connection.prepareStatement("select * from vehicles");
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				vehicles.add(new Musicians( resultSet.getString("Name"),
									resultSet.getInt("age"),
									resultSet.getString("location"),
									resultSet.getString("instrument"),
									resultSet.getInt("Experience")
									));
			}

			resultSet.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBErrorException();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return vehicles;
	}

	public Musicians getMusiciansWithID(int id) throws DBErrorException {
		Connection connection = null;
		Musicians musicians = null;
		
		try {
			
			connection = ds.getConnection();

			PreparedStatement ps = connection.prepareStatement("select * from musicians where id = ?");
			ps.setInt(1, id);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				musicians = new Musicians( resultSet.getInt("id"),
									resultSet.getString("make"),
									resultSet.getString("model"),
									resultSet.getString("color"),
									resultSet.getInt("theYear"),
									resultSet.getInt("mileage")
									);
			}

			resultSet.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBErrorException();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return musicians;
	}

	public boolean updateMusician(Musicians v) throws DBErrorException {
		
		boolean updateSuccessful = false;
		
		Connection connection = null;
		
		try {
			
			connection = ds.getConnection();

			String theSqlQueryString = "update VEHICLES set make = ?, "
					+ "model = ?, theYear = ?, mileage = ?, color = ? where id = ?";
			
			PreparedStatement ps = connection.prepareStatement(theSqlQueryString);
			ps.setString(1, v.getName());
			ps.setString(2, v.getInstrument());
			ps.setInt(3, v.getExperience());
			ps.setInt(4, v.getAge());
			
			int theUpdatedCount = ps.executeUpdate();
			if (theUpdatedCount >= 1) {
				updateSuccessful = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBErrorException();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	
		return updateSuccessful;
	}

	public boolean addVehicleForValues(String make, String model, String color,
			int year, int mileage) throws DBErrorException {
		
		// INSERT INTO VEHICLES (make, model, theYear, mileage, color)  values ('Lincoln', 'Navigator', 1978, 300000, 'Silver');
		boolean updateSuccessful = false;
		Connection connection = null;
		
		try {
			
			connection = ds.getConnection();

			String theSqlQueryString = "INSERT INTO VEHICLES (make, model, theYear, mileage, color)  values (?, ?, ?, ?, ?)";
			
			PreparedStatement ps = connection.prepareStatement(theSqlQueryString);
			ps.setString(1, make);
			ps.setString(2, model);
			ps.setInt(3, year);
			ps.setInt(4, mileage);
			ps.setString(5, color);
			
			int theUpdatedCount = ps.executeUpdate();
			if (theUpdatedCount >= 1) {
				updateSuccessful = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBErrorException();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return updateSuccessful;
	}

	public boolean deleteVehicleWithID(int id) throws DBErrorException {
		boolean updateSuccessful = false;
		Connection connection = null;
		
		try {
			
			connection = ds.getConnection();

			String theSqlQueryString = "DELETE FROM VEHICLES WHERE ID = ?";
			
			PreparedStatement ps = connection.prepareStatement(theSqlQueryString);
			ps.setInt(1, id);
			
			int theUpdatedCount = ps.executeUpdate();
			if (theUpdatedCount >= 1) {
				updateSuccessful = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBErrorException();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return updateSuccessful;
	}

	public ArrayList<Musicians> getMusician() {
		// TODO Auto-generated method stub
		return null;
	}
}