package com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftBoxView;
import jk1.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftBoxView$a;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import d61.y;
import mk1.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Integer;
import lnc.a1;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import ia2.b;
import ia2.a;
import ez0.g;
import java.lang.Number;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ym5.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$a;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.MotionEvent;

public class LiveAudienceGiftBoxView extends RelativeLayout implements d	// class@000b6a
{
    public LiveGiftBoxPopupView b;
    public LiveGiftTitleView c;
    public DrawingGiftEditView d;
    public KwaiImageView e;
    public View f;
    public View g;
    public View h;
    public View i;
    public LiveGiftPanelItemView j;
    public View k;
    public View l;
    public ViewGroup m;
    public View n;
    public b o;
    public boolean p;
    public boolean q;
    public GestureDetector r;
    public View s;

    public void LiveAudienceGiftBoxView(Context p0){
       super(p0, null, 0);
    }
    public void LiveAudienceGiftBoxView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceGiftBoxView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r = new GestureDetector(this.getContext(), new LiveAudienceGiftBoxView$a(this));
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceGiftBoxView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return y.d(n.d(this));
    }
    public void b(){
       int i;
       int landscapeGif;
       boolean i2;
       g a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxView.class, "5")) {
          return;
       }
       LiveAudienceGiftBoxView liveAudience = 0x800055;
       float f = 12.00f;
       int b = true;
       if (this.a()) {
          if (!PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxView.class, "12")) {
             Activity uActivity = n.d(this);
             if (uActivity != null) {
                i = n.k(uActivity);
                int i1 = n.j(uActivity);
                this.g.setVisibility(0);
                if (!this.i.getVisibility()) {
                   LiveAudienceGiftBoxView to = this.o;
                   if (to != null && to.q == null) {
                      this.i.setVisibility(8);
                   }
                }
                this.m.getLayoutParams().height = i1;
                this.k.getLayoutParams().height = i1 - (this.getGiftBoxHeight() - this.k.getLayoutParams().height);
                landscapeGif = this.getLandscapeGiftBoxWidth();
                this.getLayoutParams().height = i1;
                this.getLayoutParams().width = landscapeGif;
                this.d.setEnabled(b);
                this.d.getLayoutParams().width = i;
                this.d.getLayoutParams().height = i1;
                i2 = i - landscapeGif;
                this.d.setEmptyViewWidth(i2);
                this.d.getLayoutParams().setMargins(0, 0, landscapeGif, 0);
                this.d.k(i, i1);
                LiveAudienceGiftBoxView tn = this.n;
                if (!PatchProxy.isSupport(LiveAudienceGiftBoxView.class) || !PatchProxy.applyVoidTwoRefs(tn, Integer.valueOf(landscapeGif), this, LiveAudienceGiftBoxView.class, "9")) {
                   tn.getLayoutParams().rightMargin = landscapeGif;
                   tn.getLayoutParams().bottomMargin = a1.e(f);
                   tn.getLayoutParams().gravity = liveAudience;
                }
                this.f.getLayoutParams().width = landscapeGif;
                this.f.getLayoutParams().height = i1;
                this.f.getLayoutParams().setMargins(i, 0, 0, 0);
                this.e.getLayoutParams().setMargins(((i2 - this.e.getLayoutParams().width) / 2), a1.e(110.00f), 0, 0);
                if (this.p != null && !PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxView.class, "13")) {
                   uActivity = n.d(this);
                   if (uActivity != null) {
                      i1 = n.j(uActivity);
                      this.m.setBackground(objArray);
                      this.setBackground(a.b(this.q));
                      LiveAudienceGiftBoxView th = this.h;
                      if (th != null) {
                         th.setVisibility(0);
                         this.h.getLayoutParams().width = (int)((float)i1 * 0.29f);
                      }
                      LiveAudienceGiftBoxView ts = this.s;
                      if (ts != null) {
                         ts.setVisibility(4);
                      }
                   }
                }
             }
          }
       }else {
          g og = g.class;
          if (!PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxView.class, "6")) {
             Activity uActivity1 = n.d(this);
             if (uActivity1 != null) {
                Object obj = PatchProxy.applyOneRefs(uActivity1, objArray, og, "1");
                if (obj != PatchProxyResult.class) {
                   landscapeGif = obj.intValue();
                }else {
                   a.p(uActivity1, "activity");
                   landscapeGif = (d.a(0x4c5dd1b8).f2())? a1.d(R.dimen.arg_RES_7f07030e): n.k(uActivity1);
                }
                i = n.j(uActivity1);
                LiveGiftBoxConfig liveGiftBoxC = LiveGiftBoxConfig.m.a();
                int i3 = (liveGiftBoxC.f(this.a()))? a1.d(R.dimen.arg_RES_7f070790): a1.d(R.dimen.arg_RES_7f07078f);
                this.k.getLayoutParams().height = i3;
                i2 = liveGiftBoxC.f(this.a());
                if (!PatchProxy.isSupport(LiveAudienceGiftBoxView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i2), this, LiveAudienceGiftBoxView.class, "7")) {
                   ViewGroup$LayoutParams layoutParams1 = this.l.getLayoutParams();
                   if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                      if (i2) {
                         layoutParams1.height = a1.d(0x7f070788);
                         layoutParams1.bottomMargin = a1.d(0x7f07078a);
                      }else {
                         layoutParams1.height = a1.d(0x7f070787);
                         layoutParams1.bottomMargin = a1.d(0x7f070789);
                      }
                   }
                }
                this.b.setMinInitialTopOffset(0);
                this.d.setEnabled(b);
                b = this.getGiftBoxHeight();
                this.getLayoutParams().height = b;
                this.getLayoutParams().width = landscapeGif;
                this.d.getLayoutParams().width = landscapeGif;
                this.d.getLayoutParams().height = i;
                this.d.setEmptyViewHeight((i - b));
                this.d.getLayoutParams().setMargins(0, 0, 0, b);
                this.d.k(landscapeGif, i);
                LiveAudienceGiftBoxView tn1 = this.n;
                int i4 = a1.e(f) + b;
                if (PatchProxy.isSupport(LiveAudienceGiftBoxView.class) && (!PatchProxy.applyVoidTwoRefs(tn1, Integer.valueOf(i4), this, LiveAudienceGiftBoxView.class, "8") && tn1.getLayoutParams() instanceof FrameLayout$LayoutParams)) {
                   tn1.getLayoutParams().bottomMargin = i4;
                   tn1.getLayoutParams().gravity = liveAudience;
                }
                this.f.getLayoutParams().height = b;
                this.f.getLayoutParams().width = landscapeGif;
                this.f.getLayoutParams().setMargins(0, i, 0, 0);
                this.e.getLayoutParams().setMargins(((landscapeGif - this.e.getLayoutParams().width) / 2), a1.e(180.00f), 0, 0);
                if (!PatchProxy.applyVoidOneRefs(this, objArray, og, "3")) {
                   a.p(this, "view");
                   if (d.a(0x4c5dd1b8).f2()) {
                      ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
                      if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                         layoutParams.setMarginEnd(a1.d(R.dimen.pv));
                      }
                      a = g.a;
                      a.o(layoutParams, "params");
                      Objects.requireNonNull(a);
                      if (!PatchProxy.applyVoidOneRefs(layoutParams, a, og, "4")) {
                         if (layoutParams instanceof RelativeLayout$LayoutParams) {
                            layoutParams.addRule(19);
                         }else if(layoutParams instanceof LinearLayout$LayoutParams){
                            layoutParams.gravity = 0x800005;
                         }else if(layoutParams instanceof FrameLayout$LayoutParams){
                            layoutParams.gravity = 0x800005;
                         }
                      }
                   }
                }
             }
          }
       }
    label_0339 :
       return;
    }
    public int getGiftBoxHeight(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceGiftBoxView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int childCount = this.m.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.m.getChildAt(i);
          if (childAt.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             ViewGroup$LayoutParams height = layoutParams.height;
             if (height == -1 || height == -2) {
                Object[] objArray = new Object[0];
                a.C().A("LiveAudienceGiftBoxView", "GiftBox目前的实现机制有限制，需要在show之前就知道具体有多高，因此必须标记具体的高度，此View违反了这个机制: "+childAt, objArray);
             }else {
                i1 = i1 + height;
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   i1 = i1 + layoutParams.topMargin;
                   i1 = i1 + layoutParams.bottomMargin;
                }
             }
          }
          i = i + 1;
       }
       return i1;
    }
    public int getLandscapeGiftBoxWidth(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceGiftBoxView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.p == null) {
          return a1.d(0x7f070804);
       }
       int i = a.a(n.d(this));
       if (i <= 0) {
          i = a1.d(R.dimen.arg_RES_7f070804);
       }
       return i;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxView.class, "16")) {
          return;
       }
       super.onAttachedToWindow();
       this.b();
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceGiftBoxView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.r.onTouchEvent(p0);
       return super.onInterceptTouchEvent(p0);
    }
}
