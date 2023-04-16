package com.kuaishou.live.core.show.hourlytrank.f$b;
import xq5.c;
import com.kuaishou.live.core.show.hourlytrank.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class f$b implements c	// class@000c0f
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "2")) {
          return;
       }
       this.b.V8();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       this.b.R8();
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
