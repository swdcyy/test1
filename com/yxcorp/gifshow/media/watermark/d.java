package com.yxcorp.gifshow.media.watermark.d;
import nxc.b;
import java.lang.Object;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.String;
import com.yxcorp.gifshow.media.watermark.d$a;
import com.yxcorp.gifshow.media.watermark.d$b;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.media.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.media.watermark.g;
import tkd.b;
import tkd.d;
import h69.e;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.yxcorp.gifshow.video.api.watermark.BitmapAlignType;
import java.io.Closeable;
import ekd.p;
import y6b.r;
import com.yxcorp.gifshow.media.watermark.VideoWatermarkTask;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import hxc.a;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.media.util.g;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.kwai.video.editorsdk2.ExportEventListener;
import java.lang.Exception;
import y6b.h;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import s31.d;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import ekd.k1;
import y6b.j;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.StringBuilder;
import y6b.k;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import java.text.DecimalFormat;
import com.kwai.video.editorsdk2.ExportTaskStatsUnit;
import y6b.d;
import com.kwai.framework.model.feed.BaseFeed;
import y6b.b;
import kp.r1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import android.graphics.Bitmap;
import wb5.c;
import com.yxcorp.gifshow.media.util.c;
import y6b.n;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import mca.a;
import com.yxcorp.utility.Log;
import s0d.b;
import java.lang.System;
import android.app.Activity;
import com.yxcorp.gifshow.media.watermark.a;
import java.lang.Math;
import y6b.o;
import nxc.d;
import h69.d;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import nxc.c;
import androidx.fragment.app.DialogFragment;
import java.util.Locale;
import lnc.a1;
import y6b.c;
import android.view.View$OnClickListener;
import ok.h;
import com.yxcorp.gifshow.media.watermark.b;
import com.yxcorp.gifshow.fragment.ProgressFragment$a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import android.net.Uri;
import ekd.w0;
import java.lang.Throwable;
import ekd.a0;
import com.kwai.video.hodor.ExportMediaCacheTask;
import java.util.Map;
import com.kwai.video.hodor.AbstractHodorTask;
import com.yxcorp.gifshow.media.watermark.d$c;
import com.kwai.video.hodor.ExportMediaCacheTask$ExportMediaCacheTaskCallback;
import com.kwai.video.hodor.HodorConfig;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kwai.video.hodor.logEvent.CdnStatEvent;
import com.kwai.video.hodor.logEvent.CdnStatEvent$OnCdnStatEventListener;
import com.yxcorp.gifshow.media.watermark.d$d;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;

public class d	// class@001d32
{
    public final ExportEventListener A;
    public final ExportEventListener B;
    public String a;
    public final WeakReference b;
    public final File c;
    public final File d;
    public final File e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final User i;
    public final BaseFeed j;
    public BitmapAlignType k;
    public r l;
    public final boolean m;
    public final c n;
    public final h o;
    public final h p;
    public EditorSdk2V2$VideoEditorProject q;
    public ExportTaskNoQueueing r;
    public ExportEventListener s;
    public d$d t;
    public ExportMediaCacheTask u;
    public ProgressFragment v;
    public final File w;
    public final File x;
    public d y;
    public a z;

