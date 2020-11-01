package io.swagger.api;

import java.util.Objects;
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
public class ObjectApiController implements ObjectApi {

    private static final Logger log = LoggerFactory.getLogger(ObjectApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ObjectApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Objects>> getAllObjects() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Objects>>(objectMapper.readValue("[ {\n  \"square\" : 0.8008281904610115,\n  \"workerCount\" : 6,\n  \"gosContract\" : \"gosContract\",\n  \"name\" : \"name\",\n  \"company\" : {\n    \"name\" : \"name\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"genPodrad\" : \"genPodrad\"\n  },\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"place\" : [ \"place\", \"place\" ],\n  \"permisionBuild\" : \"permisionBuild\"\n}, {\n  \"square\" : 0.8008281904610115,\n  \"workerCount\" : 6,\n  \"gosContract\" : \"gosContract\",\n  \"name\" : \"name\",\n  \"company\" : {\n    \"name\" : \"name\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"genPodrad\" : \"genPodrad\"\n  },\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"place\" : [ \"place\", \"place\" ],\n  \"permisionBuild\" : \"permisionBuild\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Objects>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Objects>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Objects> getObjectInfo(@ApiParam(value = "Id of the object, which info would be send",required=true) @PathVariable("objectId") UUID objectId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Objects>(objectMapper.readValue("{\n  \"square\" : 0.8008281904610115,\n  \"workerCount\" : 6,\n  \"gosContract\" : \"gosContract\",\n  \"name\" : \"name\",\n  \"company\" : {\n    \"name\" : \"name\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"genPodrad\" : \"genPodrad\"\n  },\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"place\" : [ \"place\", \"place\" ],\n  \"permisionBuild\" : \"permisionBuild\"\n}", Objects.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Objects>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Objects>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Integer> getWorkerCountOnObject(@ApiParam(value = "Id of the object, which info would be send",required=true) @PathVariable("objectId") UUID objectId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Integer>(objectMapper.readValue("0", Integer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Integer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
