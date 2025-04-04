package com.bluefletch.motorola;

/**
 * Simple class for holding RFID data
 */
public class RFIDScan {
	public String LabelType;
	public String RFIDTag;
	public RFIDScan (String label, String code){
		this.LabelType = label;
		this.RFIDTag = code;
	}
}
