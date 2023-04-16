package com.yxcorp.gifshow.v3.framework.post.TimeUpdateConfig$Companion;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.v3.framework.post.TimeUpdateConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.framework.post.TimeUpdateConfig$Companion$DEFAULT$1;
import msd.a;

public final class TimeUpdateConfig$Companion	// class@001539
{

    public void TimeUpdateConfig$Companion(){
       super();
    }
    public void TimeUpdateConfig$Companion(u p0){
       super();
    }
    public final TimeUpdateConfig a(){
       Object obj = PatchProxy.apply(null, this, TimeUpdateConfig$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TimeUpdateConfig(10, TimeUpdateConfig$Companion$DEFAULT$1.INSTANCE);
    }
}
