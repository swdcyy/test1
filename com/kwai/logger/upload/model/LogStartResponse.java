package com.kwai.logger.upload.model.LogStartResponse;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class LogStartResponse implements Serializable	// class@000ee2
{
    public boolean allow;
    public List appEndpointList;
    public String extra;
    public List httpEndpointList;
    public String ktpToken;
    public List newAppEndpointList;
    public String tokenId;

    public void LogStartResponse(String p0){
       super();
       this.extra = p0;
       this.allow = true;
    }
}
