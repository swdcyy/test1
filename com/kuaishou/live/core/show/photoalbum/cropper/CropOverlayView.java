package com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.photoalbum.cropper.d;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Paint$Style;
import java.lang.Boolean;
import com.kuaishou.live.core.show.photoalbum.cropper.c;
import java.lang.Math;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView$b;
import pp.a;
import java.lang.Throwable;
import q87.c;
import android.graphics.Canvas;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$CropShape;
import android.os.Build$VERSION;
import android.graphics.Region$Op;
import android.graphics.Path$Direction;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$Guidelines;
import java.util.Arrays;
import java.lang.System;
import android.view.ScaleGestureDetector;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView$c;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView$a;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.MotionEvent;
import java.util.Objects;
import com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler;
import android.graphics.PointF;
import com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler$Type;
import com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler$a;
import java.lang.Enum;
import android.view.ViewParent;
import java.lang.IllegalArgumentException;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageOptions;

public class CropOverlayView extends View	// class@000d64
{
    public CropImageView$CropShape A;
    public final Rect B;
    public boolean C;
    public Integer D;
    public ScaleGestureDetector b;
    public boolean c;
    public final d d;
    public CropOverlayView$b e;
    public final RectF f;
    public Paint g;
    public Paint h;
    public Paint i;
    public Paint j;
    public Path k;
    public final float[] l;
    public final RectF m;
    public int n;
    public int o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public CropWindowMoveHandler u;
    public boolean v;
    public int w;
    public int x;
    public float y;
    public CropImageView$Guidelines z;

