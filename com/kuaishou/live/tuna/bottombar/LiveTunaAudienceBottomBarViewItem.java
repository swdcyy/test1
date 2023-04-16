package com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBarViewItem;
import com.kuaishou.live.bottombar.component.widget.d;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBarViewItem$mLottieAnmLnr$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import o56.a;
import android.os.Trace;
import k51.a;
import k51.b;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.m1;
import com.kuaishou.live.bottombar.component.widget.view.PressableFixedSimpleKwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBarViewItem$a;
import android.view.View$OnClickListener;
import z61.b;
import pp3.c;
import z61.e;
import z61.l;
import ekd.j;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import s0d.b;
import java.lang.StringBuilder;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import ub.b;
import pb.d;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBarViewItem$mLottieAnmLnr$2$a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge;
import n61.a;

public final class LiveTunaAudienceBottomBarViewItem extends d	// class@000f96
{
    public PressableFixedSimpleKwaiImageView k;
    public LottieAnimationView l;
    public ViewGroup m;
    public View n;
    public TextView o;
    public final p p;

    public void LiveTunaAudienceBottomBarViewItem(){
       super();
       this.p = s.c(new LiveTunaAudienceBottomBarViewItem$mLottieAnmLnr$2(this));
    }
    public View C(Context p0,ViewGroup p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTunaAudienceBottomBarViewItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = "LiveTunaAudienceBottomBarViewItem::createView";
       long l = System.nanoTime();
       if (a.d()) {
          Trace.beginSection(obj);
       }
       View view = b.f(p0, R.layout.live_audience_bottom_bar_tuna_layout, p1, false, a.c());
       if (a.d()) {
          Trace.endSection();
       }
       float f = (float)(System.nanoTime() - l) / 1000000.00f;
       if (a.d() && !SystemUtil.R()) {
          Object[] objArray = new Object[]{obj,Float.valueOf(f)};
          String str = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLogTag.LIVE_PERFORMANCE, str);
       }
       return view;
    }
    public void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTunaAudienceBottomBarViewItem.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.k = m1.f(p0, 0x7f0a1a9e);
          LottieAnimationView lottieAnimat = m1.f(p0, R.id.live_audience_bottom_bar_tuna_lottie_view);
          this.l = lottieAnimat;
          if (lottieAnimat != null) {
             lottieAnimat.setRepeatMode(1);
          }
          this.o = m1.f(p0, 0x7f0a1ac1);
          this.n = m1.f(p0, 0x7f0a1aa1);
          this.m = m1.f(p0, 0x7f0a192c);
       }
       this.h.setOnClickListener(new LiveTunaAudienceBottomBarViewItem$a(this));
       return;
    }
    public void F(b p0){
       CDNUrl mUrl;
       LiveTunaAudienceBottomBarViewItem m;
       LiveTunaAudienceBottomBarViewItem n;
       l mSelectedIco;
       l mSelectedIco1;
       e uoe;
       ImageRequest[] imageRequest;
       ImageRequest[] imageRequest1;
       a$a uoa;
       d uod;
       AbstractDraweeController uAbstractDra;
       Object obj = this;
       d obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveTunaAudienceBottomBarViewItem.class, "4")) {
          return;
       }
       a.p(obj1, "item");
       if (!obj1 instanceof c) {
          obj1 = 0;
       }
       Object obj2 = obj1;
       if (obj2 != null && !PatchProxy.applyVoidOneRefs(obj2, obj, LiveTunaAudienceBottomBarViewItem.class, "5")) {
          this.G();
          if (obj2.d != null) {
             obj1 = obj.h;
             a.o(obj1, "mRootView");
             obj1.setAlpha(0x3f800000);
          }else {
             obj1 = obj.h;
             a.o(obj1, "mRootView");
             obj1.setAlpha(0x3f000000);
          }
          if (!PatchProxy.applyVoidOneRefs(obj2, obj, LiveTunaAudienceBottomBarViewItem.class, "6")) {
             m = obj.k;
             if (m != null) {
                if (obj2.mIsSelected != null) {
                   mSelectedIco = obj2.mSelectedIconUrl;
                   mSelectedIco1 = obj2.mSelectedIconRes;
                }else {
                   mSelectedIco = null;
                   mSelectedIco1 = -1;
                }
                if (j.h(mSelectedIco) && mSelectedIco1 == -1) {
                   mSelectedIco = obj2.mIconUrl;
                   mSelectedIco1 = obj2.mIconRes;
                }
                l ol = mSelectedIco;
                l ol1 = mSelectedIco1;
                if (ol1 != -1) {
                   m.setPlaceHolderImage(ol1);
                }
                e b = obj2.b;
                if (PatchProxy.isSupport(LiveTunaAudienceBottomBarViewItem.class)) {
                   uoe = b;
                   if (!PatchProxy.applyVoidThreeRefs(ol, Integer.valueOf(ol1), Boolean.valueOf(b), this, LiveTunaAudienceBottomBarViewItem.class, "7")) {
                   }
                }else {
                   uoe = b;
                }
             }
          }
       label_00fe :
          obj1 = obj.h;
          a.o(obj1, "mRootView");
          obj1.setEnabled(obj2.d);
          int i = 8;
          n.Y(obj.l, i, false);
          l mLottieAnima = obj2.mLottieAnimation;
          if (mLottieAnima != null) {
             int i1 = (!mLottieAnima.length)? 1: 0;
             if ((i1 ^ 1) == 1) {
                object oobject = mLottieAnima[0];
                if (oobject != null) {
                   mUrl = oobject.mUrl;
                   if (mUrl != null) {
                   label_0127 :
                      if (!TextUtils.x(mUrl)) {
                         if (!PatchProxy.applyVoidOneRefs(mUrl, obj, LiveTunaAudienceBottomBarViewItem.class, "8")) {
                            LiveTunaAudienceBottomBarViewItem l = obj.l;
                            if (l != null) {
                               if (l.p()) {
                                  l.f();
                               }
                               l.setAnimationFromUrl(mUrl);
                               l.setRepeatCount(-1);
                               l.setRepeatMode(1);
                               LiveTunaAudienceBottomBarViewItem$mLottieAnmLnr$2$a omLottieAnmL = PatchProxy.apply(null, obj, LiveTunaAudienceBottomBarViewItem.class, "1");
                               if (omLottieAnmL == PatchProxyResult.class) {
                                  omLottieAnmL = obj.p.getValue();
                               }
                               l.a(omLottieAnmL);
                               l.s();
                            }
                         }
                      }else {
                         n.Y(obj.k, false, false);
                         n.Y(obj.l, i, false);
                      }
                      m = obj.m;
                      if (m != null) {
                         m.setSelected(obj2.c);
                      }
                      n = obj.n;
                      a.m(n);
                      LiveTunaAudienceBottomBarViewItem o = obj.o;
                      a.m(o);
                      a.a(obj2.mDisableShowRedPoint, obj2.mBadge, n, o);
                   }
                }
             }
          }
       label_0125 :
          mUrl = "";
          goto label_0127 ;
       }
       return;
    }
    public final void G(){
       if (PatchProxy.applyVoid(null, this, LiveTunaAudienceBottomBarViewItem.class, "10")) {
          return;
       }
       LiveTunaAudienceBottomBarViewItem tl = this.l;
       if (tl != null) {
          tl.t();
       }
       tl = this.l;
       if (tl != null && tl.p() == true) {
          tl = this.l;
          if (tl != null) {
             tl.f();
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveTunaAudienceBottomBarViewItem.class, "11")) {
          return;
       }
       super.a();
       this.G();
       return;
    }
    public void q(int p0){
       LiveTunaAudienceBottomBarViewItem liveTunaAudi = LiveTunaAudienceBottomBarViewItem.class;
       if (PatchProxy.isSupport(liveTunaAudi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveTunaAudi, "9")) {
          return;
       }
       d th = this.h;
       if (th != null) {
          th.setBackgroundResource(p0);
       }
       return;
    }
}
