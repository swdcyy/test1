package com.yxcorp.gifshow.util.r0$d;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.util.r0;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.String;
import com.yxcorp.gifshow.util.r0$b;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.Object;
import java.util.Arrays;
import q87.c;
import java.lang.Void;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoSegmentPackage;
import com.yxcorp.gifshow.media.util.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.util.s0;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager;
import com.yxcorp.gifshow.util.y;
import java.util.concurrent.CountDownLatch;
import java.lang.InterruptedException;
import mca.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.video.clipkit.utils.Utils$Size;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import android.graphics.BitmapFactory$Options;
import com.yxcorp.gifshow.util.z;
import com.kwai.video.clipkit.log.ClipEditImageImportLog;
import java.lang.System;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.media.util.c;
import gq.a;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import q16.a$a;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qr4.i;
import km6.a;
import com.kwai.gifshow.post.api.core.model.VideoProduceTime;
import k2b.w;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lq.i;
import lq.e;
import java.util.Iterator;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Long;
import java.util.Map;
import z36.d$a;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import android.content.Intent;
import lq.a;
import com.yxcorp.gifshow.model.MultiplePhotosProject$Type;
import com.yxcorp.gifshow.model.MultiplePhotosProject$b;
import ekd.j0;
import com.kuaishou.android.post.StrArg;
import com.yxcorp.gifshow.util.r0$c;
import q16.a;
import tkd.b;
import tkd.d;
import r16.a;
import r16.d;
import com.yxcorp.gifshow.util.r0$e;
import w46.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public class r0$d extends d	// class@001f9c
{
    public boolean[] A;
    public b B;
    public boolean C;
    public boolean D;
    public String E;
    public String F;
    public final r0$b G;
    public ArrayList H;
    public final r0 I;
    public QMedia[] y;
    public List z;
    public static final int J;

    public void r0$d(r0 p0,QMedia[] p1,String p2,String p3,r0$b p4,boolean p5,boolean[] p6){
       this.I = p0;
       super(p0.r, p5);
       this.z = new ArrayList();
       this.H = new ArrayList();
       this.y = p1;
       this.F = p3;
       boolean b = true;
       int i = 0;
       boolean b1 = (p1 != null && p1.length > b)? true: false;
       this.C = b1;
       if (p1 == null || p1.length != b) {
          b = false;
       }
       this.D = b;
       this.t(R.string.loading);
       this.G = p4;
       this.E = p2;
       this.A = p6;
       Object[] objArray = new Object[i];
       a.D().w("BaseSelectedMediasHandler", "PhotoMovieLoader photos:"+Arrays.toString(p1)+",activityJson:"+p2+",needProgressDialog:"+p5+",mEnableUploadAtlas:"+this.C+",mIsSinglePicture:"+this.D, objArray);
       return;
    }
    public Object b(Object[] p0){
       Object[] objArray1;
       r0$d y1;
       object oobject1;
       QMedia path;
       BitmapFactory$Options options;
       ClipEditImageImportLog uClipEditIma;
       long l;
       double d;
       Bitmap uBitmap;
       File uFile;
       Object[] objArray5;
       QMedia path1;
       r0$d uod = this;
       b uob = null;
       uod.B = uob;
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "BaseSelectedMediasHandler";
       a.D().w(str, "doInBackground mPhotos:"+Arrays.toString(uod.y), objArray);
       r0$d y = uod.y;
       boolean b = true;
       if (y != null) {
          int len = y.length;
          int i1 = 0;
          while (i1 < len) {
             object oobject = y[i1];
             b0 uob0 = BitmapUtil.E(oobject.path);
             String str1 = "doInBackground dimension:";
             if (uob0.a < b || uob0.b < b) {
                objArray1 = new Object[i];
                a.D().w(str, str1+uob0, objArray1);
             }else {
                uod.z.add(oobject);
                if (uod.y.length == b) {
                   float f = (float)uob0.b / (float)uob0.a;
                   Object[] objArray2 = new Object[i];
                   a.D().w(str, "doInBackground single photo ratio:"+f, objArray2);
                   if (f - 0x4031c71c > 0) {
                      uod.D = i;
                      uod.C = b;
                   }
                }
                ClientContent$PhotoSegmentPackage photoSegment = new ClientContent$PhotoSegmentPackage();
                photoSegment.height = uob0.b;
                photoSegment.width = uob0.a;
                uArrayList.add(photoSegment);
                Object[] objArray3 = new Object[i];
                a.D().w(str, str1+uob0+",mLocationRetriever:"+uod.B, objArray3);
                if (uod.B == null) {
                   b uob1 = new b(oobject.path);
                   uob1.i();
                   if (uob1.f()) {
                      uod.B = uob1;
                   }
                }
                uod.H.add(new Size(uob0.a, uob0.b));
                objArray1 = new Object[i];
                a.D().w(str, "doInBackground photo size:"+uob0, objArray1);
             }
             i1 = i1 + 1;
          }
       }
       if (uod.C != null) {
          Object[] objArray4 = new Object[i];
          a.D().w(str, "doInBackground mEnableUploadAtlas mValidPhotos:"+uod.z, objArray4);
          MultiplePhotosProject multiplePhot = new MultiplePhotosProject(MultiplePhotosProject.c());
          b.m(multiplePhot.e());
          multiplePhot.a();
          String[] stringArray = new String[i];
          String[] stringArray1 = q.g(uod.z, s0.a).toArray(stringArray);
          multiplePhot.mPhotosSignStr = MultiplePhotosProject.b(stringArray1);
          MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf = new MultiplePhotosWorkManager$CropWorkInfo(multiplePhot.e(), stringArray1);
          MultiplePhotosWorkManager multiplePhot1 = MultiplePhotosWorkManager.f();
          multiplePhot1.e = uod.F;
          uod.I.f = multiplePhot1.c(uCropWorkInf, multiplePhot, uob);
          a uoa = a.D();
          String str2 = "doInBackground mPhotosSignStr:"+multiplePhot.mPhotosSignStr+",cropWorkInfo:"+uCropWorkInf+",mPhotosCropWorkId:"+uod.I.f;
          objArray = new Object[i];
          try{
             uoa.w(str, str2, objArray);
             uod.I.c.await();
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
       }
    }
    public void j(Object p0){
       Object[] objArray1;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$a uoa = a$a.class;
       super.j(p0);
       Object[] objArray = new Object[0];
       a.D().w("BaseSelectedMediasHandler", "PhotoMovieLoader onPostExecute result:"+p0, objArray);
       p0 = this.z;
       if (p0 != null && (p0.isEmpty() || this.I.r.isFinishing())) {
          objArray1 = new Object[0];
          a.D().t("BaseSelectedMediasHandler", "PhotoMovieLoader onPostExecute error mValidPhotos:"+this.z+",isFinishing:"+this.I.r.isFinishing(), objArray1);
       }else {
          boolean b = true;
          p0.t = b;
          objArray = new Object[0];
          a.D().w("BaseSelectedMediasHandler", "fillVideoContext", objArray);
          p0 = this.I.k;
          if (p0 == null) {
             p0 = new VideoContext();
          }
          p0.A1(this.z.size());
          r0$d tB = this.B;
          if (!PatchProxy.applyVoidOneRefs(tB, p0, VideoContext.class, "194")) {
             VideoContext.b();
             if (tB != null && tB.f()) {
                p0.l1(tB.b(), tB.c());
             }else {
                p0.l1("", "");
             }
          }
          p0.o0(this.E);
          tB = this.y;
          if (tB != null && tB.length > 0) {
             a.b(p0.F(), this.z);
             this.I.c(p0);
          }
          a$a uoa1 = new a$a();
          VideoProduceTime videoProduce = new VideoProduceTime();
          videoProduce.mPickTime = this.I.p.a();
          uoa1.i0(videoProduce);
          if (!TextUtils.x(this.I.b)) {
             uoa1.e0(this.I.b);
             if (i.h()) {
                i.m().k().x(this.I.b);
             }
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.z.iterator();
          while (iterator.hasNext()) {
             QMedia qMedia = iterator.next();
             uArrayList.add(qMedia.path);
             if (this.D != null) {
                qMedia = qMedia.mExportFilePath;
                if (qMedia != null) {
                   uArrayList.add(qMedia);
                }
             }
          }
          Object[] objArray2 = new Object[0];
          a.D().w("BaseSelectedMediasHandler", "PhotoMovieLoader onPostExecute photosPath:"+uArrayList+",mIsSinglePicture:"+this.D+",mImmutableText:"+this.I.g+",mInitialCaption:"+this.I.h+",mHidePhotosAddEntrance:"+this.I.j+",mEnableUploadAtlas:"+this.C+",mPhotosCropWorkId:"+this.I.f+",mIsSinglePicture:"+this.D+",mNextClickStartTime:"+this.I.a+",mTaskId:"+this.F, objArray2);
          iterator = this.H.iterator();
          while (iterator.hasNext()) {
             Object[] objArray3 = new Object[0];
             a.D().w("BaseSelectedMediasHandler", "onPostExecute photoSize:"+iterator.next(), objArray3);
          }
          String[] stringArray = new String[uArrayList.size()];
          a$a uoa2 = uoa1.T(uArrayList.toArray(stringArray));
          r0$d tH = this.H;
          Objects.requireNonNull(uoa2);
          Object obj = PatchProxy.applyOneRefs(tH, uoa2, uoa, "42");
          uoa2 = (obj != patchProxyRe)? obj: tH;
          uoa2 = uoa2.q(Integer.valueOf(2000)).a0(this.I.g()).y(this.I.g).z(this.I.h).x(this.I.j);
          boolean b1 = (this.I.d != null && this.C != null)? true: false;
          p0 = uoa2.t(Boolean.valueOf(b1)).j(Boolean.FALSE).h0(p0.m()).U(Long.valueOf(this.I.f)).Z(Boolean.valueOf(this.D));
          Long longx = Long.valueOf(this.I.a);
          Objects.requireNonNull(p0);
          Object obj1 = PatchProxy.applyOneRefs(longx, p0, uoa, "70");
          p0 = (obj1 != patchProxyRe)? obj1: longx.longValue();
          p0.D(this.A).f0(this.F).d(this.I.o);
          p0 = this.A;
          if (p0 != null) {
             int len = p0.length;
             int i1 = 1;
             for (i = 0; i < len; i = i + 1) {
                objArray2 = new Object[0];
                a.D().w("MagicEffectTime", "ÅÄ¶àÕÅ\("+i1+"\)"+p0[i], objArray2);
                i1 = i1 + b;
             }
          }
          if (i.h() && i.g().getStickerParam().get() == null) {
             i.g().getStickerParam().read(this.I.r.getIntent(), 0);
          }
          if (!i.h()) {
             i.V().b0(this.I.l);
             objArray1 = new Object[0];
             a.D().w("BaseSelectedMediasHandler", "PhotoMovieLoader onPostExecute mIsNeedFinishGoHome:"+this.I.l, objArray1);
          }
          if (this.I.d != null && this.C != null) {
             i.m().p().o(this.I.d);
             p0 = this.I.d.g(MultiplePhotosProject$Type.ATLAS);
             if (p0 != null) {
                p0 = p0.mPictures;
                if (p0 != null) {
                   uoa1.g(p0.size());
                }
             }
             p0 = this.I.d.g(MultiplePhotosProject$Type.LONGPICTURE);
             if (p0 != null) {
                p0 = p0.mPictures;
                if (p0 != null) {
                   uoa1.H(p0.size());
                }
             }
          }
       label_033a :
          uoa1.V(Boolean.valueOf(this.I.m));
          uoa1.m(Boolean.valueOf(this.I.n));
          objArray1 = new Object[0];
          a.D().w("BaseSelectedMediasHandler", "PhotoMovieLoader onPostExecute mIsEditEntry:"+this.I.m+",mCloseIconDefault:"+this.I.n, objArray1);
          if (j0.a(this.I.r.getIntent(), "INTENT_EXTRA_IS_FROM_IM_MESSAGE", 0)) {
             uoa1.B(b);
             uoa1.S(j0.b(this.I.r.getIntent(), "INTENT_EXTRA_PHOTO_VISIBILITY", 0));
             uoa1.x(b);
          }
          uoa1.b().getPageMonitorSource().set("IMPORT");
          uoa1.b().getDefaultEditPreviewTab().set(this.I.i);
          if (!TextUtils.x(i.g().getInteractiveStickerForEdit().get())) {
             uoa1.b().getDefaultEditPreviewTab().set("photoMovie");
          }
          p0 = this.I.v;
          if (p0 != null) {
             p0.a(uoa1);
          }
          p0 = d.a(0x14d6f666).NX(this.I.r, uoa1.f());
          this.I.b(p0);
          r0$d tG = this.G;
          if (tG != null) {
             tG.a(p0);
          }else {
             objArray1 = new Object[0];
             a.D().w("BaseSelectedMediasHandler", "PhotoMovieLoader onPostExecute: start editor activity", objArray1);
             this.I.r.startActivityForResult(p0, 770);
          }
          p0 = this.I.u;
          if (p0 != null) {
             p0.M();
          }
       }
       return;
    }
    public void k(){
       super.k();
       Object[] objArray = new Object[0];
       a.D().w("BaseSelectedMediasHandler", "PhotoMovieLoader onPreExecute: ", objArray);
       this.I.c = new CountDownLatch(1);
       this.I.d = null;
       this.z.clear();
    }
    public void r(ProgressFragment p0){
       Object[] objArray = new Object[0];
       a.D().w("BaseSelectedMediasHandler", "PhotoMovieLoader onProgressDialogInit", objArray);
       p0.Gh(true);
       p0.Ah(R.dimen.arg_RES_7f07025f, 0x7f07025f);
    }
}
