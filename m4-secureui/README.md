# m4-secureui

In this project we are building a secure UI as a demonstration of what is
probably the most common OAuth 2.0 flow: `OAuth 2.0 Grant Type: Authorization Code`.


We will build a `ReportController` which enables SSO with github. We will
configure the application to use some well known public credentials, which
only work when the client is running on `lcoalhost:8080` -- because this 
is how the redirect from github will be setup when the user successfully
authenticates. The redirected response will include and authorization code
that will enable this secure client to get access tokens for secure downstream
services, like: `m4-secureservice`.

## OAuth 2.0 Grant Type: Authorization Code

This flow is optimized for secure clients, like server side apps. 
It is used to get access tokens and refresh tokens and etc... 
The client must be able to securely maintain the client secret.

This is a redirection based flow. It requires client interaction
with a resource owner, typically through a browser. This flow will
not work for a headless operation.