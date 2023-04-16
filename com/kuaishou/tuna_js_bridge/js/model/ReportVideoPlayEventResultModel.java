package com.kuaishou.tuna_js_bridge.js.model.ReportVideoPlayEventResultModel;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class ReportVideoPlayEventResultModel implements Serializable	// class@00114c
{
    public int mEventType;
    public String mPhotoId;

    public void ReportVideoPlayEventResultModel(int p0,String p1){
       super();
       this.mEventType = p0;
       this.mPhotoId = p1;
    }
}
