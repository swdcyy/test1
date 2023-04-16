package com.kuaishou.live.core.show.photoalbum.cropper.CropImageView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Matrix;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageOptions;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$ScaleType;
import java.lang.Enum;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$CropShape;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$Guidelines;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$a;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView$b;
import android.widget.ProgressBar;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Float;
import java.lang.Boolean;
import android.graphics.RectF;
import android.graphics.Bitmap;
import com.kuaishou.live.core.show.photoalbum.cropper.c;
import java.util.Objects;
import gd2.a;
import java.lang.System;
import android.view.animation.Animation;
import android.net.Uri;
import android.util.Pair;
import android.graphics.Rect;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$RequestSizeOptions;
import com.kuaishou.live.core.show.photoalbum.cropper.c$a;
import java.lang.ref.WeakReference;
import com.kuaishou.live.core.show.photoalbum.cropper.a;
import android.os.AsyncTask;
import android.graphics.Bitmap$CompressFormat;
import java.lang.Void;
import com.kuaishou.live.core.show.photoalbum.cropper.d;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.os.Parcelable;
import android.os.Bundle;
import java.io.File;
import pp.a;
import java.lang.Throwable;
import q87.c;
import java.util.UUID;
import com.kuaishou.live.core.show.photoalbum.cropper.b;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$c;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$d;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$e;

public class CropImageView extends FrameLayout	// class@000d60
{
    public int A;
    public float B;
    public float C;
    public float D;
    public RectF E;
    public int F;
    public boolean G;
    public Uri H;
    public WeakReference I;
    public WeakReference J;
    public final ImageView b;
    public final CropOverlayView c;
    public final Matrix d;
    public final Matrix e;
    public final ProgressBar f;
    public final float[] g;
    public a h;
    public Bitmap i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public CropImageView$ScaleType q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public CropImageView$d w;
    public CropImageView$e x;
    public CropImageView$c y;
    public Uri z;

