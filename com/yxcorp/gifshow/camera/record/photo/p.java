package com.yxcorp.gifshow.camera.record.photo.p;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.camera.record.photo.p$d;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.photo.p$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.w;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lq.i;
import ce9.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lq.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.gifshow.post.api.core.model.VideoProduceTime;
import q16.a$a;
import com.kwai.robust.PatchProxyResult;
import oc9.w;
import java.util.List;
import java.util.Iterator;
import oc9.t;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import nh9.a;
import je9.e;
import je9.e$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Map;
import com.yxcorp.gifshow.model.CustomMagicInfo;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.CustomConfig;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import android.content.Context;
import lnc.f6;
import j8c.a;
import q87.c;
import qr4.i;
import pm6.h;
import qr4.m$k0;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import qr4.m$a0;
import xg9.j;
import xg9.j$a;
import qr4.k$j;
import oa0.a;
import oe6.e;
import sm6.b;
import ld9.a;
import java.lang.Number;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.camerasdk.videoCapture.CameraController;
import kuaishou.perf.page.impl.d;
import q16.a;
import qr4.m$w;
import com.kwai.gifshow.post.api.core.camerasdk.model.ExifInfo;
import qr4.m$l;
import com.google.protobuf.nano.MessageNano;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lq.a;
import lnc.h6;
import hg9.r0;
import java.util.Objects;
import lnc.h6$c;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Future;
import lnc.h6$b;
import s16.j;
import lnc.a1;
import qkd.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.model.EditorSplashImageInfo;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.util.PostUtils;
import android.net.Uri;
import ekd.x0;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import tkd.b;
import tkd.d;
import os5.g;
import hg9.w0;
import n3d.a;
import com.yxcorp.gifshow.camera.record.photo.p$a;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import w46.b;
import r16.a;
import lnc.s;
import e17.i;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import ekd.w0;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import hg9.s0;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import hg9.c1;
import hg9.y0;
import erd.g;
import crd.b;
import lnc.s6;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.camera.record.photo.n;
import msd.l;
import com.yxcorp.gifshow.camera.record.photo.p$c;
import java.lang.Enum;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import hg9.t0;
import hg9.z0;
import hg9.x0;
import u36.b;
import u36.b$a;
import ca9.a;
import ca9.b;
import hg9.u0;
import java.util.concurrent.TimeUnit;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import hg9.b1;
import hg9.a1;
import android.view.View;
import hg9.v0;
import android.view.View$OnTouchListener;
import com.yxcorp.utility.n;
import hg9.q0;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.camera.record.photo.o;
import qs5.d;
import lnc.b9;
import hg9.d1;
import yd9.c;
import gd9.a;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import com.kuaishou.gifshow.files.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k36.c;
import k36.f;
import voc.m;
import java.util.Collections;
import r16.d;
import qvb.s;

public class p	// class@000ef9
{
    public final String a;
    public final w b;
    public final TakePictureType c;
    public final BaseFragment d;
    public final p$d e;
    public final b f;
    public final String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public a k;
    public VideoContext l;
    public b m;
    public b n;

