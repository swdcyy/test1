package com.yxcorp.gifshow.hypertag.KwaiHyperTagView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import android.text.TextPaint;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qra.c;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ub.b;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.view.View$MeasureSpec;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.hypertag.KwaiHyperTagView$a;
import java.lang.Boolean;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;

public class KwaiHyperTagView extends LinearLayout	// class@001915
{
    public final KwaiImageView b;
    public final KwaiImageView c;
    public final KwaiImageView d;
    public final KwaiImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final View j;
    public final ImageView k;
    public final View l;
    public final View m;
    public a n;
    public boolean o;
    public int p;
    public int q;

    public void KwaiHyperTagView(Context p0){
       super(p0, null);
    }
    public void KwaiHyperTagView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiHyperTagView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.q = 0x7f061d77;
       this.setOrientation(0);
       a.d(p0, R.layout.arg_RES_7f0d0734, this, true);
       this.setPadding(a1.d(R.dimen.arg_RES_7f070329), 0, a1.d(R.dimen.arg_RES_7f070329), 0);
       this.b = this.findViewById(0x7f0a3457);
       this.c = this.findViewById(0x7f0a3458);
       this.d = this.findViewById(0x7f0a3459);
       this.e = this.findViewById(0x7f0a345e);
       TextView textView = this.findViewById(R.id.reco_reason_can_cut_text);
       this.f = textView;
       TextView textView1 = this.findViewById(R.id.reco_reason_can_not_cut_text);
       this.g = textView1;
       TextView textView2 = this.findViewById(R.id.reco_reason_more);
       this.h = textView2;
       this.j = this.findViewById(0x7f0a3460);
       this.k = this.findViewById(0x7f0a3456);
       this.i = this.findViewById(0x7f0a345d);
       this.l = this.findViewById(0x7f0a2d5f);
       this.m = this.findViewById(0x7f0a345a);
       textView.getPaint().setFakeBoldText(true);
       textView1.getPaint().setFakeBoldText(true);
       textView2.getPaint().setFakeBoldText(true);
    }
    public final CharSequence a(String p0,TextView p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KwaiHyperTagView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a(p0, p1.getTextSize());
    }
    public void b(ImageRequest[] p0,int p1,int p2,int p3){
       object oobject1;
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KwaiHyperTagView.class, "12")) {
          return;
       }
       boolean b = false;
       this.o = b;
       KwaiImageView[] kwaiImageVie = new KwaiImageView[]{this.b,this.c,this.d};
       int len = (p0 != null)? p0.length: 0;
       int i = 0;
       object oobject = 8;
       while (i < 3) {
          if (i < len) {
             this.o = true;
             kwaiImageVie[i].setVisibility(b);
             if (p1 > 0) {
                ViewGroup$LayoutParams layoutParams = kwaiImageVie[i].getLayoutParams();
                if (layoutParams.width != p1 || layoutParams.height != p1) {
                   layoutParams.width = p1;
                   layoutParams.height = p1;
                   oobject1 = 1;
                }else {
                   oobject1 = null;
                }
                if (i > 0 && (p2 > 0 && layoutParams instanceof ViewGroup$MarginLayoutParams)) {
                   ViewGroup$LayoutParams layoutParams1 = layoutParams;
                   int i1 = layoutParams.width - p2;
                   if (layoutParams1.leftMargin != i1) {
                      layoutParams1.leftMargin = i1;
                      oobject1 = 1;
                   }
                }
                if (oobject1) {
                   kwaiImageVie[i].setLayoutParams(layoutParams);
                }
             }
             if (p3 > 0) {
                kwaiImageVie[i].setPadding(p3, p3, p3, p3);
             }
             ImageRequest[] imageRequest = new ImageRequest[1];
             imageRequest[b] = p0[i];
             b uob = null;
             d uod = kwaiImageVie[i].g0(uob, uob, imageRequest);
             oobject1 = kwaiImageVie[i];
             if (uod != null) {
                uob = uod.e();
             }
             oobject1.setController(uob);
          }else {
             kwaiImageVie[i].setVisibility(oobject);
          }
          i++;
       }
       KwaiHyperTagView tm = this.m;
       if (this.o == null) {
          b = 8;
       }
       tm.setVisibility(b);
       return;
    }
    public void c(String p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiHyperTagView.class, "3")) {
          return;
       }
       this.e.setVisibility(0);
       if (p1 > 0 && p2 > 0) {
          this.e.getHierarchy().u(t$b.a);
          int i = a1.d(R.dimen.arg_RES_7f070283);
          this.e.getLayoutParams().width = (p1 * i) / p2;
          p1.height = i;
          this.e.requestLayout();
       }else {
          this.e.getHierarchy().u(t$b.e);
       }
       this.e.L(p0);
       return;
    }
    public void d(String p0,String p1,int p2){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiHyperTagView.class, "13")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          KwaiHyperTagView tf = this.f;
          if (TextUtils.x(p1)) {
             p1 = null;
          }
          this.g(tf, p1, this.q);
          if (p2 > 0) {
             float f = (float)p2;
             if (f - this.f.getTextSize()) {
                this.f.setTextSize(0, f);
             }
          }
          KwaiHyperTagView tf1 = this.f;
          tf1.setText(this.a(p0, tf1));
          this.f.setVisibility(0);
       }else {
          this.f.setText("");
          this.f.setVisibility(8);
       }
       return;
    }
    public void e(String p0,String p1,int p2){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiHyperTagView.class, "15")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          KwaiHyperTagView th = this.h;
          if (TextUtils.x(p1)) {
             p1 = null;
          }
          this.g(th, p1, this.q);
          if (p2 > 0) {
             float f = (float)p2;
             if (f - this.h.getTextSize()) {
                this.h.setTextSize(0, f);
             }
          }
          KwaiHyperTagView th1 = this.h;
          th1.setText(this.a(p0, th1));
          this.h.setVisibility(0);
       }else {
          this.h.setText("");
          this.h.setVisibility(8);
       }
       return;
    }
    public void f(String p0,String p1,int p2){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiHyperTagView.class, "14")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          KwaiHyperTagView tg = this.g;
          if (TextUtils.x(p1)) {
             p1 = null;
          }
          this.g(tg, p1, this.q);
          if (p2 > 0) {
             float f = (float)p2;
             if (f - this.g.getTextSize()) {
                this.g.setTextSize(0, f);
             }
          }
          KwaiHyperTagView tg1 = this.g;
          tg1.setText(this.a(p0, tg1));
          this.g.setVisibility(0);
       }else {
          this.g.setText("");
          this.g.setVisibility(8);
       }
       return;
    }
    public final void g(TextView p0,String p1,int p2){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiHyperTagView.class, "17")) {
          return;
       }
       int i = (!TextUtils.x(p1))? Color.parseColor(p1): a1.a(p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiHyperTagView.class, "20")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p0);
       KwaiHyperTagView tp = this.p;
       if (tp > null && tp < size) {
          p0 = View$MeasureSpec.makeMeasureSpec(this.p, View$MeasureSpec.getMode(p0));
       }
       super.onMeasure(p0, p1);
       p0 = 0;
       p1 = 0;
       while (p0 < this.getChildCount()) {
          View childAt = this.getChildAt(p0);
          if (childAt != null && childAt.getVisibility() != 8) {
             LinearLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             size = childAt.getMeasuredWidth() + layoutParams.leftMargin;
             size = size + layoutParams.rightMargin;
             p1 = p1 + size;
          }
          p0++;
       }
       this.setMeasuredDimension((p1 + (this.getPaddingLeft() + this.getPaddingRight())), this.getMeasuredHeight());
       return;
    }
    public void setAvatars(ImageRequest[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiHyperTagView.class, "11")) {
          return;
       }
       this.b(p0, 0, 0, 0);
       return;
    }
    public void setDefTextColorRes(int p0){
       this.q = p0;
    }
    public void setDividerColor(int p0){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiHyperTagView.class, "5")) {
          return;
       }
       this.i.setBackgroundColor(p0);
       return;
    }
    public void setMaxWidth(int p0){
       this.p = p0;
    }
    public void setMoreArrowDrawableRes(int p0){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiHyperTagView.class, "7")) {
          return;
       }
       this.k.setImageDrawable(a1.f(p0));
       return;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiHyperTagView.class, "19")) {
          return;
       }
       super.setOnClickListener(new KwaiHyperTagView$a(this, p0));
       return;
    }
    public void setReasonMoreMargin(boolean p0){
       a uoa;
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiHyperTagView.class, "18")) {
          return;
       }
       int i = 1;
       int i1 = 6;
       if (p0) {
          uoa = new a();
          uoa.i(this.j);
          uoa.Q(R.id.reco_reason_more, i1, 0);
          uoa.Q(R.id.reco_reason_more, i, 0);
          uoa.b(this.j);
       }else {
          uoa = new a();
          uoa.i(this.j);
          uoa.Q(R.id.reco_reason_more, i1, a1.e(4.00f));
          uoa.Q(R.id.reco_reason_more, i, a1.e(4.00f));
          uoa.b(this.j);
       }
       return;
    }
    public void setShowDivider(boolean p0){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiHyperTagView.class, "10")) {
          return;
       }
       KwaiHyperTagView ti = this.i;
       int i = (p0)? 0: 8;
       ti.setVisibility(i);
       return;
    }
    public void setShowMoreArrow(boolean p0){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiHyperTagView.class, "9")) {
          return;
       }
       KwaiHyperTagView tk = this.k;
       int i = (p0)? 0: 8;
       tk.setVisibility(i);
       return;
    }
    public void setShowMoreContainer(boolean p0){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiHyperTagView.class, "8")) {
          return;
       }
       KwaiHyperTagView tj = this.j;
       int i = (p0)? 0: 8;
       tj.setVisibility(i);
       return;
    }
    public void setTextSize(int p0){
       if (PatchProxy.isSupport(KwaiHyperTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiHyperTagView.class, "6")) {
          return;
       }
       float f = (float)p0;
       this.f.setTextSize(0, f);
       this.g.setTextSize(0, f);
       this.h.setTextSize(0, f);
       return;
    }
}
