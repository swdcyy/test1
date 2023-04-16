package com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.c$a;
import xq5.c;
import com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.LiveRedPackRainForbiddenBiz;
import lh2.e;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class c$a implements c	// class@000ef2
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       this.b.R8(LiveRedPackRainForbiddenBiz.PAGE_HIDE, true);
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.b.R8(LiveRedPackRainForbiddenBiz.PAGE_HIDE, false);
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
