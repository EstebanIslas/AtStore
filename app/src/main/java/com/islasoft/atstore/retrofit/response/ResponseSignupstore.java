
package com.islasoft.atstore.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseSignupstore {

    @SerializedName("Status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseSignupstore() {
    }

    /**
     * 
     * @param status
     */
    public ResponseSignupstore(String status) {
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
