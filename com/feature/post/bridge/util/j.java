package com.feature.post.bridge.util.j;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams;
import og.b1;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.feature.post.bridge.util.PostVideoHelper;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import w26.c;
import r16.f;
import ixc.c;
import lnc.pa;
import lnc.qa;
import g26.b;
import om6.f;
import hn6.c;
import com.kwai.robust.PatchProxyResult;
import qm6.b$a;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import java.lang.Integer;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import wh5.c;
import e17.i;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam$a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import android.content.Intent;
import android.os.Bundle;
import n3d.a;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$PairedPhotoParams;
import android.content.Context;
import ekd.p0;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import brd.t;
import com.yxcorp.gifshow.feed.g;
import t45.d;
import brd.z;
import com.feature.post.bridge.util.f;
import erd.o;
import og.y;
import og.z;
import crd.b;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import o79.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo;
import tkd.b;
import tkd.d;
import ul9.c;
import android.app.Activity;
import og.c0;
import og.x;
import og.w;
import com.feature.post.bridge.util.PostVideoHelper$d;
import lnc.s6;
import lnc.a1;
import og.h0;
import wkd.b;
import rfc.a;
import com.feature.post.bridge.util.i;
import com.feature.post.bridge.util.e;
import og.a0;
import og.i0;
import og.g0;
import brd.w;
import erd.c;
import og.k0;
import og.j0;

public final class j implements g	// class@0014d4
{
    public final GifshowActivity b;
    public final JsCameraCallbackParams c;
    public final b1 d;

