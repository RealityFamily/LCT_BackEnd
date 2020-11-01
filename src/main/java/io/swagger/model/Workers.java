package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Companies;
import io.swagger.model.Works;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Workers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T02:17:21.680Z[GMT]")


public class Workers   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("dateBirth")
  private OffsetDateTime dateBirth = null;

  @JsonProperty("work")
  private Works work = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("employer")
  private Companies employer = null;

  @JsonProperty("password")
  private String password = null;

  public Workers id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Workers name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Workers lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Workers dateBirth(OffsetDateTime dateBirth) {
    this.dateBirth = dateBirth;
    return this;
  }

  /**
   * Get dateBirth
   * @return dateBirth
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getDateBirth() {
    return dateBirth;
  }

  public void setDateBirth(OffsetDateTime dateBirth) {
    this.dateBirth = dateBirth;
  }

  public Workers work(Works work) {
    this.work = work;
    return this;
  }

  /**
   * Get work
   * @return work
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Works getWork() {
    return work;
  }

  public void setWork(Works work) {
    this.work = work;
  }

  public Workers phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Workers employer(Companies employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Companies getEmployer() {
    return employer;
  }

  public void setEmployer(Companies employer) {
    this.employer = employer;
  }

  public Workers password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workers workers = (Workers) o;
    return Objects.equals(this.id, workers.id) &&
        Objects.equals(this.name, workers.name) &&
        Objects.equals(this.lastName, workers.lastName) &&
        Objects.equals(this.dateBirth, workers.dateBirth) &&
        Objects.equals(this.work, workers.work) &&
        Objects.equals(this.phone, workers.phone) &&
        Objects.equals(this.employer, workers.employer) &&
        Objects.equals(this.password, workers.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastName, dateBirth, work, phone, employer, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateBirth: ").append(toIndentedString(dateBirth)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
