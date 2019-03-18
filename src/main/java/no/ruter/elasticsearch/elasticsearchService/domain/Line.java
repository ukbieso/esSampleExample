package no.ruter.elasticsearch.elasticsearchService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Line {
    private String lineId;
    private String linePublicCode;
}
