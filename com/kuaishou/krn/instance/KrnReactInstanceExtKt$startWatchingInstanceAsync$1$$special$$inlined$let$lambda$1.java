package com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.HashMap;
import java.lang.Object;
import com.facebook.react.bridge.ReactContext;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.lang.Boolean;
import android.content.ContextWrapper;
import java.lang.Integer;

public final class KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$1 extends Lambda implements l	// class@0008c2
{
    public final HashMap $commonDescription$inlined;
    public final long $waitUntilRetain$inlined;

    public void KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$1(HashMap p0,long p1){
       this.$commonDescription$inlined = p0;
       this.$waitUntilRetain$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(ReactContext p0){
       String str;
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "_reactContext");
       obj = new HashMap(this.$commonDescription$inlined);
       obj.put("Name", "ReactContext");
       Activity currentActiv = p0.getCurrentActivity();
       if (currentActiv != null) {
          str = currentActiv.toString();
          if (str != null) {
          label_0031 :
             obj.put("Activity", str);
             obj.put("HasActiveCatalystInstance", Boolean.valueOf(p0.hasActiveCatalystInstance()));
             obj.put("Id", Integer.valueOf(p0.hashCode()));
             PatchProxy.onMethodExit(KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$1.class, "1");
             return obj;
          }
       }
       str = "";
       goto label_0031 ;
    }
}
