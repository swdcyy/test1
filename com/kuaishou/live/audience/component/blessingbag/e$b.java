package com.kuaishou.live.audience.component.blessingbag.e$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.audience.component.blessingbag.e;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o07.o;
import com.kuaishou.live.core.show.blessingbag.c;
import com.kuaishou.live.core.show.blessingbag.a;
import p91.m;
import gx0.i;
import com.kuaishou.live.core.show.blessingbag.c$a;

public class e$b implements PopupInterface$h	// class@000a49
{
    public final LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice b;
    public final e c;

    public void e$b(e p0,LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       o.e(this, p0);
       new c("KWAI_LUCKY_BAG_RECEIVE_POPUP", this.c.q).a(new i(this.b)).c();
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
