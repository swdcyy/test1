package com.yxcorp.gifshow.photo.download.task.n0;
import com.yxcorp.gifshow.photo.download.task.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import crd.b;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.System;
import ywb.e;
import q87.c;
import com.yxcorp.gifshow.photo.download.model.PhotoStage;
import wkd.b;
import zwb.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import java.util.Objects;
import kotlin.jvm.internal.a;
import ixb.s;
import erd.o;
import ixb.t;
import t45.d;
import brd.z;
import ixb.u;
import ixb.v;
import ixb.w;
import com.yxcorp.gifshow.photo.download.task.n0$a;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import jxb.i;
import java.lang.Long;
import o56.a;
import android.content.Context;
import ekd.p0;
import com.kwai.sdk.switchconfig.a;
import java.lang.Double;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.photo.download.task.i0;
import io.reactivex.g;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.photo.download.task.c0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import ixb.t1;
import java.io.File;
import java.lang.Float;
import qkd.b;
import java.lang.StringBuilder;
import x6b.j;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import com.yxcorp.gifshow.photo.download.task.e0;
import com.yxcorp.gifshow.photo.download.task.g0;
import com.kuaishou.android.model.mix.VideoMeta;
import tl8.d;
import zp.c0;
import com.yxcorp.gifshow.photo.download.task.j0;
import ixb.i2;
import ixb.p1;
import java.lang.Throwable;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import com.yxcorp.gifshow.photo.download.task.exception.NoSpaceException;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import kp.r1;
import mc6.j;
import j80.g;
import ixb.r1;
import java.io.IOException;
import ywb.f;
import ixb.c2;
import ixb.d2;
import erd.a;
import ixb.h2;
import ixb.n1;
import ixb.s1;
import ixb.o1;

public class n0 extends f	// class@000f0d
{
    public boolean l;
    public final boolean m;
    public final b[] n;
    public final DownloadRedPacketHelper o;
    public static final String p = "n0";

