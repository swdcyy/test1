package ak0.c;
import com.facebook.react.bridge.JSBundleLoader;
import com.kuaishou.krn.instance.JsFramework;
import com.kuaishou.krn.model.LoadingStateTrack;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import iu6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hj0.c;
import gu6.b;
import brd.a0;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.StringBuilder;
import com.kuaishou.krn.experiment.ExpConfigKt;
import ek0.d;
import java.lang.System;
import java.lang.Long;
import java.util.Objects;
import hg.a;
import java.lang.Throwable;
import ak0.b;
import java.lang.Enum;
import com.kwai.kxb.update.model.DownloadPriority;
import xu6.j;
import kotlin.NoWhenBranchMatchedException;
import java.util.List;
import trd.t;
import java.lang.Boolean;
import java.io.File;
import ak0.a;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import qj0.a;
import java.lang.reflect.Type;
import el.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import qj0.b;
import zsd.u;

public final class c extends JSBundleLoader	// class@0000b9
{
    public final JsFramework a;
    public final LoadingStateTrack b;
    public final l c;

    public void c(JsFramework p0,LoadingStateTrack p1,l p2){
       a.p(p0, "mJsFramework");
       a.p(p2, "onCoreBundleLoaded");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.a.a(this.a).o(this.a.getBundleId()).e();
       a.o(obj, "Kxb.of\(mJsFramework\).que¡­eId\)\n      .blockingGet\(\)");
       return obj;
    }
    public String loadScript(JSBundleLoaderDelegate p0){
       long l1;
       LoadingStateTrack k1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LoadingStateTrack loadingState = LoadingStateTrack.class;
       c uoc = c.class;
       c obj = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       d.e("loadCoreScript: useKrnPlatformUpdate:"+ExpConfigKt.q());
       obj = this.b;
       if (obj != null) {
          long l = System.currentTimeMillis();
          if (!PatchProxy.isSupport(loadingState) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), obj, loadingState, "52")) {
             k1 = obj.k;
             Objects.requireNonNull(k1);
             if (!PatchProxy.isSupport(KrnBundleLoadInfo.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), k1, KrnBundleLoadInfo.class, "14")) {
                k1.J0 = l;
                if (k1.c != null) {
                   a.b(0, "asset_get_base_js", a.e(), 6);
                }
             }
          }
       }
       Object[] objArray = null;
       a uoa = this.a();
       if (!ExpConfigKt.q() && (this.a == JsFramework.REACT && uoa.h() != this.a.getPresetVersionCode())) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             c.a.a(this.a).e(t.k(this.a.getBundleId())).e();
          }
          uoa = this.a();
       }
    label_0101 :
       obj = this.b;
       if (obj != null) {
          l1 = System.currentTimeMillis();
          if (!PatchProxy.isSupport(loadingState) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), obj, loadingState, "53")) {
             k1 = obj.k;
             Objects.requireNonNull(k1);
             if (!PatchProxy.isSupport(KrnBundleLoadInfo.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), k1, KrnBundleLoadInfo.class, "15")) {
                k1.K0 = l1;
                if (k1.c != null) {
                   a.d(0, "asset_get_base_js", a.e(), 6);
                }
             }
          }
       }
       this.c.invoke(uoa);
       obj = this.b;
       if (obj != null) {
          l1 = System.currentTimeMillis();
          if (!PatchProxy.isSupport(loadingState) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), obj, loadingState, "56")) {
             k1 = obj.k;
             Objects.requireNonNull(k1);
             if (!PatchProxy.isSupport(KrnBundleLoadInfo.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), k1, KrnBundleLoadInfo.class, "16")) {
                k1.L0 = l1;
                if (k1.c != null) {
                   a.b(0, "load_base_js_bundle", a.e(), 5);
                }
             }
          }
       }
       String obj1 = PatchProxy.applyTwoRefs(p0, uoa, this, uoc, "6");
       if (obj1 != patchProxyRe) {
          obj1.booleanValue();
       }else {
          File uFile = new File(uoa.e(), "resource.tex");
          obj1 = a.a.a(uoa.a(), String.valueOf(uoa.h()));
          if (p0 != null) {
             p0.loadScriptFromFile(uFile.getAbsolutePath(), obj1, false);
          }
       }
       c tb = this.b;
       if (tb != null) {
          long l2 = System.currentTimeMillis();
          if (!PatchProxy.isSupport(loadingState) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l2), tb, loadingState, "57")) {
             LoadingStateTrack k = tb.k;
             Objects.requireNonNull(k);
             if (!PatchProxy.isSupport(KrnBundleLoadInfo.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l2), k, KrnBundleLoadInfo.class, "17")) {
                k.M0 = l2;
                if (k.c != null) {
                   a.d(0, "load_base_js_bundle", a.e(), 5);
                }
             }
          }
       }
       return "";
    }
    public boolean useCodeCache(String p0){
       List value;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "sourceURL");
       obj = PatchProxy.apply(null, null, ExpConfigKt.class, "71");
       if (obj != patchProxyRe) {
       }else {
          d uod = KrnInternalManager.c.a().c();
          if (uod != null) {
             value = uod.getValue("kdsCodeCacheDisabledList", new a().getType(), CollectionsKt__CollectionsKt.E());
             if (value != null) {
             label_0050 :
                obj = value;
             }
          }
          value = CollectionsKt__CollectionsKt.E();
          goto label_0050 ;
       }
       boolean b = true;
       if (!obj instanceof Collection || !obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          if (iterator.hasNext()) {
             b uob = iterator.next();
             if (!a.g(p0, a.a.a(uob.a(), uob.b())) && (!u.q2(p0, uob.a()+"_", false, 2, null) || !a.g(uob.b(), "*"))) {
                b = false;
             }
          }
       }
       return b;
    }
}