    public void d(b p0){
       super();
       this.a = "SaveWatermarkPhotoHelper";
       this.l = null;
       this.w = new File(b.a(-1504323719).o(), "logo_left_top_bmp.png");
       this.x = new File(b.a(-1504323719).o(), "logo_bottom_right_bmp.png");
       this.A = new d$a(this);
       this.B = new d$b(this);
       this.b = new WeakReference(p0.a.get());
       this.c = p0.b;
       this.d = p0.c;
       this.e = p0.d;
       this.f = p0.e;
       this.g = p0.f;
       this.h = p0.g;
       b i = p0.i;
       this.i = i;
       if (TextUtils.x(i.mKwaiId)) {
          i.mKwaiId = p0.h;
       }
       this.j = p0.j;
       this.k = p0.l;
       this.m = p0.k;
       this.n = p0.m;
       this.o = p0.n;
       this.p = p0.o;
       return;
    }
    public final ExportTask a(boolean p0,VideoContext p1){
       a obj;
       Closeable uCloseable;
       d tl;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uod, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uod = this.d;
       if (uod == null || this.c == null) {
          return null;
       }else {
          try{
             int i = 0;
             try{
                a uoa = new a(uod, i, i);
                this.q = g.a(this.e, this.d);
                EditorSdk2$ExportOptions uExportOptio = d.a(0x1dd3f09e).g00(this.d, this.q, this.i, p1);
                if (this.g != null) {
                   this.q.setProjectOutputWidth(uExportOptio.width());
                   this.q.setProjectOutputHeight(uExportOptio.height());
                   if (this.k == BitmapAlignType.DYNAMIC_WATERMARK) {
                      if (!this.l()) {
                         p.b(uoa);
                         tl = this.l;
                         if (tl != null) {
                            tl.recycle();
                         }
                         return null;
                      }
                   }else if(!this.m(uExportOptio)){
                      p.b(uoa);
                      tl = this.l;
                      if (tl != null) {
                         tl.recycle();
                      }
                      return null;
                   }
                }else {
                   uod = this.q;
                   uod.setAnimatedSubAssets(g.b(uod, VideoWatermarkTask.b().getAbsolutePath(), VideoWatermarkTask.b().getAbsolutePath(), i));
                }
                obj = new a();
                this.z = obj;
                g.b(obj, uExportOptio, (long)(EditorSdk2UtilsV2.getComputedDuration(this.q) * 0x408f400000000000));
                uExportOptio.setNoFastStart(a.t().d("editorExportDisableFastStart", i));
                ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(a.a().a(), this.q, this.c.getAbsolutePath(), uExportOptio);
                this.r = uExportTaskN;
                uExportTaskN.setExportEventListener(this.B);
                this.n(p0);
                this.r.run();
                tl = this.r;
                p.b(uoa);
                d tl1 = this.l;
                if (tl1 != null) {
                   tl1.recycle();
                }
                return tl;
             }catch(java.lang.Exception e9){
             }
             e9.printStackTrace();
             p.b(uCloseable);
             tl = this.l;
             if (tl != null) {
                tl.recycle();
             }
             return null;
          }catch(java.lang.Exception e9){
             uCloseable = null;
             goto label_00fa ;
          }
       }
    }
    public void b(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c.k(new h(p0));
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       d tv = this.v;
       if (tv != null && tv.isAdded()) {
          tv = this.v;
          Objects.requireNonNull(tv);
          k1.r(new d(tv), 1);
       }
       return;
    }
    public void d(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       d tz = this.z;
       if (tz != null) {
          tz.g = 9;
          tz.e = k1.t(tz.j);
       }
       try{
          this.c();
          c.k(new j(this));
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       tz = this.s;
       if (tz != null) {
          tz.onCancelled(p0);
       }
       return;
    }
    public void e(ExportTask p0){
       d tz;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "16")) {
          return;
       }
       if (this.z != null) {
          EditorSdk2$EditorSdkError error = p0.getError();
          this.z.i = error.message();
          this.z.h = " type:"+error.type()+", code="+error.code()+" msg="+error.message();
          tz = this.z;
          tz.g = 8;
          tz.e = k1.t(tz.j);
       }
       try{
          this.c();
          c.k(new k(this));
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       tz = this.s;
       if (tz != null) {
          tz.onError(p0);
       }
       return;
    }
    public void f(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "14")) {
          return;
       }
       d tz = this.z;
       if (tz != null) {
          tz.g = 7;
          tz.e = k1.t(tz.j);
          ExportTaskStatsInfo exportTaskSt = p0.getExportTaskStats();
          DecimalFormat uDecimalForm = new DecimalFormat("0.0");
          this.z.f = "TotalCost="+uDecimalForm.format(exportTaskSt.getExportTaskStatsUnit().getTotalCostSec())+", EncodeCost="+uDecimalForm.format(exportTaskSt.getExportTaskStatsUnit().getEncodeCostSec())+", DecodeCost="+uDecimalForm.format(exportTaskSt.getExportTaskStatsUnit().getDecodeCostSec())+", ExportDuration="+uDecimalForm.format(exportTaskSt.getExportTaskStatsUnit().getRenderCostSec())+", RenderCost="+uDecimalForm.format(exportTaskSt.getExportTaskStatsUnit().getRenderCostSec())+", VideoBitrate="+exportTaskSt.getExportTaskStatsUnit().getExportVideoBitrate()+", SkipTranscode="+exportTaskSt.getExportTaskStatsUnit().isSkipTranscode()+", EncoderType="+exportTaskSt.getExportTaskStatsUnit().getEncoderType()+", EncoderCodec="+exportTaskSt.getExportTaskStatsUnit().getEncoderCodec();
       }
       tz = this.v;
       if (tz != null && tz.isAdded()) {
          this.v.Nh(100);
          tz = this.v;
          Objects.requireNonNull(tz);
          k1.r(new d(tz), 1);
       }
       c.k(new d(this));
       tz = this.s;
       if (tz != null) {
          tz.onFinished(p0, p1);
       }
       return;
    }
    public EditorSdk2V2$VideoEditorProject g(BaseFeed p0,String p1,b p2){
       int this;
       ArrayList uArrayList;
       double d;
       d uod = this;
       String str = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       QPhoto obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str1 = ".jpg";
       String str2 = "_";
       this = -1504323719;
       Minecraft$InputFileOptions inputFileOpt = null;
       int i = 0;
       StringBuilder str3 = 1;
       if (r1.f2(p0)) {
          obj = new QPhoto(p0);
          if (PatchProxy.isSupport(d.class)) {
             uArrayList = PatchProxy.applyThreeRefs(obj, Boolean.FALSE, p2, null, d.class, "24");
             if (uArrayList != patchProxyRe) {
             }
          }
          uArrayList = new ArrayList();
          int i1 = obj.getAtlasList().size();
          while (i < i1) {
             List atlasPhotosC = obj.getAtlasPhotosCdn(i);
             CDNUrl[] uCDNUrlArray = new CDNUrl[atlasPhotosC.size()];
             ImageRequest[] imageRequest = d.b(atlasPhotosC.toArray(uCDNUrlArray));
             if (imageRequest.length >= str3) {
                Bitmap uBitmap = c.a(imageRequest);
                if (uBitmap != null) {
                   String absolutePath = new File(b.a(this).o(), obj.getPhotoId()+str2+i+str1).getAbsolutePath();
                   c.g("feed_watermark", uBitmap, uBitmap.getWidth(), uBitmap.getHeight(), 100, absolutePath, true);
                   uBitmap.recycle();
                   uArrayList.add(absolutePath);
                   d = (double)i * 20.00f;
                   d = d / (double)i1;
                   p2.onProgress(d);
                }
             }
             i = i + 1;
             this = -1504323719;
             str3 = 1;
          }
          String[] stringArray = new String[uArrayList.size()];
          inputFileOpt = a.c(uArrayList.toArray(stringArray), 2.00f, inputFileOpt, str);
          Log.g(uod.a, "generateVideoEditor for AtlasPhotos, photoPathList.size = "+uArrayList.size());
       }else if(r1.O2(p0)){
          Bitmap uBitmap1 = c.a(b.c(r1.G0(p0)));
          File uFile = new File(b.a(-1504323719).o(), r1.t1(p0)+str2+System.currentTimeMillis()+str1);
          str1 = uFile.getAbsolutePath();
          if (uBitmap1 != null) {
             c.g("feed_watermark", uBitmap1, uBitmap1.getWidth(), uBitmap1.getHeight(), 100, str1, true);
          }
          String[] stringArray1 = new String[]{str1};
          inputFileOpt = a.c(stringArray1, 2.00f, inputFileOpt, str);
          Log.g(uod.a, "generateVideoEditor for KtvSong, photoPath= "+str1+",file.length="+uFile.length());
       }
       if (inputFileOpt == null) {
          Log.g(uod.a, "videoEditorProject == null");
          inputFileOpt = new EditorSdk2V2$VideoEditorProject();
       }
       return inputFileOpt;
    }
    public final String h(BaseFeed p0){
       CDNUrl[] uCDNUrlArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (r1.f2(p0)) {
          uCDNUrlArray = r1.l0(p0);
          if (uCDNUrlArray != null && uCDNUrlArray.length > 0) {
             return uCDNUrlArray[0].getUrl();
          }
       }else if(r1.O2(p0)){
          uCDNUrlArray = r1.e1(p0);
          if (uCDNUrlArray != null && uCDNUrlArray.length > 0) {
             return uCDNUrlArray[0].getUrl();
          }
       }
       return null;
    }
    public final boolean i(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.isFinishing() || p0.isDestroyed())? true: false;
       return b;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d tv = this.v;
       if (tv != null && tv.isAdded()) {
          this.v.dismiss();
          this.v = null;
       }
       return;
    }
    public void k(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.release();
       }
       return;
    }
    public final boolean l(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       d ti = this.i;
       String kwaiId = ti.getKwaiId();
       String id = ti.getId();
       String name = ti.getName();
       a uoa = new a(this.q.projectOutputWidth(), this.q.projectOutputHeight(), kwaiId, id, name);
       boolean b = obj.a();
       this.y = obj.g;
       this.l = obj;
       d tq = this.q;
       tq.setAnimatedSubAssets(obj.b(tq, true));
       return b;
    }
    public final boolean m(EditorSdk2$ExportOptions p0){
       Object obj1;
       EditorSdk2V2$VideoEditorProject videoEditorP;
       d uod = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyOneRefs(p0, uod, d.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       o oo = (uod.f != null)? new o(Math.min(p0.width(), p0.height()), Math.min(p0.width(), p0.height()), uod.i): new o(p0.width(), p0.height(), uod.i);
       uod.y = new d();
       uod.l = oo;
       oo.c();
       obj = uod.y;
       obj.c = k1.t(obj.a);
       boolean b = false;
       if (!oo.k(uod.w)) {
          uod.y.b = 8;
          return b;
       }else {
          try{
             uod.y.b = 7;
             obj = uod.q;
             String absolutePath = uod.w.getAbsolutePath();
             obj1 = null;
             EditorSdk2V2$AnimatedSubAsset obj2 = PatchProxy.applyTwoRefs(obj, absolutePath, obj1, g.class, "3");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }else if(!EditorSdk2UtilsV2.videoProjectPrivateDataLoaded(obj)){
                videoEditorP = EditorSdk2UtilsV2.loadProject(obj);
             }else {
                videoEditorP = obj;
             }
             double computedDura = EditorSdk2UtilsV2.getComputedDuration(videoEditorP);
             EditorSdk2V2$AnimatedSubAsset uAnimatedSub = g.f(absolutePath, computedDura);
             if (uAnimatedSub != null) {
                obj2 = uAnimatedSub;
                Minecraft$PropertyKeyFrame[] propertyKeyF = new Minecraft$PropertyKeyFrame[true];
                propertyKeyF[0] = g.g(computedDura, 50.00f, g.d((double)EditorSdk2UtilsV2.getAnimatedSubAssetHeight(uAnimatedSub), (double)d.a(-223655702).H6(videoEditorP), (double)d.a(-223655702).Yy(videoEditorP)));
                obj2.setKeyFrames(propertyKeyF);
                EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = new EditorSdk2V2$AnimatedSubAsset[true];
                uAnimatedSub1[0] = obj2;
                obj1 = uAnimatedSub1;
             }
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
             e0.printStackTrace();
          }
             obj.setAnimatedSubAssets(obj1);
             return true;
       }
    }
    public final void n(boolean p0){
       String str;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "8")) {
          return;
       }
       if (p0) {
          d tn = this.n;
          c c = tn.c;
          boolean b = false;
          tn.e = b;
          ProgressFragment progressFrag = new ProgressFragment();
          this.v = progressFrag;
          progressFrag.Eh(b, 100);
          this.v.setCancelable(b);
          tn = this.v;
          if (TextUtils.x(this.h)) {
             Object[] objArray = new Object[]{a1.p(0x7f100f18)};
             str = String.format(Locale.US, "%s ", objArray);
          }else {
             str = this.h;
          }
          tn.Jh(str);
          this.v.Kh(this.m);
          this.v.Ch(R.drawable.arg_RES_7f08234f);
          this.v.Bh(new c(this));
          if (this.m != null) {
             tn = this.o;
             if (tn != null) {
                tn.apply(this.n);
             }
          }else if(c > null){
             this.v.Hh((long)(c * 1000), new b(this));
          }
          GifshowActivity gifshowActiv = this.b.get();
          if (gifshowActiv != null && !this.i(gifshowActiv)) {
             this.v.show(gifshowActiv.getSupportFragmentManager(), "runner");
          }
       }
    label_00a4 :
       return;
    }
    public final void o(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "12")) {
          return;
       }
       File uFile = new File(b.a(-1504323719).a(), "audio_"+a1.k()+".m4a");
       String str = this.h(this.j);
       ClientStat$CdnResourceLoadStatEvent obj = PatchProxy.applyOneRefs(str, objArray, uod, "22");
       if (obj != PatchProxyResult.class) {
       }else {
          Uri uri = w0.f(str);
          String path = uri.getPath();
          String obj1 = PatchProxy.applyThreeRefs(uri, path, str, null, d.class, "23");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else {
             try{
                obj1 = (TextUtils.p(path)).toLowerCase(Locale.US);
             }catch(java.lang.IllegalArgumentException e4){
                Log.e("@", "fail to parse ext from url: "+uri, e4);
                obj1 = ".xxx";
             }
             String str1 = w0.a(uri, "clientCacheKey");
             if (!TextUtils.x(str1)) {
                str1 = str1+obj1;
             }else if(!TextUtils.x(path)){
                str1 = a0.c(path)+obj1;
             }else {
                str1 = a0.c(str)+obj1;
             }
          }
       }
       ExportMediaCacheTask uExportMedia = new ExportMediaCacheTask(str, objArray, obj, uFile.getAbsolutePath());
       this.u = uExportMedia;
       uExportMedia.setTaskQosClass(8);
       this.u.setBizType("feed_water_mark");
       this.u.setBizFt(":ks-kernels:kuaishou-utility");
       this.u.setExportMediaCacheTaskCallback(new d$c(this, uFile));
       if (HodorConfig.isEnablePreloadUnifyCdnLog()) {
          obj = new ClientStat$CdnResourceLoadStatEvent();
          obj.resourceType = 22;
          this.u.setCdnStatEvent(new CdnStatEvent(obj, objArray));
          this.u.setUnifyCdnLog(true);
       }
       this.u.submit();
       return;
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "13")) {
          return;
       }
       Log.g(this.a, "startPhotoEncodeTask, audioFilePath=="+p0);
       d$d uod = new d$d(this, p0);
       this.t = uod;
       Void[] voidArray = new Void[0];
       uod.c(voidArray);
       return;
    }
}
