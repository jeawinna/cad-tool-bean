package com.bplead.cad.bean.client;

import priv.lee.cad.model.ClientTemporary;

public class CaxaTemporary implements ClientTemporary {

	private static final long serialVersionUID = -2920420379604912729L;
	private String cache;
	private String location;

	public CaxaTemporary() {

	}

	public CaxaTemporary(String cache, String location) {
		this.cache = cache;
		this.location = location;
	}

	public String getCache() {
		return cache;
	}

	public String getLocation() {
		return location;
	}

	public void setCache(String cache) {
		this.cache = cache;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CaxaTemporary [cache=");
		builder.append(cache);
		builder.append(", location=");
		builder.append(location);
		builder.append("]");
		return builder.toString();
	}
}
