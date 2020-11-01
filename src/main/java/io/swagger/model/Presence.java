package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Workers;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Presence
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T02:17:21.680Z[GMT]")


public class Presence   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("worker")
  private Workers worker = null;

  @JsonProperty("object")
  private Objects object = null;

  @JsonProperty("shiftStart")
  private OffsetDateTime shiftStart = null;

  @JsonProperty("shiftEnd")
  private OffsetDateTime shiftEnd = null;

  public Presence id(UUID id) {
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

  public Presence worker(Workers worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Workers getWorker() {
    return worker;
  }

  public void setWorker(Workers worker) {
    this.worker = worker;
  }

  public Presence object(Objects object) {
    this.object = object;
    return this;
  }

  /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Objects getObject() {
    return object;
  }

  public void setObject(Objects object) {
    this.object = object;
  }

  public Presence shiftStart(OffsetDateTime shiftStart) {
    this.shiftStart = shiftStart;
    return this;
  }

  /**
   * Get shiftStart
   * @return shiftStart
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getShiftStart() {
    return shiftStart;
  }

  public void setShiftStart(OffsetDateTime shiftStart) {
    this.shiftStart = shiftStart;
  }

  public Presence shiftEnd(OffsetDateTime shiftEnd) {
    this.shiftEnd = shiftEnd;
    return this;
  }

  /**
   * Get shiftEnd
   * @return shiftEnd
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getShiftEnd() {
    return shiftEnd;
  }

  public void setShiftEnd(OffsetDateTime shiftEnd) {
    this.shiftEnd = shiftEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Presence presence = (Presence) o;
    return Objects.equals(this.id, presence.id) &&
        Objects.equals(this.worker, presence.worker) &&
        Objects.equals(this.object, presence.object) &&
        Objects.equals(this.shiftStart, presence.shiftStart) &&
        Objects.equals(this.shiftEnd, presence.shiftEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, worker, object, shiftStart, shiftEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Presence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    shiftStart: ").append(toIndentedString(shiftStart)).append("\n");
    sb.append("    shiftEnd: ").append(toIndentedString(shiftEnd)).append("\n");
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
