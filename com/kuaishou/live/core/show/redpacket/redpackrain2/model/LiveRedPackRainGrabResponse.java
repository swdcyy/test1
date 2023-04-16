package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainGrabResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveRedPackRainGrabResponse implements Serializable	// class@000f02
{
    public LiveRedPackRainGrabResult mLiveRedPackRainGrabResult;
    public int mResult;
    public static final long serialVersionUID = 0x3a4e7aea04ef8983;

    public void LiveRedPackRainGrabResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainGrabResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRedPackRainGrabResponse{mLiveRedPackRainGrabResult="+this.mLiveRedPackRainGrabResult+'}';
    }
}
