package entities;

import java.util.Date;

public class Transaction {
	private Integer superiorCode;
	private String superiorName;
	private Integer agencyCode;
	private String agencyName;
	private Integer unityCode;
	private String unityName;
	private Integer statementYear;
	private Integer statementMonth;
	private String carrierCpf;
	private String carrierName;
	private String favoredCpfCnpj;
	private String favoredName;
	private String transactionType;
	private Date transactionDate;
	private Double transactionValue;
	
	public Transaction(){
	}

	public Transaction(Integer superiorCode, String superiorName, Integer agencyCode, String agencyName,
			Integer unityCode, String unityName, Integer statementYear, Integer statementMonth, String carrierCpf,
			String carrierName, String favoredCpfCnpj, String favoredName, String transactionType, Date transactionDate,
			Double transactionValue) {
		this.superiorCode = superiorCode;
		this.superiorName = superiorName;
		this.agencyCode = agencyCode;
		this.agencyName = agencyName;
		this.unityCode = unityCode;
		this.unityName = unityName;
		this.statementYear = statementYear;
		this.statementMonth = statementMonth;
		this.carrierCpf = carrierCpf;
		this.carrierName = carrierName;
		this.favoredCpfCnpj = favoredCpfCnpj;
		this.favoredName = favoredName;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.transactionValue = transactionValue;
	}

	public Integer getSuperiorCode() {
		return superiorCode;
	}

	public String getSuperiorName() {
		return superiorName;
	}

	public Integer getAgencyCode() {
		return agencyCode;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public Integer getUnityCode() {
		return unityCode;
	}

	public String getUnityName() {
		return unityName;
	}

	public Integer getStatementYear() {
		return statementYear;
	}

	public Integer getStatementMonth() {
		return statementMonth;
	}

	public String getCarrierCpf() {
		return carrierCpf;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public String getFavoredCpfCnpj() {
		return favoredCpfCnpj;
	}

	public String getFavoredName() {
		return favoredName;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public Double getTransactionValue() {
		return transactionValue;
	}

	
	
}
