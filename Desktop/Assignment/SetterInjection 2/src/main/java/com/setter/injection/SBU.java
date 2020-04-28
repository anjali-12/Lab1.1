package com.setter.injection;

public class SBU {

	String sbuild;
	String sbuName;
	String sbuHead;
	public String getSbuild() {
		return sbuild;
	}
	public void setSbuild(String sbuild) {
		this.sbuild = sbuild;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public void getSbuDetails() {
		System.out.println("sbu details=SBU\n sbuCodes="+sbuild+" sbuHead="+sbuHead+" sbuNames="+sbuName);
	}
}
