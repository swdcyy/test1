package com.yxcorp.gifshow.postentrance.bubblev2.widget.BubbleTitlesLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.lang.Float;
import java.lang.CharSequence;
import java.lang.Boolean;
import android.widget.TextView;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.postentrance.bubblev2.widget.BubbleTitlesLayout$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.constraintlayout.widget.a;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;

public final class BubbleTitlesLayout extends ConstraintLayout	// class@00103f
{
    public ConstraintLayout B;
    public KwaiSizeAdjustableTextView C;
    public KwaiSizeAdjustableTextView D;
    public KwaiImageView E;
    public Drawable F;
    public HashMap G;

    public void BubbleTitlesLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void BubbleTitlesLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void BubbleTitlesLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       a.c(p0, R.layout.arg_RES_7f0d05c4, this);
       View view = m1.f(this, R.id.title);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.title\)");
       this.D = view;
       view = m1.f(this, R.id.image_title);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.image_title\)");
       this.E = view;
       view = m1.f(this, R.id.sub_title);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.sub_title\)");
       this.C = view;
       view = m1.f(this, R.id.title_layout);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.title_layout\)");
       this.B = view;
    }
    public void BubbleTitlesLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void L(int p0,int p1){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BubbleTitlesLayout.class, "2")) {
          return;
       }
       this.E.getLayoutParams().width = p0;
       p0.height = p1;
       return;
    }
    public final void M(float p0,float p1){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BubbleTitlesLayout.class, "11")) {
          return;
       }
       this.N(this.C, p0, p1);
       return;
    }
    public final void N(KwaiSizeAdjustableTextView p0,float p1,float p2){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, BubbleTitlesLayout.class, "15")) {
          return;
       }
       p0.setTextSizeAdjustable(true);
       float f = (float)0;
       if (Float.compare(p1, f) > 0) {
          p0.setInitTextSize(p1);
       }
       if (Float.compare(p2, f) > 0) {
          p0.setMinTextSize(p2);
       }
       return;
    }
    public final void O(CharSequence p0,Boolean p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BubbleTitlesLayout.class, "6")) {
          return;
       }
       a.p(p0, "titleText");
       this.E.setVisibility(8);
       this.D.setVisibility(0);
       this.D.setText(p0);
       boolean b = true;
       if (p1 != null) {
          BubbleTitlesLayout tD = this.D;
          int i = (p1.booleanValue())? 1: 2;
          tD.setMaxLines(i);
       }
       this.D.setTextSizeAdjustable(b);
       this.D.getViewTreeObserver().addOnGlobalLayoutListener(new BubbleTitlesLayout$a(this));
       return;
    }
    public final void P(float p0,float p1){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BubbleTitlesLayout.class, "12")) {
          return;
       }
       this.N(this.D, p0, p1);
       return;
    }
    public final void setImageTitleMaxHeight(int p0){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BubbleTitlesLayout.class, "3")) {
          return;
       }
       this.E.setMaxHeight(p0);
       this.setImageTitleSize(p0);
       return;
    }
    public final void setImageTitleSize(int p0){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BubbleTitlesLayout.class, "4")) {
          return;
       }
       BubbleTitlesLayout tF = this.F;
       if (tF != null) {
          float f = (float)(tF.getIntrinsicWidth() * p0) / (float)tF.getIntrinsicHeight();
          int maxWidth = this.E.getMaxWidth();
          if (f - (float)this.E.getMaxWidth() > 0) {
             this.L(maxWidth, ((int)((float)(tF.getIntrinsicHeight() * maxWidth) / (float)tF.getIntrinsicWidth()) + 1));
          }else {
             this.L(((int)f + 1), p0);
          }
       }
       return;
    }
    public final void setSubTitle(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BubbleTitlesLayout.class, "7")) {
          return;
       }
       a.p(p0, "subTitleText");
       this.C.setText(p0);
       this.C.setVisibility(0);
       return;
    }
    public final void setSubTitleColor(int p0){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BubbleTitlesLayout.class, "9")) {
          return;
       }
       this.C.setTextColor(p0);
       return;
    }
    public final void setTitle(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BubbleTitlesLayout.class, "1")) {
          return;
       }
       a.p(p0, "titleDrawable");
       this.D.setVisibility(8);
       this.E.setVisibility(0);
       this.F = p0;
       this.E.setPlaceHolderImage(p0);
       this.setImageTitleSize(this.E.getMaxHeight());
       return;
    }
    public final void setTitleColor(int p0){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BubbleTitlesLayout.class, "8")) {
          return;
       }
       this.D.setTextColor(p0);
       return;
    }
    public final void setTitleMaxLines(int p0){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BubbleTitlesLayout.class, "5")) {
          return;
       }
       this.D.setMaxLines(p0);
       return;
    }
    public final void setTitleStyle(int p0){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BubbleTitlesLayout.class, "14")) {
          return;
       }
       a uoa = new a();
       uoa.i(this);
       uoa.g(R.id.title_layout, 1);
       uoa.g(R.id.title_layout, 2);
       uoa.g(R.id.sub_title, 1);
       uoa.g(R.id.sub_title, 2);
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                uoa.l(R.id.title_layout, 1, 0, 1);
                uoa.l(R.id.title_layout, 2, 0, 2);
                uoa.l(R.id.sub_title, 1, 0, 1);
                uoa.l(R.id.sub_title, 2, 0, 2);
             }
          }else {
             uoa.l(R.id.title_layout, 2, 0, 2);
             uoa.l(R.id.sub_title, 2, 0, 2);
          }
       }else {
          uoa.l(R.id.title_layout, 1, 0, 1);
          uoa.l(R.id.sub_title, 1, 0, 1);
       }
       uoa.b(this);
       return;
    }
    public final void setTitlesIntervalSpace(int p0){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BubbleTitlesLayout.class, "13")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.B.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.bottomMargin = p0;
       return;
    }
    public final void setTitlesMaxWidth(int p0){
       if (PatchProxy.isSupport(BubbleTitlesLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BubbleTitlesLayout.class, "10")) {
          return;
       }
       this.D.setMaxWidth(p0);
       this.E.setMaxWidth(p0);
       this.C.setMaxWidth(p0);
       return;
    }
}
