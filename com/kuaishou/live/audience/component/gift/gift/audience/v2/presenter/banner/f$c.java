package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f$c;
import ql1.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ql1.b;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import aq5.d;
import lp3.c;
import lp3.e;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;

public class f$c implements c	// class@000b31
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void a(GiftPanelItem p0,int p1,boolean p2){
       b.e(this, p0, p1, p2);
    }
    public void b(GiftPanelItem p0,int p1,boolean p2){
       b.f(this, p0, p1, p2);
    }
    public void c(GiftTab p0,GiftPanelItem p1,int p2,View p3){
       if (PatchProxy.isSupport(f$c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, f$c.class, "1")) {
          return;
       }
       if (p0 != GiftTab.NormalGift) {
          return;
       }
       f$c ta = this.a;
       if (ta.x == null) {
          ta.S8(false);
       }
       return;
    }
    public void d(){
       b.d(this);
    }
    public void e(GiftTab p0,GiftPanelItem p1){
       b.a(this, p0, p1);
    }
    public void f(){
       b.c(this);
    }
    public void g(GiftTab p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "2")) {
          return;
       }
       f$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, "5")) {
          boolean b = false;
          if (ta.q.a(d.class).r2(AudienceBizRelation.VOICE_PARTY)) {
             if (p0 == GiftTab.NormalGift) {
                ta.S8(b);
             }else {
                ta.R8();
             }
          }else if(p0 != GiftTab.NormalGift){
             b = true;
          }
          ta.S8(b);
       }
       return;
    }
    public void h(){
    }
}