    public void j(GifshowActivity p0,JsCameraCallbackParams p1,b1 p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       Object[] objArray;
       PatchProxyResult patchProxyRe1;
       b$a uoa2;
       int i3;
       PostVideoHelper$c uoc1;
       b$a uoa4;
       PatchProxyResult patchProxyRe2;
       j oj1;
       t ot;
       ProgressFragment progressFrag;
       l ol;
       j oj = this;
       j b = oj.b;
       j c = oj.c;
       j d = oj.d;
       PostVideoHelper$c a = PostVideoHelper.a;
       if (a != null) {
       }else {
          a = new PostVideoHelper$c();
          a.a = y6.r(RecordPostPlugin.class);
          a.b = y6.r(c.class);
          a.c = y6.r(f.class);
          a.d = qa.r(c.class);
          a.e = y6.r(b.class);
          a.f = y6.r(f.class);
          a.g = y6.r(c.class);
          PostVideoHelper.a = a;
       }
       PostVideoHelper$c uoc = a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$a uoa = b$a.class;
       if (c != null) {
          JsCameraCallbackParams mParam = c.mParam;
          if (mParam == null) {
          label_0522 :
             PostVideoHelper.h("null params for uploadShopVideo", d);
          }else {
             String str = "PostVideoHelper";
             boolean b1 = -1;
             int i = 0;
             int b2 = true;
             if (!TextUtils.x(mParam.mUploadId) && Integer.parseInt(c.mParam.mUploadId) != b1) {
                objArray = new Object[i];
                l.D().w(str, "postVideo uploadId: "+c.mParam.mUploadId, objArray);
                PostVideoHelper.a(d, Integer.parseInt(c.mParam.mUploadId), uoc);
                uoc.c.o1(Integer.parseInt(c.mParam.mUploadId), i, b2);
             }else {
                boolean i1 = 412;
                int i2 = 0x7f11066a;
                if (!c.g()) {
                   i.a(i2, R.string.arg_RES_7f10054d);
                   d.d(new JsErrorResult(i1, R.string.arg_RES_7f10054d));
                }else {
                   JsCameraCallbackParams mParam1 = c.mParam;
                   JsCameraCallbackParams$Param param = (mParam1 != null && mParam1.mAllowJumpFlashTemplate != null)? 1: null;
                   if (param) {
                      if (TextUtils.x(mParam1.mFlashTemplateId)) {
                         PostVideoHelper.h("empty FlashTemplateId", d);
                      }else {
                         KuaishanPageParam$a uoa1 = new KuaishanPageParam$a();
                         uoa1.i(mParam1.mFlashTemplateId);
                         if (!TextUtils.x(mParam1.mFlashGroupId)) {
                            uoa1.h(mParam1.mFlashGroupId);
                         }
                         if (!TextUtils.x(mParam1.mExternalTaskId)) {
                            uoa1.k(mParam1.mExternalTaskId);
                         }
                         i1 = (mParam1.mReturnToWeb == null && mParam1.mReturnToOriginalPage == null)? true: false;
                         uoa1.g(i1);
                         Intent intent = uoc.e.v10(b, uoa1.f());
                         if (intent == null) {
                            PostVideoHelper.h("kuaishanPreview start failed", d);
                         }else {
                            intent.putExtras(PostVideoHelper.b(mParam1));
                            objArray = new Object[b2];
                            objArray[i] = "goToKuaishanPreview";
                            l.D().w(str, "discardCurrentPostSession", objArray);
                            intent.putExtra("discard_current_post_session", b2);
                            b.t1(intent, 1006, PostVideoHelper.l(d, uoc));
                         }
                      }
                   }else {
                      String str1 = null;
                      if (mParam1 != null) {
                         param = mParam1.mPairedPhotoParams;
                         if (param == null) {
                         label_0259 :
                            p0 = mParam1;
                            patchProxyRe1 = patchProxyRe;
                            uoa2 = uoa;
                            i3 = 0;
                         label_0260 :
                            uoc1 = null;
                         }else if(TextUtils.x(param.mPhotoId) || TextUtils.x(mParam1.mPairedPhotoParams.mType)){
                            p0 = mParam1;
                            patchProxyRe1 = patchProxyRe;
                            uoa2 = uoa;
                            i3 = 0;
                            PostVideoHelper.h("empty photoId or type", d);
                            goto label_0260 ;
                         }else {
                            param = mParam1.mPairedPhotoParams;
                            StringBuilder str3 = (!TextUtils.n(param.mType, "sameFrame") && (TextUtils.n(param.mType, "followShoot") || TextUtils.n(param.mType, "lipsSync")))? 1: null;
                            if (!str3) {
                               PostVideoHelper.h("invalid type="+mParam1.mPairedPhotoParams.mType, d);
                               ol = null;
                            }else if(!p0.C(b)){
                               Object[] objArray2 = new Object[i];
                               l.D().w(str, "net is not connected", objArray2);
                               b2 = 0x7f1038e5;
                               d.d(new JsErrorResult(i1, b2));
                               i.a(i2, b2);
                               ol = 1;
                            }else {
                               objArray = new Object[i];
                               l.D().w(str, "goToPairVideoPage with params:  "+mParam1.mPairedPhotoParams.toString(), objArray);
                               ProgressFragment progressFrag2 = PostVideoHelper.o(b, mParam1);
                               Bundle uBundle = PostVideoHelper.b(mParam1);
                               y oy = i1;
                               y oy1 = i1;
                               patchProxyRe1 = patchProxyRe;
                               Bundle uBundle1 = uBundle;
                               uoa2 = uoa;
                               p0 = mParam1;
                               i3 = 0;
                               oy = new y(progressFrag2, b, uBundle1, mParam1, d, uoc);
                               PostVideoHelper.i(b, g.e(mParam1.mPairedPhotoParams.mPhotoId, str1).observeOn(d.c).concatMap(new f(mParam1, b, uoc, uBundle)).observeOn(d.a).subscribe(oy1, new z(progressFrag2, b, uoc)), progressFrag2);
                               uoc1 = 1;
                            }
                            uoc1 = ol;
                            p0 = mParam1;
                            patchProxyRe1 = patchProxyRe;
                            uoa2 = uoa;
                            i3 = 0;
                         }
                      }else {
                         goto label_0259 ;
                      }
                      if (!uoc1) {
                         int recordMode = c.getRecordMode();
                         objArray = new Object[i3];
                         l.D().w(str, "recordMode="+recordMode, objArray);
                         b$a uoa3 = new b$a(b, recordMode);
                         JsCameraCallbackParams jsCameraCall = p0;
                         if (jsCameraCall.mFinishCallBack != null) {
                            i1 = 1;
                            uoa3.Z(jsCameraCall.generateWholeUploadParams()).i0(i1);
                         }else {
                            oj1 = 1;
                         }
                         uoa3.O(jsCameraCall.mMockFeedOption);
                         param = jsCameraCall.mAlbumTabList;
                         if (param != null) {
                            String str2 = "video";
                            if (str2.equals(param)) {
                               uoa3.j(a.d);
                            }else {
                               str1 = "image";
                               if (str1.equals(jsCameraCall.mAlbumTabList)) {
                                  uoa3.j(a.c);
                               }else if((jsCameraCall.mAlbumTabList).contains(str2) && (jsCameraCall.mAlbumTabList).contains(str1)){
                                  uoa3.j(a.b);
                               }else if(("all").equals(jsCameraCall.mAlbumTabList)){
                                  uoa3.j(a.a);
                               }else if(("mix").equals(jsCameraCall.mAlbumTabList)){
                                  uoa3.j(a.e);
                               }
                            }
                         }
                         if (("juxing").equals(jsCameraCall.mSource)) {
                            uoa3.N1 = " ";
                         }
                         uoa3.b2 = jsCameraCall.mTaskType;
                         param = jsCameraCall.mHideSmartAlbum;
                         if (PatchProxy.isSupport(uoa2)) {
                            uoa4 = uoa2;
                            patchProxyRe2 = patchProxyRe1;
                            if (PatchProxy.applyOneRefs(Boolean.valueOf(param), uoa3, uoa4, "30") != patchProxyRe2) {
                            label_032b :
                               uoa3.z(jsCameraCall.mHideAICut);
                               param = jsCameraCall.mDisableCameraTabBottomLine;
                               if (PatchProxy.isSupport(uoa4) && PatchProxy.applyOneRefs(Boolean.valueOf(param), uoa3, uoa4, "3") != patchProxyRe2) {
                               }else {
                                  uoa3.e2 = param;
                               }
                               uoa3.A(jsCameraCall.mInitialCaption);
                               param = jsCameraCall.mDisablePublishInfoEdit;
                               if (PatchProxy.isSupport(uoa4) && PatchProxy.applyOneRefs(Boolean.valueOf(param), uoa3, uoa4, "84") != patchProxyRe2) {
                               }else {
                                  uoa3.S1 = param;
                               }
                               param = jsCameraCall.mDisablePublishInfoEditToast;
                               if (PatchProxy.applyOneRefs(param, uoa3, uoa4, "87") != patchProxyRe2) {
                               }else {
                                  uoa3.P1 = param;
                               }
                               param = jsCameraCall.mDisableUploadCompletedToast;
                               if (PatchProxy.isSupport(uoa4) && PatchProxy.applyOneRefs(Boolean.valueOf(param), uoa3, uoa4, "85") != patchProxyRe2) {
                               }else {
                                  uoa3.Q1 = param;
                               }
                               param = jsCameraCall.mDisableUploadForbidDialog;
                               if (PatchProxy.isSupport(uoa4) && PatchProxy.applyOneRefs(Boolean.valueOf(param), uoa3, uoa4, "86") != patchProxyRe2) {
                               }else {
                                  uoa3.R1 = param;
                               }
                               uoa3.a2 = jsCameraCall.mActivitySource;
                               uoa3.C(jsCameraCall.mInteractStickerType);
                               param = jsCameraCall.mChallengeStickerInfo;
                               if (param != null && !TextUtils.x(param.challengeTopic)) {
                                  uoa3.n(jsCameraCall.mChallengeStickerInfo);
                               }
                               b1 = PostVideoHelper.j(b);
                               if (jsCameraCall.mIsFromAdShowcase != null) {
                                  oj1 = b;
                                  x ox = new x(oj1, uoa3, jsCameraCall, d, b1, uoc);
                                  PostVideoHelper.i(b, d.a(-1281240646).sM(oj1, "commercial_showcase_record", 0, 0).flatMap(new c0(b, jsCameraCall)).observeOn(d.a).subscribe(i3, new w(b, uoc)), null);
                               }else {
                                  z oz = null;
                                  PostVideoHelper$d uod = new PostVideoHelper$d(jsCameraCall);
                                  if (s6.H()) {
                                     if (!TextUtils.x(jsCameraCall.mMagicFaceId)) {
                                        uoa3.M(jsCameraCall.mMagicFaceId);
                                     }
                                     if (!TextUtils.x(jsCameraCall.mChildMagicFaceId)) {
                                        uoa3.o(jsCameraCall.mChildMagicFaceId);
                                     }
                                     if (!TextUtils.x(jsCameraCall.mMusicId)) {
                                        uoa3.S(jsCameraCall.mMusicId);
                                        uoa3.W(jsCameraCall.mMusicType);
                                     }
                                     ot = t.just(uoa3);
                                     progressFrag = oz;
                                  }else {
                                     ProgressFragment progressFrag1 = PostVideoHelper.o(b, jsCameraCall);
                                     Object[] objArray1 = new Object[i3];
                                     l.D().w(str, "onMagicFaceStartLoad diff is "+a1.o(uod.a), objArray1);
                                     uod.b = a1.k();
                                     objArray1 = new Object[i3];
                                     l.D().w(str, "onMusicStartLoad diff is "+a1.o(uod.a), objArray1);
                                     uod.c = a1.k();
                                     if (PostVideoHelper.e(jsCameraCall) != -1) {
                                        i1 = false;
                                     }
                                     t ot1 = PostVideoHelper.n(b1, jsCameraCall, i1, uoc).doOnNext(new h0(uod));
                                     if (TextUtils.x(jsCameraCall.mMusicId)) {
                                        ot = t.just(uoa3);
                                     }else {
                                        z c1 = d.c;
                                        t ot2 = b.a(0x4a533fa).h(jsCameraCall.mMusicId, jsCameraCall.mMusicType).map(i.b).observeOn(c1).concatMap(new e(recordMode)).observeOn(c1);
                                        ot = ot2.map(new a0(recordMode, uoa3, jsCameraCall));
                                     }
                                     ot = t.zip(ot1, ot.doOnNext(new i0(uod)), new g0(jsCameraCall));
                                     progressFrag = progressFrag1;
                                  }
                                  k0 ok0 = new k0(uod, progressFrag, b, uoa3, jsCameraCall, d, b1, uoc);
                                  PostVideoHelper.i(b, ot.observeOn(d.a).subscribe(str, new j0(uod, progressFrag, b, uoc)), progressFrag);
                               }
                            }
                         }else {
                            patchProxyRe2 = patchProxyRe1;
                            uoa4 = uoa2;
                         }
                         uoa3.M1 = param;
                         goto label_032b ;
                      }
                   }
                }
             }
          }
       }else {
          goto label_0522 ;
       }
       return;
    }
}
