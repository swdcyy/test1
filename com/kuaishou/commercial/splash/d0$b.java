package com.kuaishou.commercial.splash.d0$b;
import d6a.a;
import com.kuaishou.commercial.splash.d0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import wkd.b;
import tjc.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.h;

public class d0$b extends a	// class@0015a7
{
    public final d0 b;

    public void d0$b(d0 p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, d0$b.class, "2")) {
          return;
       }
       d0$b tb = this.b;
       if (tb.V == null && l.j(tb.r.mEntity)) {
          tb = this.b;
          tb.V = true;
          tb.Z8();
          this.b.S8();
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, d0$b.class, "1")) {
          return;
       }
       if (b.a(-1608526086).R() == 1) {
          RxBus.f.b(new h(3));
       }
       return;
    }
}
