package com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.ScrollView;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import z5c.k0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import kp.r1;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import lnc.i3;
import java.lang.Float;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import wkd.b;
import o3c.l;
import brd.t;
import a2c.v;
import a2c.w;
import erd.g;
import crd.b;
import t45.d;
import brd.z;
import a2c.p;
import erd.o;
import a2c.q;
import exc.l;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.v7;
import a2c.t;
import a2c.u;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.rx.RxBus;
import i3c.d;

public final class ProfileCropVideoSizePresenter$b extends m	// class@001253
{
    public final ProfileCropVideoSizePresenter c;

    public void ProfileCropVideoSizePresenter$b(ProfileCropVideoSizePresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCropVideoSizePresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ProfileCropVideoSizePresenter$b tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, ProfileCropVideoSizePresenter.class, "8")) {
          ProfileCropVideoSizePresenter q = tc.q;
          if (q == null) {
             a.S("mTextureView");
          }
          int height = q.getHeight();
          float f = ((float)tc.B * tc.W8()) / (float)2;
          ProfileCropVideoSizePresenter r = tc.r;
          if (r == null) {
             a.S("mScrollView");
          }
          int scrollY = r.getScrollY();
          ProfileCropVideoSizePresenter x = tc.x;
          String str = "mVideoInfo";
          if (x == null) {
             a.S(str);
          }
          x.setShowAreaCenterYRadio(((f + (float)scrollY) / (float)height));
          ProfileBackgroundPublishManager profileBackg = ProfileBackgroundPublishManager.j.a();
          ProfileCropVideoSizePresenter x1 = tc.x;
          if (x1 == null) {
             a.S(str);
          }
          Objects.requireNonNull(profileBackg);
          ProfileBackgroundPublishManager profileBackg1 = ProfileBackgroundPublishManager.class;
          if (!PatchProxy.applyVoidOneRefs(x1, profileBackg, profileBackg1, "14")) {
             a.p(x1, "videoInfo");
             if (k0.f() && x1.getFeed() != null) {
                if (!PatchProxy.applyVoidOneRefs(x1, profileBackg, profileBackg1, "15")) {
                   profileBackg.c = x1;
                   BaseFeed feed = x1.getFeed();
                   if (feed != null) {
                      ProfileBackgroundPublishManager c = profileBackg.c;
                      if (c != null) {
                         str = feed.getId();
                         a.o(str, "feed.id");
                         c.setZtPhotoId(str);
                      }
                      c = profileBackg.c;
                      if (c != null) {
                         CDNUrl[] uCDNUrlArray = r1.F0(feed);
                         if (uCDNUrlArray != null) {
                            objArray = ArraysKt___ArraysKt.uy(uCDNUrlArray);
                         }
                         c.setCoverUrls(objArray);
                      }
                      profileBackg.o(x1);
                      i3 oi3 = i3.f();
                      oi3.c("showAreaCenterYRadio", Float.valueOf(x1.getShowAreaCenterYRadio()));
                      oi3.c("mediaType", Integer.valueOf(3));
                      float f1 = (float)1000;
                      oi3.c("clipStart", Float.valueOf(((float)x1.getClipStart() / f1)));
                      oi3.c("clipDuration", Float.valueOf(((float)x1.getClipDuration() / f1)));
                      g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "modifyVideoBg photo: "+feed.getId());
                      b.a(0x37313f08).i(feed.getId(), oi3.e()).subscribe(new v(profileBackg, x1), new w(profileBackg, x1));
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(x1, profileBackg, profileBackg1, "16")){
                profileBackg.c = x1;
                t.just(x1).subscribeOn(d.c).observeOn(d.a).map(p.b).subscribe(new q(profileBackg));
                t ot = new t(profileBackg, x1);
                v7.s(l.class, LoadPolicy.DIALOG).R(ot, u.b);
             }
          }
          Activity activity = tc.getActivity();
          if (activity != null) {
             activity.finishAffinity();
          }
          RxBus.f.b(new d());
       }
       return;
    }
}
