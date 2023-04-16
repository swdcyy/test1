package com.kuaishou.merchant.home.basic.widget.ImageTextView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.view.View;
import com.kuaishou.merchant.home.basic.widget.MerchantHomeKwaiImageView;
import yb.b;
import android.content.res.Resources;
import yb.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import android.widget.ImageView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import xm4.a;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Math;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import java.util.List;
import s0d.f;
import java.util.Collection;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class ImageTextView extends ViewGroup	// class@0016d4
{
    public TextView b;
    public TextView c;
    public MerchantHomeKwaiImageView d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    public void ImageTextView(Context p0){
       super(p0, null);
    }
    public void ImageTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageTextView.class, "1")) {
       }else {
          int i = 0;
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.r1, i, i);
          this.h = typedArray.getBoolean(i, i);
          typedArray.recycle();
          TextView textView = PatchProxy.apply(null, this, ImageTextView.class, "2");
          if (textView != PatchProxyResult.class) {
          }else {
             textView = new TextView(this.getContext());
             textView.setId(R.id.text);
             textView.setSingleLine();
             textView.setGravity(1);
             textView.setEllipsize(TextUtils$TruncateAt.END);
          }
          this.c = textView;
          this.addView(textView);
          MerchantHomeKwaiImageView merchantHome = PatchProxy.apply(null, this, ImageTextView.class, "3");
          if (merchantHome != PatchProxyResult.class) {
          }else {
             merchantHome = new MerchantHomeKwaiImageView(this.getContext());
             b uob = new b(this.getResources());
             uob.m(i);
             merchantHome.setHierarchy(uob.a());
             merchantHome.setId(R.id.icon);
             merchantHome.setEnableReloadSameUrl(i);
          }
          this.d = merchantHome;
          this.addView(merchantHome);
          textView = PatchProxy.apply(null, this, ImageTextView.class, "4");
          if (textView == PatchProxyResult.class) {
             textView = a.e(this, R.layout.arg_RES_7f0d0f0f);
          }
          this.b = textView;
          this.addView(textView);
          this.f = n.c(p0, 18.00f);
          this.e = n.c(p0, 2.00f);
       }
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, ImageTextView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewGroup$MarginLayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       ViewGroup$MarginLayoutParams marginLayout = PatchProxy.applyOneRefs(p0, this, ImageTextView.class, "10");
       if (marginLayout != PatchProxyResult.class) {
       }else {
          marginLayout = new ViewGroup$MarginLayoutParams(this.getContext(), p0);
       }
       return marginLayout;
    }
    public TextView getTipView(){
       return this.b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ImageTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ImageTextView.class, "20")) {
             return;
          }
       }
       p3 = p3 - p1;
       int measuredHeig = this.d.getMeasuredHeight();
       p1 = this.d.getMeasuredWidth();
       p2 = this.c.getMeasuredHeight();
       ImageTextView tg = this.g;
       int i = (p3 - p1) / 2;
       p4 = ((p4 - p2) - ((measuredHeig + p2) + tg)) / 2;
       this.d.layout(i, p4, (p1 + i), (p4 + measuredHeig));
       p4 = p4 + (measuredHeig + tg);
       this.c.layout(0, p4, p3, (p2 + p4));
       if (!this.b.getVisibility()) {
          measuredHeig = this.d.getLeft() + this.f;
          p1 = (this.d.getTop() - (this.b.getMeasuredHeight() / 2)) + this.e;
          p2 = this.b.getMeasuredHeight();
          p3 = this.b.getMeasuredWidth();
          if (p3 < p2) {
             p3 = p2;
          }
          this.b.layout(measuredHeig, p1, (p3 + measuredHeig), (p2 + p1));
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ImageTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ImageTextView.class, "19")) {
          return;
       }
       int i = p1;
       this.measureChildWithMargins(this.d, p0, 0, i, 0);
       int i1 = p0;
       this.measureChildWithMargins(this.c, i1, 0, i, (this.d.getMeasuredHeight() + this.g));
       this.measureChildWithMargins(this.b, i1, 0, i, 0);
       int i2 = ViewGroup.combineMeasuredStates(ViewGroup.combineMeasuredStates(ViewGroup.combineMeasuredStates(0, this.d.getMeasuredState()), this.c.getMeasuredState()), this.b.getMeasuredState());
       this.setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(this.d.getMeasuredWidth(), this.c.getMeasuredWidth()), p0, i2), ViewGroup.resolveSizeAndState(((this.d.getMeasuredHeight() + this.g) + this.c.getMeasuredHeight()), p1, i2));
       return;
    }
    public void setAnimateEnabled(boolean p0){
       if (PatchProxy.isSupport(ImageTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ImageTextView.class, "9")) {
          return;
       }
       this.d.setAnimateEnabled(p0);
       return;
    }
    public void setImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageTextView.class, "14")) {
          return;
       }
       this.d.setImageDrawable(p0);
       return;
    }
    public void setImageFailure(int p0){
       if (PatchProxy.isSupport(ImageTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ImageTextView.class, "17")) {
          return;
       }
       this.d.setFailureImage(p0);
       return;
    }
    public void setImagePlaceholder(int p0){
       if (PatchProxy.isSupport(ImageTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ImageTextView.class, "15")) {
          return;
       }
       this.d.setPlaceHolderImage(p0);
       return;
    }
    public void setImagePlaceholder(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageTextView.class, "16")) {
          return;
       }
       this.d.setPlaceHolderImage(p0);
       return;
    }
    public void setImageTextPadding(int p0){
       this.g = p0;
    }
    public void setImageTipStartPadding(int p0){
       this.f = p0;
    }
    public void setImageTipTopPadding(int p0){
       this.e = p0;
    }
    public void setImageUrls(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageTextView.class, "18")) {
          return;
       }
       ImageTextView tag = this.d.getTag(R.id.shop_icon_tag);
       if (tag != null && tag.equals(p0)) {
          return;
       }
       if (p0 != null) {
          tag = this.d;
          if (!PatchProxy.applyVoidTwoRefs(tag, p0, this, ImageTextView.class, "21")) {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.q(true);
             uod.u(f.x().q(p0).w());
             tag.setController(uod.e());
          }
          this.d.setTag(R.id.shop_icon_tag, p0);
       }
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageTextView.class, "12")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(ImageTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ImageTextView.class, "8")) {
          return;
       }
       this.c.setTextColor(p0);
       return;
    }
    public void setTextSize(int p0){
       if (PatchProxy.isSupport(ImageTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ImageTextView.class, "6")) {
          return;
       }
       this.c.setTextSize(1, (float)p0);
       return;
    }
    public void setTipText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageTextView.class, "13")) {
          return;
       }
       this.b.setText(p0);
       if (TextUtils.x(p0)) {
          this.b.setVisibility(8);
       }else {
          this.b.setVisibility(0);
       }
       return;
    }
}
