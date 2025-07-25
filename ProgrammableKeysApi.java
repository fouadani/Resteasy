import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-24T08:45:58.596742200+01:00[Africa/Casablanca]")
@Validated
@Tag(name = "ProgrammableKeys", description = "the ProgrammableKeys API")
public interface ProgrammableKeysApi {

    /**
     * GET /programmable-keys/tenants/{tenant}/groups/{site}/users/{userId} : Get device details
     * Retrieve details of a device associated with a user.
     *
     * @param tenant  (required)
     * @param site  (required)
     * @param userId  (required)
     * @return Device details successfully returned (status code 200)
     *         or Bad Request (exemple: invalid parameter X) (status code 400)
     *         or Unauthenticated (Bad Authentication or Consumer not deployed.) (status code 401)
     *         or Forbidden (example : 403 and habilitation level not authorized.) (status code 403)
     *         or Not Found (status code 404)
     *         or Service Error (status code 500)
     *         or Service unavailable (for example: back-end unavailable) (status code 503)
     *         or Other HTTP error code (status code 200)
     */
    @Operation(
            operationId = "getDeviceDetails",
            summary = "Get device details",
            description = "Retrieve details of a device associated with a user.",
            tags = { "ProgrammableKeys" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Device details successfully returned", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DeviceResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Bad Request (exemple: invalid parameter X)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Unauthenticated (Bad Authentication or Consumer not deployed.)"),
                    @ApiResponse(responseCode = "403", description = "Forbidden (example : 403 and habilitation level not authorized.)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Not Found", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Service Error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "503", description = "Service unavailable (for example: back-end unavailable)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "default", description = "Other HTTP error code", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/programmable-keys/tenants/{tenant}/groups/{site}/users/{userId}",
            produces = { "application/json" }
    )
    ResponseEntity<DeviceResponseDto> getDeviceDetails(
            @Parameter(name = "tenant", description = "", required = true, in = ParameterIn.PATH) @PathVariable("tenant") String tenant,
            @Parameter(name = "site", description = "", required = true, in = ParameterIn.PATH) @PathVariable("site") String site,
            @Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId
    );


    /**
     * GET /programmable-keys/tenants/{tenant}/groups/{site}/users/{userId}/access_device/phone_buttons : get programmable phone buttons
     * get the programmable phone buttons for a user&#39;s device.
     *
     * @param tenant  (required)
     * @param site  (required)
     * @param userId  (required)
     * @return list of touches (status code 200)
     *         or Bad Request (exemple: invalid parameter X) (status code 400)
     *         or Unauthenticated (Bad Authentication or Consumer not deployed.) (status code 401)
     *         or Forbidden (example : 403 and habilitation level not authorized.) (status code 403)
     *         or Not Found (status code 404)
     *         or Service Error (status code 500)
     *         or Service unavailable (for example: back-end unavailable) (status code 503)
     *         or Other HTTP error code (status code 200)
     */
    @Operation(
            operationId = "getDeviceDetailsButtons",
            summary = "get programmable phone buttons",
            description = "get the programmable phone buttons for a user's device.",
            tags = { "ProgrammableKeys" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "list of touches", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = PhoneButtonsResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Bad Request (exemple: invalid parameter X)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Unauthenticated (Bad Authentication or Consumer not deployed.)"),
                    @ApiResponse(responseCode = "403", description = "Forbidden (example : 403 and habilitation level not authorized.)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Not Found", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Service Error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "503", description = "Service unavailable (for example: back-end unavailable)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "default", description = "Other HTTP error code", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/programmable-keys/tenants/{tenant}/groups/{site}/users/{userId}/access_device/phone_buttons",
            produces = { "application/json" }
    )
    ResponseEntity<PhoneButtonsResponseDto> getDeviceDetailsButtons(
            @Parameter(name = "tenant", description = "", required = true, in = ParameterIn.PATH) @PathVariable("tenant") String tenant,
            @Parameter(name = "site", description = "", required = true, in = ParameterIn.PATH) @PathVariable("site") String site,
            @Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId
    );


    /**
     * PUT /programmable-keys/tenants/{tenant}/groups/{site}/users/{userId}/access_device/phone_buttons : Update programmable phone buttons
     * Update the programmable phone buttons for a user&#39;s device.
     *
     * @param tenant  (required)
     * @param site  (required)
     * @param userId  (required)
     * @param phoneButtonsRequestDto  (required)
     * @return Buttons updated successfully (status code 204)
     *         or Bad Request (exemple: invalid parameter X) (status code 400)
     *         or Unauthenticated (Bad Authentication or Consumer not deployed.) (status code 401)
     *         or Forbidden (example : 403 and habilitation level not authorized.) (status code 403)
     *         or Not Found (status code 404)
     *         or Service Error (status code 500)
     *         or Service unavailable (for example: back-end unavailable) (status code 503)
     *         or Other HTTP error code (status code 200)
     */
    @Operation(
            operationId = "updateDeviceDetailsButtons",
            summary = "Update programmable phone buttons",
            description = "Update the programmable phone buttons for a user's device.",
            tags = { "ProgrammableKeys" },
            responses = {
                    @ApiResponse(responseCode = "204", description = "Buttons updated successfully"),
                    @ApiResponse(responseCode = "400", description = "Bad Request (exemple: invalid parameter X)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Unauthenticated (Bad Authentication or Consumer not deployed.)"),
                    @ApiResponse(responseCode = "403", description = "Forbidden (example : 403 and habilitation level not authorized.)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Not Found", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Service Error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "503", description = "Service unavailable (for example: back-end unavailable)", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "default", description = "Other HTTP error code", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/programmable-keys/tenants/{tenant}/groups/{site}/users/{userId}/access_device/phone_buttons",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    ResponseEntity<Void> updateDeviceDetailsButtons(
            @Parameter(name = "tenant", description = "", required = true, in = ParameterIn.PATH) @PathVariable("tenant") String tenant,
            @Parameter(name = "site", description = "", required = true, in = ParameterIn.PATH) @PathVariable("site") String site,
            @Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId,
            @Parameter(name = "PhoneButtonsRequestDto", description = "", required = true) @Valid @RequestBody PhoneButtonsRequestDto phoneButtonsRequestDto
    );
}