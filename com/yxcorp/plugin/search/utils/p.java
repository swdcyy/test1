package com.yxcorp.plugin.search.utils.p;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import lyb.w;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lyb.w$a;
import com.kuaishou.android.model.feed.PhotoType;
import nfd.u0;
import android.view.View;
import com.yxcorp.plugin.search.response.SearchCommodityItem;
import com.yxcorp.gifshow.entity.QPhoto;
import zbd.e;
import q7d.d0;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import com.kuaishou.android.model.feed.SearchParams;
import nfd.b3;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import nfd.r3;
import oed.a;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam$a;
import com.search.common.entity.SearchBaseItem;
import android.os.SystemClock;
import tkd.b;
import tkd.d;
import os5.k;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import com.kwai.framework.model.user.User;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateUserFeed;
import e7d.h;
import com.yxcorp.plugin.search.SearchPage;
import nfd.c3;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.kbox.KBoxRealLog;
import cl8.a;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.ExtInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import os5.l;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e7d.f;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import ddd.i;
import com.kwai.framework.model.feed.BaseFeed;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yxb.b;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.plugin.search.http.a;
import nfd.g3;
import nfd.y0;
import w9d.c;
import qvb.a;
import lyb.a$a;
import d6a.f;
import ded.h;
import com.yxcorp.gifshow.nasa.NasaTagInfo;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import android.text.TextUtils;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.nasa.NasaTagInfo$MusicTagInfo;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import lyb.a;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import zbd.d;
import f7d.n;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.i;
import com.yxcorp.gifshow.detail.slideplay.c;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.util.ArrayList;
import java.util.Iterator;
import wkd.b;
import l66.a;
import dda.d;
import m66.a;
import os5.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import um6.j;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import nfd.w0;
import com.yxcorp.plugin.search.utils.m;
import erd.g;
import crd.b;
import com.kuaishou.android.model.mix.TagItem;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMusicFeed;
import nfd.g;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import com.kwai.feature.api.feed.tag.plugin.TagPluginHelper;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import jp5.b;
import nfd.q2;

public final class p	// class@0007af
{

