/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.22).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.util.Objects;
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
@Api(value = "object", description = "the object API")
public interface ObjectApi {

    @ApiOperation(value = "Get full list of objects", nickname = "getAllObjects", notes = "", response = Objects.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "object", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Objects.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Error on load from DB") })
    @RequestMapping(value = "/object",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Objects>> getAllObjects();


    @ApiOperation(value = "Get information about object", nickname = "getObjectInfo", notes = "", response = Objects.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "object", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Objects.class),
        @ApiResponse(code = 500, message = "Wrong objectId") })
    @RequestMapping(value = "/object/{objectId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Objects> getObjectInfo(@ApiParam(value = "Id of the object, which info would be send",required=true) @PathVariable("objectId") UUID objectId
);


    @ApiOperation(value = "Get worker count", nickname = "getWorkerCountOnObject", notes = "", response = Integer.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "object", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Integer.class) })
    @RequestMapping(value = "/object/{objectId}/worker_count",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Integer> getWorkerCountOnObject(@ApiParam(value = "Id of the object, which info would be send",required=true) @PathVariable("objectId") UUID objectId
);

}
