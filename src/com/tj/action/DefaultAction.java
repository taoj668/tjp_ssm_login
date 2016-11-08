package com.tj.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class DefaultAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		logger.info("默认action！！！！！！！！！！1");
		return "error";
	}
}
