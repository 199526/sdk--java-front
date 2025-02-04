// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.machinelearning.fluent.models.BatchEndpointDataInner;
import com.azure.resourcemanager.machinelearning.fluent.models.EndpointAuthKeysInner;
import com.azure.resourcemanager.machinelearning.models.PartialBatchEndpointPartialTrackedResource;

/** An instance of this class provides access to all the operations defined in BatchEndpointsClient. */
public interface BatchEndpointsClient {
    /**
     * Lists Batch inference endpoint in the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of BatchEndpoint entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BatchEndpointDataInner> list(String resourceGroupName, String workspaceName);

    /**
     * Lists Batch inference endpoint in the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param count Number of endpoints to be retrieved in a page of results.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of BatchEndpoint entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BatchEndpointDataInner> list(
        String resourceGroupName, String workspaceName, Integer count, String skip, Context context);

    /**
     * Delete Batch Inference Endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Delete Batch Inference Endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference Endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String endpointName, Context context);

    /**
     * Delete Batch Inference Endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Delete Batch Inference Endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference Endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String endpointName, Context context);

    /**
     * Gets a batch inference endpoint by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch Endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a batch inference endpoint by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchEndpointDataInner get(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Gets a batch inference endpoint by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch Endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a batch inference endpoint by name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BatchEndpointDataInner> getWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, Context context);

    /**
     * Update a batch inference endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch inference endpoint.
     * @param body Mutable batch inference endpoint definition object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BatchEndpointDataInner>, BatchEndpointDataInner> beginUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        PartialBatchEndpointPartialTrackedResource body);

    /**
     * Update a batch inference endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch inference endpoint.
     * @param body Mutable batch inference endpoint definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BatchEndpointDataInner>, BatchEndpointDataInner> beginUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        PartialBatchEndpointPartialTrackedResource body,
        Context context);

    /**
     * Update a batch inference endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch inference endpoint.
     * @param body Mutable batch inference endpoint definition object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchEndpointDataInner update(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        PartialBatchEndpointPartialTrackedResource body);

    /**
     * Update a batch inference endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch inference endpoint.
     * @param body Mutable batch inference endpoint definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchEndpointDataInner update(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        PartialBatchEndpointPartialTrackedResource body,
        Context context);

    /**
     * Creates a batch inference endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch inference endpoint.
     * @param body Batch inference endpoint definition object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BatchEndpointDataInner>, BatchEndpointDataInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, String endpointName, BatchEndpointDataInner body);

    /**
     * Creates a batch inference endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch inference endpoint.
     * @param body Batch inference endpoint definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BatchEndpointDataInner>, BatchEndpointDataInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        BatchEndpointDataInner body,
        Context context);

    /**
     * Creates a batch inference endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch inference endpoint.
     * @param body Batch inference endpoint definition object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchEndpointDataInner createOrUpdate(
        String resourceGroupName, String workspaceName, String endpointName, BatchEndpointDataInner body);

    /**
     * Creates a batch inference endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Name for the Batch inference endpoint.
     * @param body Batch inference endpoint definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchEndpointDataInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        BatchEndpointDataInner body,
        Context context);

    /**
     * Lists batch Inference Endpoint keys.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return keys for endpoint authentication.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EndpointAuthKeysInner listKeys(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Lists batch Inference Endpoint keys.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference Endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return keys for endpoint authentication along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EndpointAuthKeysInner> listKeysWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, Context context);
}
