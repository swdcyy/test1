package com.kwai.feature.api.live.plugin.dva.LivePluginManager$c;
import com.kwai.plugin.dva.work.c$c;
import msd.p;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.Long;
import java.lang.Boolean;
import sj7.d;

public final class LivePluginManager$c implements c$c	// class@000ff1
{
    public final p a;

    public void LivePluginManager$c(p p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePluginManager$c.class, "2")) {
          return;
       }
       this.a.invoke(Long.valueOf(System.currentTimeMillis()), Boolean.FALSE);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePluginManager$c.class, "1")) {
       }else {
          this.a.invoke(Long.valueOf(System.currentTimeMillis()), Boolean.TRUE);
       }
       return;
    }
}
