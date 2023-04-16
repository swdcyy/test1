package com.kuaishou.live.common.core.component.line.model.LiveLineStatusResponse;
import java.lang.Object;
import com.kuaishou.live.common.core.component.line.model.LiveLineStatusResponse$LineMatchingStatus;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveLineStatusResponse	// class@00148d
{
    public LiveLineStatusResponse$LineMatchingStatus mStatusView;

    public void LiveLineStatusResponse(){
       super();
    }
    public long a(){
       LiveLineStatusResponse tmStatusView = this.mStatusView;
       if (tmStatusView != null) {
          LiveLineStatusResponse$LineMatchingStatus mIntervalMil = tmStatusView.mIntervalMillis;
          if (mIntervalMil > null) {
             return (long)mIntervalMil;
          }
       }
       return 5000;
    }
    public boolean b(){
       LiveLineStatusResponse tmStatusView = this.mStatusView;
       boolean b = true;
       if (tmStatusView == null || tmStatusView.mStatus != b) {
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLineStatusResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLineStatusResponse{mStatusView="+this.mStatusView+'}';
    }
}
