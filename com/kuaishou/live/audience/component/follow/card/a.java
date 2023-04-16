package com.kuaishou.live.audience.component.follow.card.a;
import com.kuaishou.live.audience.component.follow.card.d;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import qy0.c;
import com.kuaishou.live.audience.component.follow.card.e;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceActivityFollowCardFragment;
import t02.a0;
import k2b.e0;
import z12.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import qy0.a;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.live.audience.component.follow.LiveAudienceFollowCardUser;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import com.kuaishou.protobuf.livestream.nano.LiveFollowProto$SCFollowPopup;
import com.kuaishou.protobuf.livestream.nano.LiveFollowProto$FollowPopupUserInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.follow.cache.c;
import qy0.h;
import java.lang.Runnable;
import e93.f;

public class a extends d	// class@000ac9
{
    public static String sLivePresenterClassName = "LiveAudienceActivityFollowCardPresenter";

    public void a(){
       super();
    }
    public LiveAudienceBaseActivityFollowCardFragment P8(){
       e uoe;
       LiveAudienceActivityFollowCardFragment obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 97;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          uoe = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uod, "5");
          if (uoe != PatchProxyResult.class) {
          label_002e :
             obj = PatchProxy.applyOneRefs(uoe, null, LiveAudienceActivityFollowCardFragment.class, "1");
             if (obj != PatchProxyResult.class) {
             }else {
                obj = new LiveAudienceActivityFollowCardFragment();
                obj.F = uoe;
             }
             return obj;
          }
       }
       uoe = new e(this, i);
       goto label_002e ;
    }
    public int S8(){
       return 1;
    }
    public void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       e0 uoe0 = x.l(this.p);
       ClientContent$LiveStreamPackage liveStreamPa = this.p.Z2.a();
       d tq = this.q;
       d ts = this.s;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(uoe0, liveStreamPa, tq, Long.valueOf(ts), null, a.class, "1")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContent$BatchUserPackage uBatchUserPa = PatchProxy.applyOneRefs(tq, objArray, a.class, "3");
          if (uBatchUserPa != PatchProxyResult.class) {
          }else {
             uBatchUserPa = new ClientContent$BatchUserPackage();
             if (!tq.isEmpty()) {
                ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[tq.size()];
                for (int i = 0; i < tq.size(); i = i1) {
                   ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                   userPackage.identity = TextUtils.k(tq.get(i).mUserId);
                   int i1 = i + 1;
                   userPackage.index = i1;
                   String str = (tq.get(i).mIsFollowed != null)? "1": "0";
                   userPackage.params = str;
                   userPackageA[i] = userPackage;
                }
                uBatchUserPa.userPackage = userPackageA;
             }
          }
          uContentPack.batchUserPackage = uBatchUserPa;
          u1.C0("", uoe0, 3, a.a(ts), uContentPack);
       }
       return;
    }
    public void W8(LiveAudienceFollowCardUser p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       e0 uoe0 = x.l(this.p);
       ClientContent$LiveStreamPackage liveStreamPa = this.p.Z2.a();
       int i = this.q.indexOf(p0) + 1;
       d ts = this.s;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{uoe0,liveStreamPa,p0,Integer.valueOf(i),Long.valueOf(ts)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
          label_006f :
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = TextUtils.k(p0.mUserId);
       userPackage.index = i;
       uContentPack.userPackage = userPackage;
       u1.L("", uoe0, 1, a.a(ts), uContentPack);
       goto label_006f ;
    }
    public void X8(LiveFollowProto$SCFollowPopup p0){
       LiveFollowProto$SCFollowPopup displayDurat;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "4")) {
          this.q.clear();
          displayDurat = p0.userInfo;
          int len = displayDurat.length;
          int i = 0;
          while (i < len) {
             object oobject = displayDurat[i];
             if (oobject != null) {
                LiveFollowProto$FollowPopupUserInfo userBaseInfo = oobject.userBaseInfo;
                if (userBaseInfo != null) {
                   String str = String.valueOf(userBaseInfo.userId);
                   LiveAudienceFollowCardUser liveAudience = new LiveAudienceFollowCardUser(str);
                   liveAudience.mUserInfo = UserInfo.convertFromProto(userBaseInfo);
                   liveAudience.mDescription = oobject.note;
                   liveAudience.mIsFollowed = c.b().c(str);
                   this.q.add(liveAudience);
                }
             }
             i = i + 1;
          }
       }
       displayDurat = p0.displayDuration;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Long.valueOf(displayDurat), this, uod, "6")) {
          f.h("showFollowCardPopup", new h(this, displayDurat));
       }
       return;
    }
}
