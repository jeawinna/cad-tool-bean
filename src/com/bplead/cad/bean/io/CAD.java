package com.bplead.cad.bean.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import priv.lee.cad.util.XmlUtils;

@JacksonXmlRootElement(localName = "root")
public class CAD implements DetailModel, AttachmentModel {

	private static final long serialVersionUID = 2392245310325963033L;

	public static CAD newInstance(File file) {
		return XmlUtils.read(file, CAD.class);
	}

	@JacksonXmlProperty(localName = "attachment")
	private List<Attachment> attachments = new ArrayList<Attachment>();
	@JacksonXmlProperty(localName = "hbsh")
	private String composing;
	@JacksonXmlProperty(localName = "detail")
	private List<CADLink> detail = new ArrayList<CADLink>();
	@JacksonXmlProperty(localName = "detailNum")
	private String detailNum;
	@JacksonXmlProperty(localName = "indexPage")
	private String indexPage;
	@JacksonXmlProperty(localName = "jdeNum")
	private String jdeNum;
	@JacksonXmlProperty(localName = "material")
	private String material;
	@JacksonXmlProperty(localName = "name")
	private String name;
	@JacksonXmlProperty(localName = "number")
	private String number;
	@JacksonXmlProperty(localName = "pageSize")
	private String pageSize;
	@JacksonXmlProperty(localName = "proportion")
	private String proportion;
	@JacksonXmlProperty(localName = "size")
	private String size;
	@JacksonXmlProperty(localName = "weight")
	private String weight;

	@Override
	public List<Attachment> getAttachments() {
		return attachments;
	}

	public String getComposing() {
		return composing;
	}

	@Override
	public List<CADLink> getDetail() {
		return detail;
	}

	public String getDetailNum() {
		return detailNum;
	}

	public String getIndexPage() {
		return indexPage;
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

	public String getPageSize() {
		return pageSize;
	}

	public String getProportion() {
		return proportion;
	}

	public String getSize() {
		return size;
	}

	public String getWeight() {
		return weight;
	}

	@Override
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public void setComposing(String composing) {
		this.composing = composing;
	}

	public void setDetail(List<CADLink> detail) {
		this.detail = detail;
	}

	public void setDetailNum(String detailNum) {
		this.detailNum = detailNum;
	}

	public void setIndexPage(String indexPage) {
		this.indexPage = indexPage;
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

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public void setProportion(String proportion) {
		this.proportion = proportion;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CAD [detail=");
		builder.append(detail);
		builder.append(", detailNum=");
		builder.append(detailNum);
		builder.append(", indexPage=");
		builder.append(indexPage);
		builder.append(", jdeNum=");
		builder.append(jdeNum);
		builder.append(", material=");
		builder.append(material);
		builder.append(", name=");
		builder.append(name);
		builder.append(", number=");
		builder.append(number);
		builder.append(", pageSize=");
		builder.append(pageSize);
		builder.append(", proportion=");
		builder.append(proportion);
		builder.append(", size=");
		builder.append(size);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}
}
