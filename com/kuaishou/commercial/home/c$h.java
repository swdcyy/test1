package com.kuaishou.commercial.home.c$h;
import erd.g;
import com.kuaishou.commercial.home.c;
import java.lang.Object;
import y8c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import tw.j;
import java.lang.Runnable;
import ekd.k1;

public class c$h implements g	// class@0014e0
{
    public final c b;

    public void c$h(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$h.class, "1")) {
       }else {
          c$h tb = this.b;
          c z = tb.z;
          if (z != null) {
             p0 = p0.a;
             if (p0 != true) {
                if (p0 != 2) {
                   if (p0 != 3) {
                      if (p0 != 4) {
                         if (p0 == 6) {
                            tb.v = true;
                            p0.w = true;
                         }
                      }else if(tb.M != null && this.b.z.isRunning()){
                         this.b.z.stop();
                         p0.v = false;
                         this.b.P8();
                      }
                   }else if(tb.v == null && (!this.b.z.isRunning() && j.m(this.b.q) != null)){
                      p0 = this.b;
                      k1.r(p0.T, j.m(p0.q).coverStart);
                   }
                }else if(!z.isRunning()){
                   k1.m(this.b.T);
                   k1.m(this.b.S);
                }
             }else {
                tb.x = false;
             }
          }
       }
       return;
    }
}