    public void CropOverlayView(Context p0){
       super(p0, null);
    }
    public void CropOverlayView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new d();
       this.f = new RectF();
       this.k = new Path();
       float[] uofloatArray = new float[8];
       this.l = uofloatArray;
       this.m = new RectF();
       this.y = (float)this.w / (float)this.x;
       this.B = new Rect();
    }
    public static Paint g(float p0,int p1){
       Paint obj;
       if (PatchProxy.isSupport(CropOverlayView.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), null, CropOverlayView.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 > 0) {
          obj = new Paint();
          obj.setColor(p1);
          obj.setStrokeWidth(p0);
          obj.setStyle(Paint$Style.STROKE);
          obj.setAntiAlias(true);
          return obj;
       }else {
          return null;
       }
    }
    public final boolean a(RectF p0){
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, CropOverlayView.class, "31");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       float f = c.s(obj.l);
       float f1 = c.u(obj.l);
       float f2 = c.t(obj.l);
       float f3 = c.n(obj.l);
       boolean b = false;
       if (!this.j()) {
          obj.m.set(f, f1, f2, f3);
          return b;
       }else {
          CropOverlayView l = obj.l;
          int i = l[b];
          int i1 = 1;
          int i2 = l[i1];
          int i3 = 4;
          int i4 = l[i3];
          int i5 = 5;
          int i6 = l[i5];
          int i7 = 6;
          int i8 = l[i7];
          int i9 = 7;
          int i10 = l[i9];
          if (l[i9] - l[i1] < 0) {
             if (l[i1] - l[3] < 0) {
                i = l[i7];
                i2 = l[i9];
                i4 = l[2];
                i6 = l[3];
                i8 = l[i3];
                i10 = l[i5];
             }else {
                i = l[i3];
                i2 = l[i5];
                i4 = l[b];
                i6 = l[i1];
                i8 = l[2];
                i10 = l[3];
             }
          }else if(l[i1] - l[3] > 0){
             i = l[2];
             i2 = l[3];
             i4 = l[i7];
             i6 = l[i9];
             i8 = l[b];
             i10 = l[i1];
          }
          float f4 = (i10 - i2) / (i8 - i);
          float f5 = 0xbf800000 / f4;
          float f6 = i2 - (f4 * i);
          float f7 = i2 - (i * f5);
          float f8 = i6 - (f4 * i4);
          float f9 = i6 - (i4 * f5);
          RectF left = obj1.left;
          float f10 = (p0.centerY() - obj1.top) / (p0.centerX() - left);
          float f11 = - f10;
          RectF top = obj1.top;
          float f12 = top - (left * f10);
          RectF right = obj1.right;
          float f13 = top - (f11 * right);
          float f14 = f4 - f10;
          float f15 = (f12 - f6) / f14;
          float f16 = (f15 - right < 0)? f15: f;
          f = Math.max(f, f16);
          f16 = (f12 - f7) / (f5 - f10);
          if (f16 - obj1.right >= 0) {
             f16 = f;
          }
          f = Math.max(f, f16);
          f10 = f5 - f11;
          f16 = (f13 - f9) / f10;
          if (f16 - obj1.right >= 0) {
             f16 = f;
          }
          float f17 = Math.max(f, f16);
          f = (f13 - f7) / f10;
          if (f - obj1.left <= 0) {
             f = f2;
          }
          f = Math.min(f2, f);
          f13 = (f13 - f8) / (f4 - f11);
          if (f13 - obj1.left <= 0) {
             f13 = f;
          }
          f = Math.min(f, f13);
          f12 = (f12 - f8) / f14;
          if (f12 - obj1.left <= 0) {
             f12 = f;
          }
          float f18 = Math.min(f, f12);
          CropOverlayView m = this.m;
          m.left = f17;
          m.top = Math.max(f1, Math.max(((f4 * f17) + f6), ((f5 * f18) + f7)));
          m.right = f18;
          m.bottom = Math.min(f3, Math.min(((f5 * f17) + f9), ((f4 * f18) + f8)));
          return true;
       }
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport(CropOverlayView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropOverlayView.class, "32")) {
          return;
       }
       try{
          CropOverlayView te = this.e;
          if (te != null) {
             te.a(p0);
          }
       }catch(java.lang.Exception e4){
          a.C().e("AIC", "Exception in crop window changed", e4);
       }
       return;
    }
    public final void c(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "21")) {
          return;
       }
       RectF rectF = this.d.f();
       float f = Math.max(c.s(this.l), 0);
       float f1 = Math.max(c.u(this.l), 0);
       float f2 = Math.min(c.t(this.l), (float)this.getWidth());
       float f3 = Math.min(c.n(this.l), (float)this.getHeight());
       float f4 = 0.00f;
       if (this.A == CropImageView$CropShape.RECTANGLE) {
          if (this.j()) {
             this.k.reset();
             CropOverlayView tl = this.l;
             this.k.moveTo(tl[0], tl[1]);
             tl = this.l;
             this.k.lineTo(tl[2], tl[3]);
             tl = this.l;
             this.k.lineTo(tl[4], tl[5]);
             tl = this.l;
             this.k.lineTo(tl[6], tl[7]);
             this.k.close();
             p0.save();
             p0.clipPath(this.k, Region$Op.INTERSECT);
             if (Build$VERSION.SDK_INT >= f4) {
                p0.clipPath(this.k);
             }else {
                p0.clipPath(this.k, Region$Op.XOR);
             }
             p0.drawRect(f, f1, f2, f3, this.j);
             p0.restore();
          }else {
             Canvas uCanvas = p0;
             float f5 = f;
             f4 = f2;
             uCanvas.drawRect(f5, f1, f4, rectF.top, this.j);
             uCanvas.drawRect(f5, rectF.bottom, f4, f3, this.j);
             uCanvas.drawRect(f5, rectF.top, rectF.left, rectF.bottom, this.j);
             p0.drawRect(rectF.right, rectF.top, f2, rectF.bottom, this.j);
          }
       }else {
          this.k.reset();
          this.f.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
          this.k.addOval(this.f, Path$Direction.CW);
          p0.save();
          if (Build$VERSION.SDK_INT >= f4) {
             p0.clipPath(this.k);
          }else {
             p0.clipPath(this.k, Region$Op.XOR);
          }
          p0.drawRect(f, f1, f2, f3, this.j);
          p0.restore();
       }
       return;
    }
    public final void d(Canvas p0){
       float f3;
       float f6;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "22")) {
          return;
       }
       if (this.i != null) {
          CropOverlayView tg = this.g;
          float strokeWidth = (tg != null)? tg.getStrokeWidth(): 0;
          RectF rectF = this.d.f();
          rectF.inset(strokeWidth, strokeWidth);
          float f = rectF.width() / 3.00f;
          float f1 = rectF.height() / 3.00f;
          if (this.A == CropImageView$CropShape.OVAL) {
             float f2 = (rectF.width() / 2.00f) - strokeWidth;
             strokeWidth = (rectF.height() / 2.00f) - strokeWidth;
             f3 = rectF.left + f;
             float f4 = rectF.right - f;
             float f5 = (float)((double)strokeWidth * Math.sin(Math.acos((double)((f2 - f) / f2))));
             p0.drawLine(f3, ((rectF.top + strokeWidth) - f5), f3, ((rectF.bottom - strokeWidth) + f5), this.i);
             p0.drawLine(f4, ((rectF.top + strokeWidth) - f5), f4, ((rectF.bottom - strokeWidth) + f5), this.i);
             f6 = rectF.top + f1;
             f4 = rectF.bottom - f1;
             strokeWidth = (float)((double)f2 * Math.cos(Math.asin((double)((strokeWidth - f1) / strokeWidth))));
             p0.drawLine(((rectF.left + f2) - strokeWidth), f6, ((rectF.right - f2) + strokeWidth), f6, this.i);
             p0.drawLine(((rectF.left + f2) - strokeWidth), f4, ((rectF.right - f2) + strokeWidth), f4, this.i);
          }else {
             f3 = rectF.left + f;
             strokeWidth = rectF.right - f;
             Canvas uCanvas = p0;
             uCanvas.drawLine(f3, rectF.top, f3, rectF.bottom, this.i);
             uCanvas.drawLine(strokeWidth, rectF.top, strokeWidth, rectF.bottom, this.i);
             f6 = rectF.top + f1;
             strokeWidth = rectF.bottom - f1;
             uCanvas.drawLine(rectF.left, f6, rectF.right, f6, this.i);
             uCanvas.drawLine(rectF.left, strokeWidth, rectF.right, strokeWidth, this.i);
          }
       }
       return;
    }
    public final void e(RectF p0){
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "19")) {
          return;
       }
       if (p0.width() - this.d.e() < 0) {
          f = (this.d.e() - p0.width()) / 2.00f;
          p0.left = p0.left - f;
          p0.right = p0.right + f;
       }
       if (p0.height() - this.d.d() < 0) {
          f = (this.d.d() - p0.height()) / 2.00f;
          p0.top = p0.top - f;
          p0.bottom = p0.bottom + f;
       }
       if (p0.width() - this.d.c() > 0) {
          f = (p0.width() - this.d.c()) / 2.00f;
          p0.left = p0.left + f;
          p0.right = p0.right - f;
       }
       if (p0.height() - this.d.b() > 0) {
          f = (p0.height() - this.d.b()) / 2.00f;
          p0.top = p0.top + f;
          p0.bottom = p0.bottom - f;
       }
       this.a(p0);
       float f1 = 0;
       if (this.m.width() - f1 > 0 && this.m.height() - f1 > 0) {
          f = Math.max(this.m.left, f1);
          f1 = Math.max(this.m.top, f1);
          float f2 = Math.min(this.m.right, (float)this.getWidth());
          float f3 = Math.min(this.m.bottom, (float)this.getHeight());
          if (p0.left - f < 0) {
             p0.left = f;
          }
          if (p0.top - f1 < 0) {
             p0.top = f1;
          }
          if (p0.right - f2 > 0) {
             p0.right = f2;
          }
          if (p0.bottom - f3 > 0) {
             p0.bottom = f3;
          }
       }
    label_00ff :
       if (this.v != null && (double)Math.abs((p0.width() - (p0.height() * this.y))) - 0x3fb999999999999a > 0) {
          if (p0.width() - (p0.height() * this.y) > 0) {
             f = Math.abs(((p0.height() * this.y) - p0.width())) / 2.00f;
             p0.left = p0.left + f;
             p0.right = p0.right - f;
          }else {
             f = Math.abs(((p0.width() / this.y) - p0.height())) / 2.00f;
             p0.top = p0.top + f;
             p0.bottom = p0.bottom - f;
          }
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, CropOverlayView.class, "3")) {
          return;
       }
       RectF cropWindowRe = this.getCropWindowRect();
       this.e(cropWindowRe);
       this.d.m(cropWindowRe);
       return;
    }
    public int getAspectRatioX(){
       return this.w;
    }
    public int getAspectRatioY(){
       return this.x;
    }
    public CropImageView$CropShape getCropShape(){
       return this.A;
    }
    public RectF getCropWindowRect(){
       Object obj = PatchProxy.apply(null, this, CropOverlayView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.f();
    }
    public CropImageView$Guidelines getGuidelines(){
       return this.z;
    }
    public Rect getInitialCropWindowRect(){
       return this.B;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, CropOverlayView.class, "18")) {
          return;
       }
       float f = Math.max(c.s(this.l), 0);
       float f1 = Math.max(c.u(this.l), 0);
       float f2 = Math.min(c.t(this.l), (float)this.getWidth());
       float f3 = Math.min(c.n(this.l), (float)this.getHeight());
       if (f2 - f > 0 && f3 - f1 > 0) {
          RectF rectF = new RectF();
          this.C = true;
          CropOverlayView tr = this.r;
          float f4 = f2 - f;
          float f5 = tr * f4;
          float f6 = f3 - f1;
          float f7 = tr * f6;
          if (this.B.width() > 0 && this.B.height() > 0) {
             rectF.left = ((float)this.B.left / this.d.h()) + f;
             rectF.top = ((float)this.B.top / this.d.g()) + f1;
             rectF.right = rectF.left + ((float)this.B.width() / this.d.h());
             rectF.bottom = rectF.top + ((float)this.B.height() / this.d.g());
             rectF.left = Math.max(f, rectF.left);
             rectF.top = Math.max(f1, rectF.top);
             rectF.right = Math.min(f2, rectF.right);
             rectF.bottom = Math.min(f3, rectF.bottom);
          }else if(this.v != null && (f2 - f > 0 && f3 - f1 > 0)){
             if ((f4 / f6) - this.y > 0) {
                rectF.top = f1 + f7;
                rectF.bottom = f3 - f7;
                f = (float)this.getWidth() / 2.00f;
                this.y = (float)this.w / (float)this.x;
                f1 = Math.max(this.d.e(), (rectF.height() * this.y)) / 2.00f;
                rectF.left = f - f1;
                rectF.right = f + f1;
             }else {
                rectF.left = f + f5;
                rectF.right = f2 - f5;
                f = (float)this.getHeight() / 2.00f;
                f1 = Math.max(this.d.d(), (rectF.width() / this.y)) / 2.00f;
                rectF.top = f - f1;
                rectF.bottom = f + f1;
             }
          }else {
             rectF.left = f + f5;
             rectF.top = f1 + f7;
             rectF.right = f2 - f5;
             rectF.bottom = f3 - f7;
          }
          this.e(rectF);
          this.d.m(rectF);
       }
       return;
    }
    public boolean i(){
       return this.v;
    }
    public final boolean j(){
       CropOverlayView tl = this.l;
       int i = 0;
       if (tl[i] - tl[6] && tl[1] - tl[7]) {
          i = true;
       }
       return i;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, CropOverlayView.class, "5")) {
          return;
       }
       if (this.C != null) {
          this.setCropWindowRect(c.b);
          this.h();
          this.invalidate();
       }
       return;
    }
    public void l(float[] p0,int p1,int p2){
       if (PatchProxy.isSupport(CropOverlayView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, CropOverlayView.class, "4")) {
          return;
       }
       if (p0 == null || !Arrays.equals(this.l, p0)) {
          if (p0 == null) {
             Arrays.fill(this.l, 0);
          }else {
             System.arraycopy(p0, 0, this.l, 0, p0.length);
          }
          this.n = p1;
          this.o = p2;
          RectF rectF = this.d.f();
          if (!rectF.width() || !rectF.height()) {
             this.h();
          }
       }
       return;
    }
    public boolean m(boolean p0){
       if (PatchProxy.isSupport(CropOverlayView.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, CropOverlayView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.c != p0) {
          this.c = p0;
          if (p0 && this.b == null) {
             this.b = new ScaleGestureDetector(this.getContext(), new CropOverlayView$c(this, null));
          }
          return true;
       }else {
          return false;
       }
    }
    public void onDraw(Canvas p0){
       CropOverlayView tz;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "20")) {
          return;
       }
       super.onDraw(p0);
       this.c(p0);
       if (this.d.n()) {
          tz = this.z;
          if (tz == CropImageView$Guidelines.ON) {
             this.d(p0);
          }else if(tz == CropImageView$Guidelines.ON_TOUCH && this.u != null){
             this.d(p0);
          }
       }
       float f = 2.00f;
       if (!PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "23")) {
          tz = this.g;
          if (tz != null) {
             RectF rectF1 = this.d.f();
             rectF1.inset((tz.getStrokeWidth() / f), (tz.getStrokeWidth() / f));
             if (this.A == CropImageView$CropShape.RECTANGLE) {
                p0.drawRect(rectF1, this.g);
             }else {
                p0.drawOval(rectF1, this.g);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "24") && this.h != null) {
          tz = this.g;
          CropOverlayView uCropOverlay = null;
          float strokeWidth = (tz != null)? tz.getStrokeWidth(): 0;
          float strokeWidth1 = this.h.getStrokeWidth();
          float f1 = strokeWidth1 / f;
          if (this.A == CropImageView$CropShape.RECTANGLE) {
             uCropOverlay = this.p;
          }
          RectF rectF = this.d.f();
          rectF.inset((uCropOverlay + f1), (uCropOverlay + f1));
          strokeWidth1 = (strokeWidth1 - strokeWidth) / f;
          f1 = f1 + strokeWidth1;
          float f2 = rectF.left - strokeWidth1;
          RectF top = rectF.top;
          Canvas uCanvas = p0;
          uCanvas.drawLine(f2, (top - f1), f2, (top + this.q), this.h);
          top = rectF.left;
          float f3 = rectF.top - strokeWidth1;
          uCanvas.drawLine((top - f1), f3, (top + this.q), f3, this.h);
          f2 = rectF.right + strokeWidth1;
          top = rectF.top;
          uCanvas.drawLine(f2, (top - f1), f2, (top + this.q), this.h);
          top = rectF.right;
          f3 = rectF.top - strokeWidth1;
          uCanvas.drawLine((top + f1), f3, (top - this.q), f3, this.h);
          f2 = rectF.left - strokeWidth1;
          top = rectF.bottom;
          uCanvas.drawLine(f2, (top + f1), f2, (top - this.q), this.h);
          top = rectF.left;
          f3 = rectF.bottom + strokeWidth1;
          uCanvas.drawLine((top - f1), f3, (top + this.q), f3, this.h);
          f2 = rectF.right + strokeWidth1;
          top = rectF.bottom;
          uCanvas.drawLine(f2, (top + f1), f2, (top - this.q), this.h);
          top = rectF.right;
          f3 = rectF.bottom + strokeWidth1;
          uCanvas.drawLine((top + f1), f3, (top - this.q), f3, this.h);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float x;
       float y;
       CropOverlayView u;
       float f2;
       RectF left;
       RectF rectF1;
       d uod1;
       CropWindowMoveHandler uCropWindowM = this;
       RectF obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RectF obj1 = PatchProxy.applyOneRefs(obj, uCropWindowM, CropOverlayView.class, "27");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       if (uCropWindowM.c != null) {
          uCropWindowM.b.onTouchEvent(obj);
       }
       int action = p0.getAction();
       Object[] objArray = null;
       if (action) {
          if (action != 1) {
             String str = 3;
             int i = 2;
             if (action != i) {
                if (action != str) {
                   return b;
                }
             }else {
                x = p0.getX();
                y = p0.getY();
                if (PatchProxy.isSupport(CropOverlayView.class) && (!PatchProxy.applyVoidTwoRefs(Float.valueOf(x), Float.valueOf(y), uCropWindowM, CropOverlayView.class, "30") && uCropWindowM.u != null)) {
                   CropOverlayView t = uCropWindowM.t;
                   RectF rectF = uCropWindowM.d.f();
                   if (uCropWindowM.a(rectF)) {
                      t = 0;
                   }
                   u = uCropWindowM.u;
                   CropOverlayView m = uCropWindowM.m;
                   CropOverlayView n = uCropWindowM.n;
                   CropOverlayView o = uCropWindowM.o;
                   CropOverlayView v = uCropWindowM.v;
                   CropOverlayView y1 = uCropWindowM.y;
                   Objects.requireNonNull(u);
                   CropWindowMoveHandler uCropWindowM1 = CropWindowMoveHandler.class;
                   int i1 = 6;
                   int i2 = 4;
                   if (PatchProxy.isSupport(uCropWindowM1)) {
                      Object[] objArray1 = new Object[9];
                      objArray1[b] = rectF;
                      objArray1[1] = Float.valueOf(x);
                      objArray1[i] = Float.valueOf(y);
                      objArray1[3] = m;
                      objArray1[i2] = Integer.valueOf(n);
                      objArray1[5] = Integer.valueOf(o);
                      objArray1[i1] = Float.valueOf(t);
                      objArray1[7] = Boolean.valueOf(v);
                      objArray1[8] = Float.valueOf(y1);
                      if (!PatchProxy.applyVoid(objArray1, u, uCropWindowM1, "1")) {
                      label_00ce :
                         CropWindowMoveHandler f = u.f;
                         x = x + f.x;
                         y = y + f.y;
                         if (u.e == CropWindowMoveHandler$Type.CENTER) {
                            if (PatchProxy.isSupport(uCropWindowM1)) {
                               objArray1 = new Object[]{rectF,Float.valueOf(x),Float.valueOf(y),m,Integer.valueOf(n),Integer.valueOf(o),Float.valueOf(t)};
                               if (!PatchProxy.applyVoid(objArray1, u, uCropWindowM1, "3")) {
                               }
                            }else {
                            }
                         }else {
                            CropOverlayView uCropOverlay = m;
                            if (v != null) {
                               if (PatchProxy.isSupport(uCropWindowM1)) {
                                  objArray1 = new Object[]{rectF,Float.valueOf(x),Float.valueOf(y),uCropOverlay,Integer.valueOf(n),Integer.valueOf(o),Float.valueOf(t),Float.valueOf(y1)};
                                  if (!PatchProxy.applyVoid(objArray1, u, uCropWindowM1, "5")) {
                                  }
                               }else {
                               }
                            }else {
                               m = o;
                               CropOverlayView uCropOverlay3 = n;
                               CropOverlayView uCropOverlay1 = u;
                               if (PatchProxy.isSupport(uCropWindowM1)) {
                                  Object[] objArray2 = new Object[]{rectF,Float.valueOf(x),Float.valueOf(y),uCropOverlay,Integer.valueOf(uCropOverlay3),Integer.valueOf(m),Float.valueOf(t)};
                                  if (!PatchProxy.applyVoid(objArray2, uCropOverlay1, uCropWindowM1, "4")) {
                                  }
                               }else {
                               }
                            }
                         }
                      }
                   }else {
                      goto label_00ce ;
                   }
                label_042e :
                   uCropWindowM.d.m(rectF);
                   uCropWindowM.b(true);
                   this.invalidate();
                }
                this.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
             }
          }
          this.getParent().requestDisallowInterceptTouchEvent(b);
          if (!PatchProxy.applyVoid(objArray, uCropWindowM, CropOverlayView.class, "29") && uCropWindowM.u != null) {
             uCropWindowM.u = objArray;
             uCropWindowM.b(b);
             this.invalidate();
          }
          return true;
       }else {
          x = p0.getX();
          y = p0.getY();
          if (!PatchProxy.isSupport(CropOverlayView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(x), Float.valueOf(y), uCropWindowM, CropOverlayView.class, "28")) {
             CropOverlayView uCropOverlay2 = uCropWindowM.d;
             u = uCropWindowM.s;
             CropOverlayView a = uCropWindowM.A;
             Objects.requireNonNull(uCropOverlay2);
             d uod = d.class;
             if (PatchProxy.isSupport(uod)) {
                uod1 = uod;
                CropWindowMoveHandler$Type obj2 = PatchProxy.applyFourRefs(Float.valueOf(x), Float.valueOf(y), Float.valueOf(u), a, uCropOverlay2, d.class, "8");
                if (obj2 != patchProxyRe) {
                   objArray = obj2;
                }else if(a == CropImageView$CropShape.OVAL){
                   if (PatchProxy.isSupport(uod1)) {
                      obj2 = PatchProxy.applyTwoRefs(Float.valueOf(x), Float.valueOf(y), uCropOverlay2, uod1, "10");
                      if (obj2 != patchProxyRe) {
                      }
                   }
                   float f1 = uCropOverlay2.a.width() / 6.00f;
                   d a1 = uCropOverlay2.a;
                   RectF left1 = a1.left;
                   float f5 = left1 + f1;
                   float f4 = left1 + (f1 * 5.00f);
                   f1 = a1.height() / 6.00f;
                   RectF top = uCropOverlay2.a.top;
                   float f6 = top + f1;
                   float f3 = top + (f1 * 5.00f);
                   if (x - f5 < 0) {
                      if (y - f6 < 0) {
                         obj2 = CropWindowMoveHandler$Type.TOP_LEFT;
                      }else if(y - f3 < 0){
                         obj2 = CropWindowMoveHandler$Type.LEFT;
                      }else {
                         obj2 = CropWindowMoveHandler$Type.BOTTOM_LEFT;
                      }
                   }else if(x - f4 < 0){
                      if (y - f6 < 0) {
                         obj2 = CropWindowMoveHandler$Type.TOP;
                      }else if(y - f3 < 0){
                         obj2 = CropWindowMoveHandler$Type.CENTER;
                      }else {
                         obj2 = CropWindowMoveHandler$Type.BOTTOM;
                      }
                   }else if(y - f6 < 0){
                      obj2 = CropWindowMoveHandler$Type.TOP_RIGHT;
                   }else if(y - f3 < 0){
                      obj2 = CropWindowMoveHandler$Type.RIGHT;
                   }else {
                      obj2 = CropWindowMoveHandler$Type.BOTTOM_RIGHT;
                   }
                }else if(PatchProxy.isSupport(uod1)){
                   obj2 = PatchProxy.applyThreeRefs(Float.valueOf(x), Float.valueOf(y), Float.valueOf(u), uCropOverlay2, d.class, "9");
                   if (obj2 != patchProxyRe) {
                   }
                }
                d a2 = uCropOverlay2.a;
                if (d.j(x, y, a2.left, a2.top, u)) {
                   obj2 = CropWindowMoveHandler$Type.TOP_LEFT;
                }else {
                   a2 = uCropOverlay2.a;
                   if (d.j(x, y, a2.right, a2.top, u)) {
                      obj2 = CropWindowMoveHandler$Type.TOP_RIGHT;
                   }else {
                      a2 = uCropOverlay2.a;
                      if (d.j(x, y, a2.left, a2.bottom, u)) {
                         obj2 = CropWindowMoveHandler$Type.BOTTOM_LEFT;
                      }else {
                         a2 = uCropOverlay2.a;
                         if (d.j(x, y, a2.right, a2.bottom, u)) {
                            obj2 = CropWindowMoveHandler$Type.BOTTOM_RIGHT;
                         }else {
                            a2 = uCropOverlay2.a;
                            if (d.i(x, y, a2.left, a2.top, a2.right, a2.bottom) && uCropOverlay2.a()) {
                               obj2 = CropWindowMoveHandler$Type.CENTER;
                            }else {
                               a2 = uCropOverlay2.a;
                               if (d.k(x, y, a2.left, a2.right, a2.top, u)) {
                                  obj2 = CropWindowMoveHandler$Type.TOP;
                               }else {
                                  a2 = uCropOverlay2.a;
                                  if (d.k(x, y, a2.left, a2.right, a2.bottom, u)) {
                                     obj2 = CropWindowMoveHandler$Type.BOTTOM;
                                  }else {
                                     a2 = uCropOverlay2.a;
                                     if (d.l(x, y, a2.left, a2.top, a2.bottom, u)) {
                                        obj2 = CropWindowMoveHandler$Type.LEFT;
                                     }else {
                                        a2 = uCropOverlay2.a;
                                        if (d.l(x, y, a2.right, a2.top, a2.bottom, u)) {
                                           obj2 = CropWindowMoveHandler$Type.RIGHT;
                                        }else {
                                           a2 = uCropOverlay2.a;
                                           if (d.i(x, y, a2.left, a2.top, a2.right, a2.bottom) && !uCropOverlay2.a()) {
                                              obj2 = CropWindowMoveHandler$Type.CENTER;
                                           }else {
                                              Object[] objArray3 = objArray;
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
                if (obj2 != null) {
                   objArray = new CropWindowMoveHandler(obj2, uCropOverlay2, x, y);
                }
             }else {
                uod1 = uod;
                goto label_04b8 ;
             }
             uCropWindowM.u = objArray;
             if (objArray != null) {
                this.invalidate();
             }
          }
          return true;
       }
    }
    public void setAspectRatioX(int p0){
       if (PatchProxy.isSupport(CropOverlayView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CropOverlayView.class, "9")) {
          return;
       }
       if (p0 <= 0) {
          throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
       }
       if (this.w != p0) {
          this.w = p0;
          this.y = (float)p0 / (float)this.x;
          if (this.C != null) {
             this.h();
             this.invalidate();
          }
       }
       return;
    }
    public void setAspectRatioY(int p0){
       if (PatchProxy.isSupport(CropOverlayView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CropOverlayView.class, "10")) {
          return;
       }
       if (p0 <= 0) {
          throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
       }
       if (this.x != p0) {
          this.x = p0;
          this.y = (float)this.w / (float)p0;
          if (this.C != null) {
             this.h();
             this.invalidate();
          }
       }
       return;
    }
    public void setCropShape(CropImageView$CropShape p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "6")) {
          return;
       }
       if (this.A != p0) {
          this.A = p0;
          this.invalidate();
       }
       return;
    }
    public void setCropWindowChangeListener(CropOverlayView$b p0){
       this.e = p0;
    }
    public void setCropWindowRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "2")) {
          return;
       }
       this.d.m(p0);
       return;
    }
    public void setFixedAspectRatio(boolean p0){
       if (PatchProxy.isSupport(CropOverlayView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropOverlayView.class, "8")) {
          return;
       }
       if (this.v != p0) {
          this.v = p0;
          if (this.C != null) {
             this.h();
             this.invalidate();
          }
       }
       return;
    }
    public void setGuidelines(CropImageView$Guidelines p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "7")) {
          return;
       }
       if (this.z != p0) {
          this.z = p0;
          if (this.C != null) {
             this.invalidate();
          }
       }
       return;
    }
    public void setInitialAttributeValues(CropImageOptions p0){
       Paint paint;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "17")) {
          return;
       }
       CropOverlayView td = this.d;
       Objects.requireNonNull(td);
       td.c = (float)p0.y;
       td.d = (float)p0.z;
       td.g = (float)p0.A;
       td.h = (float)p0.B;
       td.i = (float)p0.C;
       td.j = (float)p0.D;
       this.setCropShape(p0.b);
       this.setSnapRadius(p0.c);
       this.setGuidelines(p0.e);
       this.setFixedAspectRatio(p0.m);
       this.setAspectRatioX(p0.n);
       this.setAspectRatioY(p0.o);
       this.m(p0.j);
       this.s = p0.d;
       this.r = p0.l;
       this.g = CropOverlayView.g(p0.p, p0.q);
       this.p = p0.s;
       this.q = p0.t;
       this.h = CropOverlayView.g(p0.r, p0.u);
       this.i = CropOverlayView.g(p0.v, p0.w);
       p0 = p0.x;
       if (PatchProxy.isSupport(CropOverlayView.class)) {
          paint = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, CropOverlayView.class, "25");
          if (paint != PatchProxyResult.class) {
          label_00a5 :
             this.j = paint;
             return;
          }
       }
       paint = new Paint();
       paint.setColor(p0);
       goto label_00a5 ;
    }
    public void setInitialCropWindowRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropOverlayView.class, "15")) {
          return;
       }
       CropOverlayView tB = this.B;
       if (p0 == null) {
          p0 = c.a;
       }
       tB.set(p0);
       if (this.C != null) {
          this.h();
          this.invalidate();
          this.b(false);
       }
       return;
    }
    public void setSnapRadius(float p0){
       this.t = p0;
    }
}
