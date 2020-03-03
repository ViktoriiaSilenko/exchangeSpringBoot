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
 * ExchangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-17T21:47:54.178Z")

public class ExchangeRequest   {
  @JsonProperty("amountFrom")
  private BigDecimal amountFrom = null;

  @JsonProperty("amountTo")
  private BigDecimal amountTo = null;

  /**
   * Gets or Sets currencyFrom
   */
  public enum CurrencyFromEnum {
    EUR("EUR"),
    
    USD("USD"),
    
    UAH("UAH"),
    
    RUB("RUB");

    private String value;

    CurrencyFromEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyFromEnum fromValue(String text) {
      for (CurrencyFromEnum b : CurrencyFromEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("currencyFrom")
  private CurrencyFromEnum currencyFrom = null;

  /**
   * Gets or Sets currencyTo
   */
  public enum CurrencyToEnum {
    EUR("EUR"),
    
    USD("USD"),
    
    UAH("UAH"),
    
    RUB("RUB");

    private String value;

    CurrencyToEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyToEnum fromValue(String text) {
      for (CurrencyToEnum b : CurrencyToEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("currencyTo")
  private CurrencyToEnum currencyTo = null;

  /**
   * Gets or Sets operationType
   */
  public enum OperationTypeEnum {
    GET("GET"),
    
    GIVE("GIVE");

    private String value;

    OperationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationTypeEnum fromValue(String text) {
      for (OperationTypeEnum b : OperationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operationType")
  private OperationTypeEnum operationType = null;

  public ExchangeRequest amountFrom(BigDecimal amountFrom) {
    this.amountFrom = amountFrom;
    return this;
  }

  /**
   * Get amountFrom
   * @return amountFrom
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountFrom() {
    return amountFrom;
  }

  public void setAmountFrom(BigDecimal amountFrom) {
    this.amountFrom = amountFrom;
  }

  public ExchangeRequest amountTo(BigDecimal amountTo) {
    this.amountTo = amountTo;
    return this;
  }

  /**
   * Get amountTo
   * @return amountTo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountTo() {
    return amountTo;
  }

  public void setAmountTo(BigDecimal amountTo) {
    this.amountTo = amountTo;
  }

  public ExchangeRequest currencyFrom(CurrencyFromEnum currencyFrom) {
    this.currencyFrom = currencyFrom;
    return this;
  }

  /**
   * Get currencyFrom
   * @return currencyFrom
  **/
  @ApiModelProperty(value = "")


  public CurrencyFromEnum getCurrencyFrom() {
    return currencyFrom;
  }

  public void setCurrencyFrom(CurrencyFromEnum currencyFrom) {
    this.currencyFrom = currencyFrom;
  }

  public ExchangeRequest currencyTo(CurrencyToEnum currencyTo) {
    this.currencyTo = currencyTo;
    return this;
  }

  /**
   * Get currencyTo
   * @return currencyTo
  **/
  @ApiModelProperty(value = "")


  public CurrencyToEnum getCurrencyTo() {
    return currencyTo;
  }

  public void setCurrencyTo(CurrencyToEnum currencyTo) {
    this.currencyTo = currencyTo;
  }

  public ExchangeRequest operationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
  **/
  @ApiModelProperty(value = "")


  public OperationTypeEnum getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRequest exchangeRequest = (ExchangeRequest) o;
    return Objects.equals(this.amountFrom, exchangeRequest.amountFrom) &&
        Objects.equals(this.amountTo, exchangeRequest.amountTo) &&
        Objects.equals(this.currencyFrom, exchangeRequest.currencyFrom) &&
        Objects.equals(this.currencyTo, exchangeRequest.currencyTo) &&
        Objects.equals(this.operationType, exchangeRequest.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountFrom, amountTo, currencyFrom, currencyTo, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRequest {\n");
    
    sb.append("    amountFrom: ").append(toIndentedString(amountFrom)).append("\n");
    sb.append("    amountTo: ").append(toIndentedString(amountTo)).append("\n");
    sb.append("    currencyFrom: ").append(toIndentedString(currencyFrom)).append("\n");
    sb.append("    currencyTo: ").append(toIndentedString(currencyTo)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

