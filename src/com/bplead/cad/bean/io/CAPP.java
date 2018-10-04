package com.bplead.cad.bean.io;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "plminfo")
public class CAPP implements AttachmentModel {

	private static final long serialVersionUID = -6586845584942195940L;
	@JacksonXmlProperty(localName = "attachment")
	private List<Attachment> attachments = new ArrayList<Attachment>();
	@JacksonXmlProperty(localName = "kpmc")
	private String cardName;
	@JacksonXmlProperty(localName = "fcmc")
	private String factoryName;
	@JacksonXmlProperty(localName = "jdecode")
	private String jdeNum;
	@JacksonXmlProperty(localName = "GYGCMC")
	private String manuRegulationName;
	@JacksonXmlProperty(localName = "clph")
	private String materialBrandNum;
	@JacksonXmlProperty(localName = "clcc")
	private String materialSize;
	@JacksonXmlElementWrapper(localName = "partlist")
	@JacksonXmlProperty(localName = "partinfo")
	private List<MPMPart> mpmParts = new ArrayList<MPMPart>();
	@JacksonXmlProperty(localName = "gylxlx")
	private String mpmPlanType;
	@JacksonXmlProperty(localName = "gy")
	private String pageSize;
	@JacksonXmlProperty(localName = "ljmc")
	private String partName;
	@JacksonXmlProperty(localName = "ljdh")
	private String partNum;
	@JacksonXmlProperty(localName = "cpmc")
	private String productName;
	@JacksonXmlProperty(localName = "cpdh")
	private String productNum;

	@Override
	public List<Attachment> getAttachments() {
		return attachments;
	}

	public String getCardName() {
		return cardName;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public String getJdeNum() {
		return jdeNum;
	}

	public String getManuRegulationName() {
		return manuRegulationName;
	}

	public String getMaterialBrandNum() {
		return materialBrandNum;
	}

	public String getMaterialSize() {
		return materialSize;
	}

	public List<MPMPart> getMpmParts() {
		return mpmParts;
	}

	public String getMpmPlanType() {
		return mpmPlanType;
	}

	public String getPageSize() {
		return pageSize;
	}

	public String getPartName() {
		return partName;
	}

	public String getPartNum() {
		return partNum;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductNum() {
		return productNum;
	}

	@Override
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public void setJdeNum(String jdeNum) {
		this.jdeNum = jdeNum;
	}

	public void setManuRegulationName(String manuRegulationName) {
		this.manuRegulationName = manuRegulationName;
	}

	public void setMaterialBrandNum(String materialBrandNum) {
		this.materialBrandNum = materialBrandNum;
	}

	public void setMaterialSize(String materialSize) {
		this.materialSize = materialSize;
	}

	public void setMpmParts(List<MPMPart> mpmParts) {
		this.mpmParts = mpmParts;
	}

	public void setMpmPlanType(String mpmPlanType) {
		this.mpmPlanType = mpmPlanType;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
}
