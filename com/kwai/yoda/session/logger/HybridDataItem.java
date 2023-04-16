package com.kwai.yoda.session.logger.HybridDataItem;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class HybridDataItem implements Serializable	// class@0012d2
{
    public Object dimension;
    public Long eventClientTimeStamp;
    public String key;
    public Object value;

    public void HybridDataItem(){
       super();
    }
    public final Object getDimension(){
       return this.dimension;
    }
    public final Long getEventClientTimeStamp(){
       return this.eventClientTimeStamp;
    }
    public final String getKey(){
       return this.key;
    }
    public final Object getValue(){
       return this.value;
    }
    public final void setDimension(Object p0){
       this.dimension = p0;
    }
    public final void setEventClientTimeStamp(Long p0){
       this.eventClientTimeStamp = p0;
    }
    public final void setKey(String p0){
       this.key = p0;
    }
    public final void setValue(Object p0){
       this.value = p0;
    }
}
