package com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$c;
import vy6.a;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.player.helper.b;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.framework.player.core.b;
import ekd.y0;
import h4a.h;
import h4a.g;
import com.kwai.framework.player.helper.b$b;

public class PLCLogHelper$c implements a	// class@001684
{
    public final PLCLogHelper b;

    public void PLCLogHelper$c(PLCLogHelper p0){
       this.b = p0;
       super();
    }
    public void B0(){
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$c.class, "2")) {
          return;
       }
       PLCLogHelper$c tb = this.b;
       tb.A = false;
       tb.B = false;
       tb.a();
       PLCLogHelper y = this.b.y;
       if (y != null) {
          y.e();
       }
       k1.m(this.b.u);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$c.class, "1")) {
          return;
       }
       PLCLogHelper$c tb = this.b;
       tb.v = false;
       long l = 0;
       tb.w = l;
       PLCLogHelper b = tb.b;
       if (b != null) {
          l = b.getDuration();
       }
       tb.x = l;
       this.b.z = new y0(1000, new h(this));
       tb = this.b;
       PLCLogHelper b1 = tb.b;
       if (b1 != null) {
          tb.y = new b(b1, new g(this));
          if (this.b.y.c()) {
             this.b.n();
          }
       }
       return;
    }
    public void k1(){
    }
}
