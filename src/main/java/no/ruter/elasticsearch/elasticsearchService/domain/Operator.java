package no.ruter.elasticsearch.elasticsearchService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Operator {

    private String operatorName;
    private String operatorId;
    private String operatorEmailAddress;
}
