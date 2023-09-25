package net.javaguides.apigateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;  //need spring-boot-stater-webflux dependency
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    private static final List<String> openEndPoints=List.of(
            "/auth/register",
            "/auth/token",
            "/eureka"
    );

    public Predicate<ServerHttpRequest> isSecured=
            (request) -> openEndPoints.stream().noneMatch((uri)->request.getURI().getPath().contains(uri));
}