    public void p(){
       super();
    }
    public static w a(SearchItem p0,SearchResultFragment p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, null, p.class, "39");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       w$a uoa = PatchProxy.apply(null, null, w.class, "1");
       boolean b = false;
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new w$a();
          uoa.a(true);
          uoa.c = true;
          uoa.d = -1;
          uoa.b = b;
          uoa.e = "";
          int[] ointArray = new int[true];
          ointArray[b] = PhotoType.VIDEO.toInt();
          uoa.f = ointArray;
       }
       uoa.a(b);
       uoa.g = new u0(p1);
       w ow = PatchProxy.apply(null, uoa, w$a.class, "1");
       if (ow != PatchProxyResult.class) {
       }else {
          ow = new w(uoa);
       }
       return ow;
    }
    public static void b(SearchResultFragment p0,View p1,SearchItem p2){
       SearchCommodityItem mPhoto;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, p.class, "35")) {
          return;
       }
       if (p2 != null) {
          SearchItem mGoods = p2.mGoods;
          if (mGoods != null) {
             mPhoto = mGoods.mPhoto;
             if (mPhoto != null) {
             label_001c :
                if (mPhoto == null) {
                   return;
                }else {
                   p.l(d0.d(p2, mPhoto), p0, p1, false, null);
                   return;
                }
             }
          }
       }
       mPhoto = null;
       goto label_001c ;
    }
    public static void c(SearchItem p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, p.class, "9")) {
          return;
       }
       QPhoto currentPhoto = p0.getCurrentPhoto();
       if (currentPhoto == null) {
          return;
       }
       PhotoMeta photoMeta = currentPhoto.getPhotoMeta();
       if (photoMeta != null && photoMeta.mLiveTipInfo != null) {
          String str = (p0.mItemType == SearchItem$SearchItemType.AD_PHOTO)? "AVERT": "LIVE_STREAM";
          SearchParams searchParams = b3.a(p0, str);
          searchParams.mPhotoId = currentPhoto.getPhotoId();
          a.a(p1, r3.e(searchParams, photoMeta.mLiveTipInfo, 5));
       }
       return;
    }
    public static void d(Activity p0,QPhoto p1,SearchItem p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, p.class, "7")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("type", "LIVE_PLAYBACK");
       oi3.c("pos", Integer.valueOf(p2.mRank));
       LivePlaybackParam$a uoa = new LivePlaybackParam$a();
       uoa.d(p1);
       uoa.b(false);
       uoa.i = p2.mSessionId;
       uoa.j = oi3.e();
       uoa.c(SystemClock.elapsedRealtime());
       d.a(-129360148).kr(p0, uoa.a());
       return;
    }
    public static void e(Activity p0,SearchItem p1,User p2,TemplateUserFeed p3,h p4,SearchPage p5,int p6){
       String str;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       if (PatchProxy.isSupport(p.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, p.class, "12")) {
             return;
          }
       }
       if (oobject4 != null) {
          oobject4.Q(oobject2, oobject1, p6);
       }
       LiveAudienceParam obj = PatchProxy.applyThreeRefs(p5, p1, p3, null, p.class, "23");
       if (obj != PatchProxyResult.class) {
       }else if(oobject5 == null || oobject5 == SearchPage.USER){
          obj = b3.a(oobject1, "USER_LIVE");
       }else if(c3.f(p1)){
          if (PatchProxy.isSupport(p.class)) {
             obj = PatchProxy.applyTwoRefs(oobject1, Boolean.TRUE, null, p.class, "24");
             if (obj != PatchProxyResult.class) {
             label_008d :
                obj.mSearchPosition = oobject1.mRank;
             }
          }
          if (oobject1.mItemType == SearchItem$SearchItemType.KBOX) {
             SearchItem mRealLog = oobject1.mRealLog;
             if (mRealLog != null) {
                str = a.a(mRealLog.mSearchItemType, 1);
             label_0089 :
                obj = b3.a(oobject1, str);
                goto label_008d ;
             }
          }
          str = "ALADDIN_JC_LIVE";
          goto label_0089 ;
       }else {
          obj = b3.a(oobject1, "LIVE_STREAM");
       }
       if (oobject3 != null) {
          TemplateBaseFeed mExtInfo = oobject3.mExtInfo;
          if (mExtInfo != null && !TextUtils.x(mExtInfo.mLiveGuidePopup)) {
             obj.mLiveGuidePopup = oobject3.mExtInfo.mLiveGuidePopup;
          }
       }
    label_00b3 :
       obj = r3.e(obj, oobject2.mLiveTipInfo, 91);
       if (!PatchProxy.applyVoidTwoRefs(p0, obj, null, p.class, "10")) {
          d.a(-1492894991).m1(p0, obj);
       }
       return;
    }
    public static void f(Activity p0,SearchItem p1,User p2,RecyclerFragment p3,h p4,f p5,int p6){
       int i;
       if (PatchProxy.isSupport(p.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, p.class, "18")) {
             return;
          }
       }
       if (p4 != null) {
          p4.Q(p2, p1, p6);
       }
       ProfileStartParam profileStart = ProfileStartParam.l(p2);
       if (i.h(p1)) {
          profileStart.x(p1.mPhoto.mEntity);
       }
       try{
          profileStart.q("SEARCH");
          if (!PatchProxy.applyVoidTwoRefs(p0, profileStart, null, p.class, "19")) {
             i = -1718536792;
             d.a(i).Y7(p0, profileStart);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void g(SearchItem p0,SearchResultFragment p1,View p2,boolean p3){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, p.class, "25")) {
          return;
       }
       p.h(p0, p1, p2, p3, p.a(p0, p1));
       return;
    }
    public static void h(SearchItem p0,SearchResultFragment p1,View p2,boolean p3,w p4){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, op, "26")) {
             return;
          }
       }
       p.i(p0, p1, p2, p3, p4, 0, 0);
       return;
    }
    public static void i(SearchItem p0,SearchResultFragment p1,View p2,boolean p3,w p4,int p5,int p6){
       boolean b;
       Object obj2;
       TagInfo mMagicFace;
       a uoa2;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       int i = 1;
       int i1 = 0;
       String str = null;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Boolean.valueOf(p3),oobject3,Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, str, op, "27")) {
             return;
          }
       }
       if (d.a(-430326918).cR(ActivityContext.g().e())) {
          return;
       }else if(p1.Vh() == null){
          return;
       }else {
          SearchPage searchPage = p1.kc();
          c obj = PatchProxy.applyTwoRefs(p0, searchPage, str, g3.class, "24");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             SearchItem mItemType = oobject.mItemType;
             b = (mItemType != SearchItem$SearchItemType.PHOTO && (mItemType != SearchItem$SearchItemType.TYPE_COLLECTION && (mItemType == SearchItem$SearchItemType.LIVE_STREAM || (mItemType == SearchItem$SearchItemType.AD_PHOTO && (y0.m() && searchPage == SearchPage.AGGREGATE)))))? true: false;
          }
          if (b) {
             obj = new c(oobject1.b1, p1.kc(), p0);
             obj.add(p0);
          }else {
             uoa2 = str;
          }
          oobject1.b1.R(p0);
          SearchItem tag = (oobject2 != null)? oobject2.getTag(R.id.photo_id): oobject.mEnterPhotoId;
          a$a uoa = new a$a();
          uoa.d(f.b(p1));
          uoa.b(i);
          if (!b) {
             uoa2 = p1.Vh();
          }
          uoa.m = obj;
          uoa.c(oobject2);
          uoa.g(p3);
          uoa.i(oobject3);
          uoa.j = p5;
          uoa.k = p6;
          uoa.i = b;
          SearchItem mTagInfo = oobject.mTagInfo;
          h oh = h.class;
          TagInfo obj1 = PatchProxy.applyOneRefs(mTagInfo, str, oh, "4");
          if (obj1 != patchProxyRe) {
          }else if(mTagInfo == null){
             obj1 = mTagInfo.mTagType;
             if (obj1 != 3) {
                if (obj1 == 4) {
                   obj2 = PatchProxy.applyOneRefs(mTagInfo, str, oh, "5");
                   if (obj2 != patchProxyRe) {
                   }else {
                      mMagicFace = mTagInfo.mMagicFace;
                      SimpleMagicFace simpleMagicF = (mMagicFace == null)? str: mMagicFace.mId;
                      if (!TextUtils.isEmpty(simpleMagicF)) {
                         NasaTagInfo nasaTagInfo = h.a();
                         nasaTagInfo.setMagicFace(mTagInfo.mMagicFace);
                         obj1 = nasaTagInfo;
                      }
                   }
                }
             }else {
                obj2 = PatchProxy.applyOneRefs(mTagInfo, str, oh, "6");
                if (obj2 != patchProxyRe) {
                }else {
                   mMagicFace = mTagInfo.mMusic;
                   if (mMagicFace == null || TextUtils.isEmpty(mMagicFace.mId)) {
                      obj2 = str;
                   }else {
                      obj2 = h.a();
                      obj2.setMusicInfo(new NasaTagInfo$MusicTagInfo(mMagicFace, mTagInfo.mMusicStartTime));
                   }
                }
             }
             obj1 = obj2;
          }
       label_0116 :
          obj1 = str;
          uoa.p = obj1;
          String str1 = "";
          String str2 = (oobject3 == null)? str1: oobject3.h;
          uoa.f(str2);
          if (p1.kc() != SearchPage.AGGREGATE) {
             i = false;
          }
          uoa.q = i;
          if (oobject3 != null) {
             i1 = oobject3.i;
          }
          uoa.e(i1);
          SearchItem mKBoxItem = oobject.mKBoxItem;
          if (mKBoxItem != null) {
             str1 = mKBoxItem.mSlideNoMoreText;
          }
          uoa.h(str1);
          uoa.t = "SEARCH";
          if (oobject.mIsHagTagItem != null) {
             uoa.t = "SEARCH_HASH_TAG";
          }
          a uoa1 = uoa.a();
          FragmentActivity activity = p1.getActivity();
          List items = p1.Vh().getItems();
          if (tag != null) {
             str = String.valueOf(tag);
          }
          n.c(activity, d0.f(items, p0, str), uoa1);
          return;
       }
    }
    public static void j(d p0,Fragment p1,View p2,boolean p3,w p4){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, op, "33")) {
             return;
          }
       }
       a$a uoa = new a$a();
       uoa.d(f.b(p1));
       uoa.b(0);
       uoa.c(p2);
       uoa.g(p3);
       uoa.i(p4);
       uoa.h(p0.e());
       uoa.s = p0.b();
       n.c(p1.getActivity(), p0, uoa.a());
       return;
    }
    public static void k(d p0,Fragment p1,View p2,boolean p3,w p4,String p5,boolean p6){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),null,p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, op, "34")) {
             return;
          }
       }
       a$a uoa = new a$a();
       uoa.d(f.b(p1));
       uoa.b(0);
       uoa.c(p2);
       uoa.g(p3);
       uoa.i(null);
       uoa.f(p5);
       uoa.e(p6);
       uoa.h(p0.e());
       n.c(p1.getActivity(), p0, uoa.a());
       return;
    }
    public static void l(e p0,Fragment p1,View p2,boolean p3,w p4){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),null};
          if (PatchProxy.applyVoid(objArray, null, op, "32")) {
             return;
          }
       }
       d uod = new d();
       uod.m(p0);
       uod.p = p0.b();
       p.j(uod, p1, p2, p3, null);
       return;
    }
    public static void m(QPhoto p0,SearchItem p1,SearchResultFragment p2,String p3,boolean p4,boolean p5){
       p op = p.class;
       MerchantAudienceParams merchantAudi = null;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, merchantAudi, op, "29")) {
             return;
          }
       }
       if (d.a(-430326918).cR(ActivityContext.g().e())) {
          return;
       }else if(p2.Vh() == null){
          return;
       }else {
          p2.b1.O(p0, p1);
          if (!TextUtils.x(p3)) {
             merchantAudi = MerchantAudienceParams.parseMerchantExtraInfo(p3);
          }
          LiveAudienceParam$a uoa = new LiveAudienceParam$a();
          uoa.s(merchantAudi);
          uoa.i(p0.getLiveStreamId());
          uoa.j(p0.getEntity());
          LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
          uob.o(91);
          uob.C(p0);
          uob.d(1);
          uob.c(1);
          uob.m(uoa.a());
          if (p4) {
             String str = f.b(p2);
             b.g(j.e(c.h(p2), str, c.i(-1, p1.mLivePhoto)));
             uob.F(str);
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p1.mKBoxItem.mKBoxFeeds.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().getQphoto());
             }
             uob.w(uArrayList);
          }
          int i = 0x6d2a4fdd;
          if (p5) {
             b.a(i).b(new d(p0.getEntity(), 142));
          }else {
             b.a(i).b(new d(p0.getEntity()));
          }
          d.a(-1835681758).b1(p2.getActivity(), uob.a());
          return;
       }
    }
    public static void n(Activity p0,Music p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, p.class, "2")) {
          return;
       }
       y6.s(j.class, LoadPolicy.DIALOG).R(new w0(p0, p1), m.b);
       return;
    }
    public static void o(Activity p0,SearchItem p1,int p2){
       Intent intent;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, p.class, "1")) {
          return;
       }
       SearchItem mTag = p1.mTag;
       if (mTag == null) {
          return;
       }
       ActivityInfo uActivityInf = c3.e(mTag.mName);
       boolean b = false;
       int i = (p1.mItemType == SearchItem$SearchItemType.MUSIC_TAG && p1.mTag.mMusic != null)? 1: 0;
       if (!i) {
          TemplateMusicFeed obj = PatchProxy.applyOneRefs(p1, null, op, "22");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p1.mKBoxItem == null){
             obj = g.b(p1);
             if (obj != null) {
                obj = obj.mMusicTag;
                if (obj != null && obj.mId != null) {
                   b = true;
                }
             }
          }
          if (b) {
          label_00fc :
             TagItem mMusic = mTag.mMusic;
             if (mMusic == null) {
                return;
             }else {
                b.m(mMusic, p2).k(p0);
             }
          }else if(uActivityInf != null){
             if (!TextUtils.x(uActivityInf.mUrl) && uActivityInf.mForceRedirectUrl != null) {
                intent = b.a(0x66dce92a).a(ActivityContext.g().e(), w0.f(uActivityInf.mUrl));
                if (intent != null) {
                   TagPluginHelper.b(ActivityContext.g().e(), intent);
                   return;
                }
             }
             if (uActivityInf.mTagType == 1) {
                intent = new Intent();
                intent.putExtra("tag_name", uActivityInf.mKeyword);
                intent.putExtra("tag_source", p2);
                intent.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100d4);
                TagPluginHelper.c(ActivityContext.g().e(), intent);
                return;
             }else if(PatchProxy.applyVoidOneRefs(uActivityInf, null, op, "4")){
                intent = ActivityContext.g().e();
                c.i(intent, KwaiWebViewActivity.N3(intent, uActivityInf.mUrl).a());
             }
          }else {
             Intent intent1 = new Intent();
             intent1.putExtra("tag_name", mTag.mName);
             intent1.putExtra("tag_source", p2);
             intent1.putExtra("kgId", p1.mKgId);
             intent1.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100d4);
             TagPluginHelper.c(p0, intent1);
          }
       }else {
          goto label_00fc ;
       }
       return;
    }
    public static void p(q2 p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, p.class, "8")) {
          return;
       }
       d uod = d0.b(p0.g, p0.h, p1);
       q2 a = p0.a;
       q2 b = (p2)? p0.b: 0;
       p.k(uod, a, b, false, null, p0.j, p0.k);
       return;
    }
    public static void q(q2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "20")) {
          return;
       }
       p.p(p0, false, true);
       return;
    }
}
