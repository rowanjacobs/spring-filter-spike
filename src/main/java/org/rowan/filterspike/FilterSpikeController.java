package org.rowan.filterspike;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FilterSpikeController {

    @RequestMapping("/hello/{name}")
    public FilterSpikeApiResponse helloWorld(@PathVariable("name") String name) {
        return new FilterSpikeApiResponse(name);
    }

    private class FilterSpikeApiResponse {
        private String hello;

        public FilterSpikeApiResponse(String name) {
            hello = name;
        }

        public FilterSpikeApiResponse() {}

        public String getHello() {
            return hello;
        }
    }
}
