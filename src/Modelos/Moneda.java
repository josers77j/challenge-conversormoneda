package Modelos;

import java.util.Map;

public class Moneda {

    private String time_last_update_utc;
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }



}
