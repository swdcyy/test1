package com.kuaishou.live.audience.component.activitycoupondialog.c$b;
import xq5.c;
import com.kuaishou.live.audience.component.activitycoupondialog.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class c$b implements c	// class@000a40
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       this.b.P8();
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
