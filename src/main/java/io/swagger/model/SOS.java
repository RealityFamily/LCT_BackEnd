package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * SOS
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T02:17:21.680Z[GMT]")


public class SOS   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("worker")
  private Workers worker = null;

  @JsonProperty("object")
  private Objects object = null;

  @JsonProperty("dateTime")
  private OffsetDateTime dateTime = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RECEIVED("received"),
    
    IN_TREATMENT("in_treatment"),
    
    PROCESSED("processed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public SOS id(UUID id) {
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

  public SOS worker(Workers worker) {
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

  public SOS object(Objects object) {
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

  public SOS dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public SOS status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SOS SOS = (SOS) o;
    return Objects.equals(this.id, SOS.id) &&
        Objects.equals(this.worker, SOS.worker) &&
        Objects.equals(this.object, SOS.object) &&
        Objects.equals(this.dateTime, SOS.dateTime) &&
        Objects.equals(this.status, SOS.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, worker, object, dateTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SOS {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
