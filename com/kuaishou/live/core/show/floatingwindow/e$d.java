package com.kuaishou.live.core.show.floatingwindow.e$d;
import xq5.c;
import com.kuaishou.live.core.show.floatingwindow.e;
import java.lang.Object;
import xq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class e$d implements c	// class@000b7e
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public void P(){
       b.a(this);
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, e$d.class, "1")) {
          return;
       }
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
