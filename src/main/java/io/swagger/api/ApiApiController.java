package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Commission;
import io.swagger.model.Error;
import io.swagger.model.ExchangeRate;
import io.swagger.model.ExchangeRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-17T21:47:54.178Z")

@Controller
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ExchangeRequest> exchangeUsingPOST(@ApiParam(value = "exchangeRequest" ,required=true )  @Valid @RequestBody ExchangeRequest exchangeRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<ExchangeRequest>(objectMapper.readValue("", ExchangeRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<ExchangeRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExchangeRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ExchangeRate>> getAllRatesUsingGET() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ExchangeRate>>(objectMapper.readValue("[ {  \"rate\" : 0.80082819046101150206595775671303272247314453125,  \"from\" : \"EUR\",  \"to\" : \"EUR\"}, {  \"rate\" : 0.80082819046101150206595775671303272247314453125,  \"from\" : \"EUR\",  \"to\" : \"EUR\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ExchangeRate>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ExchangeRate>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Map<String, Commission>> getCommissionsUsingGET() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Map<String, Commission>>(objectMapper.readValue("{  \"key\" : {    \"commissionPt\" : 0.80082819046101150206595775671303272247314453125,    \"from\" : \"EUR\",    \"to\" : \"EUR\"  }}", Map.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Map<String, Commission>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Map<String, Commission>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Commission> setCommissionUsingPOST(@ApiParam(value = "commission" ,required=true )  @Valid @RequestBody Commission commission) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Commission>(objectMapper.readValue("{  \"commissionPt\" : 0.80082819046101150206595775671303272247314453125,  \"from\" : \"EUR\",  \"to\" : \"EUR\"}", Commission.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Commission>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Commission>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExchangeRate> setRateUsingPOST(@ApiParam(value = "", allowableValues = "EUR, USD, UAH, RUB") @Valid @RequestParam(value = "from", required = false) String from,@ApiParam(value = "") @Valid @RequestParam(value = "key", required = false) String key,@ApiParam(value = "") @Valid @RequestParam(value = "rate", required = false) BigDecimal rate,@ApiParam(value = "", allowableValues = "EUR, USD, UAH, RUB") @Valid @RequestParam(value = "to", required = false) String to) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExchangeRate>(objectMapper.readValue("{  \"rate\" : 0.80082819046101150206595775671303272247314453125,  \"from\" : \"EUR\",  \"to\" : \"EUR\"}", ExchangeRate.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExchangeRate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExchangeRate>(HttpStatus.NOT_IMPLEMENTED);
    }

}
