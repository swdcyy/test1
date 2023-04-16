package com.kuaishou.live.audience.component.chat.single.a$a;
import yd1.t;
import com.kuaishou.live.audience.component.chat.single.a;
import java.lang.Object;
import ae1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lp3.i;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import xd1.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatGuestGiftInfo;
import rd1.c0;
import com.airbnb.lottie.LottieAnimationView;
import yd1.b;
import android.widget.ImageView;
import lp3.e;
import com.kwai.framework.model.user.UserInfo;
import xp5.i;
import yd1.s;
import android.content.Context;
import java.util.Objects;
import u07.t$a;
import android.app.Activity;
import tx0.d;
import u07.u;
import u07.t;
import u07.j;
import n91.c;
import lp3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public class a$a implements t	// class@000a8e
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(a p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (this.a.S8() == null) {
          return;
       }
       g a = g.a;
       i oi = this.a.S8();
       a e = p0.e;
       String str = c0.i(this.a.R8(), this.a.v);
       a$a ta = this.a;
       BaseLiveAudienceSingleChatPresenter u = ta.u;
       boolean b = (!ta.O.m().getVisibility())? true: false;
       a.c(oi, e, p1, str, u, b, true);
       return;
    }
    public void b(a p0,int p1){
       s.a(this, p0, p1);
    }
    public void c(a p0,Context p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, a.class, "1")) {
          t$a uoa = new t$a(ta.w);
          uoa.W0(R.string.arg_RES_7f101f17);
          uoa.S0(R.string.arg_RES_7f103a83);
          uoa.Q0(R.string.cancel);
          uoa.u0(new d(ta));
          j.d(uoa);
       }
       return;
    }
    public void d(a p0){
       a c;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.a.S8().a(c.class).jb(p0.e);
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.u.a();
       c = p0.c;
       boolean b = false;
       int i = (!this.a.O.m().getVisibility())? 1: 0;
       if (p0.f == 2) {
          b = true;
       }
       c0.h(liveStreamPa, c, i, b, c0.i(this.a.R8(), this.a.v), "1", this.a.R8());
       return;
    }
}
