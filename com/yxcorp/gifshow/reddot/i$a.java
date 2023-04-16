package com.yxcorp.gifshow.reddot.i$a;
import i85.f;
import com.yxcorp.gifshow.reddot.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import k2b.f2;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public class i$a extends f	// class@0017c9
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0) {
          Object[] objArray = new Object[0];
          f2.b("RedDotManagerImpl", "onSendAvailableStateChanged: Ready to call postFetchRedDot", objArray);
          this.a.k(RequestTiming.COLD_START);
       }
       return;
    }
}
