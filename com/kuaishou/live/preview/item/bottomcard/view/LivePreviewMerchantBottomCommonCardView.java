package com.kuaishou.live.preview.item.bottomcard.view.LivePreviewMerchantBottomCommonCardView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.preview.item.bottomcard.view.LivePreviewMerchantBottomCommonCardView$a;
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
import com.kuaishou.live.preview.item.bottomcard.view.LivePreviewMerchantBottomCommonCardView$b;
import java.lang.CharSequence;
import bc.b;
import android.widget.TextView;
import java.lang.Number;
import lnc.a1;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.facebook.drawee.generic.RoundingParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;

public final class LivePreviewMerchantBottomCommonCardView extends RelativeLayout	// class@000da4
{
    public SimpleDraweeSpanTextView b;
    public KwaiImageView c;
    public KwaiImageView d;
    public SimpleDraweeSpanTextView e;
    public SimpleDraweeSpanTextView f;
    public View g;
    public KwaiImageView h;

    public void LivePreviewMerchantBottomCommonCardView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LivePreviewMerchantBottomCommonCardView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LivePreviewMerchantBottomCommonCardView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LivePreviewMerchantBottomCommonCardView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c99, this);
          this.setLayoutParams(new ViewGroup$LayoutParams(-1, this.getTemplateCardViewHeightPx()));
          View view = m1.f(this, R.id.live_preview_bottom_card_template_background_view);
          a.o(view, "ViewBindUtils.bindWidget¡­template_background_view\)");
          this.c = view;
          view = m1.f(this, R.id.live_preview_bottom_card_template_title_view);
          a.o(view, "ViewBindUtils.bindWidget¡­card_template_title_view\)");
          this.e = view;
          view = m1.f(this, R.id.live_preview_bottom_card_template_main_description_view);
          a.o(view, "ViewBindUtils.bindWidget¡­te_main_description_view\)");
          this.f = view;
          view = m1.f(this, R.id.live_preview_bottom_card_template_icon_view);
          a.o(view, "ViewBindUtils.bindWidget¡­_card_template_icon_view\)");
          this.d = view;
          view = m1.f(this, R.id.live_preview_bottom_card_template_right_button);
          a.o(view, "ViewBindUtils.bindWidget¡­rd_template_right_button\)");
          this.b = view;
          this.h = m1.f(this, 0x7f0a233b);
          view = m1.f(this, R.id.live_preview_bottom_card_template_right_button_container);
          a.o(view, "ViewBindUtils.bindWidget¡­e_right_button_container\)");
          this.g = view;
          this.setClickable(true);
       }
       return;
    }
    public void LivePreviewMerchantBottomCommonCardView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView.class, "18")) {
          return;
       }
       LivePreviewMerchantBottomCommonCardView th = this.h;
       a.m(th);
       th.a0(p0, new LivePreviewMerchantBottomCommonCardView$a(this));
       return;
    }
    public final Drawable b(String[] p0,KwaiRadiusStyles p1){
       Drawable uDrawable;
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, LivePreviewMerchantBottomCommonCardView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.length == 3) {
          obj = new b();
          obj.g(p1);
          obj.j(0);
          obj.i(DrawableCreator$Gradient.Linear);
          obj.m(Color.parseColor(p0[0]), Color.parseColor(p0[1]), Color.parseColor(p0[2]));
          uDrawable = obj.a();
          a.o(uDrawable, "DrawableCreator.Builder\(¡­t[2]\)\)\n          .build\(\)");
       }else if(p0.length == 2){
          obj = new b();
          obj.g(p1);
          obj.j(0);
          obj.i(DrawableCreator$Gradient.Linear);
          obj.l(Color.parseColor(p0[0]), Color.parseColor(p0[1]));
          uDrawable = obj.a();
       }else {
          obj = new b();
          obj.g(p1);
          obj.v(Color.parseColor(p0[0]));
          uDrawable = obj.a();
       }
       a.o(uDrawable, "if \(colorStringList.size¡­\n          .build\(\)\n    }");
       return uDrawable;
    }
    public final View$OnClickListener c(View$OnClickListener p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LivePreviewMerchantBottomCommonCardView$b(p0);
    }
    public final void d(SimpleDraweeSpanTextView p0,CharSequence p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePreviewMerchantBottomCommonCardView.class, "19")) {
          return;
       }
       if (p1 instanceof b) {
          p0.setDraweeSpanStringBuilder(p1);
       }else {
          p0.setText(p1);
       }
       return;
    }
    public final View getBreatheView(){
       LivePreviewMerchantBottomCommonCardView obj = PatchProxy.apply(null, this, LivePreviewMerchantBottomCommonCardView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a.S("mButtonContainer");
       }
       return obj;
    }
    public final int getLeftIconCircleSizePx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewMerchantBottomCommonCardView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(70.00f);
    }
    public final int getLeftIconSquareSizePx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewMerchantBottomCommonCardView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(70.00f);
    }
    public final int getTemplateCardViewHeightPx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewMerchantBottomCommonCardView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(94.00f);
    }
    public final View getView(){
       return this;
    }
    public final void setButtonClickListener(View$OnClickListener p0){
       LivePreviewMerchantBottomCommonCardView tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView.class, "13")) {
          return;
       }
       a.p(p0, "listener");
       if (p0 instanceof m) {
          tb = this.b;
          if (tb == null) {
             a.S("mButtonView");
          }
          tb.setOnClickListener(p0);
       }else {
          tb = this.b;
          if (tb == null) {
             a.S("mButtonView");
          }
          tb.setOnClickListener(this.c(p0));
       }
       return;
    }
    public final void setButtonContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView.class, "9")) {
          return;
       }
       a.p(p0, "content");
       if (!TextUtils.x(p0)) {
          LivePreviewMerchantBottomCommonCardView tb = this.b;
          if (tb == null) {
             a.S("mButtonView");
          }
          tb.setText(p0);
       }
       return;
    }
    public final void setButtonImage(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView.class, "11")) {
          return;
       }
       a.p(p0, "buttonImageUrls");
       this.a(p0);
       return;
    }
    public final void setContainerClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView.class, "12")) {
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
       if (PatchProxy.isSupport(LivePreviewMerchantBottomCommonCardView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePreviewMerchantBottomCommonCardView.class, "17")) {
          return;
       }
       RoundingParams roundingPara = new RoundingParams();
       LivePreviewMerchantBottomCommonCardView td = this.d;
       if (td == null) {
          a.S("mIconView");
       }
       ViewGroup$LayoutParams layoutParams = td.getLayoutParams();
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
       }
       LivePreviewMerchantBottomCommonCardView td1 = this.d;
       if (td1 == null) {
          a.S("mIconView");
       }
       a hierarchy = td1.getHierarchy();
       a.o(hierarchy, "mIconView.hierarchy");
       hierarchy.L(roundingPara);
       td1 = this.d;
       if (td1 == null) {
          a.S("mIconView");
       }
       td1.setLayoutParams(layoutParams);
       return;
    }
    public final void setMainDescriptionContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView.class, "8")) {
          return;
       }
       a.p(p0, "content");
       if (!TextUtils.x(p0)) {
          LivePreviewMerchantBottomCommonCardView tf = this.f;
          if (tf == null) {
             a.S("mMainDescriptionView");
          }
          if (tf != null) {
             tf = this.f;
             if (tf == null) {
                a.S("mMainDescriptionView");
             }
             this.d(tf, p0);
          }
       }
       return;
    }
    public final void setTitleContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView.class, "7")) {
          return;
       }
       a.p(p0, "content");
       if (TextUtils.x(p0)) {
          return;
       }
       LivePreviewMerchantBottomCommonCardView te = this.e;
       if (te == null) {
          a.S("mTitleView");
       }
       this.d(te, p0);
       return;
    }
}
