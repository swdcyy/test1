package com.yxcorp.gifshow.widget.TipWithIconView;
import com.yxcorp.gifshow.widget.CustomLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatImageView;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.View;
import qrd.l1;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.core.content.ContextCompat;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import usd.q;

public final class TipWithIconView extends CustomLayout	// class@0018dc
{
    public final int e;
    public final String f;
    public final AppCompatImageView g;
    public final AppCompatTextView h;
    public HashMap i;

    public void TipWithIconView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void TipWithIconView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void TipWithIconView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       int i = 8;
       this.setPadding(this.f(12), this.f(i), this.f(12), this.f(i));
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setShape(0);
       gradientDraw.setColor(a1.a(R.color.arg_RES_7f061c10));
       gradientDraw.setCornerRadius((float)this.f(4));
       this.setBackground(gradientDraw);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.J5, p2, 0);
       a.o(typedArray, "context.obtainStyledAttr¡­conView, defStyleAttr, 0\)");
       p2 = typedArray.getResourceId(0, R.drawable.arg_RES_7f082096);
       this.e = p2;
       String str = typedArray.getString(1);
       if (str != null) {
       }else {
          str = "";
       }
       this.f = str;
       typedArray.recycle();
       AppCompatImageView uAppCompatIm = new AppCompatImageView(p0);
       uAppCompatIm.setLayoutParams(new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT()));
       uAppCompatIm.setImageResource(p2);
       this.b(uAppCompatIm);
       this.g = uAppCompatIm;
       AppCompatTextView uAppCompatTe = new AppCompatTextView(p0);
       CustomLayout$a uoa = new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT());
       uoa.leftMargin = this.f(i);
       uAppCompatTe.setLayoutParams(uoa);
       uAppCompatTe.getLineSpacingExtra();
       uAppCompatTe.setLineSpacing((float)this.f(4), 0x3f800000);
       uAppCompatTe.setIncludeFontPadding(0);
       uAppCompatTe.setText(str);
       uAppCompatTe.setTextSize(12.00f);
       uAppCompatTe.setTextColor(ContextCompat.getColor(p0, R.color.arg_RES_7f061f86));
       this.b(uAppCompatTe);
       this.h = uAppCompatTe;
       return;
    }
    public void TipWithIconView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final AppCompatImageView getIcon(){
       return this.g;
    }
    public final AppCompatTextView getTipText(){
       return this.h;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(TipWithIconView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, TipWithIconView.class, "2")) {
             return;
          }
       }
       TipWithIconView tg = this.g;
       CustomLayout.i(this, tg, this.getPaddingLeft(), this.j(tg), false, 4, null);
       tg = this.h;
       int right = this.g.getRight();
       ViewGroup$LayoutParams layoutParams = tg.getLayoutParams();
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = null;
       }
       if (layoutParams != null) {
          i = layoutParams.leftMargin;
       }
       CustomLayout.i(this, tg, (right + i), this.j(tg), false, 4, null);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(TipWithIconView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TipWithIconView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       Iterator iterator = ViewGroupKt.b(this).iterator();
       while (iterator.hasNext()) {
          this.c(iterator.next());
       }
       this.setMeasuredDimension((((this.h(this.g) + this.h(this.h)) + this.getPaddingLeft()) + this.getPaddingRight()), ((q.n(this.g(this.g), this.g(this.h)) + this.getPaddingTop()) + this.getPaddingBottom()));
       return;
    }
    public final void setIcon(int p0){
       if (PatchProxy.isSupport(TipWithIconView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TipWithIconView.class, "3")) {
          return;
       }
       this.g.setImageResource(p0);
       return;
    }
    public final void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TipWithIconView.class, "4")) {
          return;
       }
       a.p(p0, "text");
       this.h.setText(p0);
       return;
    }
}
