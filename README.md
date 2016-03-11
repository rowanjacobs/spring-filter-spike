# spring-filter-spike

Demonstration of a trap I ran into using filters in Spring. Exposing filter beans with the same name in two different configuration classes will cause only one filter to be loaded (non-deterministically as of the time I wrote this, which was 01/16) and the other to silently be ignored.

This spike sets up a Spring Boot app with a single endpoint at `/hello/{name}`. Expected outcome of the `X-Color` header in the response is `teal`, however the actual outcome (as of 01/16) is `green` or `blue`, depending on which filter is loaded.
