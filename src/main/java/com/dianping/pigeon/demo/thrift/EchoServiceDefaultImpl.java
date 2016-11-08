/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.thrift;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dianping.pigeon.demo.UserService.User;

public class EchoServiceDefaultImpl implements EchoService {

	private static final Logger logger = LoggerFactory.getLogger(EchoServiceDefaultImpl.class);

	@Override
	public String echo(String input) {
		System.out.println(input);
		return "echo:" + input;
	}

	@Override
	public String echo2(Map<User, Double> users, int size) throws IOException {
		// throw new IOException("error raised:" + users);
		return "echo2:" + users + ",size:" + size;
	}

}