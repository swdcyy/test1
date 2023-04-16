package com.kuaishou.live.core.show.screenrecord.videocapture.gl.f$b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kj2.b;

public class f$b implements Runnable	// class@000ff9
{
    public final int b;
    public final f c;

    public void f$b(f p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       f$b tc1;
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       f$b tc = this.c;
       boolean b = false;
       if (this.b == tc.d) {
          tc.k = b;
       }else {
          while (b < 3) {
             if (this.b == this.c.e[b].b()) {
                tc1 = this.c;
                int i = 1 << b;
                i = ~ i;
                i = i & tc1.j;
                tc1.j = i;
             }
             b = b + 1;
          }
       }
       tc1 = this.c;
       if (tc1.n != null) {
          tc1.d();
       }else if(this.b == tc1.d){
          tc1.f();
       }
       return;
    }
}
