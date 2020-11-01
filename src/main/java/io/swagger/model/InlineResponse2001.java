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
 * InlineResponse2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T02:17:21.680Z[GMT]")


public class InlineResponse2001   {
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

  public InlineResponse2001 id(UUID id) {
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

  public InlineResponse2001 name(String name) {
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

  public InlineResponse2001 lastName(String lastName) {
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

  public InlineResponse2001 dateBirth(OffsetDateTime dateBirth) {
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

  public InlineResponse2001 work(Works work) {
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

  public InlineResponse2001 phone(String phone) {
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

  public InlineResponse2001 employer(Companies employer) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.id, inlineResponse2001.id) &&
        Objects.equals(this.name, inlineResponse2001.name) &&
        Objects.equals(this.lastName, inlineResponse2001.lastName) &&
        Objects.equals(this.dateBirth, inlineResponse2001.dateBirth) &&
        Objects.equals(this.work, inlineResponse2001.work) &&
        Objects.equals(this.phone, inlineResponse2001.phone) &&
        Objects.equals(this.employer, inlineResponse2001.employer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastName, dateBirth, work, phone, employer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateBirth: ").append(toIndentedString(dateBirth)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
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
