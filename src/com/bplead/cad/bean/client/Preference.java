package com.bplead.cad.bean.client;

import com.bplead.cad.bean.io.Container;

import priv.lee.cad.model.ClientTemporary;

public class Preference implements ClientTemporary {

	private static final long serialVersionUID = 5887451743348654756L;
	private CaxaTemporary caxa;
	private Container container;
	private String server;

	public Preference() {

	}

	public Preference(CaxaTemporary caxa, Container container, String server) {
		this.caxa = caxa;
		this.container = container;
		this.server = server;
	}

	public CaxaTemporary getCaxa() {
		return caxa;
	}

	public Container getContainer() {
		return container;
	}

	public String getServer() {
		return server;
	}

	public void setCaxa(CaxaTemporary caxa) {
		this.caxa = caxa;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public void setServer(String server) {
		this.server = server;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Preference [caxa=");
		builder.append(caxa);
		builder.append(", container=");
		builder.append(container);
		builder.append(", server=");
		builder.append(server);
		builder.append("]");
		return builder.toString();
	}
}
