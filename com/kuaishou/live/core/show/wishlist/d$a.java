package com.kuaishou.live.core.show.wishlist.d$a;
import xq5.c;
import com.kuaishou.live.core.show.wishlist.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class d$a implements c	// class@0012d1
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       this.b.V8();
       b9.a(this.b.G);
       d$a tb = this.b;
       tb.E = false;
       tb.F = false;
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.b.R8();
       this.b.S8();
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
