package com.kwai.plugin.dva.install.c$c;
import com.kwai.plugin.dva.install.e$b;
import com.kwai.plugin.dva.install.c;
import com.kwai.plugin.dva.work.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import java.lang.Exception;
import java.lang.Float;

public class c$c implements e$b	// class@001356
{
    public final c a;
    public final String b;
    public final c c;

    public void c$c(c p0,c p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "2")) {
          return;
       }
       this.a.r(this.b);
       return;
    }
    public void onFailed(int p0,String p1){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "3")) {
          return;
       }
       this.a.d(new PluginInstallException(p0, p1));
       return;
    }
    public void onProgress(float p0){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.m(p0);
       return;
    }
}
