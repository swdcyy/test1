package com.yxcorp.gifshow.ad.challenge.ranklist.ChallengeRankItemClickPresenter$a;
import qvb.q;
import com.yxcorp.gifshow.ad.challenge.ranklist.ChallengeRankItemClickPresenter;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.TagChallengeBannerInfo;
import com.yxcorp.gifshow.ad.challenge.model.RankListItemInfo;
import oy8.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import tkd.b;
import tkd.d;
import wm5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import android.view.View;
import vm5.o;
import qvb.a;

public final class ChallengeRankItemClickPresenter$a implements q	// class@001533
{
    public final ChallengeRankItemClickPresenter b;

    public void ChallengeRankItemClickPresenter$a(ChallengeRankItemClickPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       String str1;
       a a;
       Object obj = this;
       ChallengeRankItemClickPresenter$a uoa = ChallengeRankItemClickPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, uoa, "1")) {
          return;
       }
       uoa = obj.b;
       ChallengeRankItemClickPresenter v = uoa.v;
       if (v != null) {
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(v, uoa, ChallengeRankItemClickPresenter.class, "6") && (v.getFragmentManager() != null && v.isAdded())) {
             v.dismissAllowingStateLoss();
          }
       }
       Fragment uFragment = obj.b.P8();
       RankListItemInfo obj1 = null;
       Bundle arguments = (uFragment != null)? uFragment.getArguments(): obj1;
       String str = "";
       if (arguments != null) {
          str1 = arguments.getString("tag_name");
          if (str1 != null) {
          label_005b :
             a.o(str1, "bundle?.getString\(TagParams.KEY_TAG_NAME\) ?: \"\"");
             String str2 = (arguments != null)? arguments.getString("tag_id"): obj1;
             int i = 0;
             int intx = (arguments != null)? arguments.getInt("tag_type", i): 0;
             ChallengeRankItemClickPresenter$a b = obj.b;
             ChallengeRankItemClickPresenter r = b.r;
             TagChallengeBannerInfo tagChallenge = (r != null)? r.mActivityId: obj1;
             RankListItemInfo rankListItem = b.R8();
             RankListItemInfo rankListItem1 = (rankListItem != null)? rankListItem.mPhotoId: obj1;
             rankListItem = obj.b.R8();
             RankListItemInfo rankListItem2 = (rankListItem != null)? rankListItem.mUserId: obj1;
             a uoa1 = a.class;
             int i1 = 4;
             int i2 = 1;
             if (PatchProxy.isSupport(uoa1)) {
                Object[] objArray = new Object[]{str2,Integer.valueOf(intx),str1,tagChallenge,rankListItem1,rankListItem2};
                if (!PatchProxy.applyVoid(objArray, obj1, uoa1, "7")) {
                label_00c2 :
                   a = a.a;
                   uoa1 = a;
                   a uoa3 = a;
                   if (uoa1.a(str2, Integer.valueOf(intx), str1, tagChallenge, rankListItem1)) {
                      ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                      uClickEvent.urlPackage = uoa3.e(str2, intx, str1);
                      uClickEvent.elementPackage = uoa3.d("INCOME_VIDEO_COVER");
                      uClickEvent.contentPackage = uoa3.c(tagChallenge, rankListItem1, rankListItem2);
                      b.a(0x4b316083).B(str, uClickEvent, obj1);
                   }
                }
             }else {
                goto label_00c2 ;
             }
             RankListItemInfo rankListItem3 = obj.b.R8();
             if (rankListItem3 != null && !TextUtils.x(rankListItem3.mPhotoId)) {
                obj1 = obj.b.R8();
                if (obj1 != null) {
                   obj1 = obj1.mPhotoId;
                   if (obj1 != null) {
                      str = obj1;
                   }
                }
                PhotoDetailParam photoDetailP = new PhotoDetailParam(str).setSource(15);
                a.o(photoDetailP, "param");
                photoDetailP.getSlidePlayConfig().setEnablePullRefresh(false);
                String str3 = f.b(obj.b.P8());
                a.o(str3, "SlidePlayDataFetcher.buildFetcherId\(mFragment\)");
                v = obj.b.u;
                if (v != null) {
                   b.g(j.e(v, str3, SlideMediaType.PHOTO));
                   photoDetailP.setSlidePlayId(str3);
                   photoDetailP.setBizType(4);
                   NasaSlideParam$a uoa2 = new NasaSlideParam$a();
                   uoa2.T("DETAIL");
                   uoa2.Z("tag");
                   uoa2.Y("search_entrance_hashtag_detail");
                   uoa2.q(true);
                   uoa2.H(str1);
                   Activity uActivity = obj.b.getActivity();
                   a.m(uActivity);
                   d.a(0x66aa3a58).z20(uActivity, 1025, photoDetailP, obj.b.p, a1.h(), a1.g(), uoa2.a(), true, null);
                   v.f(obj);
                }
             }
          label_019f :
             return;
          }
       }
       str1 = str;
       goto label_005b ;
    }
}
