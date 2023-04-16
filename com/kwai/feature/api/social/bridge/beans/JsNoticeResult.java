package com.kwai.feature.api.social.bridge.beans.JsNoticeResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsNoticeResult implements Serializable	// class@0010a0
{
    public String actionId;
    public int actionStatus;
    public String operation;
    public int result;
    public static final long serialVersionUID = 0x881fd8189bd32509;

    public void JsNoticeResult(int p0,String p1){
       super();
       this.result = p0;
       this.operation = p1;
    }
    public void JsNoticeResult(int p0,String p1,int p2,String p3){
       super();
       this.result = p0;
       this.operation = p1;
       this.actionStatus = p2;
       this.actionId = p3;
    }
}