    public void p(TakePictureType p0,p$d p1,String p2,b p3){
       super();
       this.n = new p$b(this);
       this.f = p3;
       this.c = p0;
       BaseFragment uBaseFragmen = p1.b();
       this.d = uBaseFragmen;
       this.e = p1;
       this.g = p2;
       this.b = new w();
       if (uBaseFragmen.getArguments() != null) {
          this.j = uBaseFragmen.getArguments().getBoolean("key_wait_save_camera");
       }
       this.a = "TakePicture\("+p0+"\)";
       return;
    }
    public static void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "21")) {
          return;
       }
       if (i.h()) {
          l a = p0.d(l.i).a;
          if (a != null) {
             String topic = a.getTopic();
             String stickerTopic = a.getStickerTopic();
             if (!TextUtils.x(topic)) {
                i.m().k().q(topic);
             }
             if (!TextUtils.x(stickerTopic)) {
                i.m().k().v(stickerTopic);
             }
          }
       }
       return;
    }
    public static a$a b(GifshowActivity p0,b p1,VideoProduceTime p2){
       l a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, null, p.class, "18");
       if (p0 != patchProxyRe) {
          return p0;
       }
       a$a uoa = new a$a();
       Object obj = null;
       if (!PatchProxy.applyVoidTwoRefs(uoa, p1, obj, p.class, "13")) {
          Iterator iterator1 = p1.b().za().iterator();
          while (iterator1.hasNext()) {
             iterator1.next().de(uoa, obj);
          }
       }
       boolean b = a.a(p1);
       e uoe = p1.d(e.c.a());
       a = p1.d(l.i).a;
       SimpleMagicFace simpleMagicF = (a == null)? obj: a.mId;
       CustomMagicInfo uCustomMagic = uoe.a().get(simpleMagicF);
       Boolean fALSE = Boolean.FALSE;
       a$a uoa1 = uoa.f0(p1.b().getTaskId()).i0(p2).q(Integer.valueOf(2000)).a0("picture").t(fALSE).j(fALSE);
       uoa1.Z(Boolean.TRUE);
       if (b) {
          String str = "";
          obj = PatchProxy.applyTwoRefs(p1, str, obj, a.class, "4");
          if (obj != patchProxyRe) {
             str = obj;
          }else {
             a.p(p1, "$this$getFromPageToFillEdit");
             a.p(str, "default");
             if (a.a(p1)) {
                str = "IM_SEND_MESSAGE";
             }
          }
          uoa.w(str);
       }
       if (uCustomMagic != null && (!TextUtils.isEmpty(uCustomMagic.getMagicId()) && uCustomMagic.getCustomConfig() != null)) {
          uoa.p(uCustomMagic);
       }
    label_00d5 :
       if (a != null && !TextUtils.isEmpty(a.mChildId)) {
          uoa.k(a.mChildId);
       }
       Iterator iterator = p1.b().za().iterator();
       while (iterator.hasNext()) {
          iterator.next().lc(uoa);
       }
       PatchProxy.onMethodExit(p.class, "18");
       return uoa;
    }
    public static VideoContext c(GifshowActivity p0,b p1,boolean p2,String p3,File p4,boolean p5,boolean p6,int p7){
       Object[] objArray;
       int i = 0;
       if (PatchProxy.isSupport2(p.class, "20")) {
          objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,Boolean.valueOf(p5),Boolean.valueOf(p6),Integer.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, null, p.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext videoContext = f6.d(p0, p4, p1, p.e(p1), p5);
       objArray = new Object[i];
       a.D().w(p3, "savePhotoStatisticsInfo end", objArray);
       if (videoContext == null) {
          videoContext = new VideoContext();
       }
       i oi = videoContext.G();
       if (TextUtils.isEmpty(videoContext.i())) {
          p5.x = (i.h())? h.a.a(i.m().k().c()): h.a.a(j0.f(p0.getIntent(), "activity"));
       }
    label_009b :
       p5.u = new m$a0();
       p5.a = 1;
       p5.e = (float)p1.d(j.c.a()).a();
       p1.C = a.f0();
       p1.I = a.a(e.k(), b.t(p0));
       i c = oi.c;
       c.J = p2;
       if (p6) {
          c.a0 = p7;
       }
       PatchProxy.onMethodExit(p.class, "20");
       return videoContext;
    }
    public static int e(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.b().G2().isFrontCamera();
    }
    public static void n(){
       if (PatchProxy.applyVoid(null, null, p.class, "22")) {
          return;
       }
       d.d("postPhotoToEditorMonitor").h("takeSuccessToDoBackground");
       d.d("postPhotoToEditorMonitor").g("doBackgroundToPause");
       return;
    }
    public static void q(VideoContext p0,File p1,a p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, p.class, "26")) {
          return;
       }
       i oi = p0.G();
       oi.b.f.d = p1.length();
       ExifInfo uExifInfo = ExifInfo.parseFromFile(p1);
       if (uExifInfo != null) {
          oi.b.e = uExifInfo.toPhotoMeta();
       }
       byte[] uobyteArray = MessageNano.toByteArray(oi);
       p2.q1 = uobyteArray;
       if (!TextUtils.isEmpty(oi.b.a)) {
          if (PostExperimentUtils.Y() && i.h()) {
             h6 oh6 = i.m().p().v();
             r0 or0 = new r0(p1, oi, uobyteArray, p3);
             Objects.requireNonNull(oh6);
             a.p("saveKeyToDescription", "name");
             a.p(or0, "task");
             h6$c uoc = new h6$c("saveKeyToDescription", or0);
             Future uFuture = c.d().submit(uoc);
             a.o(uFuture, "future");
             oh6.a.add(new h6$b(uoc, uFuture));
          }else {
             j.i(p1.getPath(), oi.b.a);
             j.d().h(p1, uobyteArray);
             a.e(a1.c(), p1);
             Object[] objArray = new Object[0];
             a.D().w(p3, "处理文件信息 end", objArray);
          }
       }
       return;
    }
    public static void r(a p0,Bitmap p1,int p2,GifshowActivity p3){
       EditorSplashImageInfo uEditorSplas;
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, p.class, "27")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditCost", "垫图 begin", objArray);
       if (BitmapUtil.I(p1)) {
          uEditorSplas = EditorSplashImageInfo.generateEditorSplashImageInfoWithBitmap(p2, p3, p1);
          uEditorSplas.setRotation(p2);
       }else {
          uEditorSplas = EditorSplashImageInfo.generateEditorSplashImageInfoWithBitmap(p2, null, null);
       }
       uEditorSplas.setEditorSplashType(3);
       p0.Z = uEditorSplas;
       Object[] objArray1 = new Object[0];
       a.D().s("EditCost", "垫图 end", objArray1);
       return;
    }
    public GifshowActivity d(){
       Object obj = PatchProxy.apply(null, this, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getActivity();
    }
    public final void f(File p0,Bitmap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       if (this.d() == null) {
          Object[] objArray1 = new Object[0];
          return;
       }else {
          Object[] objArray2 = new Object[0];
          File uFile = new File(PostUtils.g("[>|11|>]"), "live_photo_album_cover.jpg");
          Uri uri = x0.e(uFile);
          Fresco.getImagePipeline().evictFromCache(uri);
          d.a(0x3652a147).h8(this.d(), 258, x0.e(p0), p1.getWidth(), p1.getHeight(), uri, new w0(this, uFile));
          Void[] voidArray = new Void[0];
          new p$a(this, this.d(), p0).c(voidArray);
          return;
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, p.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t(this.a, "handleOperationFailed", objArray);
       if (this.d() == null) {
          return;
       }
       if (!d.a(0x14d6f666).isAvailable()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100070);
       }else {
          i.a(R.style.arg_RES_7f110668, 0x7f103b10);
       }
       this.e.K0();
       return;
    }
    public final void h(File p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "6")) {
          return;
       }
       int i = 0;
       if (this.d() == null) {
          Object[] objArray = new Object[i];
          a.D().w(this.a, "handleShootImageSuccess activity is null", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(this.a, "handleShootImageSuccess", objArray1);
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.setCancelable(i);
          Intent intent = new Intent();
          if (p1 != null) {
             intent.putExtras(p1);
          }
          if (this.j == null) {
             intent.setData(w0.f(p0.getAbsolutePath()));
             this.d().setResult(-1, intent);
             this.d().finish();
          }else {
             progressFrag.show(this.d.getFragmentManager(), "wait save");
          }
          t.fromCallable(new s0(this, p0)).observeOn(d.c).subscribeOn(d.a).subscribe(new c1(this, progressFrag, intent), new y0(this));
          return;
       }
    }
    public boolean i(){
       Object obj = PatchProxy.apply(null, this, p.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (s6.I() && (this.c == TakePictureType.SHARE && !this.e.c1()))? true: false;
       return b;
    }
    public void j(File p0,Bitmap p1,int p2){
       Object[] this;
       Object[] objArray;
       Object[] objArray1;
       View view;
       l a;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, p.class, "1")) {
          return;
       }
       int i = 0;
       this = new Object[i];
       a.D().w(this.a, "onCaptureSuccess "+p0.getAbsolutePath(), this);
       PostFunnelManager.j.a().d().l(n.b);
       Bundle uBundle = null;
       switch (p$c.a[this.c.ordinal()]){
           case 1:
             this.h(p0, uBundle);
             break;
           case 2:
           case 3:
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, op, "9")) {
                if (this.d() == null) {
                   objArray = new Object[i];
                   a.D().w(this.a, "getActivity\(\) == null", objArray);
                }else {
                   String str = "live_anchor_plugin";
                   if (d.d(str)) {
                      objArray1 = new Object[i];
                      a.D().w(this.a, "isLoaded...", objArray1);
                      this.f(p0, p1);
                   }else {
                      b9.a(this.m);
                      this.m = d.b(this.d(), str).observeOn(d.a).subscribe(new d1(this, p0, p1));
                   }
                }
             }
             break;
           case 4:
           case 6:
           case 5:
             if (!PatchProxy.applyVoidOneRefs(p0, this, op, "7")) {
                objArray1 = new Object[i];
                a.D().w(this.a, "handleSendImage "+p0.getAbsolutePath(), objArray1);
                if (this.d.isDetached() || this.d.getView() == null) {
                   objArray = new Object[i];
                   a.D().A(this.a, "handleSendImage warning... the fragment isDetached or view is null!", objArray);
                }else {
                   this.h = i;
                   this.e.b0().setVisibility(8);
                   view = this.d.getView().findViewById(R.id.capture_finish_layout);
                   view.setVisibility(i);
                   view.setOnTouchListener(new v0(this));
                   View view1 = this.d.getView().findViewById(R.id.take_picture_btn);
                   n.W(view1, 8, 0);
                   this.d.getView().findViewById(R.id.reshoot_iv).setOnClickListener(new q0(this, view, view1));
                   ImageView imageView = this.d.getView().findViewById(R.id.send_image_iv);
                   p tc = this.c;
                   if (tc != TakePictureType.MOMENT && (tc != TakePictureType.LIVE_ENTRY && (tc == TakePictureType.LIVE_PLAY || tc == TakePictureType.PROFILE))) {
                      imageView.setImageResource(R.drawable.arg_RES_7f081874);
                   }
                   imageView.setOnClickListener(new o(this, p0));
                }
             }
             break;
           case 7:
             if (this.e.c1()) {
                if (!PatchProxy.applyVoidOneRefs(p0, this, op, "4")) {
                   if (this.d() == null) {
                      objArray = new Object[i];
                      a.D().w(this.a, "notifyAlbumScan activity is null", objArray);
                   }else {
                      objArray1 = new Object[i];
                      a.D().w(this.a, "notifyAlbumScan "+p0.getAbsolutePath(), objArray1);
                      t.fromCallable(new u0(p0)).delay(100, TimeUnit.MICROSECONDS).subscribeOn(d.c).observeOn(d.a).compose(c.c(this.d().m(), ActivityEvent.DESTROY)).subscribe(new b1(this), new a1(this));
                   }
                }
             }else {
                this.s(p0, p1, p2);
             }
             break;
           case 8:
             if (!PatchProxy.applyVoidOneRefs(p0, this, op, "3")) {
                if (this.d.getActivity() != null) {
                   uBundle = j0.f(this.d.getActivity().getIntent(), "photo_task_id");
                }
                t.fromCallable(new t0(p0)).subscribeOn(d.c).subscribe(new z0(this), new x0(this));
                b.r(b.class, b$a.b).w30(this.d(), p0.getAbsolutePath(), 2, uBundle);
             }
             break;
           case 9:
             if (!PatchProxy.applyVoidOneRefs(p0, this, op, "2")) {
                Bundle uBundle1 = new Bundle();
                a = this.f.d(l.i).a;
                if (a != null) {
                   SerializableHook.putSerializable(uBundle1, "magic_face", a);
                }
                this.h(p0, uBundle1);
             }
             break;
           case 10:
             this.s(p0, p1, p2);
             break;
           default:
             if (!PatchProxy.applyVoidOneRefs(p0, this, op, "12")) {
                objArray1 = new Object[i];
                if (this.i != null) {
                   objArray = new Object[i];
                }else if(this.d() == null){
                   objArray = new Object[i];
                }else {
                   this.i = true;
                   Object[] objArray2 = new Object[i];
                   int i1 = 0x5d485277;
                   if (d.a(i1).isAvailable()) {
                      d.a(i1).Te(this.d(), p0.getAbsolutePath(), true, this.c, this.g, p.e(this.f), this.f.b().getTaskId());
                   }
                }
             }
       }
    label_0322 :
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, p.class, "15")) {
          return;
       }
       this.b.b();
       d.d("postPhotoToEditorMonitor").h("doBackgroundToPause");
       d.d("postPhotoToEditorMonitor").g("pauseToStart");
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, p.class, "16")) {
          return;
       }
       this.i = false;
       this.b.b();
       a.e(1);
       return;
    }
    public void m(File p0,Bitmap p1,int p2,boolean p3){
       p a;
       VideoContext videoContext;
       p op = this;
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, p.class, "17")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(op.a, "prepareEditPageParam", objArray);
       GifshowActivity gifshowActiv = this.d();
       p c = op.c;
       if (c != TakePictureType.SHARE && (c != TakePictureType.MIX || (!op.e.c1() && a1.i(gifshowActiv)))) {
          VideoProduceTime videoProduce = new VideoProduceTime();
          videoProduce.mPickTime = op.b.a();
          Object[] objArray1 = new Object[i];
          a.D().w(op.a, "prepareEditPhoto end", objArray1);
          a uoa = p.b(gifshowActiv, op.f, videoProduce).f();
          op.k = uoa;
          uoa.getArgs().getPageMonitorSource().set("TAKE_PIC");
          int i1 = 1;
          String[] stringArray = new String[i1];
          stringArray[i] = p0.getAbsolutePath();
          op.k.v = stringArray;
          p f = op.f;
          boolean b = op.e.L1();
          a = op.a;
          String str = "19";
          if (PatchProxy.isSupport2(p.class, str)) {
             objArray = new Object[]{gifshowActiv,f,Boolean.valueOf(b),a,p0,Boolean.valueOf(p3)};
             videoContext = PatchProxy.apply(objArray, null, p.class, str);
             if (videoContext != PatchProxyResult.class) {
             label_00d6 :
                op.l = videoContext;
                Object[] objArray2 = new Object[i];
                a.D().w(op.a, "prepareEditPageParam end", objArray2);
             }
          }
          videoContext = p.c(gifshowActiv, f, b, a, p0, p3, false, 0);
          PatchProxy.onMethodExit(p.class, str);
          goto label_00d6 ;
       }
    label_00e5 :
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, p.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.a, "release", objArray);
       b9.a(this.m);
       return;
    }
    public Void p(File p0){
       Object[] objArray1;
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          int i = 0;
          if (this.h == null) {
             Object[] objArray = new Object[i];
             a.D().w(this.a, "sendImage saveFileToCameraDirectory", objArray);
             objArray1 = new Object[i];
             a.D().w(this.a, "destFile "+a.g(this.d(), p0).getAbsolutePath(), objArray1);
             this.h = true;
          }else {
             objArray1 = new Object[i];
             a.D().w(this.a, "hasSavedPicture", objArray1);
          }
       }catch(java.io.IOException e6){
          a.D().e(this.a, "saveFileToCameraDirectory", e6);
       }
       return null;
    }
    public final void s(File p0,Bitmap p1,int p2){
       Object[] this;
       Intent intent;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, p.class, "24")) {
          return;
       }
       this = new Object[0];
       a.D().w(this.a, "startEditPage "+p0.getAbsolutePath(), this);
       if (this.k == null) {
          this.m(p0, p1, p2, true);
       }
       p tk = this.k;
       a uoa = null;
       this.k = uoa;
       p tl = this.l;
       this.l = uoa;
       if (a1.i(this.d()) && (tk == null || tl == null)) {
          Object[] objArray = new Object[0];
          a.D().w(this.a, "startEditPage activity invavailable editPageParam:"+tk, objArray);
          this.g();
          return;
       }else {
          p.q(tl, p0, tk, this.a);
          p.n();
          if (!PatchProxy.applyVoid(uoa, this, op, "23")) {
             this.e.V();
             if (i.h()) {
                i.m().i();
             }else {
                ExceptionHandler.handleCaughtException(new Throwable("take pic post session is null"));
                i.V();
             }
          }
          p.r(tk, p1, p2, this.d());
          c.d().g(a.d(true, tl));
          if (this.i() && (p1 != null && this.d() != null)) {
             Object[] objArray1 = new Object[0];
             a.D().w(this.a, "buildBitmapsEditIntent, bitmap:"+p1, objArray1);
             intent = d.a(0x27ab2faf).pA(tk, Collections.singletonList(p1), this.d(), "CAMERA_SOURCE");
          }else {
             intent = d.a(0x14d6f666).NX(this.d(), tk);
          }
          Intent intent1 = intent;
          if (this.d() == null) {
             Object[] objArray2 = new Object[0];
             a.D().w(this.a, "prepareEditPhoto EditPlugin invavailable", objArray2);
             this.g();
             return;
          }else {
             s.b().c(3, tk, this.d(), 551, intent1);
             return;
          }
       }
    }
}