    public void CropImageView(Context p0){
       super(p0, null);
    }
    public void CropImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new Matrix();
       this.e = new Matrix();
       int i = 8;
       float[] uofloatArray = new float[i];
       this.g = uofloatArray;
       boolean b = false;
       this.r = b;
       this.s = true;
       this.t = true;
       this.u = true;
       this.A = 1;
       this.B = 0x3f800000;
       CropImageOptions uCropImageOp = new CropImageOptions();
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.h0, b, b);
          uCropImageOp.m = typedArray.getBoolean(10, uCropImageOp.m);
          uCropImageOp.n = typedArray.getInteger(b, uCropImageOp.n);
          uCropImageOp.o = typedArray.getInteger(true, uCropImageOp.o);
          uCropImageOp.f = CropImageView$ScaleType.values()[typedArray.getInt(26, uCropImageOp.f.ordinal())];
          uCropImageOp.i = typedArray.getBoolean(2, uCropImageOp.i);
          uCropImageOp.j = typedArray.getBoolean(24, uCropImageOp.j);
          uCropImageOp.k = typedArray.getInteger(19, uCropImageOp.k);
          uCropImageOp.b = CropImageView$CropShape.values()[typedArray.getInt(27, uCropImageOp.b.ordinal())];
          uCropImageOp.e = CropImageView$Guidelines.values()[typedArray.getInt(13, uCropImageOp.e.ordinal())];
          uCropImageOp.c = typedArray.getDimension(30, uCropImageOp.c);
          uCropImageOp.d = typedArray.getDimension(31, uCropImageOp.d);
          uCropImageOp.l = typedArray.getFloat(16, uCropImageOp.l);
          uCropImageOp.p = typedArray.getDimension(9, uCropImageOp.p);
          uCropImageOp.q = typedArray.getInteger(i, uCropImageOp.q);
          uCropImageOp.r = typedArray.getDimension(7, uCropImageOp.r);
          uCropImageOp.s = typedArray.getDimension(6, uCropImageOp.s);
          uCropImageOp.t = typedArray.getDimension(5, uCropImageOp.t);
          uCropImageOp.u = typedArray.getInteger(4, uCropImageOp.u);
          uCropImageOp.v = typedArray.getDimension(15, uCropImageOp.v);
          uCropImageOp.w = typedArray.getInteger(14, uCropImageOp.w);
          uCropImageOp.x = typedArray.getInteger(3, uCropImageOp.x);
          uCropImageOp.g = typedArray.getBoolean(28, this.s);
          uCropImageOp.h = typedArray.getBoolean(29, this.t);
          uCropImageOp.r = typedArray.getDimension(7, uCropImageOp.r);
          uCropImageOp.y = (int)typedArray.getDimension(23, (float)uCropImageOp.y);
          uCropImageOp.z = (int)typedArray.getDimension(22, (float)uCropImageOp.z);
          uCropImageOp.A = (int)typedArray.getFloat(21, (float)uCropImageOp.A);
          uCropImageOp.B = (int)typedArray.getFloat(20, (float)uCropImageOp.B);
          uCropImageOp.C = (int)typedArray.getFloat(18, (float)uCropImageOp.C);
          uCropImageOp.D = (int)typedArray.getFloat(17, (float)uCropImageOp.D);
          uCropImageOp.T = typedArray.getBoolean(11, uCropImageOp.T);
          uCropImageOp.U = typedArray.getBoolean(11, uCropImageOp.U);
          this.r = typedArray.getBoolean(25, this.r);
          if (typedArray.hasValue(b) && (typedArray.hasValue(b) && !typedArray.hasValue(10))) {
             uCropImageOp.m = true;
          }
       label_01ac :
          typedArray.recycle();
       }
       if (!PatchProxy.applyVoid(null, uCropImageOp, CropImageOptions.class, "2")) {
          if (uCropImageOp.k >= null) {
             CropImageOptions uCropImageOp1 = null;
             if (uCropImageOp.d - uCropImageOp1 >= 0) {
                CropImageOptions l = uCropImageOp.l;
                if (l - uCropImageOp1 >= 0 && (double)l - 0x3fe0000000000000 < 0) {
                   String str = "Cannot set aspect ratio value to a number less than or equal to 0.";
                   if (uCropImageOp.n > null) {
                      if (uCropImageOp.o > null) {
                         if (uCropImageOp.p - uCropImageOp1 >= 0) {
                            if (uCropImageOp.r - uCropImageOp1 >= 0) {
                               if (uCropImageOp.v - uCropImageOp1 >= 0) {
                                  if (uCropImageOp.z >= null) {
                                     l = uCropImageOp.A;
                                     if (l >= null) {
                                        uCropImageOp1 = uCropImageOp.B;
                                        if (uCropImageOp1 >= null) {
                                           if (uCropImageOp.C >= l) {
                                              if (uCropImageOp.D >= uCropImageOp1) {
                                                 if (uCropImageOp.J >= null) {
                                                    if (uCropImageOp.K >= null) {
                                                       l = uCropImageOp.S;
                                                       if (l < null || l > 360) {
                                                          throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                                                       }
                                                    }else {
                                                       throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                                                    }
                                                 }else {
                                                    throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                                                 }
                                              }else {
                                                 throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                                              }
                                           }else {
                                              throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                                           }
                                        }else {
                                           throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                                        }
                                     }else {
                                        throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                                     }
                                  }else {
                                     throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
                                  }
                               }else {
                                  throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
                               }
                            }else {
                               throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
                            }
                         }else {
                            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
                         }
                      }else {
                         throw new IllegalArgumentException(str);
                      }
                   }else {
                      throw new IllegalArgumentException(str);
                   }
                }else {
                   throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
                }
             }else {
                throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
             }
          }else {
             throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
          }
       }
       this.q = uCropImageOp.f;
       this.u = uCropImageOp.i;
       this.v = uCropImageOp.k;
       this.s = uCropImageOp.g;
       this.t = uCropImageOp.h;
       this.l = uCropImageOp.T;
       this.m = uCropImageOp.U;
       View view = a.g(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0ad9, this, true);
       ImageView imageView = view.findViewById(R.id.live_cover_crop_content_image_view);
       this.b = imageView;
       imageView.setScaleType(ImageView$ScaleType.MATRIX);
       CropOverlayView uCropOverlay = view.findViewById(R.id.live_cover_crop_overlay_view);
       this.c = uCropOverlay;
       uCropOverlay.setCropWindowChangeListener(new CropImageView$a(this));
       uCropOverlay.setInitialAttributeValues(uCropImageOp);
       this.f = view.findViewById(0x7f0a1bc9);
       this.h();
       return;
    }
    public static int c(int p0,int p1,int p2){
       if (PatchProxy.isSupport(CropImageView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, CropImageView.class, "58");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != 0x40000000) {
          p1 = (p0 == Integer.MIN_VALUE)? Math.min(p2, p1): p2;
       }
    label_0037 :
       return p1;
    }
    public final void a(float p0,float p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, CropImageView.class, "56")) {
          return;
       }
       if (this.i != null) {
          float f = 0;
          if (p0 - f > 0 && p1 - f > 0) {
             this.d.invert(this.e);
             RectF cropWindowRe = this.c.getCropWindowRect();
             this.e.mapRect(cropWindowRe);
             this.d.reset();
             this.d.postTranslate(((p0 - (float)this.i.getWidth()) / 2.00f), ((p1 - (float)this.i.getHeight()) / 2.00f));
             this.e();
             CropImageView tk = this.k;
             if (tk > null) {
                this.d.postRotate((float)tk, c.o(this.g), c.p(this.g));
                this.e();
             }
             float f1 = Math.min((p0 / c.v(this.g)), (p1 / c.r(this.g)));
             CropImageView tq = this.q;
             if (tq != CropImageView$ScaleType.FIT_CENTER) {
                CropImageView uCropImageVi = 0x3f800000;
                if (tq == CropImageView$ScaleType.CENTER_INSIDE && (f1 - uCropImageVi >= 0 && (f1 - uCropImageVi <= 0 || this.u == null))) {
                label_00bf :
                   f1 = (this.l != null)? - this.B: this.B;
                   float f2 = (this.m != null)? - this.B: this.B;
                   this.d.postScale(f1, f2, c.o(this.g), c.p(this.g));
                   this.e();
                   this.d.mapRect(cropWindowRe);
                   if (p2) {
                      p0 = (p0 - c.v(this.g) > 0)? 0: Math.max(Math.min(((p0 / 2.00f) - cropWindowRe.centerX()), (- c.s(this.g))), ((float)this.getWidth() - c.t(this.g))) / f1;
                      this.C = p0;
                      if (p1 - c.r(this.g) <= 0) {
                         f = Math.max(Math.min(((p1 / 2.00f) - cropWindowRe.centerY()), (- c.u(this.g))), ((float)this.getHeight() - c.n(this.g))) / f2;
                      }
                      this.D = f;
                   }else {
                      this.C = Math.min(Math.max((this.C * f1), (- cropWindowRe.left)), ((- cropWindowRe.right) + p0)) / f1;
                      this.D = Math.min(Math.max((this.D * f2), (- cropWindowRe.top)), ((- cropWindowRe.bottom) + p1)) / f2;
                   }
                   this.d.postTranslate((this.C * f1), (this.D * f2));
                   cropWindowRe.offset((this.C * f1), (this.D * f2));
                   this.c.setCropWindowRect(cropWindowRe);
                   this.e();
                   this.c.invalidate();
                   if (p3) {
                      CropImageView th = this.h;
                      CropImageView tg = this.g;
                      CropImageView td = this.d;
                      Objects.requireNonNull(th);
                      if (!PatchProxy.applyVoidTwoRefs(tg, td, th, a.class, "2")) {
                         System.arraycopy(tg, false, th.e, false, 8);
                         th.g.set(th.c.getCropWindowRect());
                         td.getValues(th.i);
                      }
                      this.b.startAnimation(this.h);
                   }else {
                      this.b.setImageMatrix(this.d);
                   }
                   this.i(false);
                }
             }
             this.d.postScale(f1, f1, c.o(this.g), c.p(this.g));
             this.e();
             goto label_00bf ;
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, CropImageView.class, "48")) {
          return;
       }
       CropImageView ti = this.i;
       if (ti != null && (this.p > null || this.z != null)) {
          ti.recycle();
       }
       this.i = null;
       this.p = 0;
       this.z = null;
       this.A = 1;
       this.k = 0;
       this.B = 0x3f800000;
       this.C = 0;
       this.D = 0;
       this.d.reset();
       this.H = null;
       this.b.setImageBitmap(null);
       this.g();
       return;
    }
    public void d(boolean p0,boolean p1){
       float f5;
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CropImageView.class, "55")) {
          return;
       }
       int width = this.getWidth();
       int height = this.getHeight();
       if (this.i != null && (width > 0 && height > 0)) {
          RectF cropWindowRe = this.c.getCropWindowRect();
          boolean b = false;
          CropImageView uCropImageVi = null;
          if (p0) {
             if (cropWindowRe.left - uCropImageVi >= 0 && (cropWindowRe.top - uCropImageVi >= 0 && (cropWindowRe.right - (float)width > 0 || cropWindowRe.bottom - (float)height > 0))) {
                this.a((float)width, (float)height, b, b);
             }
          }else {
             float f = 0x3f800000;
             if (this.u != null || this.B - f > 0) {
                if (this.B - (float)this.v < 0) {
                   float f1 = (float)width;
                   float f2 = 0x3f000000;
                   if (cropWindowRe.width() - (f1 * f2) < 0) {
                      float f3 = (float)height;
                      if (cropWindowRe.height() - (f2 * f3) < 0) {
                         float f4 = 0x3f23d70a;
                         f5 = Math.min((float)this.v, Math.min((f1 / ((cropWindowRe.width() / this.B) / f4)), (f3 / ((cropWindowRe.height() / this.B) / f4))));
                      label_00a5 :
                         if (this.B - f > 0) {
                            f2 = (float)width;
                            f3 = 0x3f266666;
                            if (cropWindowRe.width() - (f2 * f3) > 0 || cropWindowRe.height() - ((float)height * f3) > 0) {
                               f1 = 0x3f028f5c;
                               f5 = Math.max(f, Math.min((f2 / ((cropWindowRe.width() / this.B) / f1)), ((float)height / ((cropWindowRe.height() / this.B) / f1))));
                            }
                         }
                         if (this.u != null) {
                            f = f5;
                         }
                         if (f - uCropImageVi > 0 && f - this.B) {
                            if (p1) {
                               if (this.h == null) {
                                  this.h = new a(this.b, this.c);
                               }
                               CropImageView th = this.h;
                               CropImageView tg = this.g;
                               uCropImageVi = this.d;
                               Objects.requireNonNull(th);
                               if (!PatchProxy.applyVoidTwoRefs(tg, uCropImageVi, th, a.class, "1")) {
                                  th.reset();
                                  System.arraycopy(tg, b, th.d, b, 8);
                                  th.f.set(th.c.getCropWindowRect());
                                  uCropImageVi.getValues(th.h);
                               }
                            }
                            this.B = f;
                            this.a((float)width, (float)height, true, p1);
                         }
                      }
                   }
                }
                f5 = 0;
                goto label_00a5 ;
             }
          }
       }
    label_0139 :
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, CropImageView.class, "57")) {
          return;
       }
       CropImageView tg = this.g;
       tg[0] = 0;
       tg[1] = 0;
       tg[2] = (float)this.i.getWidth();
       tg = this.g;
       tg[3] = 0;
       tg[4] = (float)this.i.getWidth();
       this.g[5] = (float)this.i.getHeight();
       tg = this.g;
       tg[6] = 0;
       tg[7] = (float)this.i.getHeight();
       this.d.mapPoints(this.g);
       return;
    }
    public final void f(Bitmap p0,int p1,Uri p2,int p3,int p4){
       if (PatchProxy.isSupport(CropImageView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CropImageView.class, "47")) {
             return;
          }
       }
       CropImageView ti = this.i;
       if (ti == null || !ti.equals(p0)) {
          this.b.clearAnimation();
          this.b();
          this.i = p0;
          this.b.setImageBitmap(p0);
          this.z = p2;
          this.p = p1;
          this.A = p3;
          this.k = p4;
          this.a((float)this.getWidth(), (float)this.getHeight(), 1, 0);
          CropImageView tc = this.c;
          if (tc != null) {
             tc.k();
             this.g();
          }
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, CropImageView.class, "59")) {
          return;
       }
       CropImageView tc = this.c;
       if (tc != null) {
          int i = (this.s != null && this.i != null)? 0: 4;
          tc.setVisibility(i);
       }
       return;
    }
    public Pair getAspectRatio(){
       Object obj = PatchProxy.apply(null, this, CropImageView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(Integer.valueOf(this.c.getAspectRatioX()), Integer.valueOf(this.c.getAspectRatioY()));
    }
    public float[] getCropPoints(){
       RectF left;
       RectF top;
       RectF right;
       RectF obj = PatchProxy.apply(null, this, CropImageView.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.getCropWindowRect();
       float[] uofloatArray = new float[]{left,top,right,top,right,obj,left,obj};
       left = obj.left;
       int i = 0;
       top = obj.top;
       right = obj.right;
       obj = obj.bottom;
       this.d.invert(this.e);
       this.e.mapPoints(uofloatArray);
       for (; i < 8; i = i + 1) {
          float f = uofloatArray[i] * (float)this.A;
          uofloatArray[i] = f;
       }
       return uofloatArray;
    }
    public Rect getCropRect(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, CropImageView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i != null) {
          return c.q(this.getCropPoints(), (this.i.getWidth() * this.A), (this.i.getHeight() * this.A), this.c.i(), this.c.getAspectRatioX(), this.c.getAspectRatioY());
       }
       return objArray;
    }
    public CropImageView$CropShape getCropShape(){
       Object obj = PatchProxy.apply(null, this, CropImageView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getCropShape();
    }
    public Bitmap getCroppedImage(){
       Object obj = this;
       Object[] objArray = null;
       Object[] obj1 = PatchProxy.apply(objArray, obj, CropImageView.class, "27");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       CropImageView$RequestSizeOptions nONE = CropImageView$RequestSizeOptions.NONE;
       if (PatchProxy.isSupport(CropImageView.class)) {
          obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(0), Integer.valueOf(0), nONE, this, CropImageView.class, "29");
          if (obj1 != PatchProxyResult.class) {
          label_00c2 :
             return obj1;
          }
       }
       if (obj.i != null) {
          obj.b.clearAnimation();
          int i = 0;
          c$a a = (obj.z != null && (obj.A > 1 || nONE == CropImageView$RequestSizeOptions.SAMPLING))? c.d(this.getContext(), obj.z, this.getCropPoints(), obj.k, (obj.i.getWidth() * obj.A), (obj.i.getHeight() * obj.A), obj.c.i(), obj.c.getAspectRatioX(), obj.c.getAspectRatioY(), i, 0, obj.l, obj.m).a: c.f(obj.i, this.getCropPoints(), obj.k, obj.c.i(), obj.c.getAspectRatioX(), obj.c.getAspectRatioY(), obj.l, obj.m).a;
          objArray = c.w(a, i, 0, nONE);
       }
       obj1 = objArray;
       goto label_00c2 ;
    }
    public void getCroppedImageAsync(){
       WeakReference obj1;
       a uoa;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, CropImageView.class, "30")) {
          return;
       }
       CropImageView$RequestSizeOptions nONE = CropImageView$RequestSizeOptions.NONE;
       int i = 0;
       if (!PatchProxy.isSupport(CropImageView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(i), nONE, this, CropImageView.class, "32")) {
          if (obj.y != null) {
             int i1 = 1;
             if (PatchProxy.isSupport(CropImageView.class)) {
                Object[] objArray1 = new Object[]{Integer.valueOf(i),Integer.valueOf(i),nONE,objArray,objArray,Integer.valueOf(i)};
                if (!PatchProxy.applyVoid(objArray1, obj, CropImageView.class, "49")) {
                }
             }else if(obj.i != null){
                obj.b.clearAnimation();
                CropImageView j = obj.J;
                if (j != null) {
                   objArray = j.get();
                }
                if (objArray != null) {
                   objArray.cancel(i1);
                }
                int i2 = obj.i.getWidth() * obj.A;
                CropImageView a = obj.A;
                int i3 = obj.i.getHeight() * a;
                if (obj.z != null && (a > i1 || nONE == CropImageView$RequestSizeOptions.SAMPLING)) {
                   uoa = v15;
                   a uoa1 = v15;
                   uoa = new a(this, obj.z, this.getCropPoints(), obj.k, i2, i3, obj.c.i(), obj.c.getAspectRatioX(), obj.c.getAspectRatioY(), 0, 0, obj.l, obj.m, nONE, null, null, 0);
                   int i4 = this;
                   i4.J = new WeakReference(uoa1);
                   obj1 = i4;
                }else {
                   Object obj2 = obj;
                   uoa = v13;
                   a uoa2 = v13;
                   uoa = new a(this, obj2.i, this.getCropPoints(), obj2.k, obj2.c.i(), obj2.c.getAspectRatioX(), obj2.c.getAspectRatioY(), 0, 0, obj2.l, obj2.m, nONE, 0, 0, 0);
                   CropImageView uCropImageVi = this;
                   uCropImageVi.J = new WeakReference(uoa2);
                }
                Void[] voidArray = new Void[0];
                obj1.J.get().execute(voidArray);
                this.h();
             label_0149 :
                return;
             }
          }else {
             throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
          }
       }
       obj1 = obj;
       goto label_0149 ;
    }
    public CropImageView$Guidelines getGuidelines(){
       Object obj = PatchProxy.apply(null, this, CropImageView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getGuidelines();
    }
    public int getImageResource(){
       return this.p;
    }
    public Uri getImageUri(){
       return this.z;
    }
    public int getMaxZoom(){
       return this.v;
    }
    public int getRotatedDegrees(){
       return this.k;
    }
    public CropImageView$ScaleType getScaleType(){
       return this.q;
    }
    public Rect getWholeImageRect(){
       Object obj = PatchProxy.apply(null, this, CropImageView.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Rect(0, 0, (this.i.getWidth() * this.A), (this.i.getHeight() * this.A));
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, CropImageView.class, "60")) {
          return;
       }
       int i = 0;
       int i1 = (this.t != null && (this.i != null || (this.I != null || this.J != null)))? 1: 0;
       CropImageView tf = this.f;
       if (!i1) {
          i = 4;
       }
       tf.setVisibility(i);
       return;
    }
    public final void i(boolean p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropImageView.class, "61")) {
          return;
       }
       CropImageView ti = this.i;
       if (ti != null && !p0) {
          float f = (float)(ti.getWidth() * this.A) / c.v(this.g);
          float f1 = (float)(this.i.getHeight() * this.A) / c.r(this.g);
          CropImageView tc = this.c;
          float f2 = (float)this.getWidth();
          float f3 = (float)this.getHeight();
          Objects.requireNonNull(tc);
          if (!PatchProxy.isSupport(CropOverlayView.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f), Float.valueOf(f1), tc, CropOverlayView.class, "14")) {
             CropOverlayView d = tc.d;
             d.e = f2;
             d.f = f3;
             d.k = f;
             d.l = f1;
          }
       }
       ti = this.c;
       float[] uofloatArray = (p0)? null: this.g;
       ti.l(uofloatArray, this.getWidth(), this.getHeight());
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(CropImageView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CropImageView.class, "53")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.n > null && this.o > null) {
          ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
          layoutParams.width = this.n;
          layoutParams.height = this.o;
          this.setLayoutParams(layoutParams);
          if (this.i != null) {
             float f = (float)(p3 - p1);
             float f1 = (float)(p4 - p2);
             this.a(f, f1, 1, 0);
             if (this.E != null) {
                CropImageView tF = this.F;
                if (tF != this.j) {
                   this.k = tF;
                   this.a(f, f1, 1, 0);
                }
                this.d.mapRect(this.E);
                this.c.setCropWindowRect(this.E);
                this.d(0, 0);
                this.c.f();
                this.E = null;
             }else if(this.G != null){
                this.G = false;
                this.d(0, 0);
             }
          }else {
             this.i(1);
          }
       }else {
          this.i(1);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int i1;
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CropImageView.class, "52")) {
          return;
       }
       super.onMeasure(p0, p1);
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       CropImageView ti = this.i;
       if (ti != null) {
          if (!p1) {
             p1 = ti.getHeight();
          }
          int i = Double.POSITIVE_INFINITY;
          double d = (p0 < this.i.getWidth())? (double)p0 / (double)this.i.getWidth(): i;
          double d1 = (p1 < this.i.getHeight())? (double)p1 / (double)this.i.getHeight(): i;
          if (d - i || d1 - i) {
             if (d - d1 <= 0) {
                i = (int)((double)this.i.getHeight() * d);
                i1 = p0;
             }else {
                i1 = (int)((double)this.i.getWidth() * d1);
                i = p1;
             }
          }else {
             i1 = this.i.getWidth();
             i = this.i.getHeight();
          }
          p0 = CropImageView.c(mode, p0, i1);
          p1 = CropImageView.c(mode1, p1, i);
          this.n = p0;
          this.o = p1;
          this.setMeasuredDimension(p0, p1);
       }else {
          this.setMeasuredDimension(p0, p1);
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       int intx;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropImageView.class, "51")) {
          return;
       }
       if (p0 instanceof Bundle) {
          if (this.I == null && (this.z == null && (this.i == null && this.p == null))) {
             Uri parcelable = p0.getParcelable("LOADED_IMAGE_URI");
             if (parcelable != null) {
                String str = p0.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (str != null) {
                   Pair g = c.g;
                   Pair pair = null;
                   Bitmap uBitmap = (g != null && (g.first).equals(str))? c.g.second.get(): pair;
                   c.g = pair;
                   if (uBitmap != null && !uBitmap.isRecycled()) {
                      this.f(uBitmap, 0, parcelable, p0.getInt("LOADED_SAMPLE_SIZE"), 0);
                   }
                }
             label_0068 :
                if (this.z == null) {
                   this.setImageUriAsync(parcelable);
                }
             }else {
                intx = p0.getInt("LOADED_IMAGE_RESOURCE");
                if (intx > 0) {
                   this.setImageResource(intx);
                }else {
                   parcelable = p0.getParcelable("LOADING_IMAGE_URI");
                   if (parcelable != null) {
                      this.setImageUriAsync(parcelable);
                   }
                }
             }
             intx = p0.getInt("DEGREES_ROTATED");
             this.F = intx;
             this.k = intx;
             Rect parcelable1 = p0.getParcelable("INITIAL_CROP_RECT");
             if (parcelable1 != null && (parcelable1.width() > 0 || parcelable1.height() > 0)) {
                this.c.setInitialCropWindowRect(parcelable1);
             }
             RectF parcelable2 = p0.getParcelable("CROP_WINDOW_RECT");
             if (parcelable2 != null && (parcelable2.width() > 0 || parcelable2.height() > 0)) {
                this.E = parcelable2;
             }
             this.c.setCropShape(CropImageView$CropShape.valueOf(p0.getString("CROP_SHAPE")));
             this.u = p0.getBoolean("CROP_AUTO_ZOOM_ENABLED");
             this.v = p0.getInt("CROP_MAX_ZOOM");
             this.l = p0.getBoolean("CROP_FLIP_HORIZONTALLY");
             this.m = p0.getBoolean("CROP_FLIP_VERTICALLY");
          }
       label_00fa :
          super.onRestoreInstanceState(p0.getParcelable("instanceState"));
       }else {
          super.onRestoreInstanceState(p0);
       }
       return;
    }
    public Parcelable onSaveInstanceState(){
       RectF c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, CropImageView.class, "50");
       if (obj != patchProxyRe) {
          return obj;
       }
       WeakReference weakReferenc = 1;
       if (this.z == null && (this.i == null && this.p < weakReferenc)) {
          return super.onSaveInstanceState();
       }
       obj = new Bundle();
       CropImageView tz = this.z;
       if (this.r != null && (tz == null && this.p < weakReferenc)) {
          try{
             Context context = this.getContext();
             CropImageView ti = this.i;
             CropImageView tH = this.H;
             Object obj1 = PatchProxy.applyThreeRefs(context, ti, tH, null, c.class, "17");
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }else if(tH == null){
                tH = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
             }else if(new File(tH.getPath()).exists()){
                weakReferenc = null;
             }
             if (weakReferenc != null) {
                c.z(context, ti, tH, Bitmap$CompressFormat.JPEG, 95);
             }
             objArray = tH;
          }catch(java.lang.Exception e0){
             a.C().z("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e0);
          }
             this.H = objArray;
             tz = objArray;
       }
    label_008c :
       if (tz != null && this.i != null) {
          String str = UUID.randomUUID().toString();
          c.g = new Pair(str, new WeakReference(this.i));
          obj.putString("LOADED_IMAGE_STATE_BITMAP_KEY", str);
       }
       CropImageView tI = this.I;
       if (tI != null) {
          b uob = tI.get();
          if (uob != null) {
             obj.putParcelable("LOADING_IMAGE_URI", uob.b);
          }
       }
       obj.putParcelable("instanceState", super.onSaveInstanceState());
       obj.putParcelable("LOADED_IMAGE_URI", tz);
       obj.putInt("LOADED_IMAGE_RESOURCE", this.p);
       obj.putInt("LOADED_SAMPLE_SIZE", this.A);
       obj.putInt("DEGREES_ROTATED", this.k);
       obj.putParcelable("INITIAL_CROP_RECT", this.c.getInitialCropWindowRect());
       c = c.c;
       c.set(this.c.getCropWindowRect());
       this.d.invert(this.e);
       this.e.mapRect(c);
       obj.putParcelable("CROP_WINDOW_RECT", c);
       obj.putString("CROP_SHAPE", this.c.getCropShape().name());
       obj.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.u);
       obj.putInt("CROP_MAX_ZOOM", this.v);
       obj.putBoolean("CROP_FLIP_HORIZONTALLY", this.l);
       obj.putBoolean("CROP_FLIP_VERTICALLY", this.m);
       return obj;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CropImageView.class, "54")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       boolean b = (p2 > 0 && p3 > 0)? true: false;
       this.G = b;
       return;
    }
    public void setAutoZoomEnabled(boolean p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropImageView.class, "4")) {
          return;
       }
       if (this.u != p0) {
          this.u = p0;
          this.d(false, false);
          this.c.invalidate();
       }
       return;
    }
    public void setCropRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropImageView.class, "25")) {
          return;
       }
       this.c.setInitialCropWindowRect(p0);
       return;
    }
    public void setCropShape(CropImageView$CropShape p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropImageView.class, "3")) {
          return;
       }
       this.c.setCropShape(p0);
       return;
    }
    public void setFixedAspectRatio(boolean p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropImageView.class, "11")) {
          return;
       }
       this.c.setFixedAspectRatio(p0);
       return;
    }
    public void setFlippedHorizontally(boolean p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropImageView.class, "12")) {
          return;
       }
       if (this.l != p0) {
          this.l = p0;
          this.a((float)this.getWidth(), (float)this.getHeight(), true, false);
       }
       return;
    }
    public void setFlippedVertically(boolean p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropImageView.class, "13")) {
          return;
       }
       if (this.m != p0) {
          this.m = p0;
          this.a((float)this.getWidth(), (float)this.getHeight(), true, false);
       }
       return;
    }
    public void setGuidelines(CropImageView$Guidelines p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropImageView.class, "15")) {
          return;
       }
       this.c.setGuidelines(p0);
       return;
    }
    public void setImageBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropImageView.class, "37")) {
          return;
       }
       this.c.setInitialCropWindowRect(null);
       this.f(p0, 0, null, 1, 0);
       return;
    }
    public void setImageResource(int p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CropImageView.class, "39")) {
          return;
       }
       if (p0) {
          this.c.setInitialCropWindowRect(null);
          this.f(BitmapFactory.decodeResource(this.getResources(), p0), p0, null, 1, 0);
       }
       return;
    }
    public void setImageUriAsync(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropImageView.class, "40")) {
          return;
       }
       if (p0 != null) {
          CropImageView tI = this.I;
          RectF rectF = null;
          b uob = (tI != null)? tI.get(): rectF;
          if (uob != null) {
             uob.cancel(true);
          }
          this.b();
          this.E = rectF;
          this.F = 0;
          this.c.setInitialCropWindowRect(rectF);
          WeakReference weakReferenc = new WeakReference(new b(this, p0));
          this.I = weakReferenc;
          Void[] voidArray = new Void[0];
          weakReferenc.get().execute(voidArray);
          this.h();
       }
       return;
    }
    public void setMaxZoom(int p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CropImageView.class, "6")) {
          return;
       }
       if (this.v != p0 && p0 > 0) {
          this.v = p0;
          this.d(false, false);
          this.c.invalidate();
       }
       return;
    }
    public void setMultiTouchEnabled(boolean p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropImageView.class, "5")) {
          return;
       }
       if (this.c.m(p0)) {
          this.d(false, false);
          this.c.invalidate();
       }
       return;
    }
    public void setOnCropImageCompleteListener(CropImageView$c p0){
       this.y = p0;
    }
    public void setOnSetCropOverlayReleasedListener(CropImageView$d p0){
       this.w = p0;
    }
    public void setOnSetImageUriCompleteListener(CropImageView$e p0){
       this.x = p0;
    }
    public void setRotatedDegrees(int p0){
       boolean b = this;
       int i = p0;
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), b, CropImageView.class, "9")) {
          return;
       }
       CropImageView k = b.k;
       if (k != i) {
          i = i - k;
          if (PatchProxy.isSupport(CropImageView.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), b, CropImageView.class, "42") && b.i != null)) {
             i = (i < 0)? (i % 360) + 360: i % 360;
             int i1 = 1;
             int i2 = 0;
             k = (!b.c.i() && (i <= 45 || (i < 135 || (i > 215 && i < 305))))? 1: null;
             RectF c = c.c;
             c.set(b.c.getCropWindowRect());
             float f = (k)? c.height(): c.width();
             float f1 = 2.00f;
             f = f / f1;
             float f2 = (k)? c.width(): c.height();
             f2 = f2 / f1;
             if (k) {
                k = b.l;
                b.l = b.m;
                b.m = k;
             }
             b.d.invert(b.e);
             float[] d = c.d;
             d[i2] = c.centerX();
             d[i1] = c.centerY();
             d[2] = 0;
             d[3] = 0;
             d[4] = 0x3f800000;
             d[5] = 0;
             b.e.mapPoints(d);
             b.k = (b.k + i) % 360;
             b.a((float)this.getWidth(), (float)this.getHeight(), i1, i2);
             float[] e = c.e;
             b.d.mapPoints(e, d);
             float f3 = (float)((double)b.B / Math.sqrt((Math.pow((double)(e[4] - e[2]), 2.00f) + Math.pow((double)(e[5] - e[3]), 2.00f))));
             b.B = f3;
             b.B = Math.max(f3, 0x3f800000);
             b.a((float)this.getWidth(), (float)this.getHeight(), true, false);
             b.d.mapPoints(e, d);
             double d1 = Math.sqrt((Math.pow((double)(e[4] - e[2]), 2.00f) + Math.pow((double)(e[5] - e[3]), 2.00f)));
             float f4 = (float)((double)f * d1);
             f3 = (float)((double)f2 * d1);
             c.set((e[0] - f4), (e[1] - f3), (e[0] + f4), (e[1] + f3));
             b.c.k();
             b.c.setCropWindowRect(c);
             b.a((float)this.getWidth(), (float)this.getHeight(), 1, false);
             b.d(false, false);
             b.c.f();
          }
       }
       return;
    }
    public void setSaveBitmapToInstanceState(boolean p0){
       this.r = p0;
    }
    public void setScaleType(CropImageView$ScaleType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropImageView.class, "1")) {
          return;
       }
       if (p0 != this.q) {
          this.q = p0;
          this.B = 0x3f800000;
          this.D = 0;
          this.C = 0;
          this.c.k();
          this.requestLayout();
       }
       return;
    }
    public void setShowCropOverlay(boolean p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropImageView.class, "21")) {
          return;
       }
       if (this.s != p0) {
          this.s = p0;
          this.g();
       }
       return;
    }
    public void setShowProgressBar(boolean p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropImageView.class, "20")) {
          return;
       }
       if (this.t != p0) {
          this.t = p0;
          this.h();
       }
       return;
    }
    public void setSnapRadius(float p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CropImageView.class, "19")) {
          return;
       }
       if (p0 >= 0) {
          this.c.setSnapRadius(p0);
       }
       return;
    }
}
