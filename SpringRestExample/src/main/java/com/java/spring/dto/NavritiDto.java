package com.java.spring.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreProperties
@JsonIgnoreType
public class NavritiDto {

	private Long ideaId;
	private Long sapId;
	private String ideaStage;
	private String stageOutCome;
	private String SubmissionDate;
	private String portfolio;
	private String applicationName;
	private String submittedBy;
	private String ideaClassification;
	private String problemStatement;
	private String solutionDescription;
	private String ideationDate;
	private Long perHourDollarRate;
	private Long annualEffortSavings;
	private String smeReviewedDate;
	private String councilReviewedDate;
	private String clientReviewedDate;
	private String implementationDate;
	private Long savings;
	private Integer elapsedTime;
	private String client;
	private String comments;
	private String technology;
	private String errorCode;
	private String errorMessage;
	/**
	 * @return the ideaId
	 */
	public Long getIdeaId() {
		return ideaId;
	}
	/**
	 * @param ideaId the ideaId to set
	 */
	public void setIdeaId(Long ideaId) {
		this.ideaId = ideaId;
	}
	/**
	 * @return the sapId
	 */
	public Long getSapId() {
		//hardcoded value needs to replace once session has been implimented
		return sapId;
	}
	/**
	 * @param sapId the sapId to set
	 */
	public void setSapId(Long sapId) {
		this.sapId = sapId;
	}
	/**
	 * @return the ideaStage
	 */
	public String getIdeaStage() {
		return ideaStage;
	}
	/**
	 * @param ideaStage the ideaStage to set
	 */
	public void setIdeaStage(String ideaStage) {
		this.ideaStage = ideaStage;
	}
	/**
	 * @return the stageOutCome
	 */
	public String getStageOutCome() {
		return stageOutCome;
	}
	/**
	 * @param stageOutCome the stageOutCome to set
	 */
	public void setStageOutCome(String stageOutCome) {
		this.stageOutCome = stageOutCome;
	}
	/**
	 * @return the submissionDate
	 */
	public String getSubmissionDate() {
		return SubmissionDate;
	}
	/**
	 * @param submissionDate the submissionDate to set
	 */
	public void setSubmissionDate(String submissionDate) {
		SubmissionDate = submissionDate;
	}
	/**
	 * @return the portfolio
	 */
	public String getPortfolio() {
		return portfolio;
	}
	/**
	 * @param portfolio the portfolio to set
	 */
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}
	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	/**
	 * @return the submittedBy
	 */
	public String getSubmittedBy() {
		return submittedBy;
	}
	/**
	 * @param submittedBy the submittedBy to set
	 */
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}
	/**
	 * @return the ideaClassification
	 */
	public String getIdeaClassification() {
		return ideaClassification;
	}
	/**
	 * @param ideaClassification the ideaClassification to set
	 */
	public void setIdeaClassification(String ideaClassification) {
		this.ideaClassification = ideaClassification;
	}
	/**
	 * @return the problemStatement
	 */
	public String getProblemStatement() {
		return problemStatement;
	}
	/**
	 * @param problemStatement the problemStatement to set
	 */
	public void setProblemStatement(String problemStatement) {
		this.problemStatement = problemStatement;
	}
	/**
	 * @return the solutionDescription
	 */
	public String getSolutionDescription() {
		return solutionDescription;
	}
	/**
	 * @param solutionDescription the solutionDescription to set
	 */
	public void setSolutionDescription(String solutionDescription) {
		this.solutionDescription = solutionDescription;
	}
	/**
	 * @return the ideationDate
	 */
	public String getIdeationDate() {
		return ideationDate;
	}
	/**
	 * @param ideationDate the ideationDate to set
	 */
	public void setIdeationDate(String ideationDate) {
		this.ideationDate = ideationDate;
	}
	/**
	 * @return the perHourDollarRate
	 */
	public Long getPerHourDollarRate() {
		return perHourDollarRate;
	}
	/**
	 * @param perHourDollarRate the perHourDollarRate to set
	 */
	public void setPerHourDollarRate(Long perHourDollarRate) {
		this.perHourDollarRate = perHourDollarRate;
	}
	/**
	 * @return the annualEffortSavings
	 */
	public Long getAnnualEffortSavings() {
		return annualEffortSavings;
	}
	/**
	 * @param annualEffortSavings the annualEffortSavings to set
	 */
	public void setAnnualEffortSavings(Long annualEffortSavings) {
		this.annualEffortSavings = annualEffortSavings;
	}
	/**
	 * @return the smeReviewedDate
	 */
	public String getSmeReviewedDate() {
		return smeReviewedDate;
	}
	/**
	 * @param smeReviewedDate the smeReviewedDate to set
	 */
	public void setSmeReviewedDate(String smeReviewedDate) {
		this.smeReviewedDate = smeReviewedDate;
	}
	/**
	 * @return the councilReviewedDate
	 */
	public String getCouncilReviewedDate() {
		return councilReviewedDate;
	}
	/**
	 * @param councilReviewedDate the councilReviewedDate to set
	 */
	public void setCouncilReviewedDate(String councilReviewedDate) {
		this.councilReviewedDate = councilReviewedDate;
	}
	/**
	 * @return the clientReviewedDate
	 */
	public String getClientReviewedDate() {
		return clientReviewedDate;
	}
	/**
	 * @param clientReviewedDate the clientReviewedDate to set
	 */
	public void setClientReviewedDate(String clientReviewedDate) {
		this.clientReviewedDate = clientReviewedDate;
	}
	/**
	 * @return the implementationDate
	 */
	public String getImplementationDate() {
		return implementationDate;
	}
	/**
	 * @param implementationDate the implementationDate to set
	 */
	public void setImplementationDate(String implementationDate) {
		this.implementationDate = implementationDate;
	}
	/**
	 * @return the savings
	 */
	public Long getSavings() {
		return savings;
	}
	/**
	 * @param savings the savings to set
	 */
	public void setSavings(Long savings) {
		this.savings = savings;
	}
	/**
	 * @return the elapsedTime
	 */
	public Integer getElapsedTime() {
		return elapsedTime;
	}
	/**
	 * @param elapsedTime the elapsedTime to set
	 */
	public void setElapsedTime(Integer elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	/**
	 * @return the client
	 */
	public String getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(String client) {
		this.client = client;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the technology
	 */
	public String getTechnology() {
		return technology;
	}
	/**
	 * @param technology the technology to set
	 */
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
