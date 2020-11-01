package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Companies;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Objects
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T02:17:21.680Z[GMT]")


public class Objects   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("company")
  private Companies company = null;

  @JsonProperty("place")
  @Valid
  private List<String> place = null;

  @JsonProperty("gosContract")
  private String gosContract = null;

  @JsonProperty("square")
  private Double square = null;

  @JsonProperty("permisionBuild")
  private String permisionBuild = null;

  @JsonProperty("workerCount")
  private Integer workerCount = null;

  public Objects id(UUID id) {
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

  public Objects name(String name) {
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

  public Objects company(Companies company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Companies getCompany() {
    return company;
  }

  public void setCompany(Companies company) {
    this.company = company;
  }

  public Objects place(List<String> place) {
    this.place = place;
    return this;
  }

  public Objects addPlaceItem(String placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<String>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getPlace() {
    return place;
  }

  public void setPlace(List<String> place) {
    this.place = place;
  }

  public Objects gosContract(String gosContract) {
    this.gosContract = gosContract;
    return this;
  }

  /**
   * Get gosContract
   * @return gosContract
  **/
  @ApiModelProperty(value = "")
  
    public String getGosContract() {
    return gosContract;
  }

  public void setGosContract(String gosContract) {
    this.gosContract = gosContract;
  }

  public Objects square(Double square) {
    this.square = square;
    return this;
  }

  /**
   * Get square
   * @return square
  **/
  @ApiModelProperty(value = "")
  
    public Double getSquare() {
    return square;
  }

  public void setSquare(Double square) {
    this.square = square;
  }

  public Objects permisionBuild(String permisionBuild) {
    this.permisionBuild = permisionBuild;
    return this;
  }

  /**
   * Get permisionBuild
   * @return permisionBuild
  **/
  @ApiModelProperty(value = "")
  
    public String getPermisionBuild() {
    return permisionBuild;
  }

  public void setPermisionBuild(String permisionBuild) {
    this.permisionBuild = permisionBuild;
  }

  public Objects workerCount(Integer workerCount) {
    this.workerCount = workerCount;
    return this;
  }

  /**
   * Get workerCount
   * @return workerCount
  **/
  @ApiModelProperty(value = "")
  
    public Integer getWorkerCount() {
    return workerCount;
  }

  public void setWorkerCount(Integer workerCount) {
    this.workerCount = workerCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Objects objects = (Objects) o;
    return Objects.equals(this.id, objects.id) &&
        Objects.equals(this.name, objects.name) &&
        Objects.equals(this.company, objects.company) &&
        Objects.equals(this.place, objects.place) &&
        Objects.equals(this.gosContract, objects.gosContract) &&
        Objects.equals(this.square, objects.square) &&
        Objects.equals(this.permisionBuild, objects.permisionBuild) &&
        Objects.equals(this.workerCount, objects.workerCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, company, place, gosContract, square, permisionBuild, workerCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Objects {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    gosContract: ").append(toIndentedString(gosContract)).append("\n");
    sb.append("    square: ").append(toIndentedString(square)).append("\n");
    sb.append("    permisionBuild: ").append(toIndentedString(permisionBuild)).append("\n");
    sb.append("    workerCount: ").append(toIndentedString(workerCount)).append("\n");
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
