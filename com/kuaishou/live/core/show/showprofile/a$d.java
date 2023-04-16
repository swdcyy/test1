package com.kuaishou.live.core.show.showprofile.a$d;
import tx1.d$a;
import com.kuaishou.live.core.show.showprofile.a;
import tx1.d;
import wj2.m0;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.framework.model.user.UserInfo;
import mk1.b;
import e92.a;
import jk1.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import n92.g0;
import kg1.e;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.c;
import lp3.i;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import com.kuaishou.live.core.show.showprofile.a$f;
import java.lang.Enum;
import e17.i;
import xp5.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import co2.f2;
import co2.i0;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import erd.g;
import wj2.m;
import com.kuaishou.live.core.show.showprofile.a$d$a;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import bu2.l$c;

public class a$d extends d$a	// class@00101c
{
    public final m0 b;
    public final a c;

    public void a$d(a p0,d p1,m0 p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void a(User p0){
       a p;
       a$d tb1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       super.a(p0);
       if (p0 != null && this.c.S8(p0.mId)) {
          p = this.c.p;
          a0 x1 = p.x1;
          if (x1 != null) {
             x1.bb(a.a(p, UserInfo.convertFromQUser(p0), 27));
          }
       }else {
          a$d tb = this.b;
          if (tb != null && !TextUtils.x(tb.b)) {
             tb1 = this.b;
             g0.c(this.c.p, UserInfo.convertFromQUser(p0), tb1.a, tb1.b, 15);
          }else {
             p = this.c.p;
             UserInfo userInfo = UserInfo.convertFromQUser(p0);
             tb1 = this.b;
             Map map = (tb1 == null)? null: tb1.a;
             g0.c(p, userInfo, map, "VOICE_PARTY", 3);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "2")) {
          return;
       }
       super.b();
       a0 r1 = this.c.p.r1;
       if (r1 != null) {
          r1.A1();
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "4")) {
          return;
       }
       LiveAudienceApplyChatService liveAudience = this.c.v.a(LiveAudienceApplyChatService.class);
       int i = a$f.a[liveAudience.jh().ordinal()];
       if (i != 1 && i != 2) {
          if (i == 3) {
             i.a(R.style.arg_RES_7f11066a, 0x7f101dea);
          }
       }else {
          liveAudience.Ec(this.c.getActivity(), this.c.v.a(i.class), liveAudience.Ai(), "PERSONAL_CARD");
       }
       return;
    }
    public void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "3")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "onClickVoicePartyInvite");
       super.h(p0);
       a0 a1 = this.c.p.a1;
       if (a1 != null) {
          f2 s = a1.r0().s;
          if (s != null) {
             a$d tc = this.c;
             Objects.requireNonNull(tc);
             m om = PatchProxy.applyOneRefs(a1, tc, a.class, "13");
             if (om != PatchProxyResult.class) {
             }else {
                om = new m(tc, a1);
             }
             s.b(p0, null, 1000, om, new a$d$a(this, a1));
          }
       }
       return;
    }
}
