# Quarkus Request Filter for (Un)linked Accounts in Keycloak Account Console

This filter disables the `/account/linked-accounts` endpoint in Keycloak to prevent the exposure of private identity providers (which are hidden on the login page). You can extend the logic if you still wish to display linked providers. Tested in Keycloak 25.0.5 - 26.1.2.

# Usage

Copy the JAR file from the `/providers` directory to your providers directory.

# Example

Run with:  
`docker-compose up`
