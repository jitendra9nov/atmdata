/*  © 2022 */
package com.bank.atm.utils;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * This is Utility class containing reusable utility methods .
 *
 * @author jitendrabhadouriya
 */
public class ApiUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApiUtil.class);

	private static final ObjectMapper MAPPER = new ObjectMapper();

	/**
	 * 
	 * 
	 * /** This method converts Java Beans into Json String by serialising the
	 * object
	 *
	 * @param obj      - object to be converted into json string
	 * @param isPretty - true if want to format json; else false
	 * @return
	 */
	public static String writeValueAsString(final Object obj, final boolean isPretty) {

		String stringJson = null;

		try {
			final ObjectWriter objWriter = isPretty ? MAPPER.writerWithDefaultPrettyPrinter() : MAPPER.writer();

			stringJson = objWriter.writeValueAsString(obj);
		} catch (final JsonProcessingException e) {
			LOGGER.warn("Failed while serializing given Java value as a String", e);
		}
		return stringJson;
	}

	/**
	 * @param urlString
	 * @return
	 */
	public static boolean isValidURL(String urlString) {
		try {
			URL url = new URL(urlString);
			url.toURI();
			return true;
		} catch (Exception e) {

			LOGGER.warn("Provided urlString {} is not a valid URL", urlString);
			return false;
		}
	}

	private ApiUtil() {

		throw new IllegalStateException("Utility class should not be instanciated");
	}
}
