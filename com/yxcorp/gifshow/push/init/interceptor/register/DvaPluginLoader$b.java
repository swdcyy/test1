package com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader$b;
import com.kwai.plugin.dva.work.c$c;
import com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader;
import ftd.u;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;
import kotlin.jvm.internal.a;
import java.lang.RuntimeException;
import sj7.d;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.lang.Boolean;

public final class DvaPluginLoader$b implements c$c	// class@00166a
{
    public final DvaPluginLoader a;
    public final u b;

    public void DvaPluginLoader$b(DvaPluginLoader p0,u p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DvaPluginLoader$b.class, "2")) {
          return;
       }
       if (p0 != null) {
          PushLogcat.i$default(PushLogcat.INSTANCE, null, "[DvaPluginLoader] load ["+this.a.b()+"] failure "+Log.getStackTraceString(p0)+' ', 1, null);
          this.b.d(p0);
          DvaPluginLoader$b ta = this.a;
          String stackTraceSt = Log.getStackTraceString(p0);
          a.o(stackTraceSt, "Log.getStackTraceString\(e\)");
          ta.d(ta.a(), stackTraceSt, "LOAD");
       }else {
          this.b.d(new RuntimeException("dva plugin load error"));
          DvaPluginLoader$b ta1 = this.a;
          ta1.d(ta1.a(), "dva plugin ["+this.a.b()+"] load error", "LOAD");
       }
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DvaPluginLoader$b.class, "1")) {
       }else {
          PushLogcat.i$default(PushLogcat.INSTANCE, null, "[DvaPluginLoader] load ["+this.a.b()+"] success", 1, null);
          PluginDownloadExtension.k.a(this.a.b());
          this.b.j(Boolean.TRUE);
       }
       return;
    }
}
