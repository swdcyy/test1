package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailView;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import yoc.n;
import jwc.a$a;
import jwc.a;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Path;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailView$a;
import android.util.AttributeSet;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import qsd.d;
import p16.c;
import android.graphics.Bitmap;
import fpc.a;
import com.yxcorp.gifshow.v3.editor.k;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.Path$Direction;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailView$drawBitmap$refreshListener$1;
import dpc.b;
import msd.a;
import android.graphics.Rect;
import dpc.a;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.view.View;

public final class ThumbnailView extends LinearLayout	// class@000dcb
{
    public final String b;
    public final int c;
    public final double d;
    public final float e;
    public int f;
    public a g;
    public double h;
    public int i;
    public int j;
    public final int k;
    public final int l;
    public final Paint m;
    public final RectF n;
    public final Path o;
    public boolean p;
    public boolean q;
    public final int r;
    public final Runnable s;
    public HashMap t;

    public void ThumbnailView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = "ThumbnailView";
       this.c = a1.e(2.00f);
       this.d = 0x3f50624dd2f1a9fc;
       this.e = 0x3f400000;
       ClipUtils c = ClipUtils.c;
       this.k = c.d().b().a;
       this.l = c.d().b().b;
       this.m = new Paint();
       this.n = new RectF();
       this.o = new Path();
       this.r = a1.e(2.00f);
       this.s = new ThumbnailView$a(this);
    }
    public void ThumbnailView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1);
       this.b = "ThumbnailView";
       this.c = a1.e(2.00f);
       this.d = 0x3f50624dd2f1a9fc;
       this.e = 0x3f400000;
       ClipUtils c = ClipUtils.c;
       this.k = c.d().b().a;
       this.l = c.d().b().b;
       this.m = new Paint();
       this.n = new RectF();
       this.o = new Path();
       this.r = a1.e(2.00f);
       this.s = new ThumbnailView$a(this);
    }
    public void ThumbnailView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1, p2);
       this.b = "ThumbnailView";
       this.c = a1.e(2.00f);
       this.d = 0x3f50624dd2f1a9fc;
       this.e = 0x3f400000;
       ClipUtils c = ClipUtils.c;
       this.k = c.d().b().a;
       this.l = c.d().b().b;
       this.m = new Paint();
       this.n = new RectF();
       this.o = new Path();
       this.r = a1.e(2.00f);
       this.s = new ThumbnailView$a(this);
    }
    public final Pair a(int p0){
       Object obj;
       int i1;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ThumbnailView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ThumbnailView.class, "7");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i = 0;
       if (PatchProxy.isSupport(ThumbnailView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ThumbnailView.class, "8");
          if (obj != patchProxyRe) {
             i1 = obj.intValue();
          label_00b8 :
             i2 = (p0 >= 0)? 0: d.G0(((double)Math.abs(p0) / (double)this.k));
             int i3 = this.i + i2;
             Object[] objArray = new Object[i];
             a.D().s(this.b, "view "+this.hashCode()+" calculateThumbnail realx: "+p0+", getWidth\(\):"+this.getWidth()+",getHeight\(\):"+this.getHeight()+","+"showingFrameSize:"+i1+",startDrawFrameIndex:"+i3+"getTotalFrameSize\(\):"+this.getTotalFrameSize()+",mShowingStartX:"+this.h+",mShowingWidth:"+this.j, objArray);
             return new Pair(Integer.valueOf(i1), Integer.valueOf(i3));
          }
       }
       if (p0 < 0) {
          i1 = Math.min(a1.h(), (this.j + p0));
       }else if(p0 >= a1.h()){
          i1 = Math.max((p0 - a1.h()), this.j);
       }else {
          i1 = a1.h() - p0;
       }
       Object[] objArray1 = new Object[i];
       a.D().s(this.b, "getShowingFrameSize, visiblePixelSize="+i1, objArray1);
       i1 = d.G0(((double)i1 / (double)this.k)) + 2;
       i2 = this.getTotalFrameSize();
       Object[] objArray2 = new Object[i];
       a.D().s(this.b, "getShowingFrameSize, showingFrameSizeBound="+i2+", "+"computedShowingFrameSize="+i1, objArray2);
       i1 = Math.min(i2, i1);
       goto label_00b8 ;
    }
    public final Bitmap b(int p0,c p1){
       ThumbnailView obj;
       if (PatchProxy.isSupport(ThumbnailView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ThumbnailView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       double d = (double)((float)p0 + 0x3f000000) / (double)this.e;
       ThumbnailView tg = this.g;
       String str = "segment";
       if (tg == null) {
          a.S(str);
       }
       d = Math.min(d, (tg.a() - 0x3fb999999999999a));
       tg = 0;
       if (d - (double)tg < 0) {
          obj = null;
       }
       ThumbnailView tg1 = this.g;
       if (tg1 == null) {
          a.S(str);
       }
       if (tg1.k() - this.d >= 0) {
          tg1 = this.g;
          if (tg1 == null) {
             a.S(str);
          }
          if (tg1.c() - obj > 0) {
             obj = this.g;
             if (obj == null) {
                a.S(str);
             }
             d = obj.c() + this.d;
          }
          tg1 = this.g;
          if (tg1 == null) {
             a.S(str);
          }
          double d1 = tg1.c();
          ThumbnailView tg2 = this.g;
          if (tg2 == null) {
             a.S(str);
          }
          if ((d1 + tg2.k()) - d < 0) {
             obj = this.g;
             if (obj == null) {
                a.S(str);
             }
             d = obj.c();
             tg1 = this.g;
             if (tg1 == null) {
                a.S(str);
             }
             d = (d + tg1.k()) - this.d;
          }
       }
       double d2 = d;
       Object[] objArray = new Object[tg];
       a.D().s(this.b, "view "+this.hashCode()+" fetchBitmap time: "+d2+" , segmentIndex "+this.f, objArray);
       return k.f().d(this.f, d2, this.k, this.l, p1);
    }
    public void dispatchDraw(Canvas p0){
       ThumbnailView n;
       float f4;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ThumbnailView.class, "5")) {
          return;
       }
       super.dispatchDraw(p0);
       if (obj.g == null) {
          return;
       }
       if (obj1 != null) {
          obj.n.set(0, 0, (float)obj.j, (float)this.getHeight());
          obj.o.reset();
          if (obj.p != null) {
             n = obj.n;
             n.left = n.left + (float)obj.r;
          }
          if (obj.q != null) {
             n = obj.n;
             n.right = n.right - (float)obj.r;
          }
          ThumbnailView c = obj.c;
          float f = (float)c;
          obj.o.addRoundRect(obj.n, f, (float)c, Path$Direction.CCW);
          obj1.clipPath(obj.o);
          int locationX = this.getLocationX();
          int i = (locationX >= 0)? 0: d.G0(((double)Math.abs(locationX) / (double)obj.k));
          Pair pair = obj.a(locationX);
          Object[] objArray = new Object[0];
          a.D().s(obj.b, "dispatchDraw result index "+pair.first+' '+"allframe "+pair.second+" offset "+i, objArray);
          int i1 = pair.first.intValue() + 1;
          int i2 = 0;
          while (i2 < i1) {
             int i3 = pair.second.intValue() + i2;
             int i4 = i * obj.k;
             if (!PatchProxy.isSupport(ThumbnailView.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i3), Integer.valueOf(i2), p0, Integer.valueOf(i4), this, ThumbnailView.class, "9")) {
                Bitmap uBitmap = obj.b(i3, new b(new ThumbnailView$drawBitmap$refreshListener$1(obj)));
                if (uBitmap != null) {
                   float f1 = (float)uBitmap.getWidth();
                   float f2 = (float)uBitmap.getHeight();
                   f = f2 / f1;
                   float Rect f3 = (float)obj.l * 0x3f800000;
                   f3 = f3 / (float)obj.k;
                   int i5 = 2;
                   if (f - f3 > 0) {
                      f3 = f3 / f;
                      f3 = f3 * f2;
                      f = f2 - f3;
                      f4 = (float)i5;
                      f = f / f4;
                      f2 = f2 + f3;
                      f2 = f2 / f4;
                      f3 = new Rect(0, (int)f, (int)f1, (int)f2);
                   }else {
                      f = f / f3;
                      f = f * f1;
                      f3 = f1 - f;
                      f4 = (float)i5;
                      f3 = f3 / f4;
                      f1 = f1 + f;
                      f1 = f1 / f4;
                      f3 = new Rect((int)f3, 0, (int)f1, (int)f2);
                   }
                   c = obj.k;
                   int i6 = i2 * c;
                   i6 = i6 + i4;
                   i5 = i2 + 1;
                   i5 = i5 * c;
                   i4 = i4 + i5;
                   obj1.drawBitmap(uBitmap, f3, new Rect(i6, 0, i4, obj.l), obj.m);
                }
             }
             i2 = i2 + 1;
          }
       }
       return;
    }
    public final int getLocationX(){
       int[] obj = PatchProxy.apply(null, this, ThumbnailView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new int[2];
       this.getLocationOnScreen(obj);
       return obj[0];
    }
    public final int getTotalFrameSize(){
       return ((this.j / this.k) + 2);
    }
    public void onAttachedToWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThumbnailView.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.g != null && !PatchProxy.applyVoid(objArray, this, ThumbnailView.class, "3")) {
          Pair pair = this.a(this.getLocationX());
          Pair first = pair.first;
          a.o(first, "result.first");
          int i1 = first.intValue();
          for (int i = 0; i < i1; i = i + 1) {
             int i2 = pair.second.intValue() + i;
             this.b(i2, new a(this));
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ThumbnailView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && (this.n.left - p0.getX() <= 0 && p0.getX() - this.n.right <= 0)) {
          return super.onTouchEvent(p0);
       }
       return false;
    }
}
