package com.kuaishou.krn.apm.memory.KdsLeakDetector$watchKrnContainer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import qrd.r0;
import java.lang.Integer;
import trd.t0;

public final class KdsLeakDetector$watchKrnContainer$1 extends Lambda implements l	// class@0007e6
{
    public final String $bundleId;
    public final String $componentName;
    public final String $name;

    public void KdsLeakDetector$watchKrnContainer$1(String p0,String p1,String p2){
       this.$name = p0;
       this.$bundleId = p1;
       this.$componentName = p2;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(Object p0){
       Pair[] obj = PatchProxy.applyOneRefs(p0, this, KdsLeakDetector$watchKrnContainer$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = new Pair[4];
       obj[0] = r0.a("Name", this.$name);
       obj[1] = r0.a("Id", Integer.valueOf(p0.hashCode()));
       int i = 2;
       KdsLeakDetector$watchKrnContainer$1 t$bundleId = this.$bundleId;
       String str = "";
       if (t$bundleId == null) {
          t$bundleId = str;
       }
       obj[i] = r0.a("BundleId", t$bundleId);
       i = 3;
       t$bundleId = this.$componentName;
       if (t$bundleId != null) {
          str = t$bundleId;
       }
       obj[i] = r0.a("ComponentName", str);
       return t0.W(obj);
    }
}
