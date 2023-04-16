package com.kwai.plugin.dva.install.c$d;
import com.kwai.plugin.dva.install.e$b;
import com.kwai.plugin.dva.install.c;
import com.kwai.plugin.dva.work.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import qj7.d;
import sj7.c;
import java.lang.Integer;
import com.kwai.plugin.dva.install.error.PluginDownloadException;
import java.lang.Exception;
import java.lang.Float;

public class c$d implements e$b	// class@001357
{
    public final c a;
    public final String b;
    public final c c;

    public void c$d(c p0,c p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "2")) {
          return;
       }
       d.c("predownload "+this.b+" success");
       if (this.c.n(this.b) == null) {
          c uoc = c.j(this.b);
          uoc.m(90.00f);
          this.c.h.b(uoc);
       }
       this.a.r(this.b);
       return;
    }
    public void onFailed(int p0,String p1){
       c$d uod = c$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "3")) {
          return;
       }
       this.a.d(new PluginDownloadException(p0, p1));
       return;
    }
    public void onProgress(float p0){
       c$d uod = c$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.a.m(p0);
       return;
    }
}
