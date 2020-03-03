package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExchangeRate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-17T21:47:54.178Z")

public class ExchangeRate   {
  /**
   * Gets or Sets from
   */
  public enum FromEnum {
    EUR("EUR"),
    
    USD("USD"),
    
    UAH("UAH"),
    
    RUB("RUB");

    private String value;

    FromEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FromEnum fromValue(String text) {
      for (FromEnum b : FromEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("from")
  private FromEnum from = null;

  @JsonProperty("rate")
  private BigDecimal rate = null;

  /**
   * Gets or Sets to
   */
  public enum ToEnum {
    EUR("EUR"),
    
    USD("USD"),
    
    UAH("UAH"),
    
    RUB("RUB");

    private String value;

    ToEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ToEnum fromValue(String text) {
      for (ToEnum b : ToEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("to")
  private ToEnum to = null;

  public ExchangeRate from(FromEnum from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")


  public FromEnum getFrom() {
    return from;
  }

  public void setFrom(FromEnum from) {
    this.from = from;
  }

  public ExchangeRate rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public ExchangeRate to(ToEnum to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")


  public ToEnum getTo() {
    return to;
  }

  public void setTo(ToEnum to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRate exchangeRate = (ExchangeRate) o;
    return Objects.equals(this.from, exchangeRate.from) &&
        Objects.equals(this.rate, exchangeRate.rate) &&
        Objects.equals(this.to, exchangeRate.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, rate, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRate {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

