package com.yxcorp.gifshow.widget.banner.DotsIndicator;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.animation.ArgbEvaluator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Integer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.drawable.GradientDrawable;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$c;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$a;
import android.view.View$OnClickListener;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import yyc.c;
import com.yxcorp.gifshow.widget.banner.a;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Float;
import com.yxcorp.gifshow.widget.banner.b;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$b;

public class DotsIndicator extends LinearLayout	// class@001937
{
    public List b;
    public DotsIndicator$c c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public ArgbEvaluator n;
    public c o;

    public void DotsIndicator(Context p0){
       super(p0, null);
    }
    public void DotsIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DotsIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = new ArgbEvaluator();
       if (PatchProxy.applyVoidOneRefs(p1, this, DotsIndicator.class, "1")) {
       }else {
          this.b = new ArrayList();
          int i = 0;
          this.setOrientation(i);
          float f = (float)this.b(16);
          this.d = f;
          this.e = f;
          f = 4;
          this.g = (float)this.b(f);
          this.f = this.d / 2.00f;
          float f1 = 2.50f;
          this.h = f1;
          int i1 = -16711681;
          this.i = i1;
          this.l = true;
          if (p1 != null) {
             TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.p0);
             this.i = typedArray.getColor(i, i1);
             this.j = typedArray.getColor(7, i1);
             float floatx = typedArray.getFloat(5, f1);
             this.h = floatx;
             if (floatx - 0x3f800000 < 0) {
                this.h = f1;
             }
             this.d = typedArray.getDimension(f, this.d);
             f = typedArray.getDimension(2, this.e);
             this.e = f;
             this.f = (float)(int)typedArray.getDimension(true, (f / 2.00f));
             this.g = typedArray.getDimension(3, this.g);
             this.k = typedArray.getBoolean(6, i);
             typedArray.recycle();
          }
          if (this.isInEditMode()) {
             this.a(5);
          }
       }
       return;
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(DotsIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DotsIndicator.class, "5")) {
          return;
       }
       for (int i = 0; i < p0; i = i + 1) {
          View view = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0314, this, false);
          ImageView imageView = view.findViewById(R.id.dot);
          RelativeLayout$LayoutParams layoutParams = imageView.getLayoutParams();
          layoutParams.width = (int)this.d;
          layoutParams.height = (int)this.e;
          DotsIndicator tg = this.g;
          int i1 = (int)tg;
          layoutParams.setMargins(i1, false, (int)tg, false);
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setCornerRadius(this.f);
          if (this.isInEditMode()) {
             tg = (!i)? this.j: this.i;
             gradientDraw.setColor(tg);
          }else if(this.c.a() == i){
             tg = this.j;
          }else {
             tg = this.i;
          }
          gradientDraw.setColor(tg);
          imageView.setBackground(gradientDraw);
          view.setOnClickListener(new DotsIndicator$a(this, i));
          this.b.add(imageView);
          this.addView(view);
       }
       return;
    }
    public final int b(int p0){
       if (PatchProxy.isSupport(DotsIndicator.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, DotsIndicator.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)(c.c(this.getContext().getResources()).density * (float)p0);
    }
    public GradientDrawable c(ImageView p0){
       GradientDrawable obj = PatchProxy.applyOneRefs(p0, this, DotsIndicator.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getBackground();
       if (obj == null) {
          obj = new GradientDrawable();
          obj.setCornerRadius(this.f);
          p0.setBackground(obj);
       }
       return obj;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DotsIndicator.class, "3")) {
          return;
       }
       DotsIndicator tc = this.c;
       if (tc != null && tc.isValid()) {
          String str = null;
          if (!PatchProxy.applyVoid(objArray, this, DotsIndicator.class, "4")) {
             if (this.b.size() < this.c.b()) {
                this.a((this.c.b() - this.b.size()));
             }else if(this.b.size() > this.c.b()){
                int i = this.b.size() - this.c.b();
                if (!PatchProxy.isSupport(DotsIndicator.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, DotsIndicator.class, "6")) {
                   for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                      int i2 = this.getChildCount() - 1;
                      this.removeViewAt(i2);
                      DotsIndicator tb = this.b;
                      int i3 = tb.size() - 1;
                      tb.remove(i3);
                   }
                }
             }
          }
          this.e();
          if (!PatchProxy.applyVoid(objArray, this, DotsIndicator.class, "12") && this.b != null) {
             for (; str < this.c.a(); str = str + 1) {
                this.f(this.b.get(str), (int)this.d);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, DotsIndicator.class, "7")) {
             tc = this.c;
             if (tc != null && (tc.isValid() && this.c.b() > 0)) {
                a uoa = PatchProxy.apply(objArray, this, DotsIndicator.class, "8");
                if (uoa != PatchProxyResult.class) {
                }else {
                   uoa = new a(this);
                }
                this.o = uoa;
                this.c.d(uoa);
                this.o.b(this.c.a(), -1, 0);
             }
          }
       }else {
          tc = DotsIndicator.class;
       }
    label_00ff :
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, DotsIndicator.class, "10")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       for (int i = 0; i < this.b.size(); i = i + 1) {
          ImageView imageView = this.b.get(i);
          GradientDrawable gradientDraw = this.c(imageView);
          if (i == this.c.a() || (this.k != null && i < this.c.a())) {
             gradientDraw.setColor(this.j);
          }else {
             gradientDraw.setColor(this.i);
          }
          imageView.setBackground(gradientDraw);
          imageView.invalidate();
       }
       return;
    }
    public void f(ImageView p0,int p1){
       if (PatchProxy.isSupport(DotsIndicator.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DotsIndicator.class, "9")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = p1;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void setDotsClickable(boolean p0){
       this.l = p0;
    }
    public void setDotsSpacing(float p0){
       if (PatchProxy.isSupport(DotsIndicator.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DotsIndicator.class, "2")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public void setPointsColor(int p0){
       if (PatchProxy.isSupport(DotsIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DotsIndicator.class, "15")) {
          return;
       }
       this.i = p0;
       this.e();
       return;
    }
    public void setSelectedPointColor(int p0){
       if (PatchProxy.isSupport(DotsIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DotsIndicator.class, "16")) {
          return;
       }
       this.j = p0;
       this.e();
       return;
    }
    public void setViewPager(DotsIndicator$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DotsIndicator.class, "17")) {
          return;
       }
       this.c = p0;
       if (!PatchProxy.applyVoid(null, this, DotsIndicator.class, "13") && this.c.isValid()) {
          this.c.e(new b(this));
       }
       this.d();
       return;
    }
}
