package com.kuaishou.merchant.actionreport.model.ReportActionItem$PendantInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;
import java.lang.String;

public final class ReportActionItem$PendantInfo implements Serializable	// class@0014d8
{
    public Map extraParam;
    public String pendantCode;
    public long timeStamp;
    public String uniqueId;

    public void ReportActionItem$PendantInfo(){
       super();
    }
    public final Map getExtraParam(){
       return this.extraParam;
    }
    public final String getPendantCode(){
       return this.pendantCode;
    }
    public final long getTimeStamp(){
       return this.timeStamp;
    }
    public final String getUniqueId(){
       return this.uniqueId;
    }
    public final void setExtraParam(Map p0){
       this.extraParam = p0;
    }
    public final void setPendantCode(String p0){
       this.pendantCode = p0;
    }
    public final void setTimeStamp(long p0){
       this.timeStamp = p0;
    }
    public final void setUniqueId(String p0){
       this.uniqueId = p0;
    }
}
