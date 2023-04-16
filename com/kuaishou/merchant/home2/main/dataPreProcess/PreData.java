package com.kuaishou.merchant.home2.main.dataPreProcess.PreData;
import java.io.Serializable;
import com.kuaishou.merchant.home2.main.dataPreProcess.PreData$a;
import nsd.u;
import java.util.List;
import java.lang.Object;

public final class PreData implements Serializable	// class@001810
{
    public List liveStreamViews;
    public static final PreData$a Companion;
    public static final long serialVersionUID;

    static {
       PreData.Companion = new PreData$a(null);
    }
    public void PreData(List p0){
       super();
       this.liveStreamViews = p0;
    }
    public final List getLiveStreamViews(){
       return this.liveStreamViews;
    }
    public final void setLiveStreamViews(List p0){
       this.liveStreamViews = p0;
    }
}
