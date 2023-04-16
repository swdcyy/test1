package com.kuaishou.live.core.show.hourlytrank.h$c;
import xq5.c;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class h$c implements c	// class@000c14
{
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, h$c.class, "2")) {
          return;
       }
       this.b.d9();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, h$c.class, "1")) {
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
