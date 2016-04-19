/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-04-08 17:16:44 UTC)
 * on 2016-04-19 at 05:23:33 UTC 
 * Modify at your own risk.
 */

package com.spotcheck.api.accountApi;

/**
 * Service definition for AccountApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AccountApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class AccountApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the accountApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://spotcheck-3210.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "accountApi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public AccountApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  AccountApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "authenticateAccount".
   *
   * This request holds the parameters needed by the accountApi server.  After setting any optional
   * parameters, call the {@link AuthenticateAccount#execute()} method to invoke the remote operation.
   *
   * @param email
   * @param password
   * @return the request
   */
  public AuthenticateAccount authenticateAccount(java.lang.String email, java.lang.String password) throws java.io.IOException {
    AuthenticateAccount result = new AuthenticateAccount(email, password);
    initialize(result);
    return result;
  }

  public class AuthenticateAccount extends AccountApiRequest<com.spotcheck.api.accountApi.model.Account> {

    private static final String REST_PATH = "authenticateAccount";

    /**
     * Create a request for the method "authenticateAccount".
     *
     * This request holds the parameters needed by the the accountApi server.  After setting any
     * optional parameters, call the {@link AuthenticateAccount#execute()} method to invoke the remote
     * operation. <p> {@link AuthenticateAccount#initialize(com.google.api.client.googleapis.services.
     * AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param email
     * @param password
     * @since 1.13
     */
    protected AuthenticateAccount(java.lang.String email, java.lang.String password) {
      super(AccountApi.this, "POST", REST_PATH, null, com.spotcheck.api.accountApi.model.Account.class);
      this.email = com.google.api.client.util.Preconditions.checkNotNull(email, "Required parameter email must be specified.");
      this.password = com.google.api.client.util.Preconditions.checkNotNull(password, "Required parameter password must be specified.");
    }

    @Override
    public AuthenticateAccount setAlt(java.lang.String alt) {
      return (AuthenticateAccount) super.setAlt(alt);
    }

    @Override
    public AuthenticateAccount setFields(java.lang.String fields) {
      return (AuthenticateAccount) super.setFields(fields);
    }

    @Override
    public AuthenticateAccount setKey(java.lang.String key) {
      return (AuthenticateAccount) super.setKey(key);
    }

    @Override
    public AuthenticateAccount setOauthToken(java.lang.String oauthToken) {
      return (AuthenticateAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public AuthenticateAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (AuthenticateAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public AuthenticateAccount setQuotaUser(java.lang.String quotaUser) {
      return (AuthenticateAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public AuthenticateAccount setUserIp(java.lang.String userIp) {
      return (AuthenticateAccount) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String email;

    /**

     */
    public java.lang.String getEmail() {
      return email;
    }

    public AuthenticateAccount setEmail(java.lang.String email) {
      this.email = email;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String password;

    /**

     */
    public java.lang.String getPassword() {
      return password;
    }

    public AuthenticateAccount setPassword(java.lang.String password) {
      this.password = password;
      return this;
    }

    @Override
    public AuthenticateAccount set(String parameterName, Object value) {
      return (AuthenticateAccount) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "createAccount".
   *
   * This request holds the parameters needed by the accountApi server.  After setting any optional
   * parameters, call the {@link CreateAccount#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.spotcheck.api.accountApi.model.AccountForm}
   * @return the request
   */
  public CreateAccount createAccount(com.spotcheck.api.accountApi.model.AccountForm content) throws java.io.IOException {
    CreateAccount result = new CreateAccount(content);
    initialize(result);
    return result;
  }

  public class CreateAccount extends AccountApiRequest<com.spotcheck.api.accountApi.model.Account> {

    private static final String REST_PATH = "createAccount";

    /**
     * Create a request for the method "createAccount".
     *
     * This request holds the parameters needed by the the accountApi server.  After setting any
     * optional parameters, call the {@link CreateAccount#execute()} method to invoke the remote
     * operation. <p> {@link CreateAccount#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.spotcheck.api.accountApi.model.AccountForm}
     * @since 1.13
     */
    protected CreateAccount(com.spotcheck.api.accountApi.model.AccountForm content) {
      super(AccountApi.this, "POST", REST_PATH, content, com.spotcheck.api.accountApi.model.Account.class);
    }

    @Override
    public CreateAccount setAlt(java.lang.String alt) {
      return (CreateAccount) super.setAlt(alt);
    }

    @Override
    public CreateAccount setFields(java.lang.String fields) {
      return (CreateAccount) super.setFields(fields);
    }

    @Override
    public CreateAccount setKey(java.lang.String key) {
      return (CreateAccount) super.setKey(key);
    }

    @Override
    public CreateAccount setOauthToken(java.lang.String oauthToken) {
      return (CreateAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public CreateAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (CreateAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public CreateAccount setQuotaUser(java.lang.String quotaUser) {
      return (CreateAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public CreateAccount setUserIp(java.lang.String userIp) {
      return (CreateAccount) super.setUserIp(userIp);
    }

    @Override
    public CreateAccount set(String parameterName, Object value) {
      return (CreateAccount) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "deactivateAccount".
   *
   * This request holds the parameters needed by the accountApi server.  After setting any optional
   * parameters, call the {@link DeactivateAccount#execute()} method to invoke the remote operation.
   *
   * @param email
   * @return the request
   */
  public DeactivateAccount deactivateAccount(java.lang.String email) throws java.io.IOException {
    DeactivateAccount result = new DeactivateAccount(email);
    initialize(result);
    return result;
  }

  public class DeactivateAccount extends AccountApiRequest<Void> {

    private static final String REST_PATH = "deactivateAccount";

    /**
     * Create a request for the method "deactivateAccount".
     *
     * This request holds the parameters needed by the the accountApi server.  After setting any
     * optional parameters, call the {@link DeactivateAccount#execute()} method to invoke the remote
     * operation. <p> {@link DeactivateAccount#initialize(com.google.api.client.googleapis.services.Ab
     * stractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param email
     * @since 1.13
     */
    protected DeactivateAccount(java.lang.String email) {
      super(AccountApi.this, "POST", REST_PATH, null, Void.class);
      this.email = com.google.api.client.util.Preconditions.checkNotNull(email, "Required parameter email must be specified.");
    }

    @Override
    public DeactivateAccount setAlt(java.lang.String alt) {
      return (DeactivateAccount) super.setAlt(alt);
    }

    @Override
    public DeactivateAccount setFields(java.lang.String fields) {
      return (DeactivateAccount) super.setFields(fields);
    }

    @Override
    public DeactivateAccount setKey(java.lang.String key) {
      return (DeactivateAccount) super.setKey(key);
    }

    @Override
    public DeactivateAccount setOauthToken(java.lang.String oauthToken) {
      return (DeactivateAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public DeactivateAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeactivateAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeactivateAccount setQuotaUser(java.lang.String quotaUser) {
      return (DeactivateAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeactivateAccount setUserIp(java.lang.String userIp) {
      return (DeactivateAccount) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String email;

    /**

     */
    public java.lang.String getEmail() {
      return email;
    }

    public DeactivateAccount setEmail(java.lang.String email) {
      this.email = email;
      return this;
    }

    @Override
    public DeactivateAccount set(String parameterName, Object value) {
      return (DeactivateAccount) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateAccount".
   *
   * This request holds the parameters needed by the accountApi server.  After setting any optional
   * parameters, call the {@link UpdateAccount#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.spotcheck.api.accountApi.model.AccountForm}
   * @return the request
   */
  public UpdateAccount updateAccount(com.spotcheck.api.accountApi.model.AccountForm content) throws java.io.IOException {
    UpdateAccount result = new UpdateAccount(content);
    initialize(result);
    return result;
  }

  public class UpdateAccount extends AccountApiRequest<Void> {

    private static final String REST_PATH = "updateAccount";

    /**
     * Create a request for the method "updateAccount".
     *
     * This request holds the parameters needed by the the accountApi server.  After setting any
     * optional parameters, call the {@link UpdateAccount#execute()} method to invoke the remote
     * operation. <p> {@link UpdateAccount#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.spotcheck.api.accountApi.model.AccountForm}
     * @since 1.13
     */
    protected UpdateAccount(com.spotcheck.api.accountApi.model.AccountForm content) {
      super(AccountApi.this, "POST", REST_PATH, content, Void.class);
    }

    @Override
    public UpdateAccount setAlt(java.lang.String alt) {
      return (UpdateAccount) super.setAlt(alt);
    }

    @Override
    public UpdateAccount setFields(java.lang.String fields) {
      return (UpdateAccount) super.setFields(fields);
    }

    @Override
    public UpdateAccount setKey(java.lang.String key) {
      return (UpdateAccount) super.setKey(key);
    }

    @Override
    public UpdateAccount setOauthToken(java.lang.String oauthToken) {
      return (UpdateAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateAccount setQuotaUser(java.lang.String quotaUser) {
      return (UpdateAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateAccount setUserIp(java.lang.String userIp) {
      return (UpdateAccount) super.setUserIp(userIp);
    }

    @Override
    public UpdateAccount set(String parameterName, Object value) {
      return (UpdateAccount) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link AccountApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link AccountApi}. */
    @Override
    public AccountApi build() {
      return new AccountApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link AccountApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAccountApiRequestInitializer(
        AccountApiRequestInitializer accountapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(accountapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}