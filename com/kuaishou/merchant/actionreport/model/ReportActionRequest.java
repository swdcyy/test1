package com.kuaishou.merchant.actionreport.model.ReportActionRequest;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.String;

public final class ReportActionRequest implements Serializable	// class@0014da
{
    public List actions;
    public String liveStreamId;
    public String sellerId;

    public void ReportActionRequest(){
       super();
    }
    public final List getActions(){
       return this.actions;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public final String getSellerId(){
       return this.sellerId;
    }
    public final void setActions(List p0){
       this.actions = p0;
    }
    public final void setLiveStreamId(String p0){
       this.liveStreamId = p0;
    }
    public final void setSellerId(String p0){
       this.sellerId = p0;
    }
}
