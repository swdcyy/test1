package com.kwai.framework.plugin.PluginManager$mSPProvider$2$a;
import oj7.d;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.PluginManager;
import ae6.c;
import com.kwai.sdk.switchconfig.a;
import vid.c;
import java.io.File;
import vid.c$a;
import java.lang.StringBuilder;
import qj7.d;
import java.lang.Throwable;
import vid.b;

public final class PluginManager$mSPProvider$2$a implements d	// class@000c7b
{

    public void PluginManager$mSPProvider$2$a(){
       super();
    }
    public SharedPreferences a(Context p0,String p1,int p2){
       String obj;
       c$a a;
       if (PatchProxy.isSupport(PluginManager$mSPProvider$2$a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, PluginManager$mSPProvider$2$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       obj = "name";
       a.p(p1, obj);
       if (!PluginManager.H.p() && !PatchProxy.applyVoidOneRefs(p1, new c(), c.class, "1")) {
          a.p(p1, obj);
          if (a.t().d("dvaDeleteOldSP", false) && c.a != null) {
             a = c.a;
             a.o(a, "PreferenceConfigHolder.CONFIG");
             File uFile = new File(a.b(), p1+".xml");
             if (uFile.exists()) {
                uFile.delete();
                d.c("dva oldSPFile delete success, "+uFile.getAbsolutePath());
             }
          }
       }
       SharedPreferences sharedPrefer = b.c(p0, p1, p2);
       a.o(sharedPrefer, "KwaiSharedPreferences.obtain\(context, name, mode\)");
       return sharedPrefer;
    }
}
