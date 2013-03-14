package com.richardhoppes.example.common;

import com.richardhoppes.example.exception.NotFoundException;

import java.util.Properties;

public class Settings {

	private Properties configProperties;

	private String getProperty(String property) throws NotFoundException {
		String retVal = configProperties.getProperty(property);
		if(retVal == null) {
			throw new NotFoundException("Property not found: " + property);
		}
		return retVal;
	}

	public String getMode() throws NotFoundException {
		return getProperty("mode");
	}

	public String getJdbcReadWriteDriver() throws NotFoundException {
		return getProperty("jdbc.readWrite.driver");
	}

	public String getJdbcReadWriteUrl() throws NotFoundException {
		return getProperty("jdbc.readWrite.base.url") + "/" + getProperty("jdbc.readWrite.db") + "?" + getProperty("jdbc.readWrite.params");
	}

	public String getJdbcReadWriteUser() throws NotFoundException {
		return getProperty("jdbc.readWrite.user");
	}

	public String getJdbcReadWritePassword() throws NotFoundException {
		return getProperty("jdbc.readWrite.password");
	}

	public Properties getConfigProperties() {
		return configProperties;
	}

	public void setConfigProperties(Properties configProperties) {
		this.configProperties = configProperties;
	}
}
