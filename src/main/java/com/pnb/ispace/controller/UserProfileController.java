package com.pnb.ispace.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pnb.ispace.model.UserProfile;

@RestController
public class UserProfileController {

	@GetMapping("/user/{id}")
	public ResponseEntity getCustomer(@PathVariable("id") Long id) {

		UserProfile userProfile = new UserProfile(123L, "Par", "R", "pmrreddy@xxxXxxxx.com", "1234556");
		if (userProfile == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(userProfile, HttpStatus.OK);
	}
}
