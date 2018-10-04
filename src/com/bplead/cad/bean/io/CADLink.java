package com.bplead.cad.bean.io;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings("serial")
public class CADLink implements Serializable {

	@JacksonXmlProperty(localName = "description")
	private String description;
	@JacksonXmlProperty(localName = "jdeNum")
	private String jdeNum;
	@JacksonXmlProperty(localName = "material")
	private String material;
	@JacksonXmlProperty(localName = "name")
	private String name;
	@JacksonXmlProperty(localName = "number")
	private String number;
	@JacksonXmlProperty(localName = "order")
	private String order;
	@JacksonXmlProperty(localName = "quantity")
	private String quantity;
	@JacksonXmlProperty(localName = "singleWeight")
	private String singleWeight;
	@JacksonXmlProperty(localName = "weight")
	private String weight;

	public CADLink() {

	}

	public String getDescription() {
		return description;
	}

	public String getJdeNum() {
		return jdeNum;
	}

	public String getMaterial() {
		return material;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getOrder() {
		return order;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getSingleWeight() {
		return singleWeight;
	}

	public String getWeight() {
		return weight;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setJdeNum(String jdeNum) {
		this.jdeNum = jdeNum;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setSingleWeight(String singleWeight) {
		this.singleWeight = singleWeight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CADLink [description=");
		builder.append(description);
		builder.append(", jdeNum=");
		builder.append(jdeNum);
		builder.append(", material=");
		builder.append(material);
		builder.append(", name=");
		builder.append(name);
		builder.append(", number=");
		builder.append(number);
		builder.append(", order=");
		builder.append(order);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", singleWeight=");
		builder.append(singleWeight);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}
}
