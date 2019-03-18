package no.ruter.elasticsearch.elasticsearchService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@AllArgsConstructor
//@Document(indexName = "block",type = "", createIndex = true)
public class Block {
    @Id
    private String blockId;
    private String blockName;
    private Date startTime;
    private Date stopeTime;
    private QuayStope quayStope;


}
