package com.yxcorp.gifshow.photo.download.utils.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import fxb.d$a;
import com.yxcorp.gifshow.photo.download.task.b;
import fxb.d;
import com.yxcorp.retrofit.model.KwaiException;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kxb.e;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import java.lang.Boolean;
import com.yxcorp.gifshow.photo.download.utils.e;
import wkd.b;
import zwb.a;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import cjd.e;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.util.Objects;
import fxb.c;
import java.lang.Runnable;
import t45.c;
import org.greenrobot.eventbus.a;
import zca.e;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoWatermarkDetailPackage;
import java.io.File;
import com.yxcorp.gifshow.media.util.c;
import java.lang.System;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import org.json.JSONObject;
import com.yxcorp.gifshow.photo.download.model.PhotoStage;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import ekd.j;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import org.json.JSONException;

public class c	// class@000f23
{

    public void c(){
       super();
    }
    public static void a(QPhoto p0,Throwable p1,long p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, c.class, "6")) {
          return;
       }
       d$a uoa = new d$a();
       uoa.d = p1;
       uoa.e = p2;
       b.h.f(uoa);
       if (p1 instanceof KwaiException) {
          KwaiException kwaiExceptio = i3.f();
          kwaiExceptio.c("type", Integer.valueOf(p1.getErrorCode()));
          String str = kwaiExceptio.e();
          e.h(p0.mEntity, "PHOTO_DOWNLOAD_FAIL_TOAST", str, 7);
       }
       return;
    }
    public static void b(QPhoto p0,StatModel p1,e0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "4")) {
          return;
       }
       c.c(p0, p1, p2, null);
       return;
    }
    public static void c(QPhoto p0,StatModel p1,e0 p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c.class, "5")) {
          return;
       }
       int i = 1167;
       String str = "download_click_cancel";
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), str, null, e.class, "8")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (p0 != null) {
             uContentPack.photoPackage = w1.f(p0.mEntity);
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = i;
          uElementPack.name = str;
          u1.u(1, uElementPack, uContentPack);
       }
       c.f(p0, 9, null, p1, p2, p3);
       return;
    }
    public static void d(QPhoto p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "3")) {
          return;
       }
       if (!e.d(p0)) {
          b.a(-258426948).c(p0.getPhotoId(), QCurrentUser.ME.getId(), p1).map(new e()).subscribe(Functions.d(), Functions.d());
       }
       return;
    }
    public static void e(QPhoto p0,int p1,StatModel p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, c.class, "2")) {
          return;
       }
       d h = b.h;
       StatModel mStartTime = p2.mStartTime;
       Objects.requireNonNull(h);
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(mStartTime), Integer.valueOf(p1), h, d.class, "7")) {
          c uoc = new c(h, p0, mStartTime, p1);
          c.a(PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(mStartTime), Integer.valueOf(p1), h, d.class, "7"));
       }
       if (p1 == 7) {
          a.d().k(new e(true, p0.getPhotoId()));
          c.d(p0, true);
       }else {
          a.d().k(new e(false, p0.getPhotoId()));
          c.d(p0, false);
       }
       return;
    }
    public static void f(QPhoto p0,int p1,String p2,StatModel p3,e0 p4,String p5){
       Object[] objArray;
       JSONObject jSONObject;
       object oobject = p0;
       int i = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p5;
       c uoc = c.class;
       String str = "1";
       ClientContent$PhotoPackage obj = null;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 0;
       int i5 = 6;
       int i6 = 1;
       int i7 = 2;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[i5];
          objArray[i4] = oobject;
          objArray[i6] = Integer.valueOf(p1);
          objArray[i7] = oobject1;
          objArray[i3] = oobject2;
          objArray[i2] = p4;
          objArray[i1] = oobject3;
          if (PatchProxy.applyVoid(objArray, obj, uoc, str)) {
             return;
          }
       }
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          objArray = new Object[i5];
          objArray[i4] = oobject;
          objArray[i6] = oobject2;
          objArray[i7] = Integer.valueOf(p1);
          objArray[i3] = oobject1;
          objArray[i2] = p4;
          objArray[i1] = oobject3;
          if (!PatchProxy.applyVoid(objArray, obj, uoe, "15")) {
          label_0059 :
             h$b uob = h$b.d(i, 1182);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (oobject != null) {
                obj = w1.g(oobject.mEntity, p0.getPosition());
                uContentPack.photoPackage = obj;
                i3 oi3 = i3.f();
                oi3.d("search_session_id", p0.getSearchSessionId());
                obj.extraInfo = oi3.e();
                ClientContent$AtlasPackage uAtlasPackag = new ClientContent$AtlasPackage();
                if (p0.isAtlasPhotos()) {
                   uAtlasPackag.type = i6;
                }else if(p0.isLongPhotos()){
                   uAtlasPackag.type = i7;
                }
                uContentPack.atlasPackage = uAtlasPackag;
                uob.l(r1.O0(oobject.mEntity));
             }
             ClientContent$VideoWatermarkDetailPackage videoWaterma = new ClientContent$VideoWatermarkDetailPackage();
             videoWaterma.type = oobject2.mWaterMarkType;
             StatModel mLocalFile = oobject2.mLocalFile;
             if (mLocalFile != null && mLocalFile.exists()) {
                videoWaterma.duration = (long)c.i(oobject2.mLocalFile.getAbsolutePath());
                videoWaterma.length = oobject2.mLocalFile.length();
             }
             long l = System.currentTimeMillis() - oobject2.mStartTime;
             videoWaterma.cost = l;
             videoWaterma.downloadUrl = TextUtils.k(oobject2.mDownloadUrl);
             uContentPack.videoWatermarkDetailPackage = videoWaterma;
             if (!TextUtils.x(p2)) {
                ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
                resultPackag.message = oobject1;
                uob.q(resultPackag);
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             if (TextUtils.n(oobject2.mSource, "downloadSinglePicFromDialog")) {
                uElementPack.action2 = "PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON";
             }else if(TextUtils.n(oobject2.mSource, "downloadSingleLongPicFromDialog")){
                uElementPack.action2 = "PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON";
             }else if(oobject3 != null){
                uElementPack.action2 = oobject3;
             }
             try{
                jSONObject = new JSONObject();
                StatModel mLocalFile1 = oobject2.mLocalFile;
                if (mLocalFile1 != null) {
                   jSONObject.put("filePath", mLocalFile1.getPath());
                label_012a :
                   jSONObject.put("download_type", "NORMAL");
                   jSONObject.put("source", oobject2.mSource);
                   jSONObject.put("photo_stage", oobject2.mPhotoStage.name);
                   if (oobject != null && (p0.isSinglePhoto() || !j.h(r1.n0(oobject.mEntity)))) {
                      String str1 = "num";
                      String str2 = (p0.isSinglePhoto())? str: Integer.toString(r1.n0(oobject.mEntity).length);
                      jSONObject.put(str1, str2);
                      if (!TextUtils.x(oobject2.mDownloadIndex)) {
                         jSONObject.put("download_index", oobject2.mDownloadIndex);
                      }else if(p0.isSinglePhoto()){
                         str = "VERTICAL";
                      }
                      jSONObject.put("download_index", str);
                   }
                   Iterator iterator = oobject2.mElementParams.entrySet().iterator();
                   if (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      str = uEntry.getKey();
                      jSONObject.put(str, uEntry.getValue());
                   }
                }else {
                   goto label_012a ;
                }
             }catch(org.json.JSONException e0){
                e0.printStackTrace();
             }
             uElementPack.params = TextUtils.I(jSONObject.toString());
             uob.k(uElementPack);
             uob.h(uContentPack);
             u1.p0("", e.c(p4), uob);
             if (oobject2.mNeedCdnReport != null) {
                e.j(p0.getPhotoId(), oobject2.mLocalFile, e.a(p0), l, oobject2.mIsNetDownload, oobject2.mDownloadUrl, e.b(p1));
             }
          }
       }else {
          goto label_0059 ;
       }
       c.e(oobject, i, oobject2);
       return;
    }
    public static void g(QPhoto p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoc, "7")) {
          return;
       }
       if (p1 == 7) {
          a.d().k(new e(true, p0.getPhotoId()));
          c.d(p0, true);
       }else {
          a.d().k(new e(false, p0.getPhotoId()));
          c.d(p0, false);
       }
       return;
    }
}
