/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BackupLongTermRetentionPolicies.
 */
public class BackupLongTermRetentionPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private BackupLongTermRetentionPoliciesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of BackupLongTermRetentionPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupLongTermRetentionPoliciesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(BackupLongTermRetentionPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupLongTermRetentionPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupLongTermRetentionPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.BackupLongTermRetentionPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{backupLongTermRetentionPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("backupLongTermRetentionPolicyName") String backupLongTermRetentionPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.BackupLongTermRetentionPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{backupLongTermRetentionPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("backupLongTermRetentionPolicyName") String backupLongTermRetentionPolicyName, @Query("api-version") String apiVersion, @Body BackupLongTermRetentionPolicyInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.BackupLongTermRetentionPolicies beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{backupLongTermRetentionPolicyName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("backupLongTermRetentionPolicyName") String backupLongTermRetentionPolicyName, @Query("api-version") String apiVersion, @Body BackupLongTermRetentionPolicyInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.BackupLongTermRetentionPolicies listByDatabase" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies")
        Observable<Response<ResponseBody>> listByDatabase(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupLongTermRetentionPolicyInner object if successful.
     */
    public BackupLongTermRetentionPolicyInner get(String resourceGroupName, String serverName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().body();
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupLongTermRetentionPolicyInner> getAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<BackupLongTermRetentionPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupLongTermRetentionPolicyInner object
     */
    public Observable<BackupLongTermRetentionPolicyInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<BackupLongTermRetentionPolicyInner>, BackupLongTermRetentionPolicyInner>() {
            @Override
            public BackupLongTermRetentionPolicyInner call(ServiceResponse<BackupLongTermRetentionPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupLongTermRetentionPolicyInner object
     */
    public Observable<ServiceResponse<BackupLongTermRetentionPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        final String backupLongTermRetentionPolicyName = "Default";
        final String apiVersion = "2014-04-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, backupLongTermRetentionPolicyName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackupLongTermRetentionPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<BackupLongTermRetentionPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackupLongTermRetentionPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BackupLongTermRetentionPolicyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BackupLongTermRetentionPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BackupLongTermRetentionPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param parameters The required parameters to update a backup long term retention policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupLongTermRetentionPolicyInner object if successful.
     */
    public BackupLongTermRetentionPolicyInner createOrUpdate(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters).toBlocking().last().body();
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param parameters The required parameters to update a backup long term retention policy
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupLongTermRetentionPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters, final ServiceCallback<BackupLongTermRetentionPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param parameters The required parameters to update a backup long term retention policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<BackupLongTermRetentionPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters).map(new Func1<ServiceResponse<BackupLongTermRetentionPolicyInner>, BackupLongTermRetentionPolicyInner>() {
            @Override
            public BackupLongTermRetentionPolicyInner call(ServiceResponse<BackupLongTermRetentionPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param parameters The required parameters to update a backup long term retention policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<BackupLongTermRetentionPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String backupLongTermRetentionPolicyName = "Default";
        final String apiVersion = "2014-04-01";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, backupLongTermRetentionPolicyName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<BackupLongTermRetentionPolicyInner>() { }.getType());
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param parameters The required parameters to update a backup long term retention policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupLongTermRetentionPolicyInner object if successful.
     */
    public BackupLongTermRetentionPolicyInner beginCreateOrUpdate(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param parameters The required parameters to update a backup long term retention policy
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupLongTermRetentionPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters, final ServiceCallback<BackupLongTermRetentionPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param parameters The required parameters to update a backup long term retention policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupLongTermRetentionPolicyInner object
     */
    public Observable<BackupLongTermRetentionPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters).map(new Func1<ServiceResponse<BackupLongTermRetentionPolicyInner>, BackupLongTermRetentionPolicyInner>() {
            @Override
            public BackupLongTermRetentionPolicyInner call(ServiceResponse<BackupLongTermRetentionPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param parameters The required parameters to update a backup long term retention policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupLongTermRetentionPolicyInner object
     */
    public Observable<ServiceResponse<BackupLongTermRetentionPolicyInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String backupLongTermRetentionPolicyName = "Default";
        final String apiVersion = "2014-04-01";
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, backupLongTermRetentionPolicyName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackupLongTermRetentionPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<BackupLongTermRetentionPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackupLongTermRetentionPolicyInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BackupLongTermRetentionPolicyInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BackupLongTermRetentionPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BackupLongTermRetentionPolicyInner>() { }.getType())
                .register(201, new TypeToken<BackupLongTermRetentionPolicyInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;BackupLongTermRetentionPolicyInner&gt; object if successful.
     */
    public List<BackupLongTermRetentionPolicyInner> listByDatabase(String resourceGroupName, String serverName, String databaseName) {
        return listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().body();
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BackupLongTermRetentionPolicyInner>> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<List<BackupLongTermRetentionPolicyInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BackupLongTermRetentionPolicyInner&gt; object
     */
    public Observable<List<BackupLongTermRetentionPolicyInner>> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        return listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<List<BackupLongTermRetentionPolicyInner>>, List<BackupLongTermRetentionPolicyInner>>() {
            @Override
            public List<BackupLongTermRetentionPolicyInner> call(ServiceResponse<List<BackupLongTermRetentionPolicyInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BackupLongTermRetentionPolicyInner&gt; object
     */
    public Observable<ServiceResponse<List<BackupLongTermRetentionPolicyInner>>> listByDatabaseWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.listByDatabase(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<BackupLongTermRetentionPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<BackupLongTermRetentionPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BackupLongTermRetentionPolicyInner>> result = listByDatabaseDelegate(response);
                        List<BackupLongTermRetentionPolicyInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<BackupLongTermRetentionPolicyInner>> clientResponse = new ServiceResponse<List<BackupLongTermRetentionPolicyInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BackupLongTermRetentionPolicyInner>> listByDatabaseDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BackupLongTermRetentionPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BackupLongTermRetentionPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}