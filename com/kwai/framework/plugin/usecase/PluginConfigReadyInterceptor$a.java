package com.kwai.framework.plugin.usecase.PluginConfigReadyInterceptor$a;
import java.lang.Object;
import nsd.u;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ad6.b;
import android.content.SharedPreferences;
import pkd.a;
import java.lang.StringBuilder;
import qj7.h;
import qj7.d;

public final class PluginConfigReadyInterceptor$a	// class@000ccd
{

    public void PluginConfigReadyInterceptor$a(){
       super();
    }
    public void PluginConfigReadyInterceptor$a(u p0){
       super();
    }
    public final boolean a(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, this, PluginConfigReadyInterceptor$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "context");
       String str = "";
       obj = b.a.getString("LastConfigAppVersion", str);
       if (obj != null) {
          str = obj;
       }
       obj = a.e;
       d.c("p="+h.a(p0)+",oldV="+str+",newV="+obj);
       return (a.g(str, obj) ^ 0x01);
    }
}
