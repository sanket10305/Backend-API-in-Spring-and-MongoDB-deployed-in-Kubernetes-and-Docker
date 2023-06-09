/*
 * User Details API Task
 * This is an API providing details about users along with languages and frameworks.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: sanketdeotale@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.User;
import io.swagger.client.model.Users;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Server heartbeat operation
     *
     * This operation shows how to override the global security defined above, as we want to open it up for all users.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pingGetTest() throws Exception {
        api.pingGet();

        // TODO: test validations
    }
    /**
     * Server example operation
     *
     * Obtain information about users from the database.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void usersGetTest() throws Exception {
        Integer bodyLimit = null;
        Integer pageLimit = null;
        Users response = api.usersGet(bodyLimit, pageLimit);

        // TODO: test validations
    }
    /**
     * 
     *
     * Obtain information about specific user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void usersIdGetTest() throws Exception {
        Integer id = null;
        User response = api.usersIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a new user in the database
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void usersPostTest() throws Exception {
        User body = null;
        api.usersPost(body);

        // TODO: test validations
    }
}
