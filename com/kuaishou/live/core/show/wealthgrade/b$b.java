package com.kuaishou.live.core.show.wealthgrade.b$b;
import kr5.c;
import com.kuaishou.live.core.show.wealthgrade.b;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.wealthgrade.LiveWealthGradeEnterRoomData;
import android.view.View;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import hm2.g;
import android.animation.Animator$AnimatorListener;
import hm2.f;
import java.lang.Runnable;
import android.widget.ImageView;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenLottieView;
import hm2.j;
import az1.a;
import com.kuaishou.live.core.show.wealthgrade.c;
import com.airbnb.lottie.LottieAnimationView;
import ia1.b;
import com.kuaishou.live.common.core.basic.resource.c$b;
import com.kuaishou.live.common.core.basic.resource.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import t02.a0;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import t02.r1;
import tx1.a;

public class b$b extends c	// class@001253
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public boolean a(LiveFloatingScreenBaseData p0){
       return this.p(p0);
    }
    public void e(LiveFloatingScreenBaseData p0,View p1){
       this.o(p0, p1);
    }
    public void h(LiveFloatingScreenCommonData p0,KwaiImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "1")) {
       }else {
          super.h(p0, p1);
          b$b ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p1, ta, b.class, "5")) {
             ta.P8();
             ObjectAnimator objectAnimat = j.a(p1, new float[2]{0x3f800000,0});
             ta.s = objectAnimat;
             objectAnimat.setDuration(1600);
             ta.s.addListener(new g(ta, p1));
          }
          p1.postDelayed(new f(this), 600);
       }
       return;
    }
    public void i(LiveFloatingScreenCommonData p0,LiveFloatingScreenLottieView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "2")) {
       }else {
          super.i(p0, p1);
          if (p1 != null) {
             p1.setVisibility(0);
             if (p0.getWealthGrade() == 4) {
                j.a(p1, b.w);
                c.c(p1, new a(), c.a, 0);
             }
          }
       }
       return;
    }
    public void l(LiveFloatingScreenCommonData p0,View p1){
       this.o(p0, p1);
    }
    public boolean n(LiveFloatingScreenCommonData p0){
       return this.p(p0);
    }
    public void o(LiveWealthGradeEnterRoomData p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "3")) {
          return;
       }
       super.l(p0, p1);
       this.a.P8();
       return;
    }
    public boolean p(LiveWealthGradeEnterRoomData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.n(p0);
       UserInfo userInfo = p0.getUserInfo();
       if (userInfo == null) {
          return false;
       }
       b$b ta = this.a;
       b q = ta.q;
       if (q != null) {
          q.U.w0(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 0, false, 77);
       }else {
          b r = ta.r;
          if (r != null) {
             r.Z.g3(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, false, 77);
          }
       }
       return true;
    }
}
