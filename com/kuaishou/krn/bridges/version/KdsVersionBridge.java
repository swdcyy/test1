package com.kuaishou.krn.bridges.version.KdsVersionBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.krn.c;
import kj0.j;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.krn.utils.d;

public final class KdsVersionBridge extends KrnBridge	// class@000832
{

    public void KdsVersionBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public String getName(){
       return "KdsVersionBridge";
    }
    public final boolean isEq(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, KdsVersionBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       j oj = obj.c();
       a.o(oj, "KrnManager.get\(\).commonParams");
       return TextUtils.equals(oj.getAppVersion(), p0);
    }
    public final boolean isGe(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, KdsVersionBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       j oj = obj.c();
       a.o(oj, "KrnManager.get\(\).commonParams");
       boolean b = (d.a(oj.getAppVersion(), p0) >= 0)? true: false;
       return b;
    }
    public final boolean isGt(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, KdsVersionBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       j oj = obj.c();
       a.o(oj, "KrnManager.get\(\).commonParams");
       boolean b = (d.a(oj.getAppVersion(), p0) > 0)? true: false;
       return b;
    }
}
