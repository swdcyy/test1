package com.kwai.plugin.dva.work.c$b$a;
import java.lang.Runnable;
import com.kwai.plugin.dva.work.c$b;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.work.c$c;

public class c$b$a implements Runnable	// class@0013a4
{
    public final int b;
    public final float c;
    public final Exception d;
    public final Object e;
    public final c$b f;

    public void c$b$a(c$b p0,int p1,float p2,Exception p3,Object p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$b$a.class, "1")) {
          return;
       }
       c$b$a tb = this.b;
       if (tb != 0x276a) {
          if (tb != 0x2774) {
             if (tb != 0x27d8) {
                if (tb == 0x2904) {
                   this.f.b.onFailed(this.d);
                }
             }else {
                this.f.b.onSucceed(this.e);
             }
          }else {
             this.f.b.onProgress(this.c);
          }
       }else {
          this.f.b.onStart();
       }
       return;
    }
}
