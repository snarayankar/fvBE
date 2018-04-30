package com.foodviolatorsrest.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "HIST_SEATTLE")
public class HistSeattle {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "INSP_DATE")
	private LocalDateTime inspectionDate;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "ADDR_1")
	private String address1;

	@Column(name = "ADDR_2")
	private String address2;

	@Column(name = "CITY")
	private String city;

	@Column(name = "ZIP_CODE")
	private Long zipCode;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "INSP_TYPE")
	private String inspectionType;

	@Column(name = "INSP_SCORE")
	private Long inspectionScore; // Long

	@Column(name = "INSP_RESULT")
	private String inspectionResult;

	@Column(name = "INSP_CLOSED_BUS")
	private Long inspectionClosedBus;

	@Column(name = "VIOLATION_TYPE")
	private String violationType;

	@Column(name = "VIOLATION_DESC")
	private String violationDescription;

	@Column(name = "VIOLATION_PTS")
	private Long violationPoints;

	@Column(name = "BUSINESS_ID")
	private String businessId;

	@Column(name = "INSP_SERIAL_NUM")
	private String inspectionSerialNumber;

	@Column(name = "VIOLATION_RECORD_ID")
	private String violationRecordId;

	@Column(name = "ADD_DT")
	private LocalDateTime addDate;

	@Column(name = "UPD_DT")
	private LocalDateTime updateDate;

	@Column(name = "ACTIVE_IND")
	private Long activeInd;

}
