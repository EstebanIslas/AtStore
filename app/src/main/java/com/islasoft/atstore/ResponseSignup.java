
package com.islasoft.atstore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseSignup {

    @SerializedName("Status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseSignup() {
    }

    /**
     * 
     * @param status
     */
    public ResponseSignup(String status) {
        super();
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}