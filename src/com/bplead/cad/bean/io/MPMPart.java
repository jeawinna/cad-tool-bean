package com.bplead.cad.bean.io;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MPMPart implements Serializable, DetailModel {

	private static final long serialVersionUID = -943041750292223333L;
	@JacksonXmlProperty(localName = "line")
	List<MPMLine> detail = new ArrayList<MPMLine>();
	@JacksonXmlProperty(localName = "id")
	private String id;
	@JacksonXmlProperty(localName = "SZKITL")
	private String jdeNum;
	@JacksonXmlProperty(localName = "SZOPSQ")
	private String operationNum;

	@Override
	public List<MPMLine> getDetail() {
		return detail;
	}

	public String getId() {
		return id;
	}

	public String getJdeNum() {
		return jdeNum;
	}


	public String getOperationNum() {
		return operationNum;
	}

	public void setDetail(List<MPMLine> detail) {
		this.detail = detail;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setJdeNum(String jdeNum) {
		this.jdeNum = jdeNum;
	}

	public void setOperationNum(String operationNum) {
		this.operationNum = operationNum;
	}
}
