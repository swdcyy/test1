package com.kuaishou.live.core.show.template.a$c;
import kr5.c;
import com.kuaishou.live.core.show.template.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.activitty.LiveActivityEnterRoomData;
import android.view.View;
import android.animation.Animator;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenMountData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenDataWithMount;
import ar5.a;
import android.animation.AnimatorSet;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import hl2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import java.lang.Boolean;
import t02.a0;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import t02.r1;
import tx1.a;

public class a$c extends c	// class@00117b
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public boolean a(LiveFloatingScreenBaseData p0){
       return this.q(p0);
    }
    public Animator b(LiveFloatingScreenBaseData p0,View p1){
       return this.o(p0, p1);
    }
    public void f(LiveFloatingScreenBaseData p0,View p1){
       this.p(p0, p1);
    }
    public Animator j(LiveFloatingScreenCommonData p0,View p1){
       return this.o(p0, p1);
    }
    public void m(LiveFloatingScreenCommonData p0,View p1){
       this.p(p0, p1);
    }
    public boolean n(LiveFloatingScreenCommonData p0){
       return this.q(p0);
    }
    public Animator o(LiveActivityEnterRoomData p0,View p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getMountData() == null) {
          return super.j(p0, p1);
       }
       obj = new a();
       obj.c(((p0.getDisplayDuration() - 600) - 200));
       return obj.a(p1);
    }
    public void p(LiveActivityEnterRoomData p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "3")) {
          return;
       }
       super.m(p0, p1);
       UserInfo userInfo = p0.getUserInfo();
       if (userInfo != null) {
          b.d0(LiveLogTag.LIVE_ACTIVITY_TEMPLATE_ENTER_ROOM, "CreatFestivalEnterRoomView", "uid", userInfo.mId, "type", Integer.valueOf(p0.getDisplayType()));
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.p.a();
       int displayType = p0.getDisplayType();
       String activityType = p0.getActivityType();
       if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, Integer.valueOf(displayType), activityType, null, i.class, "1")) {
          ClientContent$ContentPackage uContentPack = i.a(liveStreamPa);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ENTER_REMIND_EFFECT";
          ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
          moreInfoPack.vlaue = String.valueOf(displayType);
          moreInfoPack.type = TextUtils.k(activityType);
          uContentPack.moreInfoPackage = moreInfoPack;
          u1.u0(6, uElementPack, uContentPack);
       }
       return;
    }
    public boolean q(LiveActivityEnterRoomData p0){
       ClientContent$LiveStreamPackage obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.n(p0);
       obj = this.a.p.a();
       int displayType = p0.getDisplayType();
       String activityType = p0.getActivityType();
       if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidThreeRefs(obj, Integer.valueOf(displayType), activityType, null, i.class, "2")) {
          ClientContent$ContentPackage uContentPack = i.a(obj);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ENTER_REMIND_EFFECT";
          ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
          moreInfoPack.vlaue = String.valueOf(displayType);
          moreInfoPack.type = TextUtils.k(activityType);
          uContentPack.moreInfoPackage = moreInfoPack;
          u1.u(true, uElementPack, uContentPack);
       }
       UserInfo userInfo = p0.getUserInfo();
       if (userInfo == null) {
          return false;
       }else {
          a$c ta = this.a;
          a q = ta.q;
          if (q != null) {
             q.U.w0(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 14, false, 100);
          }else {
             a r = ta.r;
             if (r != null) {
                r.Z.g3(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 14, 100);
             }
          }
          return true;
       }
    }
}
