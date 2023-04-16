package com.kwai.plugin.dva.install.c$a;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.install.c;
import com.kwai.plugin.dva.work.c;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sj7.c;
import java.lang.Float;

public class c$a implements c$c	// class@001354
{
    public boolean a;
    public final c b;
    public final c c;

    public void c$a(c p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
       this.a = false;
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "4")) {
          return;
       }
       this.a = false;
       this.c.z(this.b);
       this.c.h.b(this.b);
       this.c.i.b(this.b);
       return;
    }
    public void onProgress(float p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if ((int)p0 == 90) {
          this.c.h.b(this.b);
       }
       if (this.a == null) {
          this.c.h.b(this.b);
       }
       this.a = true;
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.c.j = true;
       this.c.h.b(this.b);
       return;
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "3")) {
       }else {
          this.a = false;
          this.c.z(this.b);
          this.c.h.b(this.b);
          this.c.i.b(this.b);
       }
       return;
    }
}
