package io.swagger.api;

import io.swagger.model.Body4;
import io.swagger.model.SOS;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T02:17:21.680Z[GMT]")
@Controller
public class SosApiController implements SosApi {

    private static final Logger log = LoggerFactory.getLogger(SosApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<SOS>> getAllSOS() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SOS>>(objectMapper.readValue("[ {\n  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"worker\" : {\n    \"lastName\" : \"lastName\",\n    \"password\" : \"password\",\n    \"phone\" : \"phone\",\n    \"work\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n    },\n    \"name\" : \"name\",\n    \"employer\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"dateBirth\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"object\" : {\n    \"square\" : 0.8008281904610115,\n    \"workerCount\" : 6,\n    \"gosContract\" : \"gosContract\",\n    \"name\" : \"name\",\n    \"company\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"place\" : [ \"place\", \"place\" ],\n    \"permisionBuild\" : \"permisionBuild\"\n  },\n  \"status\" : \"received\"\n}, {\n  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"worker\" : {\n    \"lastName\" : \"lastName\",\n    \"password\" : \"password\",\n    \"phone\" : \"phone\",\n    \"work\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n    },\n    \"name\" : \"name\",\n    \"employer\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"dateBirth\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"object\" : {\n    \"square\" : 0.8008281904610115,\n    \"workerCount\" : 6,\n    \"gosContract\" : \"gosContract\",\n    \"name\" : \"name\",\n    \"company\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"place\" : [ \"place\", \"place\" ],\n    \"permisionBuild\" : \"permisionBuild\"\n  },\n  \"status\" : \"received\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SOS>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SOS>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SOS> getSOS(@ApiParam(value = "Id of the SOS alert, which info would be send",required=true) @PathVariable("sosId") UUID sosId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SOS>(objectMapper.readValue("{\n  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"worker\" : {\n    \"lastName\" : \"lastName\",\n    \"password\" : \"password\",\n    \"phone\" : \"phone\",\n    \"work\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n    },\n    \"name\" : \"name\",\n    \"employer\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"dateBirth\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"object\" : {\n    \"square\" : 0.8008281904610115,\n    \"workerCount\" : 6,\n    \"gosContract\" : \"gosContract\",\n    \"name\" : \"name\",\n    \"company\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"place\" : [ \"place\", \"place\" ],\n    \"permisionBuild\" : \"permisionBuild\"\n  },\n  \"status\" : \"received\"\n}", SOS.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SOS>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SOS>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SOS>> getTimeSOS(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body4 body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SOS>>(objectMapper.readValue("[ {\n  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"worker\" : {\n    \"lastName\" : \"lastName\",\n    \"password\" : \"password\",\n    \"phone\" : \"phone\",\n    \"work\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n    },\n    \"name\" : \"name\",\n    \"employer\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"dateBirth\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"object\" : {\n    \"square\" : 0.8008281904610115,\n    \"workerCount\" : 6,\n    \"gosContract\" : \"gosContract\",\n    \"name\" : \"name\",\n    \"company\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"place\" : [ \"place\", \"place\" ],\n    \"permisionBuild\" : \"permisionBuild\"\n  },\n  \"status\" : \"received\"\n}, {\n  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"worker\" : {\n    \"lastName\" : \"lastName\",\n    \"password\" : \"password\",\n    \"phone\" : \"phone\",\n    \"work\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n    },\n    \"name\" : \"name\",\n    \"employer\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"dateBirth\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"object\" : {\n    \"square\" : 0.8008281904610115,\n    \"workerCount\" : 6,\n    \"gosContract\" : \"gosContract\",\n    \"name\" : \"name\",\n    \"company\" : {\n      \"name\" : \"name\",\n      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"genPodrad\" : \"genPodrad\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"place\" : [ \"place\", \"place\" ],\n    \"permisionBuild\" : \"permisionBuild\"\n  },\n  \"status\" : \"received\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SOS>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SOS>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
