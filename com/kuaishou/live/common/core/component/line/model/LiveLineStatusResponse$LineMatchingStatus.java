package com.kuaishou.live.common.core.component.line.model.LiveLineStatusResponse$LineMatchingStatus;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveLineStatusResponse$LineMatchingStatus	// class@00148c
{
    public int mIntervalMillis;
    public String mLineChatId;
    public int mStatus;

    public void LiveLineStatusResponse$LineMatchingStatus(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLineStatusResponse$LineMatchingStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LineMatchingStatus{mStatus="+this.mStatus+", mLineChatId=\'"+this.mLineChatId+'''+", mIntervalMillis="+this.mIntervalMillis+'}';
    }
}
