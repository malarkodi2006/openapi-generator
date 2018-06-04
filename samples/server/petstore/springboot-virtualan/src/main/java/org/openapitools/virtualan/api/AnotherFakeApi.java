/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.virtualan.api;

import org.openapitools.virtualan.model.Client;
import io.swagger.annotations.*;
import org.openapitools.virtualan.VirtualServiceUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.openapitools.virtualan.model.MockRequest;
import org.openapitools.virtualan.model.MockResponse;
import org.openapitools.virtualan.model.MockServiceRequest;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Api(value = "another-fake", description = "the another-fake API")
public interface AnotherFakeApi {
	default String addQueryParamValue(Object value){
		return String.join(",", (java.util.List)value);
	}
    Logger log = LoggerFactory.getLogger(AnotherFakeApi.class);


	default Optional<VirtualServiceUtil> getVirtualServiceUtil() {
        return Optional.empty();
    }

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "To test special tags", nickname = "testSpecialTags", notes = "To test special tags", response = Client.class, tags={ "$another-fake?", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    @RequestMapping(value = "/another-fake/dummy",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<Client> testSpecialTags(@ApiParam(value = "client model" ,required=true )  @Valid @RequestBody Client client) {
				Map<String, String> paramMap =  new HashMap<>();
		MockServiceRequest mockServiceRequest = new MockServiceRequest();

		try {
			mockServiceRequest.setResource("another-fake");
			mockServiceRequest.setOperationId("testSpecialTags");
			mockServiceRequest.setParams(paramMap);
			mockServiceRequest.setInputObjectType(client.getClass());
			mockServiceRequest.setInputObject(client);
			return getVirtualServiceUtil().get().returnResponse(mockServiceRequest);
		} catch (ClassNotFoundException | IOException e){
			log.error("Unable to load the mock Response for " + "testSpecialTags", e);
			return new ResponseEntity("{\"code\": \"ERROR\", \"message\": \"Unable to load the mock Response for testSpecialTags\"}", HttpStatus.INTERNAL_SERVER_ERROR);
		}

    }

}
