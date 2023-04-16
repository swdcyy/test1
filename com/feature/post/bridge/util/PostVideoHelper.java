package com.feature.post.bridge.util.PostVideoHelper;
import og.b1;
import com.feature.post.bridge.util.PostVideoHelper$c;
import com.feature.post.bridge.util.PostVideoHelper$a;
import r26.e;
import w26.c;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import android.os.Bundle;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.io.File;
import com.kuaishou.android.model.music.Music;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.music.utils.o;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import ekd.k1;
import com.yxcorp.gifshow.media.util.c;
import og.l;
import java.lang.Long;
import java.lang.Integer;
import q87.c;
import r6b.b;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qm6.b$a;
import lnc.s;
import com.kwai.robust.PatchProxyResult;
import qm6.b;
import android.content.Intent;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.ArrayList;
import qm6.a;
import nm6.a;
import com.kuaishou.android.model.mix.Location;
import tkd.b;
import tkd.d;
import gm9.b;
import xx5.d;
import android.app.Activity;
import nm6.b;
import java.util.Collection;
import ekd.q;
import n3d.a;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import s3b.a;
import ixc.c;
import java.lang.Exception;
import com.feature.post.bridge.util.PostVideoHelper$PairNotSupportException;
import e17.i;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import lnc.i1;
import crd.b;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.feature.post.bridge.util.PostVideoHelper$3;
import androidx.lifecycle.LifecycleObserver;
import ekd.j0;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$PairedPhotoParams;
import pm6.o;
import pm6.a;
import og.v;
import r26.a;
import java.util.HashMap;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.feature.post.bridge.jsmodel.JsUploadVideoResult;
import java.util.Map;
import brd.t;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import t45.d;
import brd.z;
import com.feature.post.bridge.util.g;
import erd.o;
import og.b0;
import lnc.a1;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

public final class PostVideoHelper	// class@0014c4
{
    public static PostVideoHelper$c a;

