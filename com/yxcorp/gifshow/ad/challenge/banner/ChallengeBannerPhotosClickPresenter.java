package com.yxcorp.gifshow.ad.challenge.banner.ChallengeBannerPhotosClickPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.challenge.banner.ChallengeBannerPhotosClickPresenter$onBind$1;
import android.view.View;
import msd.l;
import lnc.y0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.TagChallengeBannerInfo;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import oy8.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import d6a.f;
import ny8.d;
import java.util.List;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import tkd.b;
import tkd.d;
import wm5.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import vm5.o;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class ChallengeBannerPhotosClickPresenter extends PresenterV2	// class@00152f
{
    public KwaiImageView p;
    public BaseFeed q;
    public Fragment r;
    public TagChallengeBannerInfo s;

    public void ChallengeBannerPhotosClickPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ChallengeBannerPhotosClickPresenter.class, "3")) {
          return;
       }
       ChallengeBannerPhotosClickPresenter tp = this.p;
       if (tp != null) {
          y0.a(tp, new ChallengeBannerPhotosClickPresenter$onBind$1(this));
       }
       return;
    }
    public final void P8(){
       String str1;
       Object[] objArray2;
       String str4;
       a a;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, ChallengeBannerPhotosClickPresenter.class, "4")) {
          return;
       }
       ChallengeBannerPhotosClickPresenter q = obj.q;
       if (q != null) {
          ChallengeBannerPhotosClickPresenter r = obj.r;
          Bundle arguments = (r != null)? r.getArguments(): objArray;
          String str = "";
          if (arguments != null) {
             str1 = arguments.getString("tag_name");
             if (str1 != null) {
             label_002a :
                a.o(str1, "bundle?.getString\(TagParams.KEY_TAG_NAME\) ?: \"\"");
                String str2 = (arguments != null)? arguments.getString("tag_id"): objArray;
                int i = 0;
                int intx = (arguments != null)? arguments.getInt("tag_type", i): 0;
                ChallengeBannerPhotosClickPresenter s = obj.s;
                TagChallengeBannerInfo tagChallenge = (s != null)? s.mActivityId: objArray;
                String id = q.getId();
                String str3 = r1.U1(q);
                a uoa = a.class;
                int i1 = 4;
                int i2 = 1;
                if (PatchProxy.isSupport(uoa)) {
                   Object[] objArray1 = new Object[]{str2,Integer.valueOf(intx),str1,tagChallenge,id,str3};
                   if (PatchProxy.applyVoid(objArray1, objArray, uoa, "3")) {
                      objArray2 = objArray;
                   }else {
                   label_0080 :
                      a = a.a;
                      uoa = a;
                      a uoa2 = a;
                      str4 = str3;
                      if (!uoa.a(str2, Integer.valueOf(intx), str1, tagChallenge, id)) {
                         objArray2 = null;
                      }else {
                         ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                         uClickEvent.urlPackage = uoa2.e(str2, intx, str1);
                         uClickEvent.elementPackage = uoa2.d("SAMPLE_VIDEO_COVER");
                         uClickEvent.contentPackage = uoa2.c(tagChallenge, id, str4);
                         objArray2 = null;
                         b.a(0x4b316083).B(str, uClickEvent, objArray2);
                      }
                   }
                }else {
                   goto label_0080 ;
                }
                PhotoDetailParam photoDetailP = new PhotoDetailParam(new QPhoto(obj.q)).setSource(15);
                a.o(photoDetailP, "param");
                photoDetailP.getSlidePlayConfig().setEnablePullRefresh(false);
                str4 = f.b(obj.r);
                a.o(str4, "SlidePlayDataFetcher.buildFetcherId\(mFragment\)");
                s = obj.s;
                if (s != null) {
                   objArray2 = s.mBaseFeeds;
                }
                b.g(j.e(new d(objArray2), str4, SlideMediaType.PHOTO));
                photoDetailP.setSlidePlayId(str4);
                photoDetailP.setBizType(4);
                NasaSlideParam$a uoa1 = new NasaSlideParam$a();
                uoa1.T("DETAIL");
                uoa1.Z("tag");
                uoa1.Y("search_entrance_hashtag_detail");
                uoa1.H(str1);
                uoa1.q(true);
                Activity uActivity = this.getActivity();
                a.m(uActivity);
                d.a(0x66aa3a58).z20(uActivity, 1025, photoDetailP, obj.p, r1.w0(q).mWidth, r1.w0(q).mHeight, uoa1.a(), true, null);
             }
          }
          str1 = str;
          goto label_002a ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChallengeBannerPhotosClickPresenter.class, "1")) {
          return;
       }
       KwaiImageView kwaiImageVie = (p0 != null)? p0.findViewById(R.id.banner_photos_cover): null;
       this.p = kwaiImageVie;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ChallengeBannerPhotosClickPresenter.class, "2")) {
          return;
       }
       this.s = this.t8("TAG_CHALLENGE_BANNER");
       this.q = this.s8(BaseFeed.class);
       this.r = this.t8("PageForLog");
       return;
    }
}
