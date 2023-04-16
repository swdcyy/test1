package com.kwai.live.gzone.turntable.presenters.f$a;
import xq5.c;
import com.kwai.live.gzone.turntable.presenters.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class f$a implements c	// class@000e62
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       tb.K = false;
       tb.X8();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       this.b.K = true;
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
