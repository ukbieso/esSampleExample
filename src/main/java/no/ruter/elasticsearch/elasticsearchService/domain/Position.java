package no.ruter.elasticsearch.elasticsearchService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    private float longitud;
    private float latitude;
}
