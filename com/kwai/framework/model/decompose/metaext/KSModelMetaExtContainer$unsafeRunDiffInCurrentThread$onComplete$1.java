package com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer;
import com.google.gson.JsonObject;
import java.util.Map;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ha6.d;
import java.util.Objects;
import ekd.e0;
import java.lang.ref.SoftReference;
import java.util.ArrayList;

public final class KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1 extends Lambda implements l	// class@0016a8
{
    public final JsonObject $diffJsonObject;
    public final Map $map;
    public final KSModelMetaExtContainer this$0;

    public void KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1(KSModelMetaExtContainer p0,JsonObject p1,Map p2){
       this.this$0 = p0;
       this.$diffJsonObject = p1;
       this.$map = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          d b = d.b;
          KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1 t$diffJsonOb = this.$diffJsonObject;
          Objects.requireNonNull(b);
          if (PatchProxy.applyVoidOneRefs(t$diffJsonOb, b, d.class, "2") || (e0.a && t$diffJsonOb != null)) {
             _monitor_enter(b);
             d.a.add(new SoftReference(t$diffJsonOb));
             _monitor_exit(b);
          }
       label_0036 :
          KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1 tthis$0 = this.this$0;
          tthis$0._cachedJsonMap = this.$map;
          tthis$0.set_cachedJsonObject(p0);
       }else {
          KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1 tthis$01 = this.this$0;
          Map map = null;
          tthis$01._cachedJsonMap = map;
          tthis$01.set_cachedJsonObject(map);
       }
       p0._isDiffRunning = false;
       return;
    }
}
