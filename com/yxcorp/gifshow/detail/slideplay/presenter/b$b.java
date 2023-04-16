package com.yxcorp.gifshow.detail.slideplay.presenter.b$b;
import jta.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import mn6.a;

public class b$b extends a	// class@00183d
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       b e = this.a.E;
       if (e != null) {
          boolean b = (!p0 - 0x3f800000)? true: false;
          e.b(b);
       }
       return;
    }
}
