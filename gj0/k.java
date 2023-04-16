package gj0.k;
import erd.a;
import sj0.b;
import gj0.d;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import com.kuaishou.krn.log.sample.KdsPreloadSampler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ck0.d;
import fk0.a;
import android.os.SystemClock;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import iu6.a;
import com.kuaishou.krn.instance.JsFramework;
import bk0.j;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt;
import java.lang.StringBuilder;
import ek0.d;
import vj0.a;
import kotlin.jvm.internal.a;
import java.util.Map;
import tj0.a;

public final class k implements a	// class@0024f9
{
    public final b b;
    public final d c;
    public final Long d;
    public final String e;

    public void k(b p0,d p1,Long p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       d uod;
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       k te = this.e;
       if (KdsPreloadSampler.b.a()) {
          long l = td.longValue();
          if (!PatchProxy.isSupport(KrnReactRootPreloadManager.class) || !PatchProxy.applyVoidThreeRefs(tb, tc, Long.valueOf(l), null, KrnReactRootPreloadManager.class, "15")) {
             uod = new d(tb.a(), (SystemClock.elapsedRealtime() - l));
             uod.mJsFramework = tc.framework;
             a uoa1 = tb.c();
             String str = (uoa1 != null)? uoa1.i(): tb.g().getPresetVersion();
             uod.mJsFrameworkVersion = str;
             j.b.c("krn_bundle_preload_time", uod);
          }
       }
       tb.m = te;
       if (!PatchProxy.applyVoidTwoRefs(tb, tc, null, KrnReactRootPreloadManager.class, "20") && tc.preloadType == PreloadType.GENERATE_CODE_CACHE.ordinal()) {
          a obj = PatchProxy.apply(null, null, ExpConfigKt.class, "70");
          boolean b = true;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             uod = KrnInternalManager.c.a().c();
             if (uod != null) {
                b = uod.getBoolean("krn_code_cache_bug_fixed", b);
             }
          }
          if (!b || KrnReactInstanceExtKt.c(tb)) {
             d.e("removeCodecacheReactInstance:"+tb);
             obj = KrnInternalManager.c.b();
             _monitor_enter(obj);
             if (PatchProxy.applyVoidOneRefs(tb, obj, a.class, "12")) {
                _monitor_exit(obj);
             }else {
                a.p(tb, "reactInstance");
                obj.f(tb.g(), "try destroyedInstance, KrnReactInstance="+tb);
                a uoa = obj.a.get(tb.g());
                if (uoa != null) {
                   a.p(uoa, tb, false, 2, null);
                }
                _monitor_exit(obj);
             }
          }
       }
    label_00ff :
       return;
    }
}
