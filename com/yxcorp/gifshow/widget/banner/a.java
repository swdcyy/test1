package com.yxcorp.gifshow.widget.banner.a;
import yyc.c;
import com.yxcorp.gifshow.widget.banner.DotsIndicator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Integer;
import java.lang.Float;
import android.widget.ImageView;
import android.graphics.drawable.GradientDrawable;
import android.animation.ArgbEvaluator;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$c;
import android.widget.LinearLayout;

public class a extends c	// class@001955
{
    public final DotsIndicator e;

    public void a(DotsIndicator p0){
       this.e = p0;
       super();
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.b.size();
    }
    public void b(int p0,int p1,float p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, a.class, "1")) {
          return;
       }
       int i = -1;
       if (p0 != i && p0 < this.e.b.size()) {
          this.c(this.e.m);
          a te = this.e;
          te.m = p0;
          ImageView imageView = te.b.get(p0);
          a te1 = this.e;
          DotsIndicator d = te1.d;
          te1.f(imageView, (int)(d + (((te1.h - 0x3f800000) * d) * (0x3f800000 - p2))));
          if (p1 != i && p1 < this.e.b.size()) {
             ImageView imageView1 = this.e.b.get(p1);
             if (imageView1 != null) {
                a te2 = this.e;
                DotsIndicator d1 = te2.d;
                te2.f(imageView1, (int)(d1 + (((te2.h - 0x3f800000) * d1) * p2)));
                GradientDrawable gradientDraw = this.e.c(imageView);
                GradientDrawable gradientDraw1 = this.e.c(imageView1);
                te = this.e;
                d1 = te.j;
                if (d1 != te.i) {
                   int i1 = te.n.evaluate(p2, Integer.valueOf(d1), Integer.valueOf(this.e.i)).intValue();
                   te1 = this.e;
                   gradientDraw1.setColor(te1.n.evaluate(p2, Integer.valueOf(te1.i), Integer.valueOf(this.e.j)).intValue());
                   a te3 = this.e;
                   if (te3.k != null && p0 <= te3.c.a()) {
                      gradientDraw.setColor(this.e.j);
                   }else {
                      gradientDraw.setColor(i1);
                   }
                }
             }
             this.e.invalidate();
          }
       }
       return;
    }
    public void c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (p0 >= 0 && p0 < this.e.b.size()) {
          uoa = this.e;
          uoa.f(uoa.b.get(p0), (int)this.e.d);
       }
       return;
    }
}
