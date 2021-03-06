/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.22).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body4;
import io.swagger.model.SOS;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T02:17:21.680Z[GMT]")
@Api(value = "sos", description = "the sos API")
public interface SosApi {

    @ApiOperation(value = "Get full list of SOS alerts", nickname = "getAllSOS", notes = "", response = SOS.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "monitor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SOS.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Error on load from DB") })
    @RequestMapping(value = "/sos",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<SOS>> getAllSOS();


    @ApiOperation(value = "Get a SOS alert", nickname = "getSOS", notes = "", response = SOS.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "monitor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SOS.class),
        @ApiResponse(code = 500, message = "Error on load from DB") })
    @RequestMapping(value = "/sos/{sosId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SOS> getSOS(@ApiParam(value = "Id of the SOS alert, which info would be send",required=true) @PathVariable("sosId") UUID sosId
);


    @ApiOperation(value = "Get list of SOS alerts in time", nickname = "getTimeSOS", notes = "", response = SOS.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "monitor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SOS.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Error on load from DB") })
    @RequestMapping(value = "/sos",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<SOS>> getTimeSOS(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body4 body
);

}

