package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.c$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rf5.u;
import java.util.Objects;
import java.util.BitSet;

public class c$b extends a	// class@001812
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, c$b.class, "1")) {
          return;
       }
       c$b tb = this.b;
       tb.z = false;
       if (tb.s.v()) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidWithListener(objArray, tb, c.class, "9")) {
             tb.B.clear();
             tb.V8();
             tb.P8(0x3f800000);
             PatchProxy.onMethodExit(c.class, "9");
          }
       }
       PatchProxy.onMethodExit(c$b.class, "1");
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, c$b.class, "2")) {
          return;
       }
       this.b.z = true;
       PatchProxy.onMethodExit(c$b.class, "2");
       return;
    }
}
