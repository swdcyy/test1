package com.yxcorp.gifshow.v3.editor.decoration.guideline.GuideLineView;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.decoration.guideline.GuideLineView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.graphics.Paint;
import qrd.l1;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.decoration.guideline.GuideLineView$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.graphics.Canvas;
import java.lang.Float;
import faa.a;
import q87.c;

public final class GuideLineView extends View	// class@000f12
{
    public final int b;
    public final Paint c;
    public final RectF d;
    public final RectF e;
    public int[] f;
    public boolean g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public HashMap s;
    public static final GuideLineView$a t;

    static {
       GuideLineView.t = new GuideLineView$a(null);
    }
    public void GuideLineView(Context p0){
       a.p(p0, "context");
       super(p0);
       int i = a1.e(0x3fc00000);
       this.b = i;
       Paint paint = new Paint(1);
       paint.setColor(a1.a(R.color.arg_RES_7f06031c));
       paint.setStrokeWidth((float)i);
       this.c = paint;
       this.d = new RectF(0, 0, 0, 0);
       this.e = new RectF(0, 0, 0, 0);
       int[] ointArray = new int[4];
       this.f = ointArray;
       this.j = 0x3f800000;
       this.k = 0x3f800000;
       this.l = 0x3f800000;
    }
    public void GuideLineView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       int i = a1.e(0x3fc00000);
       this.b = i;
       Paint paint = new Paint(1);
       paint.setColor(a1.a(R.color.arg_RES_7f06031c));
       paint.setStrokeWidth((float)i);
       this.c = paint;
       this.d = new RectF(0, 0, 0, 0);
       this.e = new RectF(0, 0, 0, 0);
       int[] ointArray = new int[4];
       this.f = ointArray;
       this.j = 0x3f800000;
       this.k = 0x3f800000;
       this.l = 0x3f800000;
    }
    public void GuideLineView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       int i = a1.e(0x3fc00000);
       this.b = i;
       Paint paint = new Paint(1);
       paint.setColor(a1.a(R.color.arg_RES_7f06031c));
       paint.setStrokeWidth((float)i);
       this.c = paint;
       this.d = new RectF(0, 0, 0, 0);
       this.e = new RectF(0, 0, 0, 0);
       int[] ointArray = new int[4];
       this.f = ointArray;
       this.j = 0x3f800000;
       this.k = 0x3f800000;
       this.l = 0x3f800000;
    }
    public final boolean a(int p0){
       boolean b;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                b = (p0 != 4)? false: this.r;
             }else {
                b = this.q;
             }
          }else {
             b = this.p;
          }
       }else {
          b = this.o;
       }
       return b;
    }
    public final void b(boolean p0,int p1){
       if (PatchProxy.isSupport(GuideLineView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, GuideLineView.class, "6")) {
          return;
       }
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 == 4) {
                   this.r = p0;
                }
             }else {
                this.q = p0;
             }
          }else {
             this.p = p0;
          }
       }else {
          this.o = p0;
       }
       this.invalidate();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, GuideLineView.class, "7")) {
          return;
       }
       ViewParent parent = this.getParent();
       if (!parent instanceof View) {
          return;
       }
       this.l = parent.getScaleX();
       int width = parent.getWidth();
       int height = parent.getHeight();
       if (!width || !height) {
          this.getViewTreeObserver().addOnGlobalLayoutListener(new GuideLineView$b(this));
       }
       this.d.set(0, 0, (float)width, (float)height);
       Log.g("GuideLineView", "updateGuideLineRect, "+this.d);
       this.invalidate();
       return;
    }
    public final int[] getAirWallLimitsAsToPreview(){
       return this.f;
    }
    public final RectF getEditRootViewRect(){
       return this.d;
    }
    public final RectF getPreviewAreaRect(){
       return this.e;
    }
    public void onDraw(Canvas p0){
       GuideLineView th1;
       int i1;
       float f5;
       if (PatchProxy.applyVoidOneRefs(p0, this, GuideLineView.class, "8")) {
          return;
       }
       a.p(p0, "canvas");
       int i = 0;
       float f = (float)i;
       if (this.d.width() - f > 0 && this.d.height() - f > 0) {
          float f1 = this.d.width();
          float f2 = this.d.height();
          GuideLineView th = this.h;
          if (th > null) {
             f = (this.e.centerX() * this.j) + (float)this.h;
          }else if(th < null){
             f = (this.e.centerX() + ((float)this.h * this.j)) * this.k;
          }else {
             f = this.e.centerX();
          }
          float f3 = f;
          th = this.i;
          if (th > null) {
             f = (this.e.centerY() * this.k) + (float)this.i;
          }else if(th < null){
             GuideLineView tk = this.k;
             f = (this.e.centerY() + ((float)this.i * tk)) * tk;
          }else {
             f = this.e.centerY();
          }
          float f4 = f;
          if (this.n != null) {
             p0.drawLine(f3, 0, f3, f2, this.c);
          }
          if (this.m != null) {
             p0.drawLine(0, f4, f1, f4, this.c);
          }
          if (!PatchProxy.isSupport(GuideLineView.class) || (PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(f1), Float.valueOf(f2), this, GuideLineView.class, "9") || (this.g != null && this.f.length == 4))) {
             if (this.o != null) {
                f = (this.e.centerX() - (this.e.width() / 2.00f)) + (float)this.f[i];
                th1 = this.h;
                if (th1 > null) {
                   f = (f * this.j) + (float)th1;
                }else if(th1 < null){
                   th1 = this.j;
                   f = (f + ((float)th1 * th1)) * th1;
                }else if(this.i != null){
                   f = this.e.centerX() - (((this.e.width() / 2.00f) - (float)this.f[i]) * this.j);
                }
                f3 = f;
                p0.drawLine(f3, 0, f3, f2, this.c);
             }
             if (this.q != null) {
                i1 = 2;
                f5 = (this.e.centerX() + (this.e.width() / 2.00f)) - (float)this.f[i1];
                th = this.h;
                if (th > null) {
                   f5 = f5 * this.j;
                   f = (float)th;
                label_0177 :
                   f5 = f5 + f;
                }else if(th < null){
                   th1 = this.j;
                   f5 = (f5 + ((float)th * th1)) * th1;
                }else if(this.i != null){
                   f5 = this.e.centerX();
                   f = ((this.e.width() / 2.00f) - (float)this.f[i1]) * this.j;
                   goto label_0177 ;
                }
                f3 = f5;
                p0.drawLine(f3, 0, f3, f2, this.c);
             }
             if (this.p != null) {
                i1 = 1;
                f5 = (this.e.centerY() - (this.e.height() / 2.00f)) + (float)this.f[i1];
                th = this.i;
                if (th > null) {
                   f5 = (f5 * this.k) + (float)th;
                }else if(th < null){
                   th1 = this.k;
                   f5 = (f5 + ((float)th * th1)) * th1;
                }else if(this.h != null){
                   f5 = this.e.centerY() - (((this.e.height() / 2.00f) - (float)this.f[i1]) * this.k);
                }
                f3 = f5;
                p0.drawLine(0, f3, f1, f3, this.c);
             }
             if (this.r != null) {
                i1 = 3;
                f5 = (this.e.centerY() + (this.e.height() / 2.00f)) - (float)this.f[i1];
                th = this.i;
                if (th > null) {
                   f5 = f5 * this.k;
                   f = (float)th;
                label_0221 :
                   f5 = f5 + f;
                }else if(th < null){
                   th1 = this.k;
                   f5 = (f5 + ((float)th * th1)) * th1;
                }else if(this.h != null){
                   f5 = this.e.centerY();
                   f = ((this.e.height() / 2.00f) - (float)this.f[i1]) * this.k;
                   goto label_0221 ;
                }
                f3 = f5;
                p0.drawLine(0, f3, f1, f3, this.c);
             }
          }
       }
    label_022c :
       return;
    }
    public final void setAirWallUsability(boolean p0){
       if (PatchProxy.isSupport(GuideLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuideLineView.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GuideLineView", "setAirWallUsability with enable = "+p0, objArray);
       this.g = p0;
       return;
    }
    public final void setDrawHorizontalGuideLine(boolean p0){
       if (PatchProxy.isSupport(GuideLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuideLineView.class, "4")) {
          return;
       }
       this.m = p0;
       this.invalidate();
       return;
    }
    public final void setDrawVerticalGuideLine(boolean p0){
       if (PatchProxy.isSupport(GuideLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuideLineView.class, "5")) {
          return;
       }
       this.n = p0;
       this.invalidate();
       return;
    }
    public final void setPreviewAreaRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuideLineView.class, "3")) {
          return;
       }
       a.p(p0, "rect");
       Object[] objArray = new Object[0];
       a.D().w("GuideLineView", "setPreviewAreaRect with rect = "+p0, objArray);
       this.e.set(p0);
       return;
    }
}
