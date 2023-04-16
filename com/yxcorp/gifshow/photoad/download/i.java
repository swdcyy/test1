package com.yxcorp.gifshow.photoad.download.i;
import nxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import tkd.b;
import tkd.d;
import nl9.m;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import vq4.c;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nxb.a;
import mxb.j0;
import nxb.m0;
import erd.g;
import nxb.l0;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.Boolean;
import nxb.m;
import mu8.o;
import com.kwai.robust.PatchProxyResult;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import brd.t;
import ul9.a;
import nxb.q0;
import crd.b;
import java.lang.Throwable;
import nxb.p0;
import h59.b;
import kotlin.jvm.internal.a;
import g59.o;
import java.lang.Integer;
import java.util.Objects;
import p49.f;
import p49.c;
import p49.f$a;
import h59.a;
import p49.a;
import nxb.j0;
import java.lang.Long;
import nxb.n0;
import nxb.o0;
import java.io.File;
import com.yxcorp.gifshow.util.DateUtils;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import nxb.k0;
import mxb.i0;
import mxb.j;
import vq4.d;
import o56.a;
import android.content.Context;
import ekd.p0;

public class i extends i0	// class@000f87
{
    public AdDataWrapper c;
    public BaseFeed d;
    public int e;
    public boolean f;
    public String g;

