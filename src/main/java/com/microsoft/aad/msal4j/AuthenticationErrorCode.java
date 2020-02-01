// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

/**
 * Class containing error codes returned by the service or generated by the client
 */
public class AuthenticationErrorCode {

    /**
     * In the context of device code user has not yet authenticated via browser
     */
    public final static String AUTHORIZATION_PENDING = "authorization_pending";

    /**
     * In the context of device code, this error happens when the device code has expired before
     * the user signed-in on another device (this is usually after 15 min)
     */
    public final static String CODE_EXPIRED = "code_expired";

    /**
     * Standard Oauth2 protocol error code. It indicates that the application needs to expose
     * the UI to the user so that user does an interactive action in order to get a new token
     */
    public final static String INVALID_GRANT = "invalid_grant";

    /**
     * WS-Trust Endpoint not found in Metadata document
     */
    public final static String WSTRUST_ENDPOINT_NOT_FOUND_IN_METADATA_DOCUMENT = "wstrust_endpoint_not_found";

    /**
     * Password is required for managed user. Will typically happen when trying to do integrated windows authentication
     * for managed users
     */
    public final static String PASSWORD_REQUIRED_FOR_MANAGED_USER = "password_required_for_managed_user";

    /**
     * User realm discovery failed
     */
    public final static String USER_REALM_DISCOVERY_FAILED = "user_realm_discovery_failed";

    /**
     * Not found in the cache
     */
    public final static String CACHE_MISS = "cache_miss";

    /**
     * Not able to parse instance discovery metadata. Ensure data is in valid JSON format, and that
     * it contains relevant fields. For more information, see https://aka.ms/msal4j-instance-discovery
     */
    public final static String INVALID_INSTANCE_DISCOVERY_METADATA = "invalid_instance_discovery_metadata";

    /**
     * Unknown error occurred
     */
    public final static String UNKNOWN = "unknown";

    /**
     * The current redirect URL is not a loopback URL. To use OS browser, a loopback URL must be
     * configured both during app registration as well as when initializing the InteractiveRequestParameters
     * object
     */
    public final static String LOOPBACK_REDIRECT_URI = "loopback_redirect_uri";


    /**
     * Unable to start Http listener to the specified port. This might be because the port is unable.
     */
    public final static String UNABLE_TO_START_HTTP_LISTENER = "unable_to_start_http_listener";

    public final static String PORT_BLOCKED = "port_blocked";

    public final static String AUTHORIZATION_RESULT_BLANK = "authorization_code_blank";
}

