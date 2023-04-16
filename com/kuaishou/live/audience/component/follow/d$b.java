package com.kuaishou.live.audience.component.follow.d$b;
import xq5.c;
import com.kuaishou.live.audience.component.follow.d;
import java.lang.Object;
import xq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class d$b implements c	// class@000ad2
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void P(){
       this.b.D = false;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       this.b.Y8();
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
