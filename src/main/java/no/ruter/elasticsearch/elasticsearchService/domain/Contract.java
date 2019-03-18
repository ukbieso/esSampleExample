package no.ruter.elasticsearch.elasticsearchService.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Contract {
    private String contracknumber;
    private Operator operator;
    private Block block;
    private long blockDistance;
    private Date BlockTimeSpane;
    private Date BlockRegulering;
    private DateType dateType;
    private LocalDateTime startTime;
    private LocalDateTime stopTime;
}
