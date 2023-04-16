package com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$b;
import n92.z;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo;
import ekd.j;
import qk.m;
import n92.m;
import ok.o;
import com.google.common.base.Optional;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import n92.y;
import java.lang.Boolean;
import android.animation.AnimatorSet;

public class LiveAudienceGuestActivityTopListPresenterV2$b implements z	// class@000bc9
{
    public final LiveAudienceGuestActivityTopListPresenterV2 a;

    public void LiveAudienceGuestActivityTopListPresenterV2$b(LiveAudienceGuestActivityTopListPresenterV2 p0){
       this.a = p0;
       super();
    }
    public UserInfo a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveAudienceGuestActivityTopListPresenterV2$b obj = PatchProxy.apply(objArray, this, LiveAudienceGuestActivityTopListPresenterV2$b.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, LiveAudienceGuestActivityTopListPresenterV2.class, "8");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(obj.R > 0){
          LiveAudienceGuestActivityTopListPresenterV2 u = obj.U;
          if (u != null && !j.h(u.specialAudienceRankInfo)) {
             LiveActivitySignalMessage$LiveSpecialAudienceRankInfo liveSpecialA = m.t(obj.U.specialAudienceRankInfo).r(new m(obj)).orNull();
             if (liveSpecialA != null) {
                liveSpecialA = liveSpecialA.specialAudienceUser;
                if (liveSpecialA != null) {
                   objArray = UserInfo.convertFromProto(liveSpecialA);
                }
             }
          }
       }
       return objArray;
    }
    public void b(){
       y.a(this);
    }
    public void c(){
       y.b(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGuestActivityTopListPresenterV2$b.class, "3")) {
          return;
       }
       LiveAudienceGuestActivityTopListPresenterV2$b ta = this.a;
       if (ta.L == null) {
          ta.e9();
       }
       return;
    }
    public boolean e(){
       return this.a.L;
    }
    public void f(LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGuestActivityTopListPresenterV2$b.class, "1")) {
          return;
       }
       LiveAudienceGuestActivityTopListPresenterV2$b ta = this.a;
       ta.U = p0;
       ta.T = p0.extraMessage;
       if (ta.L != null) {
          ta.c9(p0, false);
       }
       return;
    }
    public boolean g(){
       LiveAudienceGuestActivityTopListPresenterV2 obj = PatchProxy.apply(null, this, LiveAudienceGuestActivityTopListPresenterV2$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.M;
       boolean b = (obj != null && obj.isRunning())? true: false;
       return b;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGuestActivityTopListPresenterV2$b.class, "4")) {
          return;
       }
       this.a.b9();
       return;
    }
}
