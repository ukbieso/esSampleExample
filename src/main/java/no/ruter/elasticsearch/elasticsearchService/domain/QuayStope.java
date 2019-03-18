package no.ruter.elasticsearch.elasticsearchService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuayStope {
    private String arraivalTime;
    private String departueTime;
    private String order;
    private String stopeName;
    private String stopId;
    private String quayOldId;
    private String quayId;
    private Position position;
}
