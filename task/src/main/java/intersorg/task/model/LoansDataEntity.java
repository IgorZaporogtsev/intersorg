package intersorg.task.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "loans_data")
public class LoansDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String status;
    private Integer amount;
    private Integer applicationSignedHour;
    private Integer applicationSignedWeekday;
    private String city;
    private String country;
    private String creditScoreEsEquifaxRisk;
    private String dateOfBirth;
    private Double debtToIncome;
    private Integer education;
    private String employmentDurationCurrentEmployer;
    private String employmentPosition;
    private Integer employmentStatus;
    private Integer existingLiabilities;
    private Integer gender;
    private Integer homeOwnershipType;
    private Integer incomeFromPrincipalEmployer;
    private Integer incomeTotal;
    private Double interestRateApr;
    private String loanDate;
    private Integer loanDuration;
    private Integer maritalStatus;
    private String newCreditCustomer;
    private Integer noOfPreviousLoansBeforeLoan;
    private Integer occupationArea;
    private Integer useOfLoan;
    private Integer verificationType;
    private String workExperience;
    private Double previousScore;
    private String defaulted;
    private String defaultDate;

    @Basic
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "Amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "ApplicationSignedHour")
    public Integer getApplicationSignedHour() {
        return applicationSignedHour;
    }

    public void setApplicationSignedHour(Integer applicationSignedHour) {
        this.applicationSignedHour = applicationSignedHour;
    }

    @Basic
    @Column(name = "ApplicationSignedWeekday")
    public Integer getApplicationSignedWeekday() {
        return applicationSignedWeekday;
    }

    public void setApplicationSignedWeekday(Integer applicationSignedWeekday) {
        this.applicationSignedWeekday = applicationSignedWeekday;
    }

    @Basic
    @Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "CreditScoreEsEquifaxRisk")
    public String getCreditScoreEsEquifaxRisk() {
        return creditScoreEsEquifaxRisk;
    }

    public void setCreditScoreEsEquifaxRisk(String creditScoreEsEquifaxRisk) {
        this.creditScoreEsEquifaxRisk = creditScoreEsEquifaxRisk;
    }

    @Basic
    @Column(name = "DateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "DebtToIncome")
    public Double getDebtToIncome() {
        return debtToIncome;
    }

    public void setDebtToIncome(Double debtToIncome) {
        this.debtToIncome = debtToIncome;
    }

    @Basic
    @Column(name = "Education")
    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    @Basic
    @Column(name = "EmploymentDurationCurrentEmployer")
    public String getEmploymentDurationCurrentEmployer() {
        return employmentDurationCurrentEmployer;
    }

    public void setEmploymentDurationCurrentEmployer(String employmentDurationCurrentEmployer) {
        this.employmentDurationCurrentEmployer = employmentDurationCurrentEmployer;
    }

    @Basic
    @Column(name = "EmploymentPosition")
    public String getEmploymentPosition() {
        return employmentPosition;
    }

    public void setEmploymentPosition(String employmentPosition) {
        this.employmentPosition = employmentPosition;
    }

    @Basic
    @Column(name = "EmploymentStatus")
    public Integer getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(Integer employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    @Basic
    @Column(name = "ExistingLiabilities")
    public Integer getExistingLiabilities() {
        return existingLiabilities;
    }

    public void setExistingLiabilities(Integer existingLiabilities) {
        this.existingLiabilities = existingLiabilities;
    }

    @Basic
    @Column(name = "Gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "HomeOwnershipType")
    public Integer getHomeOwnershipType() {
        return homeOwnershipType;
    }

    public void setHomeOwnershipType(Integer homeOwnershipType) {
        this.homeOwnershipType = homeOwnershipType;
    }

    @Basic
    @Column(name = "IncomeFromPrincipalEmployer")
    public Integer getIncomeFromPrincipalEmployer() {
        return incomeFromPrincipalEmployer;
    }

    public void setIncomeFromPrincipalEmployer(Integer incomeFromPrincipalEmployer) {
        this.incomeFromPrincipalEmployer = incomeFromPrincipalEmployer;
    }

    @Basic
    @Column(name = "IncomeTotal")
    public Integer getIncomeTotal() {
        return incomeTotal;
    }

    public void setIncomeTotal(Integer incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

    @Basic
    @Column(name = "Interest rate (APR)")
    public Double getInterestRateApr() {
        return interestRateApr;
    }

    public void setInterestRateApr(Double interestRateApr) {
        this.interestRateApr = interestRateApr;
    }

    @Basic
    @Column(name = "LoanDate")
    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    @Basic
    @Column(name = "LoanDuration")
    public Integer getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(Integer loanDuration) {
        this.loanDuration = loanDuration;
    }

    @Basic
    @Column(name = "MaritalStatus")
    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "NewCreditCustomer")
    public String getNewCreditCustomer() {
        return newCreditCustomer;
    }

    public void setNewCreditCustomer(String newCreditCustomer) {
        this.newCreditCustomer = newCreditCustomer;
    }

    @Basic
    @Column(name = "NoOfPreviousLoansBeforeLoan")
    public Integer getNoOfPreviousLoansBeforeLoan() {
        return noOfPreviousLoansBeforeLoan;
    }

    public void setNoOfPreviousLoansBeforeLoan(Integer noOfPreviousLoansBeforeLoan) {
        this.noOfPreviousLoansBeforeLoan = noOfPreviousLoansBeforeLoan;
    }

    @Basic
    @Column(name = "OccupationArea")
    public Integer getOccupationArea() {
        return occupationArea;
    }

    public void setOccupationArea(Integer occupationArea) {
        this.occupationArea = occupationArea;
    }

    @Basic
    @Column(name = "UseOfLoan")
    public Integer getUseOfLoan() {
        return useOfLoan;
    }

    public void setUseOfLoan(Integer useOfLoan) {
        this.useOfLoan = useOfLoan;
    }

    @Basic
    @Column(name = "VerificationType")
    public Integer getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(Integer verificationType) {
        this.verificationType = verificationType;
    }

    @Basic
    @Column(name = "WorkExperience")
    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    @Basic
    @Column(name = "PreviousScore")
    public Double getPreviousScore() {
        return previousScore;
    }

    public void setPreviousScore(Double previousScore) {
        this.previousScore = previousScore;
    }

    @Basic
    @Column(name = "Defaulted")
    public String getDefaulted() {
        return defaulted;
    }

    public void setDefaulted(String defaulted) {
        this.defaulted = defaulted;
    }

    @Basic
    @Column(name = "DefaultDate")
    public String getDefaultDate() {
        return defaultDate;
    }

    public void setDefaultDate(String defaultDate) {
        this.defaultDate = defaultDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoansDataEntity that = (LoansDataEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(status, that.status) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(applicationSignedHour, that.applicationSignedHour) &&
                Objects.equals(applicationSignedWeekday, that.applicationSignedWeekday) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(creditScoreEsEquifaxRisk, that.creditScoreEsEquifaxRisk) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(debtToIncome, that.debtToIncome) &&
                Objects.equals(education, that.education) &&
                Objects.equals(employmentDurationCurrentEmployer, that.employmentDurationCurrentEmployer) &&
                Objects.equals(employmentPosition, that.employmentPosition) &&
                Objects.equals(employmentStatus, that.employmentStatus) &&
                Objects.equals(existingLiabilities, that.existingLiabilities) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(homeOwnershipType, that.homeOwnershipType) &&
                Objects.equals(incomeFromPrincipalEmployer, that.incomeFromPrincipalEmployer) &&
                Objects.equals(incomeTotal, that.incomeTotal) &&
                Objects.equals(interestRateApr, that.interestRateApr) &&
                Objects.equals(loanDate, that.loanDate) &&
                Objects.equals(loanDuration, that.loanDuration) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(newCreditCustomer, that.newCreditCustomer) &&
                Objects.equals(noOfPreviousLoansBeforeLoan, that.noOfPreviousLoansBeforeLoan) &&
                Objects.equals(occupationArea, that.occupationArea) &&
                Objects.equals(useOfLoan, that.useOfLoan) &&
                Objects.equals(verificationType, that.verificationType) &&
                Objects.equals(workExperience, that.workExperience) &&
                Objects.equals(previousScore, that.previousScore) &&
                Objects.equals(defaulted, that.defaulted) &&
                Objects.equals(defaultDate, that.defaultDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, status, amount, applicationSignedHour, applicationSignedWeekday, city, country, creditScoreEsEquifaxRisk, dateOfBirth, debtToIncome, education, employmentDurationCurrentEmployer, employmentPosition, employmentStatus, existingLiabilities, gender, homeOwnershipType, incomeFromPrincipalEmployer, incomeTotal, interestRateApr, loanDate, loanDuration, maritalStatus, newCreditCustomer, noOfPreviousLoansBeforeLoan, occupationArea, useOfLoan, verificationType, workExperience, previousScore, defaulted, defaultDate);
    }
}
