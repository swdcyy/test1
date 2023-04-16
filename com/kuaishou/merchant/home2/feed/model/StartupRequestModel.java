package com.kuaishou.merchant.home2.feed.model.StartupRequestModel;
import java.io.Serializable;
import com.kuaishou.merchant.home2.feed.model.StartupRequestModel$a;
import nsd.u;
import java.util.List;
import java.lang.Object;

public final class StartupRequestModel implements Serializable	// class@0017bd
{
    public List liveStreamInfoList;
    public static final StartupRequestModel$a Companion;
    public static final long serialVersionUID;

    static {
       StartupRequestModel.Companion = new StartupRequestModel$a(null);
    }
    public void StartupRequestModel(){
       super(null, 1, null);
    }
    public void StartupRequestModel(List p0){
       super();
       this.liveStreamInfoList = p0;
    }
    public void StartupRequestModel(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public final List getLiveStreamInfoList(){
       return this.liveStreamInfoList;
    }
    public final void setLiveStreamInfoList(List p0){
       this.liveStreamInfoList = p0;
    }
}
