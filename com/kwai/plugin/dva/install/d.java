package com.kwai.plugin.dva.install.d;
import gj7.b$a;
import com.kwai.plugin.dva.install.e;
import com.kwai.plugin.dva.install.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import qj7.d;
import java.lang.Integer;
import java.lang.Float;

public class d extends b$a	// class@001359
{
    public final e$b a;
    public final e b;

    public void d(e p0,e$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d.c("PluginInstaller onSuccess "+Thread.currentThread().getName());
       this.a.d();
       return;
    }
    public void onCancel(){
    }
    public void onFail(int p0,String p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, d.class, "2")) {
          return;
       }
       this.a.onFailed(p0, p1);
       return;
    }
    public void onProgress(float p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, d.class, "3")) {
          return;
       }
       this.a.onProgress(p0);
       return;
    }
    public void onStart(){
    }
}
