package com.simple.project.sbsp;

import com.simple.project.sbsp.domain.UserData;

public class SbspApplication {

	public static void main(String[] args) {
		UserData userData = new UserData("Kim", "Suwon", "Golf");
		System.out.println(userData.getUserAddress());
	}

}