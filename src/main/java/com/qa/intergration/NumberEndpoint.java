package com.qa.intergration;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/number")
public class NumberEndpoint {

	@Path("/random")
	@GET
	public String getAllAccounts() {
		Random random = new Random();
		int result = random.nextInt();
		return String.valueOf(result);
	}

}
