package com.bplead.cad.bean.io;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings("serial")
public class MPMLine implements Serializable {

	@JacksonXmlProperty(localName = "SZDL09")
	private String capacity;
	@JacksonXmlProperty(localName = "SZDL02")
	private String diameter;
	@JacksonXmlProperty(localName = "SZMMCU")
	private String distribute;
	@JacksonXmlProperty(localName = "SZDL06")
	private String forging_d;
	@JacksonXmlProperty(localName = "SZDL05")
	private String forging_D;
	@JacksonXmlProperty(localName = "SZDL08")
	private String forging_l;
	@JacksonXmlProperty(localName = "SZDL07")
	private String forging_L;
	@JacksonXmlProperty(localName = "SZDL11")
	private String heatingTime_Hz;
	@JacksonXmlProperty(localName = "SZDL10")
	private String heatingTime_min;
	@JacksonXmlProperty(localName = "id")
	private String id;
	@JacksonXmlProperty(localName = "SZDL01")
	private String length;
	@JacksonXmlProperty(localName = "jgdw")
	private String machiningUnit;
	@JacksonXmlProperty(localName = "SZWMCU")
	private String machiningUnitNum;
	@JacksonXmlProperty(localName = "SZVEND")
	private String mainSupplier;
	@JacksonXmlProperty(localName = "SZTRT")
	private String mpmPlanType;
	@JacksonXmlProperty(localName = "SZDSC1")
	private String operationName;
	@JacksonXmlProperty(localName = "SZOPSQ")
	private String operationNum;
	@JacksonXmlProperty(localName = "SZDL12")
	private String page;
	@JacksonXmlProperty(localName = "SZSETL")
	private String prepareWorker;
	@JacksonXmlProperty(localName = "SZKITL")
	private String projectNum;
	@JacksonXmlProperty(localName = "SZDL04")
	private String roughcastSize_L;
	@JacksonXmlProperty(localName = "SZDL03")
	private String roughcastSize_φ;
	@JacksonXmlProperty(localName = "SZRUNM")
	private String runningMachine;
	@JacksonXmlProperty(localName = "SZRUNL")
	private String runningWorker;
	@JacksonXmlProperty(localName = "SZMCU")
	private String workCenter;
	@JacksonXmlProperty(localName = "SZTIMB")
	private String workTimeBase;

	public String getCapacity() {
		return capacity;
	}

	public String getDiameter() {
		return diameter;
	}

	public String getDistribute() {
		return distribute;
	}

	public String getForging_d() {
		return forging_d;
	}

	public String getForging_D() {
		return forging_D;
	}

	public String getForging_l() {
		return forging_l;
	}

	public String getForging_L() {
		return forging_L;
	}

	public String getHeatingTime_Hz() {
		return heatingTime_Hz;
	}

	public String getHeatingTime_min() {
		return heatingTime_min;
	}

	public String getId() {
		return id;
	}

	public String getLength() {
		return length;
	}

	public String getMachiningUnit() {
		return machiningUnit;
	}

	public String getMachiningUnitNum() {
		return machiningUnitNum;
	}

	public String getMainSupplier() {
		return mainSupplier;
	}

	public String getMpmPlanType() {
		return mpmPlanType;
	}

	public String getOperationName() {
		return operationName;
	}

	public String getOperationNum() {
		return operationNum;
	}

	public String getPage() {
		return page;
	}

	public String getPrepareWorker() {
		return prepareWorker;
	}

	public String getProjectNum() {
		return projectNum;
	}

	public String getRoughcastSize_L() {
		return roughcastSize_L;
	}

	public String getRoughcastSize_φ() {
		return roughcastSize_φ;
	}

	public String getRunningMachine() {
		return runningMachine;
	}

	public String getRunningWorker() {
		return runningWorker;
	}

	public String getWorkCenter() {
		return workCenter;
	}

	public String getWorkTimeBase() {
		return workTimeBase;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public void setDistribute(String distribute) {
		this.distribute = distribute;
	}

	public void setForging_d(String forging_d) {
		this.forging_d = forging_d;
	}

	public void setForging_D(String forging_D) {
		this.forging_D = forging_D;
	}

	public void setForging_l(String forging_l) {
		this.forging_l = forging_l;
	}

	public void setForging_L(String forging_L) {
		this.forging_L = forging_L;
	}

	public void setHeatingTime_Hz(String heatingTime_Hz) {
		this.heatingTime_Hz = heatingTime_Hz;
	}

	public void setHeatingTime_min(String heatingTime_min) {
		this.heatingTime_min = heatingTime_min;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public void setMachiningUnit(String machiningUnit) {
		this.machiningUnit = machiningUnit;
	}

	public void setMachiningUnitNum(String machiningUnitNum) {
		this.machiningUnitNum = machiningUnitNum;
	}

	public void setMainSupplier(String mainSupplier) {
		this.mainSupplier = mainSupplier;
	}

	public void setMpmPlanType(String mpmPlanType) {
		this.mpmPlanType = mpmPlanType;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public void setOperationNum(String operationNum) {
		this.operationNum = operationNum;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public void setPrepareWorker(String prepareWorker) {
		this.prepareWorker = prepareWorker;
	}

	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}

	public void setRoughcastSize_L(String roughcastSize_L) {
		this.roughcastSize_L = roughcastSize_L;
	}

	public void setRoughcastSize_φ(String roughcastSize_φ) {
		this.roughcastSize_φ = roughcastSize_φ;
	}

	public void setRunningMachine(String runningMachine) {
		this.runningMachine = runningMachine;
	}

	public void setRunningWorker(String runningWorker) {
		this.runningWorker = runningWorker;
	}

	public void setWorkCenter(String workCenter) {
		this.workCenter = workCenter;
	}

	public void setWorkTimeBase(String workTimeBase) {
		this.workTimeBase = workTimeBase;
	}
}
