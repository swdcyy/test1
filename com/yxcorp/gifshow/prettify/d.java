package com.yxcorp.gifshow.prettify.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.e;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.base.d;
import tg9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import android.content.Intent;
import android.app.Activity;
import lnc.n4;
import wd9.a;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.c;
import p1c.a;
import p1c.d;
import com.yxcorp.gifshow.prettify.PrettifyPlugin$PrettyGuideType;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import l0c.m;
import erd.a;
import com.yxcorp.gifshow.prettify.b;
import com.yxcorp.gifshow.prettify.c;
import erd.g;
import crd.b;
import q0c.o2;
import oa0.a;
import q0c.a;
import com.yxcorp.gifshow.camera.bubble.b;
import lnc.a1;
import l0c.y;
import com.yxcorp.gifshow.bubble.b$c;
import l0c.d0;
import com.yxcorp.gifshow.camera.bubble.b$c;
import l0c.x;
import k07.g;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyBubbleConfig;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import q0c.c2;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyGuideConfig;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j8c.a;
import q87.c;
import oc9.w;
import zb9.p0;
import zb9.p0$a;
import s0d.f;
import s0d.e;
import com.yxcorp.gifshow.prettify.f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class d implements Runnable	// class@001140
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void run(){
       boolean b1;
       d tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       tb.d.j().addView(tb.r);
       Object[] objArray = null;
       boolean b = true;
       int i = 0;
       if (PatchProxy.applyVoid(objArray, tb, uoe, "13")) {
       }else {
          Object obj2 = PatchProxy.apply(objArray, tb, uoe, "17");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(e.N && (tb.c != CameraPageType.LIVE_COVER && (tb.D != null && (!tb.C() && (!tb.a2() && (n4.c(tb.e.getIntent()) || tb.d.d(a.i).a != null)))))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             tb.D.u(RecordBubbleItem.PRETTIFY_GUIDE);
          }else {
             e.N = i;
             tb.Y1(d.a().h(PrettifyPlugin$PrettyGuideType.VIDEO.mValue).map(new e()).observeOn(d.a).doFinally(new m(tb)).subscribe(new b(tb), c.b));
          }
       }
       b obj = PatchProxy.apply(objArray, tb, uoe, "54");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(tb.D == null || (tb.c == CameraPageType.LIVE_COVER || (!o2.b() && (!o2.a() || (!a.B() || !a.g()))))){
          b = false;
       }else {
          obj = new b(RecordBubbleItem.RECO_BEAUTY_GUIDE_BUBBLE).n(tb.s).A(R.string.arg_RES_7f10036a);
          obj.q(5000);
          obj.t((- a1.d(R.dimen.arg_RES_7f070329)));
          obj = obj.z(new y(tb));
          obj.x(b);
          obj.v(new d0(tb));
          obj.o(new x(tb));
          tb.D.n(obj);
       }
       if (!b && !PatchProxy.applyVoid(objArray, tb, uoe, "51")) {
          Object[] obj1 = PatchProxy.apply(objArray, tb, uoe, "53");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             PostBeautifyResponse postBeautify = BeautyDataHelper.d.h();
             if (postBeautify != null) {
                c2.b(postBeautify);
                postBeautify = postBeautify.mMedicalBeautyConfig;
                if (postBeautify != null) {
                   MedicalBeautyConfig mBeautyGuide = postBeautify.mBeautyGuideConfig;
                   if (mBeautyGuide != null) {
                      BeautyGuideConfig mBeautyBubbl = mBeautyGuide.mBeautyBubbleConfig;
                      if (mBeautyBubbl != null && (!q.f(mBeautyBubbl.mBubbleImageUrls) && (!TextUtils.x(mBeautyBubbl.mMainTitle) && !TextUtils.x(mBeautyBubbl.mSubTitle)))) {
                         objArray = mBeautyBubbl;
                      }
                   }
                }
             }
          }
          String str = "PrettifyController";
          if (objArray == null) {
             obj1 = new Object[i];
             a.D().w(str, "not to show medical bubble, bubble config is null", obj1);
          }else {
             c uoc = tb.d.b().V7();
             if (uoc != null) {
                if (tb.d.d(p0.j.a()).c()) {
                   obj1 = new Object[i];
                   a.D().w(str, "not to show medical bubble, assist mode on currently", obj1);
                }else {
                   Object[] objArray1 = new Object[i];
                   a.D().w(str, "tryShowMedicalBeautyGuideBubble", objArray1);
                   a.d(f.x().q(objArray.mBubbleImageUrls).v(), new f(tb, uoc, objArray));
                }
             }
          }
       }
    label_01c8 :
       return;
    }
}
