package no.ruter.elasticsearch.elasticsearchService.domain;

public enum DateType {
    EVERYDAY("12345","normal"),
    Saturday("6","normal"),
    Sunday("7","hollyday");

    private String dateTypeCode;
    private String dateTypeMode;

    public String getDateTypeCode() {
        return dateTypeCode;
    }

    public String getDateTypeMode() {
        return dateTypeMode;
    }

    private DateType(String dateTypeCode,String dateTypeMode) {
        this.dateTypeCode = dateTypeCode;
        this.dateTypeMode = dateTypeMode;
    }

}
