/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2014 wcm.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package io.wcm.caravan.commons.couchbase;

import org.osgi.annotation.versioning.ProviderType;

import com.couchbase.client.java.AsyncBucket;

/**
 * Provides access to a preconfigured couchbase client.
 * Multiple can be registered for different buckets, the can be filterd by the 'clientId' OSGi property.
 */
@ProviderType
public interface CouchbaseClient {

  /**
   * OSGi property for filtering the configured couchbase clients.
   */
  String CLIENT_ID_PROPERTY = "clientId";

  /**
   * @return ID to uniquely identify the couchbase client if multiple are defined.
   */
  String getClientId();

  /**
   * @return true if Couchbase caching is enabled and configured properly.
   */
  boolean isEnabled();

  /**
   * @return the name of the couchbase bucket to use for caching
   */
  String getBucketName();

  /**
   * @return Default bucket as configured for the couchbase client provider.
   */
  AsyncBucket getBucket();

}