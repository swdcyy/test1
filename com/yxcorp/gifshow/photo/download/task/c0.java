package com.yxcorp.gifshow.photo.download.task.c0;
import erd.g;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper;
import kotlin.jvm.internal.a;
import exb.b;
import com.yxcorp.gifshow.model.CDNUrl;
import ywb.e;
import q87.c;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import brd.t;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.f;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.photo.download.task.p0;
import ixb.q1;
import ixb.f2;
import ixb.l1;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.yxcorp.gifshow.photo.download.task.k0;
import com.yxcorp.gifshow.photo.download.task.j0;
import ixb.g2;
import ixb.m1;

public final class c0 implements g	// class@000ef0
{
    public final n0 b;

    public void c0(n0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z c;
       t ot;
       b e;
       o oo;
       double d;
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = PatchProxyResult.class;
       n0 on0 = n0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, on0, "6")) {
       }else {
          b f = tb.f;
          int i = 0;
          int i1 = 1;
          if (f != null) {
             n0 o = tb.o;
             Objects.requireNonNull(o);
             if (!PatchProxy.applyVoidOneRefs(f, o, DownloadRedPacketHelper.class, "2")) {
                a.p(f, "response");
                if (o.b != null) {
                   o.e = f;
                   if (o.a == null) {
                      o.b = f.mIsRedPack;
                   }
                   boolean b = (f.mHasWatermark == null && f.mNotNeedWaterMark == null)? true: false;
                   o.g = b;
                   d = (b)? 0x3feb333333333333: 0x3fc999999999999a;
                   o.f = d;
                }
             }
          }
          tb.d.onStart();
          CDNUrl[] downloadUrl = DownloadPhotoInfoResponse.getDownloadUrl(tb.f);
          String str = "// saveLocalPhotoFile";
          if (tb.m()) {
             objArray = new Object[i];
             e.C().w(n0.p, str, objArray);
             tb.p((tb.f.mNotNeedWaterMark ^ i1));
          }else if(downloadUrl != null){
             Object[] objArray1 = new Object[i];
             e.C().w(n0.p, "// 下载服务端生成带水印视频", objArray1);
             tb.e.mWaterMarkType = 4;
             if (!PatchProxy.applyVoidOneRefs(downloadUrl, tb, on0, "7")) {
                tb.e.mIsNetDownload = i1;
                n0 o1 = tb.o;
                float f1 = 0x3f800000;
                if (o1.b != null) {
                   f1 = (float)((double)f1 * ((double)i1 - o1.f));
                }
                c = d.c;
                ot = t.just(downloadUrl).flatMap(tb.g((float)(double)f1)).observeOn(c);
                p0 op0 = PatchProxy.apply(objArray, tb, on0, "10");
                if (op0 != p0) {
                }else {
                   op0 = new p0(tb);
                }
                tb.i = ot.flatMap(op0).flatMap(tb.j()).subscribeOn(c).observeOn(d.a).doOnNext(new q1(tb)).subscribe(new f2(tb), new l1(tb));
             }
          }else if(!TextUtils.x(tb.f.mVideoUrl)){
             Object[] objArray2 = new Object[i];
             e.C().w(n0.p, "// 下载264格式无水印视频，如果主态视频需要本地打特殊水印mNotNeedWaterMark=false", objArray2);
             downloadUrl = PatchProxy.apply(objArray, tb, on0, "11");
             if (downloadUrl != p0) {
             }else {
                downloadUrl = new CDNUrl[i1];
                downloadUrl[i] = new CDNUrl(objArray, tb.f.mVideoUrl);
             }
             int i2 = tb.f.mNotNeedWaterMark ^ i1;
             if (!PatchProxy.isSupport(on0) || !PatchProxy.applyVoidTwoRefs(downloadUrl, Boolean.valueOf(i2), tb, on0, "8")) {
                e = tb.e;
                int i3 = (i2)? 1: 5;
                e.mWaterMarkType = i3;
                e.mIsNetDownload = i1;
                c = d.c;
                ot = t.just(downloadUrl).flatMap(tb.f(i2)).observeOn(c);
                if (PatchProxy.isSupport(on0)) {
                   oo = PatchProxy.applyOneRefs(Boolean.valueOf(i2), tb, on0, "9");
                   if (oo != p0) {
                   }else if(i2){
                      oo = tb.k(0x3f4ccccd);
                   }else {
                      oo = k0.b;
                   }
                }else {
                   goto label_0184 ;
                }
                tb.i = ot.flatMap(oo).map(j0.b).flatMap(tb.j()).subscribeOn(c).observeOn(d.a).subscribe(new g2(tb), new m1(tb));
             }
          }else {
             objArray = new Object[i];
             e.C().w(n0.p, str, objArray);
             tb.p((tb.f.mNotNeedWaterMark ^ i1));
          }
       }
       return;
    }
}
