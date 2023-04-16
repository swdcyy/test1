package com.kuaishou.krn.apm.memory.KdsLeakDetector$watchReactRootView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.Map;
import java.lang.Object;
import ze.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Integer;
import android.os.Bundle;

public final class KdsLeakDetector$watchReactRootView$1 extends Lambda implements l	// class@0007e7
{
    public final Map $commonDescription;

    public void KdsLeakDetector$watchReactRootView$1(Map p0){
       this.$commonDescription = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(v p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, KdsLeakDetector$watchReactRootView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "reactRoot");
       obj = new HashMap(this.$commonDescription);
       obj.put("Name", "ReactRootView");
       obj.put("RootViewTag", Integer.valueOf(p0.getRootViewTag()));
       obj.put("Id", Integer.valueOf(p0.hashCode()));
       Bundle appPropertie = p0.getAppProperties();
       String str = "";
       if (appPropertie != null) {
          String str1 = appPropertie.getString("componentName", str);
          if (str1 != null) {
             str = str1;
          }
       }
       obj.put("ComponentName", str);
       return obj;
    }
}
