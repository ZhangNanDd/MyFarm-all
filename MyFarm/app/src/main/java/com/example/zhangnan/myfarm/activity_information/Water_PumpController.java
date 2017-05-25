package com.example.zhangnan.myfarm.activity_information;

/**
 * Created by Far-away on 17/5/24.
 */

public class Water_PumpController {
    private String id;
    private String type;
    private String state;

    public Water_PumpController(String id, String type, String state) {
        this.id = id;
        this.type = type;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getState() {
        return Integer.parseInt(state)==1?true:false;
    }

    public void setState(String state) {
        this.state = state;
    }
}
