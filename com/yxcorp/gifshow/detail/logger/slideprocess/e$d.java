package com.yxcorp.gifshow.detail.logger.slideprocess.e$d;
import qvb.q;
import com.yxcorp.gifshow.detail.logger.slideprocess.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.retrofit.model.KwaiException;
import t1a.b;
import sy6.a;
import java.util.Objects;
import java.lang.Integer;
import t1a.a;
import m9a.w;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import com.kwai.video.hodor.Hodor;
import java.lang.System;
import android.os.SystemClock;
import java.util.LinkedList;
import qvb.p;

public class e$d implements q	// class@00157e
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       e$d uod = e$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uod, "3")) {
          return;
       }
       if (this.b.W8()) {
          return;
       }
       int i = -1;
       if (p1 instanceof KwaiException) {
          i = p1.getErrorCode();
       }
       e$d tb = this.b;
       tb.R.a(tb.S, tb.T, i);
       e$d tb1 = this.b;
       tb1.T = false;
       tb1.S = false;
       tb1.c9();
       return;
    }
    public void Z1(boolean p0,boolean p1){
       e$d uod = e$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "1")) {
          return;
       }
       if (this.b.W8()) {
          return;
       }
       e$d tb = this.b;
       e r = tb.R;
       String str = tb.V8();
       int i = this.b.L.a0();
       e s = this.b.s;
       Objects.requireNonNull(r);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(str, Integer.valueOf(i), Integer.valueOf(s), Boolean.valueOf(p0), r, b.class, "1")) {
          a uoa = new a();
          uoa.mCurrentPhotoId = str;
          uoa.mCurrentPhotoIndex = i;
          uoa.mCurrentSlideCount = s;
          uoa.mNetworkType = w.a();
          uoa.mNetScore = NetworkQualityEstimator.b();
          uoa.mCdnSpeed = Hodor.instance().getNetSpeedKbpsForPreload();
          uoa.mStartTime = System.currentTimeMillis();
          uoa.a = SystemClock.elapsedRealtime();
          uoa.mIsFirstPage = p0;
          r.a.add(uoa);
       }
       this.b.c9();
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
    }
    public void v2(boolean p0,boolean p1){
       e$d uod = e$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "2")) {
          return;
       }
       if (this.b.W8()) {
          return;
       }
       e$d tb = this.b;
       tb.R.a(tb.S, tb.T, 200);
       tb = this.b;
       tb.T = false;
       tb.S = false;
       tb.c9();
       return;
    }
}
