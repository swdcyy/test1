package com.kwai.yoda.Yoda$b;
import com.kuaishou.webkit.extension.KsCorePerformanceListener;
import com.kwai.yoda.Yoda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.StringBuilder;
import yz7.r;
import com.kwai.yoda.session.logger.webviewload.SdkInitInfo;
import sz7.f;
import java.util.Map;

public class Yoda$b implements KsCorePerformanceListener	// class@00115f
{
    public final Yoda a;

    public void Yoda$b(Yoda p0){
       this.a = p0;
       super();
    }
    public void onPerformanceTiming(boolean p0,String p1,String p2,long p3){
       if (PatchProxy.isSupport(Yoda$b.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, Long.valueOf(p3), this, Yoda$b.class, "1")) {
          return;
       }
       r.b("addKsCorePerformanceListener", "onPerformanceTiming, onMainThread:"+p0+", name:"+p1+", timeStamp:"+p3);
       this.a.mSdkInitInfo.ksCorePerformances.put(p1, new f(Boolean.valueOf(p0), Long.valueOf(p3), p2));
       return;
    }
}