    public static void a(b1 p0,int p1,PostVideoHelper$c p2){
       p0.b(new PostVideoHelper$a(p1, p0, p2), p2.b);
    }
    public static Bundle b(JsCameraCallbackParams$Param p0){
       Bundle uBundle = new Bundle();
       uBundle.putString("activity", p0.mActivity);
       JsCameraCallbackParams$Param mTag = (TextUtils.x(p0.mTopic))? p0.mTag: p0.mTopic;
       if (!TextUtils.x(mTag)) {
          uBundle.putString("tag", mTag);
       }
       if (!TextUtils.x(p0.mTopicSource)) {
          uBundle.putString("topicSource", p0.mTopicSource);
       }
       SerializableHook.putSerializable(uBundle, "conversionTaskList", p0.mConversionTaskList);
       uBundle.putInt("entranceTaskType", p0.mTaskType);
       if (!TextUtils.x(p0.mAtFriends)) {
          SerializableHook.putSerializable(uBundle, "atFriends", p0.mAtFriends);
       }
       if (!TextUtils.x(p0.mMagicAutoSearchKeyword)) {
          SerializableHook.putSerializable(uBundle, "magicAutoSearchKeyword", p0.mMagicAutoSearchKeyword);
       }
       uBundle.putInt("magicAutoSearchSourceType", p0.mMagicAutoSearchSource);
       mTag = p0.mDisableUploadCompletedToast;
       if (mTag != null) {
          uBundle.putBoolean("disableUploadCompletedToast", mTag);
       }
       mTag = p0.mDisableUploadForbidDialog;
       if (mTag != null) {
          uBundle.putBoolean("disableBannedAlert", mTag);
       }
       if (!TextUtils.x(p0.mActivitySource)) {
          uBundle.putString("activitySource", p0.mActivitySource);
       }
       p0.writeBundle(uBundle);
       return uBundle;
    }
    public static Pair c(File p0,Music p1,boolean p2){
       File uFile1;
       Object[] objArray3;
       long l = TimeUnit.MINUTES.toMillis(1);
       MusicType musicType = (p2)? null: o.h(p1);
       long l1 = musicType;
       Music mType = p1.mType;
       int i = 1;
       if (mType == MusicType.SOUNDTRACK || mType == MusicType.LIP) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p1.mType.getValue());
          Object[] objArray1 = new Object[0];
          l.D().w("PostVideoHelper", String.format("origin file type=%d", objArray), objArray1);
          return new Pair(p1, p0);
       }else {
          File uFile = b.a(-1504323719).o();
          String str = "audio-"+k1.j()+".mp4";
          try{
             uFile1 = new File(uFile, str);
             long l2 = (long)c.i(p0.getPath());
             Object[] objArray2 = new Object[]{p0.getAbsolutePath(),uFile1.getAbsolutePath(),Long.valueOf(l1),Long.valueOf(l2),Long.valueOf(l),Integer.valueOf(p1.mType.getValue())};
             objArray3 = new Object[0];
             l.D().w("PostVideoHelper", String.format("clip input=%s, output=%s, start=%d, d=%d, newD=%d, t=%d", objArray2), objArray3);
             b.g(p0, l2, uFile1, l1, l);
             return new Pair(p1, uFile1);
          }catch(java.io.IOException e0){
             objArray3 = new Object[v11];
             l.D().u(v2, e0, objArray3);
             uFile1.delete();
             return new Pair(p1, p0);
          }
       }
    }
    public static void d(ProgressFragment p0){
       if (p0 != null && (p0.getFragmentManager() != null && p0.isAdded())) {
          Object[] objArray = new Object[0];
          l.D().s("PostVideoHelper", "dismiss ProgressFragment", objArray);
          p0.dismissAllowingStateLoss();
       }
    label_001f :
       return;
    }
    public static int e(JsCameraCallbackParams$Param p0){
       if (p0 == null) {
          return -1;
       }
       return p0.mMagicDownloadBarStyle;
    }
    public static void f(GifshowActivity p0,b$a p1,JsCameraCallbackParams$Param p2,b1 p3,boolean p4,PostVideoHelper$c p5){
       Intent intent;
       int i1;
       boolean b;
       if (!p5.a.isAvailable()) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$a uoa = b$a.class;
       if (p2 == null) {
          Object[] objArray = new Object[0];
          l.D().w("PostVideoHelper", "generateIntent with null iParam", objArray);
          intent = p5.a.NM(p1.f());
       }else {
          b$a uoa1 = p1.h(p2.mActivity).F(p2.mFlashTemplateId).E(p2.mFlashGroupId).D(p2.mAllowJumpFlashTemplate);
          JsCameraCallbackParams$Param mShowKuaisha = p2.mShowKuaishanPopupOnCameraPage;
          Objects.requireNonNull(uoa1);
          if (PatchProxy.isSupport(uoa)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(mShowKuaisha), uoa1, uoa, "14");
             if (obj != patchProxyRe) {
                uoa1 = obj;
             label_005f :
                mShowKuaisha = (TextUtils.x(p2.mTopic))? p2.mTag: p2.mTopic;
                uoa1 = uoa1.e0(mShowKuaisha);
                mShowKuaisha = p2.mAtFriends;
                Objects.requireNonNull(uoa1);
                obj = PatchProxy.applyOneRefs(mShowKuaisha, uoa1, uoa, "10");
                uoa1 = (obj != patchProxyRe)? obj: mShowKuaisha;
                mShowKuaisha = p2.mMagicAutoSearchKeyword;
                Objects.requireNonNull(uoa1);
                obj = PatchProxy.applyOneRefs(mShowKuaisha, uoa1, uoa, "35");
                String str1 = (obj != patchProxyRe)? obj: mShowKuaisha;
                mShowKuaisha = p2.mMagicAutoSearchSource;
                Objects.requireNonNull(str1);
                if (PatchProxy.isSupport(uoa)) {
                   obj = PatchProxy.applyOneRefs(Integer.valueOf(mShowKuaisha), str1, uoa, "36");
                   if (obj != patchProxyRe) {
                      str1 = obj;
                   label_00b3 :
                      str1.w(p2.mForbidRecoverDraft);
                      b = (p2.mReturnToOriginalPage != null || p2.mReturnToWeb != null)? true: false;
                      uoa1 = str1.Y(b);
                      uoa1.v(a.b(p2.mTabList));
                      mShowKuaisha = p2.mWorkboxGroupId;
                      obj = PatchProxy.applyOneRefs(mShowKuaisha, uoa1, uoa, "15");
                      uoa1 = (obj != patchProxyRe)? obj: mShowKuaisha;
                      uoa1.y(a.a(a.a(p2.mFrom)));
                      p1.A(p2.mInitialCaption);
                      JsCameraCallbackParams$Param mPosterActiv = p2.mPosterActivityTabInfo;
                      if (PatchProxy.applyOneRefs(mPosterActiv, p1, uoa, "2") != patchProxyRe) {
                      }else {
                         p1.d2 = mPosterActiv;
                      }
                      if (!TextUtils.x(p2.mTopicSource)) {
                         mPosterActiv = p2.mTopicSource;
                         if (PatchProxy.applyOneRefs(mPosterActiv, p1, uoa, "8") != patchProxyRe) {
                         }else {
                            p1.f2 = mPosterActiv;
                         }
                      }
                      if (p2.mPoiId && !TextUtils.x(p2.mTitle)) {
                         Location location = new Location();
                         location.latitude = p2.mLatitude;
                         location.longitude = p2.mLongitude;
                         location.mAddress = p2.mAddress;
                         location.mId = p2.mPoiId;
                         location.mTitle = p2.mTitle;
                         location.mCity = p2.mCity;
                         if (PatchProxy.applyOneRefs(location, p1, uoa, "17") != patchProxyRe) {
                         }else {
                            p1.v = location;
                         }
                      }
                      if (p2.mDisableAllScreenFrameMode != null) {
                         if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Boolean.TRUE, p1, uoa, "18") != patchProxyRe) {
                         }else {
                            p1.w = true;
                         }
                      }
                      if (!TextUtils.x(p2.mExternalTaskId)) {
                         p1.h0(p2.mExternalTaskId);
                      }
                      intent = (p2.mIsFromAdShowcase != null)? d.a(0x29d652b0).iZ(p1.f()): p5.a.NM(p1.f());
                      intent.putExtra("conversionTaskList", p2.mConversionTaskList);
                      d.a(-734569516).gG(intent, p2.mTunaTaskInfo);
                   }
                }
                str1.B = mShowKuaisha;
                goto label_00b3 ;
             }
          }
          uoa1.s = mShowKuaisha;
          goto label_005f ;
       }
       String str = "is_return_camera";
       int i = -1;
       if (p2 != null && (p2.mAllowReturnToCamera != null && p4)) {
          intent.putExtra(str, true);
          p0.setResult(i, intent);
          p0.finish();
          Object[] objArray1 = new Object[0];
          l.D().w("PostVideoHelper", "back to old CameraActivity", objArray1);
          return;
       }else {
          Object[] objArray2 = new Object[0];
          l.D().w("PostVideoHelper", "jump to new CameraActivity", objArray2);
          intent.putExtra(str, 0);
          if (p2 != null) {
             i1 = b.a(p2.mTab);
             if (i1 != i) {
                intent.putExtra("camera_constant_default_select_tab", i1);
                if (i1 == 1 || (i1 == 5 && !TextUtils.x(p2.mPanelType))) {
                   intent.putExtra("showPanelType", p2.mPanelType);
                }
             }
          }
          if (p2 != null) {
             ArrayList uArrayList = a.b(p2.mTabList);
             if (!q.f(uArrayList)) {
                SerializableHook.putExtra(intent, "fixedCameraTabItems", uArrayList);
             }
          }
          if (p2 != null && !TextUtils.x(p2.mSource)) {
             i1 = a.a(p2.mSource);
             if (i1 != i) {
                intent.putExtra("camera_page_source", i1);
             }
          }
          if (p2 != null && !TextUtils.x(p2.mFrom)) {
             i1 = a.a(p2.mFrom);
             if (i1 != i) {
                intent.putExtra("camera_page_from", a.a(i1));
             }
          }
          if (p2 != null && p2.mShowHalfAlbum != null) {
             intent.putExtra("show_half_album_view", true);
          }
          Object[] objArray3 = new Object[true];
          objArray3[0] = "goCameraActivity";
          l.D().w("PostVideoHelper", "discardCurrentPostSession", objArray3);
          intent.putExtra("discard_current_post_session", true);
          p2.writeIntent(intent);
          p0.t1(intent, 19, PostVideoHelper.l(p3, p5));
          return;
       }
    }
    public static void g(Throwable p0,ProgressFragment p1,Activity p2,PostVideoHelper$c p3){
       Object[] objArray = new Object[0];
       l.D().u("PostVideoHelper", p0, objArray);
       PostVideoHelper.d(p1);
       if (p0 instanceof UnSupportedMagicException) {
          p3.d.KA().i(p0);
       }else if(p0 instanceof PostVideoHelper$PairNotSupportException){
          int i = (p0.mIsDeviceNotSupport != null)? 0x7f10006e: 0x7f104333;
          i.a(R.style.arg_RES_7f11066a, i);
       }else {
          Object[] objArray1 = new Object[0];
          l.D().u("PostVideoHelper", p0, objArray1);
          ExceptionHandler.handleException(p2, p0);
       }
       return;
    }
    public static void h(String p0,b1 p1){
       if (p1 != null) {
          p1.d(new JsErrorResult(412, p0));
       }
       i1.c(new Throwable("PostVideoHelper"+p0));
       return;
    }
    public static void i(GifshowActivity p0,b p1,ProgressFragment p2){
       p0.getLifecycle().addObserver(new PostVideoHelper$3(p1, p2));
    }
    public static boolean j(GifshowActivity p0){
       Uri uri;
       Intent intent = p0.getIntent();
       if (intent != null) {
          String str = j0.f(intent, "KEY_URL");
          if (!TextUtils.x(str)) {
             uri = w0.f(str);
          label_0018 :
             l ol = l.D();
             int i = 1;
             Object[] objArray = new Object[i];
             String str1 = (intent == null)? "": intent.toUri(0);
             objArray[0] = str1;
             objArray = new Object[0];
             ol.w("PostVideoHelper", String.format("source=%s", objArray), objArray);
             if (uri == null || !TextUtils.n("camera", w0.a(uri, "ks_from"))) {
                i = false;
             }
             return i;
          }
       }
       uri = null;
       goto label_0018 ;
    }
    public static boolean k(JsCameraCallbackParams$Param p0,QPhoto p1){
       if (TextUtils.n(p0.mPairedPhotoParams.mType, "sameFrame")) {
          return o.a(p1, true);
       }
       if (TextUtils.n(p0.mPairedPhotoParams.mType, "followShoot") || TextUtils.n(p0.mPairedPhotoParams.mType, "lipsSync")) {
          return a.a(p1.disableFollowShoot(), p1.isVideoAndNotKtv());
       }
       return false;
    }
    public static a l(b1 p0,PostVideoHelper$c p1){
       return new v(p0, p1);
    }
    public static void m(a p0,b1 p1){
       HashMap hashMap = new HashMap();
       hashMap.put("isPublished", Boolean.toString(true));
       hashMap.put("progress", "100");
       if (p0 != null) {
          hashMap.put("uploadId", String.valueOf(p0.getId()));
          if (p0.getUploadInfo() != null) {
             hashMap.put("filePath", p0.getUploadInfo().getFilePath());
             UploadResult uploadResult = p0.getUploadInfo().getUploadResult();
             if (uploadResult != null) {
                hashMap.put("photoId", uploadResult.getPhotoId());
                hashMap.put("coverUrl", uploadResult.getThumbUrl());
                hashMap.put("videoUrl", uploadResult.getVideoUrl());
             }
             hashMap.put("coverKey", p0.getUploadInfo().getCoverKey());
             int i = (p0.getEncodeInfo().isSinglePicture())? 2: 1;
             hashMap.put("mediaSourceType", String.valueOf(i));
          }
       }
       p1.a(new JsUploadVideoResult(hashMap, true));
       return;
    }
    public static t n(boolean p0,JsCameraCallbackParams$Param p1,boolean p2,PostVideoHelper$c p3){
       if (TextUtils.x(p1.mMagicFaceId)) {
          return t.just(new MagicEmoji$MagicFace());
       }
       JsCameraCallbackParams$Param mPairedPhoto = p1.mPairedPhotoParams;
       if (mPairedPhoto != null && (("followShoot").equals(mPairedPhoto.mType) || ("lipsSync").equals(p1.mPairedPhotoParams.mType))) {
          return t.just(new MagicEmoji$MagicFace());
       }
       t ot = p3.d.KA().g(p1.mMagicFaceId, p1.mChildMagicFaceId, MagicBusinessId.VIDEO, false);
       if (!p2) {
          return ot;
       }
       return ot.observeOn(d.c).concatMap(new g(p3)).onErrorResumeNext(new b0(p1));
    }
    public static ProgressFragment o(GifshowActivity p0,JsCameraCallbackParams$Param p1){
       if (TextUtils.x(p1.mMagicFaceId) && TextUtils.x(p1.mMusicId)) {
          p1 = p1.mPairedPhotoParams;
          if (p1 == null || TextUtils.x(p1.mPhotoId)) {
             return null;
          }
       }
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.Jh(a1.p(R.string.arg_RES_7f103667));
       progressFrag.setCancelable(true);
       progressFrag.show(p0.getSupportFragmentManager(), "post_video_progress");
       Object[] objArray = new Object[0];
       l.D().s("PostVideoHelper", "show ProgressFragment", objArray);
       return progressFrag;
    }
}
