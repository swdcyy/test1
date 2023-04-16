package com.kuaishou.live.core.show.clearscreen.d$c;
import dt5.c;
import com.kuaishou.live.core.show.clearscreen.d;
import java.lang.Object;
import dt5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.clearscreen.c;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;

public class d$c implements c	// class@000a27
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public boolean c(){
       return this.a.r;
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "3")) {
          return;
       }
       d p = this.a.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(p0, p, c.class, "2")) {
          p.b.remove(p0);
       }
       return;
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "2")) {
          return;
       }
       this.a.p.a(p0);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "4")) {
          return;
       }
       this.a.Z8();
       return;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, d$c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.V8();
    }
    public void h(LiveSlidePlayService$DisableSlidePlayFunction p0,boolean p1){
       d$c uoc = d$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (!this.c()) {
          return;
       }
       d$c uoc1 = (p0 != LiveSlidePlayService$DisableSlidePlayFunction.LIVE_CHAT && (p0 != LiveSlidePlayService$DisableSlidePlayFunction.GIFT_BOX && (p0 == LiveSlidePlayService$DisableSlidePlayFunction.COMMENT || p0 == LiveSlidePlayService$DisableSlidePlayFunction.VOICE_PARTY_GUEST)))? null: 1;
       if (uoc1) {
          this.a.Y8(p1);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "5")) {
          return;
       }
       this.a.W8();
       return;
    }
}
