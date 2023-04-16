package com.yxcorp.gifshow.detail.logger.slideprocess.e$a;
import qw6.b;
import com.yxcorp.gifshow.detail.logger.slideprocess.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import bf5.p;
import v1a.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.List;
import java.lang.Runnable;
import ekd.k1;
import sy6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import s1a.b;
import wkd.b;
import com.yxcorp.gifshow.w;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kuaishou.android.model.ads.SplashInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import java.lang.System;
import android.os.SystemClock;
import com.yxcorp.gifshow.detail.logger.slideprocess.a;
import p5a.d;
import e1a.s;
import java.lang.Number;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kwai.video.player.mid.manifest.ManifestInterface;
import java.util.ArrayList;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.video.hodor.HlsPreloadPriorityTask;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.Long;

public class e$a extends b	// class@00157b
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void H2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$a.class, "2")) {
          return;
       }
       if (this.b.W8()) {
          return;
       }
       e$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, e.class, "2") && tb.x != null) {
          e q = tb.Q;
          if (q != null) {
             e o = tb.O;
             if (o != null) {
                MilanoContainerEventBus z = o.z;
                String str = (z == null)? "null": z.c();
                q.b(str);
             }
          }
       }
       return;
    }
    public void Q0(){
       String str2;
       if (PatchProxy.applyVoid(null, this, e$a.class, "3")) {
          return;
       }
       e$a tb = this.b;
       if (tb.A != null) {
          return;
       }
       tb.A = true;
       if (tb.Q == null) {
          return;
       }
       e e = tb.E;
       String str = "null";
       if (e != null) {
          e i = tb.I;
          Objects.requireNonNull(tb);
          String str1 = PatchProxy.applyOneRefs(e, tb, e.class, "16");
          if (str1 != PatchProxyResult.class) {
          }else if(e == null){
             str2 = str;
          }else {
             str2 = e.getPhotoId();
          }
          str1 = tb.M+":"+str2+":"+e.V0.get(tb.w);
          if (!i.contains(str1)) {
             k1.m(this.b.G);
             this.b.X8();
          }
       }
       if (this.b.W8()) {
          return;
       }else {
          k1.m(this.b.G);
          this.b.X8();
          tb = this.b;
          e = tb.Q;
          MilanoContainerEventBus z = tb.O.z;
          if (z != null) {
             str = z.c();
          }
          e.a(str);
          this.b.e9();
          return;
       }
    }
    public void Q1(){
       long l;
       a uoa4;
       Collection uCollection;
       e$a obj = this;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, e$a.class, "1")) {
          return;
       }
       e$a b = obj.b;
       boolean b1 = false;
       b.A = b1;
       boolean b2 = true;
       b.C = b2;
       if (b.W8()) {
          return;
       }
       b = obj.b;
       e x = b.x;
       if (x != null && x == b.L.getCurrentPhoto()) {
          b = obj.b;
          if (b.y == b.L.j()) {
             return;
          }
       }
       b = obj.b;
       b.x = b.L.getCurrentPhoto();
       b = obj.b;
       if (b.x == null) {
          return;
       }else if(TextUtils.x(b.w)){
          b = obj.b;
          b.w = b.R8(b.x.getExpTag());
          Integer integer = e.V0.get(obj.b.w);
          if (integer != null) {
             obj.b.s = integer.intValue();
          }
       }
       b = obj.b;
       x = b.s;
       if (x == 6) {
          b.E = b.x;
       }
       int i = x + b2;
       b.s = i;
       HashMap v0 = e.V0;
       v0.put(b.w, Integer.valueOf(i));
       if (obj.b.W8()) {
          obj.b.S8("SLIDE_MAX_RANK");
          return;
       }else {
          b = obj.b;
          if (b.B != null) {
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, uoe, "18")) {
                b uob = new b();
                b.U = uob;
                uob.mIsColdStart = b.a(-1343064608).isColdStart();
                b.U.mLaunchSource = b.a(-1343064608).getLaunchSource();
                SplashInfo splashInfo = d.a(-536296199).ob();
                if (splashInfo != null) {
                   splashInfo = splashInfo.mSplashBaseInfo;
                   if (splashInfo != null) {
                      b.U.mSplashId = splashInfo.mSplashId;
                   }
                }
                b.U.mEnterTime = System.currentTimeMillis();
                b.U.a = SystemClock.elapsedRealtime();
                x = b.U;
                x.mPageName = b.w;
                x.mPageSessionId = b.M;
                b.a9("startSlideProcessInfo");
                e u = b.U;
                b.a(-1448653007).c(u.mPageSessionId, u);
             }
          }
          b = obj.b;
          b.B = b1;
          b.y = b.L.j();
          b = obj.b;
          if (!b.F.contains(b.V8())) {
             b = obj.b;
             b.F.add(b.V8());
          }
          b = obj.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, uoe, "1")) {
             b.C = b2;
             if (b.x != null) {
                a uoa = new a(b.P8());
                b.Q = uoa;
                String str = b.V8();
                int type = b.x.getType();
                int i1 = d.a(b.x);
                MilanoContainerEventBus z = b.O.z;
                String str1 = (z == null)? "null": z.c();
                int i2 = v0.get(b.w).intValue();
                int i3 = b.L.a0();
                String expTag = b.x.getExpTag();
                boolean b4 = b.x.isPrefetch();
                b2 = b.L.H(b.x);
                e m = b.M;
                e x1 = b.x;
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                e$a uoa1 = b;
                s os = s.class;
                a uoa2 = uoa;
                String obj1 = PatchProxy.applyOneRefs(x1, objArray, os, "1");
                if (obj1 != patchProxyRe) {
                   l = obj1.longValue();
                }else if(x1 == null){
                   obj1 = PatchProxy.applyOneRefs(x1, objArray, os, "4");
                   if (obj1 != patchProxyRe) {
                   }else {
                      QPhoto mEntity = x1.mEntity;
                      if (mEntity instanceof VideoFeed) {
                         VideoMeta mMediaManife = mEntity.mVideoModel.mMediaManifest;
                         if (mMediaManife != null) {
                            obj1 = mMediaManife.toJsonString();
                         }
                      }
                      CharSequence uCharSequenc = null;
                   }
                   if (!TextUtils.x(obj1)) {
                      if (x1.isHlsVideo()) {
                         Iterator obj2 = PatchProxy.applyOneRefs(obj1, null, os, "3");
                         if (obj2 != patchProxyRe) {
                            uCollection = obj2;
                         }else if(TextUtils.x(obj1)){
                            uCollection = null;
                         }else {
                            uCollection = VodAdaptivePreloadPriorityTask.getCacheKeyListFromManifest(obj1);
                         }
                         if (!q.f(uCollection)) {
                            l = -1;
                            obj2 = uCollection.iterator();
                            while (obj2.hasNext()) {
                               l = Math.max(l, HlsPreloadPriorityTask.getCachedBytes(obj2.next()));
                               obj2 = obj2;
                            }
                         }
                      }else {
                         l = VodAdaptivePreloadPriorityTask.getUpmostCachedBytes(obj1);
                      }
                   }
                }
             label_0210 :
                l = 0;
                a uoa3 = a.class;
                if (PatchProxy.isSupport(uoa3)) {
                   objArray = new Object[11];
                   objArray[0] = str;
                   objArray[1] = Integer.valueOf(type);
                   objArray[2] = Integer.valueOf(i1);
                   objArray[3] = str1;
                   objArray[4] = Integer.valueOf(i2);
                   objArray[5] = Integer.valueOf(i3);
                   objArray[6] = expTag;
                   objArray[7] = Boolean.valueOf(b4);
                   objArray[8] = Boolean.valueOf(b2);
                   objArray[9] = m;
                   objArray[10] = Long.valueOf(l);
                   uoa4 = uoa2;
                   if (PatchProxy.applyVoid(objArray, uoa4, uoa3, "1")) {
                   label_02ae :
                      obj = uoa1;
                      obj.H.add(obj.Q);
                   }
                }else {
                   uoa4 = uoa2;
                }
                uoa4.mPhotoId = str;
                uoa4.mPhotoType = type;
                uoa4.mMediaType = i1;
                uoa4.mWatchId = str1;
                uoa4.mSlideCount = i2;
                uoa4.mPhotoIndex = i3;
                uoa4.mExpTag = expTag;
                uoa4.mIsPrefetch = b4;
                uoa4.mHasNextPhoto = b2;
                uoa4.mPageSessionId = m;
                uoa4.mEnterTime = System.currentTimeMillis();
                uoa4.a = SystemClock.elapsedRealtime();
                uoa4.mPhotoCachedBytes = l;
                goto label_02ae ;
             }
          }
          obj = this;
          k1.m(obj.b.G);
          k1.r(obj.b.G, 50);
          e$a b3 = obj.b;
          if (b3.p != null && !TextUtils.x(b3.q)) {
             obj.b.p = null;
          }
          return;
       }
    }
}
