package com.acan.criminalintent;

import java.util.UUID;

public class Crime {
	private UUID mId;
	private String mTitle;
	
	public Crime() {
		// TODO Auto-generated constructor stub
		mId = UUID.randomUUID();
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public UUID getmId() {
		return mId;
	}
	
}
