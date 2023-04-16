package com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import android.widget.TextView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView$b;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.widget.KwaiRadiusStyles;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import bld.b;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Gradient;
import android.graphics.Color;
import android.view.View$OnClickListener;
import com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView$a;
import java.lang.CharSequence;
import bc.b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.facebook.drawee.generic.RoundingParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;

public abstract class LiveBasePreviewBottomCardTemplateView extends RelativeLayout	// class@000d9e
{
    public KwaiImageView b;
    public KwaiImageView c;
    public SimpleDraweeSpanTextView d;
    public SimpleDraweeSpanTextView e;
    public SimpleDraweeSpanTextView f;
    public View g;
    public TextView h;
    public KwaiImageView i;
    public static final int j;

    static {
       LiveBasePreviewBottomCardTemplateView.j = a1.d(0x7f07034b);
    }
    public void LiveBasePreviewBottomCardTemplateView(Context p0){
       super(p0, null);
    }
    public void LiveBasePreviewBottomCardTemplateView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveBasePreviewBottomCardTemplateView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveBasePreviewBottomCardTemplateView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0d37, this);
          this.setLayoutParams(new ViewGroup$LayoutParams(-1, this.getTemplateCardViewHeightPx()));
          this.b = m1.f(this, 0x7f0a2336);
          this.d = m1.f(this, 0x7f0a2340);
          this.e = m1.f(this, 0x7f0a2339);
          this.f = m1.f(this, 0x7f0a233e);
          this.c = m1.f(this, 0x7f0a2338);
          this.h = m1.f(this, 0x7f0a233a);
          this.i = m1.f(this, 0x7f0a233b);
          this.g = m1.f(this, 0x7f0a233c);
          this.setClickable(true);
       }
       return;
    }
    public final void a(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "15")) {
          return;
       }
       this.i.a0(p0, new LiveBasePreviewBottomCardTemplateView$b(this));
       return;
    }
    public final Drawable b(String[] p0,KwaiRadiusStyles p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveBasePreviewBottomCardTemplateView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.length == 3) {
          obj = new b();
          obj.g(p1);
          obj.j(0);
          obj.i(DrawableCreator$Gradient.Linear);
          obj.m(Color.parseColor(p0[0]), Color.parseColor(p0[1]), Color.parseColor(p0[2]));
          return obj.a();
       }else if(p0.length == 2){
          obj = new b();
          obj.g(p1);
          obj.j(0);
          obj.i(DrawableCreator$Gradient.Linear);
          obj.l(Color.parseColor(p0[0]), Color.parseColor(p0[1]));
          return obj.a();
       }else {
          obj = new b();
          obj.g(p1);
          obj.v(Color.parseColor(p0[0]));
          return obj.a();
       }
    }
    public final View$OnClickListener c(View$OnClickListener p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveBasePreviewBottomCardTemplateView$a(this, p0);
    }
    public final void d(SimpleDraweeSpanTextView p0,CharSequence p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBasePreviewBottomCardTemplateView.class, "16")) {
          return;
       }
       if (p1 instanceof b) {
          p0.setDraweeSpanStringBuilder(p1);
       }else {
          p0.setText(p1);
       }
       return;
    }
    public View getBreatheView(){
       return this.g;
    }
    public abstract int getLeftIconCircleSizePx();
    public abstract int getLeftIconSquareSizePx();
    public abstract int getTemplateCardViewHeightPx();
    public View getView(){
       return this;
    }
    public void setButtonClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "11")) {
          return;
       }
       if (p0 instanceof m) {
          this.h.setOnClickListener(p0);
       }else {
          this.h.setOnClickListener(this.c(p0));
       }
       return;
    }
    public void setButtonContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "7")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.h.setText(p0);
       }
       return;
    }
    public void setButtonImage(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "9")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void setContainerClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "10")) {
          return;
       }
       if (p0 instanceof m) {
          this.setOnClickListener(p0);
       }else {
          this.setOnClickListener(this.c(p0));
       }
       return;
    }
    public final void setContentIconShape(boolean p0){
       if (PatchProxy.isSupport(LiveBasePreviewBottomCardTemplateView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveBasePreviewBottomCardTemplateView.class, "14")) {
          return;
       }
       RoundingParams roundingPara = new RoundingParams();
       ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
       if (!p0) {
          roundingPara.q(true);
          layoutParams.height = this.getLeftIconCircleSizePx();
          layoutParams.width = this.getLeftIconCircleSizePx();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             p0.leftMargin = a1.e(16.00f);
          }
       }else {
          roundingPara.n((float)LiveBasePreviewBottomCardTemplateView.j);
          layoutParams.height = this.getLeftIconSquareSizePx();
          layoutParams.width = this.getLeftIconSquareSizePx();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             p0.leftMargin = a1.e(8.00f);
          }
       }
       this.c.getHierarchy().L(roundingPara);
       this.c.setLayoutParams(layoutParams);
       return;
    }
    public void setMainDescriptionContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "5")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          LiveBasePreviewBottomCardTemplateView te = this.e;
          if (te != null) {
             this.d(te, p0);
          }
       }
       return;
    }
    public void setTitleContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "4")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.d(this.d, p0);
       return;
    }
    public void settSubDescriptionContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView.class, "6")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          LiveBasePreviewBottomCardTemplateView tf = this.f;
          if (tf != null) {
             this.d(tf, p0);
          }
       }
       return;
    }
}
