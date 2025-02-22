package dev.barrot;

import jakarta.ws.rs.container.*;
import jakarta.ws.rs.ext.Provider;

import java.util.List;

@Provider
@PreMatching
public class LinkedAccountsFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        if (
                requestContext.getMethod().equals("GET")
                        && requestContext.getUriInfo().getPath().contains("/account/linked-accounts")
        ) {
            responseContext.setEntity(List.of());
        }
    }
}