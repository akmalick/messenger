package com.asif.codingethics.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.asif.codingethics.messenger.database.DatabaseClass;
import com.asif.codingethics.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	// public ProfileService() {
	// Profiles.put(1L, new Profile(1, "Hello Kolkata", "Asif"));
	// Profiles.put(2L, new Profile(2, "Hello Basak Bagan", "Rahil"));
	// }


	public ProfileService() {
		profiles.put("Asif", new Profile(1L, "Asif", "Kamran", "Malick"));
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);

	}

}
