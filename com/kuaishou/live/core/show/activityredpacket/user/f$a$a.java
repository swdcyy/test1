package com.kuaishou.live.core.show.activityredpacket.user.f$a$a;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView$a;
import com.kuaishou.live.core.show.activityredpacket.user.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.activityredpacket.user.f;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o22.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import h22.a;
import h22.h;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import x22.e;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$a;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import y41.i$a;
import com.kwai.framework.model.user.User;
import y22.q;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.utils.e;
import t02.r1;
import y41.i;

public class f$a$a implements LiveActivityRedPacketBaseUserInfoView$a	// class@0009a3
{
    public final boolean a;
    public final f$a b;

    public void f$a$a(f$a p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void H1(){
       if (PatchProxy.applyVoid(null, this, f$a$a.class, "2")) {
          return;
       }
       f$a a = this.b.a;
       f$a$a ta = this.a;
       Objects.requireNonNull(a);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), a, uof, "4")) {
          if (ta == null) {
             b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "canClickAvatar == false");
          }else {
             f u = a.u;
             if (u == null) {
                b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "onAvatarViewClick mUserInfo == null");
             }else if(a.p == null){
                b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "onAvatarViewClick mLiveRouterService == null");
             }else {
                i l = u.l;
                if (TextUtils.isEmpty(l)) {
                   b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "onAvatarViewClick avatarActionUrl == null");
                }else {
                   h.c(a.q.a(), a.r.a(), a.r.d(), a.r.b(), "HEAD", a.r.c());
                   a.p.r4(l, a.getContext());
                }
             }
          }
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, f$a$a.class, str)) {
          return;
       }
       f$a a = this.b.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (!PatchProxy.applyVoid(objArray, a, f.class, "6") && a.t != null) {
          f u = a.u;
          if (u == null || (u.c() != null && a.getActivity() instanceof GifshowActivity)) {
             e uoe = new e(a);
             LiveFollowExtParams$a uoa = new LiveFollowExtParams$a();
             uoa.e(a.u.f);
             uoa.f(a.u.g);
             uoa.b(a.u.i);
             f u1 = a.u;
             Objects.requireNonNull(u1);
             str = PatchProxy.apply(objArray, u1, oi, str);
             if (str != patchProxyRe) {
             }else {
                str = TextUtils.k(u1.j);
             }
             uoa.c(str);
             f u2 = a.u;
             Objects.requireNonNull(u2);
             String str1 = PatchProxy.apply(objArray, u2, oi, "2");
             if (str1 != patchProxyRe) {
             }else {
                str1 = TextUtils.k(u2.k);
             }
             uoa.d(str1);
             i$a uoa1 = new i$a(a.getActivity(), a.q.getLiveStreamId());
             uoa1.o(UserInfo.convertToQUser(a.u.c()));
             uoa1.n(139);
             uoa1.r(false);
             uoa1.h(q.f());
             uoa1.g(uoa.a());
             uoa1.e(uoe);
             a b = a.r.b;
             if (b != null) {
                uoa1.m(e.j(b.c));
             }
             a a1 = a.r.a;
             if (a1 != null) {
                uoa1.m(a1.T());
             }
             uoa1.a().c();
          }
       }
    label_00e5 :
       h.c(this.b.a.q.a(), this.b.a.r.a(), this.b.a.r.d(), this.b.a.r.b(), "FOLLOW_OVERT", this.b.a.r.c());
       return;
    }
}