    public void i(BaseFeed p0){
       super();
       this.f = false;
       this.d = p0;
       this.c = d.a(-2125799450).Pl(p0);
    }
    public void i(ApkDownloadTaskInfo p0){
       super();
       this.f = false;
       if (p0 instanceof PhotoApkDownloadTaskInfo) {
          this.c = p0.mAdDataWrapper;
          PhotoApkDownloadTaskInfo mPhoto = p0.mPhoto;
          if (mPhoto != null) {
             this.d = mPhoto.mEntity;
          }
          this.e = p0.mAdPosition;
       }
       return;
    }
    public void i(AdDataWrapper p0){
       super();
       this.f = false;
       this.c = p0;
       this.d = p0.getPhoto();
       this.e = p0.getAdPosition();
    }
    public static void q(i p0,c p1){
       p0.t(p1);
    }
    public void a(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       a.a.a(p0.getUrl());
       return;
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       super.b(p0);
       long soFarBytes = p0.getSoFarBytes();
       long totalBytes = p0.getTotalBytes();
       j0 oj0 = this.s(35);
       if (oj0 != null) {
          m0 om0 = new m0(this, soFarBytes, totalBytes);
          oj0.d(v0);
          this.r(oj0);
          oj0.a();
       }
       return;
    }
    public void c(DownloadTask p0){
       i c;
       APKDownloadTask uAPKDownload;
       ApkDownloadTaskInfo mPackageMd5;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, i.class, "3")) {
          return;
       }
       super.c(p0);
       long soFarBytes = p0.getSoFarBytes();
       long totalBytes = p0.getTotalBytes();
       j0 oj0 = obj.s(31);
       if (oj0 != null) {
          l0 ol0 = new l0(this, soFarBytes, totalBytes);
          oj0.d(v13);
          obj.r(oj0);
          if (!PatchProxy.applyVoidOneRefs(oj0, obj, i.class, "16") && (obj.f != null && obj.c != null)) {
             Object[] objArray1 = new Object[0];
             j0.f("PhotoAdDownloadListener", "download file has exist, apk name is "+obj.c.getAppName()+", created time is "+obj.g, objArray1);
             oj0.q("file_exists_before_download", Boolean.TRUE);
             oj0.q("file_created_time", obj.g);
          }
       label_0079 :
          obj1.setInstallCallListener(new m(obj.c));
          String str = PatchProxy.apply(null, obj, i.class, "12");
          if (str != PatchProxyResult.class) {
          }else {
             c = obj.c;
             if (c != null) {
                str = c.getPackageName();
             }else {
                c = obj.d;
                if (c != null) {
                   String str1 = "AD";
                   if (c.get(str1) instanceof PhotoAdvertisement) {
                      str = obj.d.get(str1).mPackageName;
                   }
                }
                str = null;
             }
          }
          a.d(str, obj.c, p0.getUrl(), oj0);
       }
       c = obj.c;
       if (c != null && (!TextUtils.x(c.getUrl()) && !q.f(obj.c.getApkMd5s()))) {
          uAPKDownload = h.n().l(obj.c.getUrl());
          if (uAPKDownload != null) {
             uAPKDownload = uAPKDownload.mTaskInfo;
             if (uAPKDownload != null) {
                mPackageMd5 = uAPKDownload.mPackageMd5;
             label_00ef :
                a.c("commercial_night_watch", 0, 0, 40).onTerminateDetach().subscribe(new q0(p0.getTargetFilePath(), obj.c.getApkMd5s(), mPackageMd5, obj.c.getUrl()));
             }
          }
          mPackageMd5 = "";
          goto label_00ef ;
       }
    label_0117 :
       if (!PatchProxy.applyVoid(null, obj, i.class, "4") && obj.c != null) {
          uAPKDownload = h.n().l(obj.c.getUrl());
          if (uAPKDownload != null) {
             APKDownloadTask mTaskInfo = uAPKDownload.mTaskInfo;
             if (mTaskInfo == null || (!TextUtils.x(mTaskInfo.mParsedPkgName) && a.c(obj.c))) {
                Object[] objArray = new Object[0];
                j0.f("PhotoAdDownloadListener", "replacePkgName "+obj.c.getPackageName()+" to "+uAPKDownload.mTaskInfo.mParsedPkgName, objArray);
                uAPKDownload = uAPKDownload.mTaskInfo;
                ApkDownloadTaskInfo mTaskInfo1 = uAPKDownload.mParsedPkgName;
                uAPKDownload.mPkgName = mTaskInfo1;
                obj.c.setPackageName(mTaskInfo1);
             }
          }
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       b a;
       int i;
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oi, "9")) {
          return;
       }
       if (!p0.getSoFarBytes() && this.u(p0)) {
          return;
       }
       j0 oj0 = this.s(40);
       if (oj0 != null) {
          oj0.d(new p0(this, p1)).a();
       }
       Object[] objArray = null;
       BaseFeed uBaseFeed = PatchProxy.apply(objArray, this, oi, "10");
       if (uBaseFeed != patchProxyRe) {
       }else {
          oi = this.c;
          uBaseFeed = (oi != null && oi.getPhoto() != null)? this.c.getPhoto(): this.d;
       }
       String url = p0.getUrl();
       if (!PatchProxy.applyVoidFourRefs("PhotoAdDownloadListener", uBaseFeed, p1, url, null, b.class, "1")) {
          a.p("PhotoAdDownloadListener", "tag");
          a = b.a;
          if (p1 != null) {
             objArray = p1.getMessage();
          }
          i = 0;
          Integer integer = Integer.valueOf(o.a(objArray, i));
          Objects.requireNonNull(a);
          Object obj = PatchProxy.applyOneRefs(integer, a, b.class, "3");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             b = -4106;
             if (integer == null || integer.intValue() != b) {
                b = -4130;
                if (integer == null || integer.intValue() != b) {
                label_00a8 :
                   b = i;
                }
             }
             i = 1;
             goto label_00a8 ;
          }
          if (!b) {
             Objects.requireNonNull(c.Z);
             f.a.a(c.c).g(new a("PhotoAdDownloadListener", uBaseFeed, p1, url));
          }
       }
       return;
    }
    public void g(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "8")) {
          return;
       }
       j0 oj0 = this.s(36);
       if (oj0 != null) {
          oj0.d(new j0(this));
          this.r(oj0);
          oj0.a();
       }
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, i.class, "6")) {
          return;
       }
       super.i(p0, p1, p2);
       j0 oj0 = this.s(33);
       if (oj0 != null) {
          n0 on0 = new n0(this, p1, p2);
          oj0.d(v6);
          this.r(oj0);
          oj0.a();
       }
       return;
    }
    public void m(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, i.class, "7")) {
          return;
       }
       super.m(p0, p1, p2);
       if (!p1) {
          return;
       }
       j0 oj0 = this.s(34);
       if (oj0 != null) {
          o0 oo0 = new o0(this, p1, p2);
          oj0.d(v6);
          this.r(oj0);
          oj0.a();
       }
       return;
    }
    public void o(DownloadTask p0){
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "1")) {
          return;
       }
       super.o(p0);
       if (p0.getSoFarBytes()) {
          return;
       }
       if (this.u(p0)) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "15") && this.f == null) {
          File uFile = new File(p0.getTargetFilePath());
          if (uFile.exists()) {
             this.f = true;
             this.g = DateUtils.a(uFile.lastModified());
          }
       }
       j0 oj0 = this.s(30);
       if (oj0 != null) {
          oj0.d(new j0(this));
          this.r(oj0);
          oj0.a();
       }
       return;
    }
    public final void r(j0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "14")) {
          return;
       }
       i tc = this.c;
       if (tc != null && tc.getAdLogParamAppender() != null) {
          p0.d(new k0(this));
       }
       return;
    }
    public final j0 s(int p0){
       j0 obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i0.a();
       i tc = this.c;
       if (tc != null) {
          return obj.p(p0, tc.getAdLogWrapper());
       }else {
          tc = this.d;
          if (tc != null) {
             return obj.e(p0, tc);
          }else {
             return null;
          }
       }
    }
    public final void t(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "13")) {
          return;
       }
       i tc = this.c;
       if (tc != null) {
          p0.h0 = tc.getDownloadSource();
       }
       return;
    }
    public final boolean u(DownloadTask p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getAllowedNetworkTypes() == 2 && p0.A(a.B))? true: false;
       return b;
    }
}
