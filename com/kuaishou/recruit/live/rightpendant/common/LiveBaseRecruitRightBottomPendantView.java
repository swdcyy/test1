package com.kuaishou.recruit.live.rightpendant.common.LiveBaseRecruitRightBottomPendantView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.widget.TextView;
import android.widget.RelativeLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import d61.k;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.recruit.live.rightpendant.common.LiveBaseRecruitRightBottomPendantView$a;
import ub.b;

public abstract class LiveBaseRecruitRightBottomPendantView extends FrameLayout	// class@000ed9
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final FrameLayout g;
    public final View h;
    public final View i;
    public final KwaiImageView j;
    public final KwaiSizeAdjustableTextView k;
    public final KwaiSizeAdjustableTextView l;
    public final View m;
    public final LiveLottieAnimationView n;
    public final TextView o;
    public CDNUrl[] p;

    public void LiveBaseRecruitRightBottomPendantView(Context p0){
       super(p0, null);
    }
    public void LiveBaseRecruitRightBottomPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveBaseRecruitRightBottomPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = a1.d(0x7f07092f);
       this.c = a1.d(0x7f070930);
       this.d = a1.d(0x7f070931);
       this.e = a1.d(0x7f070932);
       this.f = a1.d(0x7f070933);
       View view = a.c(p0, R.layout.arg_RES_7f0d0d7f, this);
       this.g = m1.f(view, 0x7f0a248e);
       this.h = m1.f(view, 0x7f0a248d);
       this.i = m1.f(view, 0x7f0a2494);
       this.j = m1.f(view, 0x7f0a2496);
       this.k = m1.f(view, 0x7f0a2499);
       this.l = m1.f(view, 0x7f0a249b);
       this.m = m1.f(view, 0x7f0a249c);
       this.n = m1.f(view, 0x7f0a249d);
       this.o = m1.f(view, 0x7f0a249e);
       this.a(p0, m1.f(view, R.id.live_recruit_pendant_bottom_container));
    }
    public abstract void a(Context p0,RelativeLayout p1);
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveBaseRecruitRightBottomPendantView.class, "10")) {
          return;
       }
       this.j.L(c0.a.b("/udata/pkg/kwai-client-image/live_pendant/live_recruitment_defaultbg.webp"));
       return;
    }
    public void c(int p0){
       LiveBaseRecruitRightBottomPendantView liveBaseRecr;
       if (PatchProxy.isSupport(LiveBaseRecruitRightBottomPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveBaseRecruitRightBottomPendantView.class, "4")) {
          return;
       }
       LiveBaseRecruitRightBottomPendantView te = this.e;
       if (p0 > te) {
          liveBaseRecr = te;
       }else {
          LiveBaseRecruitRightBottomPendantView tf = this.f;
          if (p0 < tf) {
             liveBaseRecr = tf;
          }
       }
       float f = (float)liveBaseRecr / (float)te;
       this.h.setScaleX(f);
       this.h.setScaleY(f);
       ViewGroup$LayoutParams layoutParams = this.g.getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-2, -2);
       }
       layoutParams.width = liveBaseRecr;
       layoutParams.height = (int)((float)this.d * f);
       this.g.setLayoutParams(layoutParams);
       return;
    }
    public void d(LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo p0){
       float f;
       float f1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseRecruitRightBottomPendantView.class, "11")) {
          return;
       }
       int i = 0x7f0619f0;
       int i1 = 0x7f06060a;
       if (p0 == null) {
          p0 = PatchProxy.apply(null, this, LiveBaseRecruitRightBottomPendantView.class, "12");
          if (p0 != PatchProxyResult.class) {
          }else {
             p0 = new LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo();
             p0.alertText = a1.p(0x7f102b4a);
             p0.alertTextColor = "#"+Integer.toHexString(a1.a(i1));
             p0.backgroundColor = "#"+Integer.toHexString(a1.a(i));
          }
       }
       this.o.setText(p0.alertText);
       this.o.setTextColor(k.c(p0.alertTextColor, a1.a(i1)));
       float[] uofloatArray = new float[]{f,f,0,0,f1,f1,0,0};
       f = (float)a1.e(2.00f);
       f1 = (float)a1.e(4.00f);
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, null, null));
       shapeDrawabl.getPaint().setColor(k.c(p0.backgroundColor, a1.a(i)));
       shapeDrawabl.getPaint().setStyle(Paint$Style.FILL);
       this.m.setBackground(shapeDrawabl);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveBaseRecruitRightBottomPendantView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.n.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_pendant/live_lottie_recruit_interpreting.json"));
       this.n.s();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveBaseRecruitRightBottomPendantView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       this.p = null;
       return;
    }
    public final void setCloseViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseRecruitRightBottomPendantView.class, "6")) {
          return;
       }
       this.i.setOnClickListener(p0);
       return;
    }
    public final void setInterpretationContainerVisibleStatus(boolean p0){
       if (PatchProxy.isSupport(LiveBaseRecruitRightBottomPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveBaseRecruitRightBottomPendantView.class, "7")) {
          return;
       }
       LiveBaseRecruitRightBottomPendantView tm = this.m;
       int i = (p0)? 0: 8;
       tm.setVisibility(i);
       return;
    }
    public final void setJobIconView(UserInfos$PicUrl[] p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseRecruitRightBottomPendantView.class, "8")) {
          return;
       }
       if (!j.h(p0)) {
          CDNUrl[] uCDNUrlArray = e0.i(p0);
          CDNUrl obj = PatchProxy.applyOneRefs(uCDNUrlArray, this, LiveBaseRecruitRightBottomPendantView.class, "9");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = j.e(this.p, CDNUrl.class);
             CDNUrl uCDNUrl = j.e(uCDNUrlArray, CDNUrl.class);
             b = (obj != null && (uCDNUrl != null && (TextUtils.n(obj.getUrl(), uCDNUrl.getUrl()) && TextUtils.n(obj.getCdn(), uCDNUrl.getCdn()))))? true: false;
          }
          if (b) {
             b.Z(LiveLogTag.LIVE_RECRUIT, "setJobIconView £¬but url is equals");
             return;
          }else {
             this.j.a0(uCDNUrlArray, new LiveBaseRecruitRightBottomPendantView$a(this, uCDNUrlArray));
          }
       }else {
          this.p = null;
          this.b();
       }
       return;
    }
    public void setPendantViewStatus(boolean p0){
       FrameLayout$LayoutParams layoutParams1;
       if (PatchProxy.isSupport(LiveBaseRecruitRightBottomPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveBaseRecruitRightBottomPendantView.class, "3")) {
          return;
       }
       LiveBaseRecruitRightBottomPendantView ti = this.i;
       int i = 8;
       int i1 = (p0)? 8: 0;
       ti.setVisibility(i1);
       ti = this.k;
       if (p0) {
          i = 0;
       }
       ti.setVisibility(i);
       ti = (p0)? this.e: this.c;
       LiveBaseRecruitRightBottomPendantView td = (p0)? this.d: this.b;
       ViewGroup$LayoutParams layoutParams = this.h.getLayoutParams();
       layoutParams.width = ti;
       layoutParams.height = td;
       float f = 0x3f800000;
       this.h.setScaleX(f);
       this.h.setScaleY(f);
       layoutParams = this.g.getLayoutParams();
       if (layoutParams == null) {
          layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
       }
       layoutParams1.width = ti;
       layoutParams1.height = td;
       this.g.setLayoutParams(layoutParams1);
       return;
    }
    public final void setRootViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseRecruitRightBottomPendantView.class, "5")) {
          return;
       }
       this.setOnClickListener(p0);
       return;
    }
}
