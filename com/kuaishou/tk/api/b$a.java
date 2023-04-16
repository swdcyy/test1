package com.kuaishou.tk.api.b$a;
import com.kwai.plugin.dva.work.c$c;
import com.kuaishou.tk.api.b;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.Float;
import sj7.d;
import java.lang.System;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;

public class b$a implements c$c	// class@000f8d
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       this.a.b = true;
       Log.d("TKPluginManager", "installPlugin: onFailed !!! "+Log.f(p0));
       return;
    }
    public void onProgress(float p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Log.g("TKPluginManager", "installPlugin: onProgress "+p0);
       return;
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
       }else if(("tk").equals(p0)){
          Log.g("TKPluginManager", "installPlugin: onSucceed");
          p0.g = System.currentTimeMillis();
          PluginDownloadExtension.k.a("tk");
       }
       return;
    }
}
