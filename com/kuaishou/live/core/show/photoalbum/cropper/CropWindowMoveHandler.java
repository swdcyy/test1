package com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler;
import android.graphics.Matrix;
import com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler$Type;
import com.kuaishou.live.core.show.photoalbum.cropper.d;
import java.lang.Object;
import android.graphics.PointF;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler$a;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Math;

public final class CropWindowMoveHandler	// class@000d67
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final CropWindowMoveHandler$Type e;
    public final PointF f;
    public static final Matrix g;

    static {
       CropWindowMoveHandler.g = new Matrix();
    }
    public void CropWindowMoveHandler(CropWindowMoveHandler$Type p0,d p1,float p2,float p3){
       RectF top;
       float f1;
       super();
       PointF pointF = new PointF();
       this.f = pointF;
       this.e = p0;
       this.a = p1.e();
       this.b = p1.d();
       this.c = p1.c();
       this.d = p1.b();
       RectF rectF = p1.f();
       if (!PatchProxy.isSupport(CropWindowMoveHandler.class) || !PatchProxy.applyVoidThreeRefs(rectF, Float.valueOf(p2), Float.valueOf(p3), this, CropWindowMoveHandler.class, "2")) {
          float f = 0;
          switch (CropWindowMoveHandler$a.a[p0.ordinal()]){
              case 1:
                f = rectF.left - p2;
                top = rectF.top;
             label_0086 :
                f1 = top - p3;
                break;
              case 2:
                f = rectF.right - p2;
                top = rectF.top;
                goto label_0086 ;
                break;
              case 3:
                f = rectF.left - p2;
                top = rectF.bottom;
                goto label_0086 ;
                break;
              case 4:
                f = rectF.right - p2;
                top = rectF.bottom;
                goto label_0086 ;
                break;
              case 5:
                top = rectF.left;
             label_0069 :
                f1 = top - p2;
             label_0088 :
                f = f1;
                f1 = 0;
                break;
              case 6:
                top = rectF.top;
                goto label_0086 ;
                break;
              case 7:
                top = rectF.right;
                goto label_0069 ;
                break;
              case 8:
                top = rectF.bottom;
                goto label_0086 ;
                break;
              case 9:
                f = rectF.centerX() - p2;
                f1 = rectF.centerY();
                goto label_0086 ;
                break;
              default:
                f1 = 0;
                goto label_0088 ;
          }
          pointF.x = f;
          pointF.y = f1;
       }
       return;
    }
    public static float k(float p0,float p1,float p2,float p3){
       return ((p2 - p0) / (p3 - p1));
    }
    public final void a(RectF p0,float p1,RectF p2,int p3,float p4,float p5,boolean p6,boolean p7){
       RectF rectF;
       CropWindowMoveHandler uCropWindowM = CropWindowMoveHandler.class;
       if (PatchProxy.isSupport(uCropWindowM)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Integer.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Boolean.valueOf(p6),Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uCropWindowM, "10")) {
             return;
          }
       }
       float f = (float)p3;
       if (p1 - f > 0) {
          p1 = ((p1 - f) / 0x3f866666) + f;
          uCropWindowM = this.f;
          uCropWindowM.y = uCropWindowM.y - ((p1 - f) / 0x3f8ccccd);
       }
       RectF bottom = p2.bottom;
       if (p1 - bottom > 0) {
          uCropWindowM = this.f;
          uCropWindowM.y = uCropWindowM.y - ((p1 - bottom) / 2.00f);
       }
       if ((bottom - p1) - p4 < 0) {
          rectF = bottom;
       }
       RectF top = p0.top;
       CropWindowMoveHandler tb = this.b;
       if ((rectF - top) - tb < 0) {
          rectF = top + tb;
       }
       tb = this.d;
       if ((rectF - top) - tb > 0) {
          rectF = top + tb;
       }
       if ((bottom - rectF) - p4 < 0) {
          rectF = bottom;
       }
       if (p5 > 0) {
          p4 = (rectF - top) * p5;
          CropWindowMoveHandler ta = this.a;
          if (p4 - ta < 0) {
             rectF = Math.min(bottom, (top + (ta / p5)));
             p4 = (rectF - p0.top) * p5;
          }
          CropWindowMoveHandler tc = this.c;
          if (p4 - tc > 0) {
             rectF = Math.min(p2.bottom, (p0.top + (tc / p5)));
             p4 = (rectF - p0.top) * p5;
          }
          if (p6 && p7) {
             rectF = Math.min(rectF, Math.min(p2.bottom, (p0.top + (p2.width() / p5))));
          }else if(p6){
             bottom = p0.right;
             top = p2.left;
             if ((bottom - p4) - top < 0) {
                rectF = Math.min(p2.bottom, (p0.top + ((bottom - top) / p5)));
                p4 = (rectF - p0.top) * p5;
             }
          }
          if (p7) {
             bottom = p0.left;
             RectF right = p2.right;
             if ((p4 + bottom) - right > 0) {
                rectF = Math.min(rectF, Math.min(p2.bottom, (p0.top + ((right - bottom) / p5))));
             }
          }
       }
    label_0112 :
       p0.bottom = rectF;
       return;
    }
    public final void b(RectF p0,float p1){
       CropWindowMoveHandler uCropWindowM = CropWindowMoveHandler.class;
       if (PatchProxy.isSupport(uCropWindowM) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uCropWindowM, "14")) {
          return;
       }
       p0.bottom = p0.top + (p0.width() / p1);
       return;
    }
    public final void c(RectF p0,float p1,RectF p2,float p3,float p4,boolean p5,boolean p6){
       RectF rectF;
       RectF bottom;
       CropWindowMoveHandler uCropWindowM = CropWindowMoveHandler.class;
       if (PatchProxy.isSupport(uCropWindowM)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),Float.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uCropWindowM, "7")) {
             return;
          }
       }
       uCropWindowM = null;
       if (p1 - uCropWindowM < 0) {
          p1 = p1 / 0x3f866666;
          CropWindowMoveHandler tf = this.f;
          tf.x = tf.x - (p1 / 0x3f8ccccd);
       }
       RectF left = p2.left;
       if (p1 - left < 0) {
          CropWindowMoveHandler tf1 = this.f;
          tf1.x = tf1.x - ((p1 - left) / 2.00f);
       }
       if ((p1 - left) - p3 < 0) {
          rectF = left;
       }
       RectF right = p0.right;
       CropWindowMoveHandler ta = this.a;
       if ((right - rectF) - ta < 0) {
          rectF = right - ta;
       }
       ta = this.c;
       if ((right - rectF) - ta > 0) {
          rectF = right - ta;
       }
       if ((rectF - left) - p3 < 0) {
          rectF = left;
       }
       if (p4 - uCropWindowM > 0) {
          p3 = (right - rectF) / p4;
          uCropWindowM = this.b;
          if (p3 - uCropWindowM < 0) {
             rectF = Math.max(left, (right - (uCropWindowM * p4)));
             p3 = (p0.right - rectF) / p4;
          }
          uCropWindowM = this.d;
          if (p3 - uCropWindowM > 0) {
             rectF = Math.max(p2.left, (p0.right - (uCropWindowM * p4)));
             p3 = (p0.right - rectF) / p4;
          }
          if (p5 && p6) {
             rectF = Math.max(rectF, Math.max(p2.left, (p0.right - (p2.height() * p4))));
          }else if(p5){
             bottom = p0.bottom;
             left = p2.top;
             if ((bottom - p3) - left < 0) {
                rectF = Math.max(p2.left, (p0.right - ((bottom - left) * p4)));
                p3 = (p0.right - rectF) / p4;
             }
          }
          if (p6) {
             bottom = p0.top;
             RectF bottom1 = p2.bottom;
             if ((p3 + bottom) - bottom1 > 0) {
                rectF = Math.max(rectF, Math.max(p2.left, (p0.right - ((bottom1 - bottom) * p4))));
             }
          }
       }
    label_0104 :
       p0.left = rectF;
       return;
    }
    public final void d(RectF p0,float p1){
       CropWindowMoveHandler uCropWindowM = CropWindowMoveHandler.class;
       if (PatchProxy.isSupport(uCropWindowM) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uCropWindowM, "11")) {
          return;
       }
       p0.left = p0.right - (p0.height() * p1);
       return;
    }
    public final void e(RectF p0,RectF p1,float p2){
       if (PatchProxy.isSupport(CropWindowMoveHandler.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, CropWindowMoveHandler.class, "15")) {
          return;
       }
       p0.inset(((p0.width() - (p0.height() * p2)) / 2.00f), 0);
       RectF left = p0.left;
       RectF left1 = p1.left;
       if (left - left1 < 0) {
          p0.offset((left1 - left), 0);
       }
       left = p0.right;
       p1 = p1.right;
       if (left - p1 > 0) {
          p0.offset((p1 - left), 0);
       }
       return;
    }
    public final void f(RectF p0,float p1,RectF p2,int p3,float p4,float p5,boolean p6,boolean p7){
       RectF rectF;
       CropWindowMoveHandler uCropWindowM = CropWindowMoveHandler.class;
       if (PatchProxy.isSupport(uCropWindowM)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Integer.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Boolean.valueOf(p6),Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uCropWindowM, "8")) {
             return;
          }
       }
       float f = (float)p3;
       if (p1 - f > 0) {
          p1 = ((p1 - f) / 0x3f866666) + f;
          uCropWindowM = this.f;
          uCropWindowM.x = uCropWindowM.x - ((p1 - f) / 0x3f8ccccd);
       }
       RectF right = p2.right;
       if (p1 - right > 0) {
          uCropWindowM = this.f;
          uCropWindowM.x = uCropWindowM.x - ((p1 - right) / 2.00f);
       }
       if ((right - p1) - p4 < 0) {
          rectF = right;
       }
       RectF left = p0.left;
       CropWindowMoveHandler ta = this.a;
       if ((rectF - left) - ta < 0) {
          rectF = left + ta;
       }
       ta = this.c;
       if ((rectF - left) - ta > 0) {
          rectF = left + ta;
       }
       if ((right - rectF) - p4 < 0) {
          rectF = right;
       }
       if (p5 > 0) {
          p4 = (rectF - left) / p5;
          CropWindowMoveHandler tb = this.b;
          if (p4 - tb < 0) {
             rectF = Math.min(right, (left + (tb * p5)));
             p4 = (rectF - p0.left) / p5;
          }
          CropWindowMoveHandler td = this.d;
          if (p4 - td > 0) {
             rectF = Math.min(p2.right, (p0.left + (td * p5)));
             p4 = (rectF - p0.left) / p5;
          }
          if (p6 && p7) {
             rectF = Math.min(rectF, Math.min(p2.right, (p0.left + (p2.height() * p5))));
          }else if(p6){
             right = p0.bottom;
             left = p2.top;
             if ((right - p4) - left < 0) {
                rectF = Math.min(p2.right, (p0.left + ((right - left) * p5)));
                p4 = (rectF - p0.left) / p5;
             }
          }
          if (p7) {
             right = p0.top;
             RectF bottom = p2.bottom;
             if ((p4 + right) - bottom > 0) {
                rectF = Math.min(rectF, Math.min(p2.right, (p0.left + ((bottom - right) * p5))));
             }
          }
       }
    label_0116 :
       p0.right = rectF;
       return;
    }
    public final void g(RectF p0,float p1){
       CropWindowMoveHandler uCropWindowM = CropWindowMoveHandler.class;
       if (PatchProxy.isSupport(uCropWindowM) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uCropWindowM, "13")) {
          return;
       }
       p0.right = p0.left + (p0.height() * p1);
       return;
    }
    public final void h(RectF p0,float p1,RectF p2,float p3,float p4,boolean p5,boolean p6){
       RectF rectF;
       RectF right;
       CropWindowMoveHandler uCropWindowM = CropWindowMoveHandler.class;
       if (PatchProxy.isSupport(uCropWindowM)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),Float.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uCropWindowM, "9")) {
             return;
          }
       }
       uCropWindowM = null;
       if (p1 - uCropWindowM < 0) {
          p1 = p1 / 0x3f866666;
          CropWindowMoveHandler tf = this.f;
          tf.y = tf.y - (p1 / 0x3f8ccccd);
       }
       RectF top = p2.top;
       if (p1 - top < 0) {
          CropWindowMoveHandler tf1 = this.f;
          tf1.y = tf1.y - ((p1 - top) / 2.00f);
       }
       if ((p1 - top) - p3 < 0) {
          rectF = top;
       }
       RectF bottom = p0.bottom;
       CropWindowMoveHandler tb = this.b;
       if ((bottom - rectF) - tb < 0) {
          rectF = bottom - tb;
       }
       tb = this.d;
       if ((bottom - rectF) - tb > 0) {
          rectF = bottom - tb;
       }
       if ((rectF - top) - p3 < 0) {
          rectF = top;
       }
       if (p4 - uCropWindowM > 0) {
          p3 = (bottom - rectF) * p4;
          uCropWindowM = this.a;
          if (p3 - uCropWindowM < 0) {
             rectF = Math.max(top, (bottom - (uCropWindowM / p4)));
             p3 = (p0.bottom - rectF) * p4;
          }
          uCropWindowM = this.c;
          if (p3 - uCropWindowM > 0) {
             rectF = Math.max(p2.top, (p0.bottom - (uCropWindowM / p4)));
             p3 = (p0.bottom - rectF) * p4;
          }
          if (p5 && p6) {
             rectF = Math.max(rectF, Math.max(p2.top, (p0.bottom - (p2.width() / p4))));
          }else if(p5){
             right = p0.right;
             top = p2.left;
             if ((right - p3) - top < 0) {
                rectF = Math.max(p2.top, (p0.bottom - ((right - top) / p4)));
                p3 = (p0.bottom - rectF) * p4;
             }
          }
          if (p6) {
             right = p0.left;
             RectF right1 = p2.right;
             if ((p3 + right) - right1 > 0) {
                rectF = Math.max(rectF, Math.max(p2.top, (p0.bottom - ((right1 - right) / p4))));
             }
          }
       }
    label_0103 :
       p0.top = rectF;
       return;
    }
    public final void i(RectF p0,RectF p1,float p2){
       if (PatchProxy.isSupport(CropWindowMoveHandler.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, CropWindowMoveHandler.class, "16")) {
          return;
       }
       p0.inset(0, ((p0.height() - (p0.width() / p2)) / 2.00f));
       RectF top = p0.top;
       RectF top1 = p1.top;
       if (top - top1 < 0) {
          p0.offset(0, (top1 - top));
       }
       top = p0.bottom;
       p1 = p1.bottom;
       if (top - p1 > 0) {
          p0.offset(0, (p1 - top));
       }
       return;
    }
    public final void j(RectF p0,float p1){
       CropWindowMoveHandler uCropWindowM = CropWindowMoveHandler.class;
       if (PatchProxy.isSupport(uCropWindowM) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uCropWindowM, "12")) {
          return;
       }
       p0.top = p0.bottom - (p0.width() / p1);
       return;
    }
}
