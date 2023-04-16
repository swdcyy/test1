package com.kuaishou.android.security.internal.plugin.k;
import com.kuaishou.android.security.internal.plugin.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.dispatch.JNICLibrary;
import com.kuaishou.android.security.base.perf.d$b;
import java.util.Locale;
import java.lang.Throwable;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.base.perf.d;

public class k implements e	// class@0006fc
{

    public void k(){
       super();
    }
    public Object a(int p0,Object[] p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = JNICLibrary.doCommandNative(p0, p1);
       return obj1;
    }
}