    public void n0(GifshowActivity p0,QPhoto p1,StatModel p2,b p3){
       super(p0, p1, p2, p3);
       this.l = true;
       b[] uobArray = new b[true];
       uobArray[0] = null;
       this.n = uobArray;
       this.o = new DownloadRedPacketHelper();
       this.m = this.m();
       p2.mNeedCdnReport = false;
    }
    public t b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n0 obj = PatchProxy.apply(null, this, n0.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.e.mStartTime = System.currentTimeMillis();
       if (this.m != null) {
          Object[] objArray = new Object[0];
          e.C().w(n0.p, "getDownloadInfo mIsMockFile", objArray);
          this.e.mPhotoStage = PhotoStage.MOCK;
          return b.a(-258426948).d(this.b.getPhotoId(), QCurrentUser.ME.getId(), "detailMock", null, 0);
       }else {
          obj = this.o;
          b tb = this.b;
          Objects.requireNonNull(obj);
          t ot = PatchProxy.applyOneRefs(tb, obj, DownloadRedPacketHelper.class, "1");
          if (ot != patchProxyRe) {
          }else {
             a.p(tb, "photo");
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (!qCurrentUser.isLogined() || !tb.isVideoType()) {
                ot = t.just(Boolean.FALSE);
                a.o(ot, "Observable.just\(false\)");
             }else {
                ot = obj.b(tb).flatMap(new s(obj, tb)).flatMap(new t(obj, tb)).subscribeOn(d.c).flatMap(new u(obj, tb)).map(new v(obj)).onErrorReturn(new w(obj));
                a.o(ot, "getConfig\(photo\).flatMap¡­= false\n      false\n    }");
             }
          }
          return ot.flatMap(new n0$a(this));
       }
    }
    public void e(){
       boolean b1;
       n0 on0 = n0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on0, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "5";
       t ot = PatchProxy.apply(objArray, this, on0, str);
       if (ot != patchProxyRe) {
       }else if(this.l != null){
          b tb = this.b;
          DownloadPhotoInfoResponse mVideoSize = this.f.mVideoSize;
          boolean b = true;
          if (PatchProxy.isSupport(i.class)) {
             Object obj = PatchProxy.applyTwoRefs(tb, Long.valueOf(mVideoSize), objArray, i.class, str);
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(tb.isVideoType() && (!p0.F(a.B) && p0.C(a.B))){
                if (PatchProxy.isSupport(i.class)) {
                   Object obj1 = PatchProxy.applyOneRefs(Long.valueOf(mVideoSize), objArray, i.class, "14");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else if((double)mVideoSize - (a.t().getValue("maxDownloadableSizeFor4G", Double.TYPE, Double.valueOf(15.00f)).doubleValue() * 1048576.00f) >= 0){
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                }else {
                   goto label_0070 ;
                }
                if (!b1) {
                label_0097 :
                   b = false;
                }
             }else {
                goto label_0097 ;
             }
          }else {
             goto label_0041 ;
          }
          if (b) {
             ot = t.create(new i0(this)).subscribeOn(a.c());
          }
       }
       ot = t.just(this.f);
       ot.observeOn(d.a).doOnNext(new c0(this)).subscribe(Functions.d(), new t1(this));
       return;
    }
    public final void l(File p0,boolean p1,float p2){
       if (PatchProxy.isSupport(n0.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Float.valueOf(p2), this, n0.class, "16")) {
          return;
       }
       if (!b.S(p0)) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w(n0.p, "reExportHighFrameRateVideoFromLocal FrameRatePromote,start download video inputFile:"+p0, objArray);
       this.e.mWaterMarkType = 3;
       qa.s(j.class, LoadPolicy.SILENT).R(new e0(this, p0, p1, p2), g0.b);
       return;
    }
    public boolean m(){
       File obj = PatchProxy.apply(null, this, n0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c0.e(this.b.mEntity.a(VideoMeta.class));
       boolean b = (obj != null && ((QCurrentUser.me().getId()).equalsIgnoreCase(this.b.getUserId()) && obj.exists()))? true: false;
       return b;
    }
    public final b n(File p0,float p1){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, on0, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.just(p0).flatMap(this.k(p1)).map(j0.b).flatMap(this.j()).subscribeOn(d.c).observeOn(d.a).subscribe(new i2(this), new p1(this));
    }
    public final void o(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "13")) {
          return;
       }
       if (PostWorkErrorTips.a(p0)) {
          this.h(new NoSpaceException());
       }else {
          this.h(p0);
       }
       return;
    }
    public final void p(boolean p0){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on0, "12")) {
          return;
       }
       File uFile = c0.e(this.b.mEntity.a(VideoMeta.class));
       if (uFile == null) {
          uFile = g.c(j.c(r1.H0(this.b.mEntity), this.b.mEntity.getId()));
       }
       this.e.mIsNetDownload = false;
       if (uFile.exists()) {
          try{
             if (!p0) {
                if (!(uFile.getCanonicalPath()).equals(this.j.getCanonicalPath())) {
                   this.i = t.just(uFile).subscribe(new r1(this));
                }
             }else if(!(uFile.getCanonicalPath()).equals(this.j.getCanonicalPath())){
                this.i = this.n(uFile, 0);
             }
          }catch(java.io.IOException e5){
             e5.printStackTrace();
          }
       }else {
          t ot = PatchProxy.apply(null, this, on0, "14");
          if (ot != PatchProxyResult.class) {
          }else {
             f uof = new f();
             ot = t.create(new c2(this, uof)).doOnDispose(new d2(this, uof));
          }
          if (p0) {
             this.i = ot.flatMap(this.k(0x3f4ccccd)).map(j0.b).flatMap(this.j()).subscribeOn(d.c).observeOn(d.a).subscribe(new h2(this), new n1(this));
          }else {
             this.i = ot.subscribeOn(d.c).observeOn(d.a).subscribe(new s1(this), new o1(this));
          }
       }
    }
}
