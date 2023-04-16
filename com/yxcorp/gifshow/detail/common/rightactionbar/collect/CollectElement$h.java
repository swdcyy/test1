package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$h;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import com.kwai.robust.PatchProxyResult;
import xy5.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import uw9.c;
import android.content.SharedPreferences;
import wy5.a;
import km8.b;
import lnc.a1;
import java.lang.Boolean;
import com.kwai.feature.component.photofeatures.collect.config.StartUpCollectConfig;
import java.lang.reflect.Type;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import com.kuaishou.android.model.mix.CollectFeedInfo;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.util.Objects;
import java.lang.Long;
import crd.b;
import lnc.b9;
import brd.t;
import t45.d;
import brd.z;
import kz9.c;
import erd.g;
import qp7.x0;
import js7.o;
import w4.e;

public final class CollectElement$h extends y0	// class@00149b
{
    public final CollectElement a;

    public void CollectElement$h(CollectElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       CollectElement$h a;
       String str2;
       boolean b1;
       CollectElement$h a1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, CollectElement$h.class, "1")) {
          return;
       }
       PhotoMeta photoMeta = CollectElement.n0(obj.a).getPhotoMeta();
       if (photoMeta != null) {
          String str = "CollectElementTag";
          Log.g(str, "onAttached: "+photoMeta.mHasGodCommentShow);
          a.o(photoMeta, "it");
          if (!photoMeta.isCollected() && photoMeta.mHasGodCommentShow == null) {
             boolean b = false;
             String str1 = "user";
             if (c.a.getBoolean("HighCollectCountUser", b) && !a.a.getBoolean(b.d(str1)+"isCollectCancelLimitTipShow", b)) {
                a = obj.a;
                str2 = a1.p(R.string.arg_RES_7f100ec8);
                a.o(str2, "CommonUtil.string\(R.stri¡­_cancel_collection_limit\)");
                a.t0(a.D, str2);
                a = obj.a;
                a.I = a.H;
             }else if(!a.a.getBoolean("isCollectOuterIconOnceTipShow", b)){
                Log.g(str, "onAttached: ready to show new bubble");
                a = obj.a;
                str2 = a1.p(R.string.arg_RES_7f100738);
                a.o(str2, "CommonUtil.string\(R.stri¡­ollect_slide_first_guide\)");
                a.t0(a.D, str2);
                a = obj.a;
                a.I = a.G;
             }
             photoMeta = photoMeta.mCollectFeedInfo;
             if (photoMeta != null) {
                a = obj.a;
                if (a.I == a.E) {
                   StartUpCollectConfig obj1 = PatchProxy.apply(objArray, objArray, oj, "21");
                   String str3 = null;
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      obj1 = a.b(StartUpCollectConfig.class);
                      b1 = (obj1 != null && (obj1.mCollectNewUser != null || (obj1.mLowFrequencyUser != null && (System.currentTimeMillis() - a.a.getLong(b.d(str1)+"lastCollectTime", str3)) - TimeUnit.DAYS.toMillis((long)obj1.mXDaysNoActions) > 0)))? true: false;
                   }
                   if (b1 && (photoMeta.mShowForStrong != null && !obj.a.H().A())) {
                      obj1 = PatchProxy.apply(objArray, objArray, oj, "22");
                      if (obj1 != patchProxyRe) {
                         b1 = obj1.booleanValue();
                      }else {
                         b1 = a.a();
                         b = ((System.currentTimeMillis() - a.a.getLong(b.d(str1)+"lastStrongCollectGuideTime", 0)) - TimeUnit.DAYS.toMillis(7) > 0 && b1 <= 3)? 1: 0;
                         b1 = b;
                      }
                      if (b1) {
                         Log.g(str, "attaced ready show Strong bubble");
                         a = obj.a;
                         long l = (long)photoMeta.mShowTimeInSeconds;
                         String str4 = PatchProxy.apply(objArray, objArray, oj, "23");
                         if (str4 != patchProxyRe) {
                         }else {
                            StartUpCollectConfig startUpColle = a.b(StartUpCollectConfig.class);
                            str4 = (startUpColle == null)? "": startUpColle.mBubbleText;
                         }
                         a.o(str4, "PhotoCollectHelper.getCollectStrongGuideText\(\)");
                         a.t0(l, str4);
                         a1 = obj.a;
                         a1.I = a1.F;
                      }
                   }
                }
             label_01a1 :
                Log.g(str, "mShowForWeak:"+photoMeta.mShowForWeak);
                if (photoMeta.mShowForWeak != null) {
                   Log.g(str, "onAttached: ready to show weak guide");
                   a1 = obj.a;
                   long l1 = (long)photoMeta.mShowTimeInSeconds;
                   Objects.requireNonNull(a1);
                   CollectElement uCollectElem = CollectElement.class;
                   if (!PatchProxy.isSupport(uCollectElem) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), a1, uCollectElem, "10")) {
                      b9.a(a1.A);
                      a1.A = t.just(Boolean.TRUE).delay(l1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new c(a1, 0x7f0f0015));
                   }
                }
             }
          }
       }
    label_0202 :
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CollectElement$h.class, "2")) {
          return;
       }
       this.a.E().k(true, objArray);
       b9.a(this.a.z);
       b9.a(this.a.A);
       this.a.E().n(false);
       CollectElement$h ta = this.a;
       ta.I = ta.E;
       ta.J = false;
       ta.K = false;
       return;
    }
}
