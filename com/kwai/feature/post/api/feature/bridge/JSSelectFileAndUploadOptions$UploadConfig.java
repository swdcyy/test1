package com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$UploadConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Short;

public final class JSSelectFileAndUploadOptions$UploadConfig implements Serializable	// class@001325
{
    public List endPoints;
    public String host;
    public int maxDuration;
    public long maxSize;
    public Short port;
    public String protocol;
    public List supportFormats;
    public String token;

    public void JSSelectFileAndUploadOptions$UploadConfig(){
       super();
    }
    public final List getEndPoints(){
       return this.endPoints;
    }
    public final String getHost(){
       return this.host;
    }
    public final int getMaxDuration(){
       return this.maxDuration;
    }
    public final long getMaxSize(){
       return this.maxSize;
    }
    public final Short getPort(){
       return this.port;
    }
    public final String getProtocol(){
       return this.protocol;
    }
    public final List getSupportFormats(){
       return this.supportFormats;
    }
    public final String getToken(){
       return this.token;
    }
    public final void setEndPoints(List p0){
       this.endPoints = p0;
    }
    public final void setHost(String p0){
       this.host = p0;
    }
    public final void setMaxDuration(int p0){
       this.maxDuration = p0;
    }
    public final void setMaxSize(long p0){
       this.maxSize = p0;
    }
    public final void setPort(Short p0){
       this.port = p0;
    }
    public final void setProtocol(String p0){
       this.protocol = p0;
    }
    public final void setSupportFormats(List p0){
       this.supportFormats = p0;
    }
    public final void setToken(String p0){
       this.token = p0;
    }
}
