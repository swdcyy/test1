package com.yxcorp.gifshow.featured.detail.featured.poornet.c$a;
import df5.b;
import com.yxcorp.gifshow.featured.detail.featured.poornet.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import xda.a;
import com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetPhotoInfo;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import wkd.b;
import qea.u;
import p5a.d;
import java.lang.System;
import android.os.SystemClock;
import sy6.a;
import com.yxcorp.gifshow.featured.detail.featured.poornet.b;
import crd.b;
import xda.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import xda.e;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetInfo;

public class c$a implements b	// class@000f46
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       b c;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       int i = 1;
       ta.t = ta.t + i;
       ta.z = p0;
       ta.D = 0;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "11")) {
          if (ta.z != null) {
             a.C("buildPhotoInfoAfterAttach");
             PoorNetPhotoInfo poorNetPhoto = new PoorNetPhotoInfo();
             ta.B = poorNetPhoto;
             poorNetPhoto.mPhotoId = ta.z.getPhotoId();
             poorNetPhoto.mIsPrefetch = ta.z.isPrefetch();
             poorNetPhoto.mIsFullyCache = g.i(ta.z);
             poorNetPhoto.mCacheSize = g.f(ta.z);
             poorNetPhoto.mPrefetchPoolSize = b.a(-622777217).p();
             poorNetPhoto.mPhotoType = ta.z.getType();
             poorNetPhoto.mMediaType = d.a(ta.z);
             poorNetPhoto.mIsAd = ta.z.isAd();
             poorNetPhoto.mIsNonVideo = ta.z.isVideoType() ^ i;
             poorNetPhoto.mPhotoEnterTime = System.currentTimeMillis();
             poorNetPhoto.mPhotoSystemClockEnterTime = SystemClock.elapsedRealtime();
             poorNetPhoto.mPhotoIndex = ta.I.a0();
             poorNetPhoto.mEnterInSideBar = ta.I.r();
          }else {
             a.C("buildPhotoInfoAfterAttach, but attachPhoto = null");
          }
       }
       if (this.a.X8()) {
          c$a ta1 = this.a;
          ta1.C = ta1.C + i;
       }
       this.a.Z8();
       if (this.a.t == i) {
          int i1 = -953099949;
          b uob = b.a(i1);
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoid(objArray, uob, b.class, "5") && uob.c()) {
             if (!uob.g()) {
                uob.f();
             }
             b c1 = uob.c;
             if (c1 == null || c1.isDisposed()) {
                uob.c = t.interval(1, uob.e().mUploadLogInterval, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new e(uob), h.b);
             }
          }
       label_012e :
          c = b.a(i1).c;
          if (c != null) {
             this.a.X7(c);
          }
       }
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       if (this.a.X8()) {
          this.a.R8();
          this.a.P8();
          if (this.a.q.mEnableSaveAllPhotos != null) {
             b.a(-953099949).l(this.a.A);
          }
       }
       return;
    }
}
