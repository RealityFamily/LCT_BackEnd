/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.22).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.InlineResponse200;
import io.swagger.model.Monitors;
import io.swagger.model.Workers;
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
@Api(value = "auth", description = "the auth API")
public interface AuthApi {

    @ApiOperation(value = "Creating new Monitor", nickname = "addMonitor", notes = "", response = InlineResponse200.class, tags={ "auth", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created succesfuly", response = InlineResponse200.class),
        @ApiResponse(code = 500, message = "Something went wrong") })
    @RequestMapping(value = "/auth/register/monitor",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> addMonitor(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Monitors body
);


    @ApiOperation(value = "Creating new Worker", nickname = "addWorker", notes = "", response = InlineResponse200.class, tags={ "auth", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created succesfuly", response = InlineResponse200.class),
        @ApiResponse(code = 500, message = "Something went wrong") })
    @RequestMapping(value = "/auth/register/worker",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> addWorker(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Workers body
);


    @ApiOperation(value = "Monitors authentication", nickname = "monitorAuth", notes = "", response = InlineResponse200.class, tags={ "auth", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Login correctly", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "AuthInfo incorrect") })
    @RequestMapping(value = "/auth/monitor",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> monitorAuth(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body1 body
);


    @ApiOperation(value = "Worker authentication", nickname = "workerAuth", notes = "", response = InlineResponse200.class, tags={ "auth", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Login correctly", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "AuthInfo incorrect") })
    @RequestMapping(value = "/auth/worker",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> workerAuth(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body
);

}

