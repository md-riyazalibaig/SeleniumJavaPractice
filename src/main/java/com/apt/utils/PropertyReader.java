package com.apt.utils;

import java.util.Properties;

import java.io.InputStream;

public class PropertyReader {

	private static PropertyReader propInstance;

	private PropertyReader() {

	}

	public static synchronized PropertyReader getInstance() {
		if (propInstance == null) {
			propInstance = new PropertyReader();
		}
		return propInstance;
	}

	public String getProperty(String propertyName, String propertyFileName) {
		Properties prop = new Properties();
		String empty = "";

		try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName)) {
			prop.load(inputStream);
			if (prop.getProperty(propertyName) != null) {
				empty = prop.getProperty(propertyName);
			}
		} catch (Exception e) {
			Log.fatal("Property value not found for property name: " + propertyName + " in file: " + propertyFileName);
		}
		return empty;
	}

}
