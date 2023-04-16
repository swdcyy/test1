package com.kwai.framework.kxb.plugins.KwaiStatisticalService;
import ru6.s;
import com.kwai.framework.kxb.plugins.KwaiStatisticalService$a;
import nsd.u;
import java.lang.Object;
import com.kwai.framework.kxb.plugins.KwaiStatisticalService$mKxbLogDeviceSample$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ru6.s$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.Log;
import k2b.u1;

public final class KwaiStatisticalService implements s	// class@001624
{
    public final p a;
    public static final KwaiStatisticalService$a b;

    static {
       KwaiStatisticalService.b = new KwaiStatisticalService$a(null);
    }
    public void KwaiStatisticalService(){
       super();
       this.a = s.c(KwaiStatisticalService$mKxbLogDeviceSample$2.INSTANCE);
    }
    public void a(String p0,Map p1,boolean p2){
       if (PatchProxy.isSupport(KwaiStatisticalService.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, KwaiStatisticalService.class, "3")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "params");
       s$a.a(this, p0, p1, p2);
       return;
    }
    public void logEvent(String p0,String p1,boolean p2){
       KwaiStatisticalService kwaiStatisti = KwaiStatisticalService.class;
       if (PatchProxy.isSupport(kwaiStatisti) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, KwaiStatisticalService.class, "2")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "params");
       if (p2) {
          Boolean uBoolean = PatchProxy.apply(null, this, kwaiStatisti, "1");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = this.a.getValue();
          }
          if (!uBoolean.booleanValue()) {
             Log.g("KwaiStatisticalService", " log event hit false");
          label_004e :
             return;
          }
       }
       u1.R(p0, p1, 20);
       goto label_004e ;
    }
}
