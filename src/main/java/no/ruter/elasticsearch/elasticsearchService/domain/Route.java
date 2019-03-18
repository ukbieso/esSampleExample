package no.ruter.elasticsearch.elasticsearchService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Route {
    private String routeId;
    private String routeName;
}
