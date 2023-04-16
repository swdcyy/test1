package com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

public final class RubasParams implements Serializable	// class@001357
{
    public String containerType;
    public Map dimensions;
    public String event;
    public String token;

    public void RubasParams(){
       super();
    }
    public final String getContainerType(){
       return this.containerType;
    }
    public final Map getDimensions(){
       return this.dimensions;
    }
    public final String getEvent(){
       return this.event;
    }
    public final String getToken(){
       return this.token;
    }
    public final void setContainerType(String p0){
       this.containerType = p0;
    }
    public final void setDimensions(Map p0){
       this.dimensions = p0;
    }
    public final void setEvent(String p0){
       this.event = p0;
    }
    public final void setToken(String p0){
       this.token = p0;
    }
}
