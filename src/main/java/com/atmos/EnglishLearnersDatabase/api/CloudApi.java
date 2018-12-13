/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.atmos.EnglishLearnersDatabase.api;

import com.atmos.EnglishLearnersDatabase.model.Course;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-13T14:24:37.132-05:00")

@Api(value = "cloud", description = "the cloud API")
public interface CloudApi {

    @ApiOperation(value = "Add a new course to the course catalog", nickname = "addCourse", notes = "", authorizations = {
        @Authorization(value = "api_auth", scopes = {
            @AuthorizationScope(scope = "read:courses", description = "read courses"),
            @AuthorizationScope(scope = "write:courses", description = "modify courses in the course catalog")
            })
    }, tags={ "Course", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/cloud",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addCourse(@ApiParam(value = "Course object that needs to be added to the course catalog" ,required=true )  @Valid @RequestBody Course body);


    @ApiOperation(value = "Update an existing course", nickname = "updateCourse", notes = "", authorizations = {
        @Authorization(value = "api_auth", scopes = {
            @AuthorizationScope(scope = "read:courses", description = "read courses"),
            @AuthorizationScope(scope = "write:courses", description = "modify courses in the course catalog")
            })
    }, tags={ "Course", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Course not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/cloud",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateCourse(@ApiParam(value = "Course object that needs to be updated to the catalog" ,required=true )  @Valid @RequestBody Course body);

}
