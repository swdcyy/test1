package com.kuaishou.live.core.show.profilecard.LiveLiteProfileCardPresenter;
import b93.d;
import ne2.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import android.app.Application;
import o56.a;
import wkd.b;
import c0d.a;
import android.content.Context;
import msd.a;
import com.kuaishou.live.materialresource.MaterialResourceManagerUpdateStrategyKt;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig;
import java.lang.reflect.Type;
import wg3.a;
import ne2.g;
import vq5.b;
import vq5.d;
import c93.b;
import or5.d;
import xp5.i;
import x83.a;
import d93.a;
import e93.c;
import xa3.a;
import kg1.h;
import d93.b;
import sc3.a;
import sc3.a$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import e17.i;
import b61.a;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import xp5.g;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import wa1.f;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import ne2.e;
import ok.x;
import kg1.b;
import ne2.h;
import cf2.c;
import ne2.i;
import pg1.d;
import tx1.b;
import com.kuaishou.live.core.show.profilecard.LiveProfileFragmentV2;
import t02.a0;
import t02.r1;
import bb1.a;
import ne2.j;
import ne2.k;
import ne2.d;
import ne2.c;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;

public class LiveLiteProfileCardPresenter extends d	// class@000db6
{
    public a A;
    public h B;
    public LiveProfileFragmentV2 C;
    public LiveProfileFeedCacheManager D;
    public boolean E;
    public final a F;
    public d v;
    public i w;
    public d x;
    public a y;
    public c z;

    public void LiveLiteProfileCardPresenter(){
       super();
       this.E = false;
       this.F = new f(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteProfileCardPresenter.class, "4")) {
          return;
       }
       super.F8();
       LiveMaterialResourceManager h = LiveMaterialResourceManager.h;
       h.c(a.b(), b.a(0x1a7467ca));
       h.d(MaterialResourceManagerUpdateStrategyKt.a());
       this.D = new LiveProfileFeedCacheManager(a.D(LiveConfigStartupResponse$LiveProfileConfig.class).mLiveProfileMaxCacheUserProductCount);
       this.E = true;
       this.x.t5("profile", new g(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteProfileCardPresenter.class, "5")) {
          return;
       }
       this.E = false;
       this.x.Z4("profile");
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteProfileCardPresenter.class, "2")) {
          return;
       }
       this.v = p0.a(d.class);
       this.w = p0.a(i.class);
       this.y = p0.a(a.class);
       this.x = p0.a(d.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteProfileCardPresenter.class, "3")) {
          return;
       }
       this.z = p0.a(c.class);
       this.A = p0.a(a.class);
       this.B = p0.a(h.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteProfileCardPresenter.class, "1")) {
          return;
       }
       p0.d(a.class, this.F);
       return;
    }
    public final void c9(a$a p0){
       LiveProfileMode lITE_SPECIAL;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteProfileCardPresenter liveLiteProf = LiveLiteProfileCardPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLiteProf, "6")) {
          return;
       }
       if (this.E == null) {
          b.Z(LiveLogTag.LIVE_PROFILE, "LiveLiteProfileCardPresenter.showLiveProfile -> not created, return");
          return;
       }else {
          UserProfile mProfile = p0.a.mProfile;
          UserInfo mId = mProfile.mId;
          if (!this.y.b(mProfile, p0.d)) {
             i.a(R.style.arg_RES_7f110668, 0x7f102512);
             return;
          }else if(a.e(mProfile)){
             lITE_SPECIAL = LiveProfileMode.LITE_SPECIAL_ROLE;
          }else {
             lITE_SPECIAL = LiveProfileMode.LITE_AUDIENCE_VIEW_OTHERS;
          }
          b.d0(LiveLogTag.LIVE_PROFILE, "LiveLiteProfileCardPresenter.showLiveProfile", "params", p0, "profileMode", lITE_SPECIAL);
          LiveApiParams$AssistantType aUDIENCE = LiveApiParams$AssistantType.AUDIENCE;
          LiveLiteProfileCardPresenter tv = this.v;
          Objects.requireNonNull(tv);
          LiveProfileParams liveProfileP = new LiveProfileParams().setLiveProfileFeedCacheManager(this.D).setOriginUserAssType(aUDIENCE).setAnchorUserId(this.v.d()).setUserProfile(p0.a).setTargetUserAssType(aUDIENCE).setOriginUserAssPrivilege(new LiveAdminPrivilege()).setClickType(p0.b.getValue()).setCanOpenFullProfile(true).setLogUrl(f.a(this.v.r5())).setBaseFeed(this.v.j0()).setProfileOriginSource(p0.e).setFollowSource(p0.f).setLiveStreamIdSupplier(new e(tv)).setShouldForceRemoveLiveFeedInPhotoList(p0.c);
          h oh = PatchProxy.apply(null, this, liveLiteProf, "7");
          if (oh != patchProxyRe) {
          }else {
             oh = new h(this);
          }
          liveProfileP = liveProfileP.setFansGroupServiceSupplier(oh);
          i oi = PatchProxy.apply(null, this, liveLiteProf, "8");
          if (oi != patchProxyRe) {
          }else {
             oi = new i(this);
          }
          liveProfileP = liveProfileP.setLogInfoSupplier(oi);
          if (d.c.b()) {
             b uob = new b();
             uob.a = d.a();
             liveProfileP.setProfileExtParams(uob);
          }
          LiveProfileFragmentV2 liveProfileF = new LiveProfileFragmentV2(null, null);
          this.C = liveProfileF;
          j oj = PatchProxy.apply(null, this, liveLiteProf, "9");
          if (oj != patchProxyRe) {
          }else {
             oj = new j(this);
          }
          liveProfileF.b5(oj);
          this.C.O4(lITE_SPECIAL);
          this.C.b9(liveProfileP);
          this.C.pe(new k(mId, new d(this)));
          this.C.k0(new c(this));
          this.C.Fh(R.style.arg_RES_7f1103d9);
          this.C.Cb(this.z.b(), "lite-profile-card");
          return;
       }
    }
}
