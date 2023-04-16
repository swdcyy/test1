package com.facebook.react.views.deractors.BackgroundDecorView;
import com.facebook.react.views.view.ReactViewGroup;
import android.content.Context;
import com.facebook.react.uimanager.ViewManager;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Canvas;
import java.lang.Integer;
import java.lang.Math;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import android.graphics.Path;
import ze.z;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import ze.n0;
import ze.m0;
import we.a;
import android.widget.FrameLayout$LayoutParams;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.views.deractors.BackgroundReactImageView;
import com.facebook.react.bridge.ReadableType;
import java.lang.CharSequence;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.util.Objects;
import ze.d;
import android.widget.ImageView;
import java.util.Arrays;

public class BackgroundDecorView extends ReactViewGroup	// class@0013a1
{
    public View b;
    public ViewManager c;
    public View d;
    public Paint e;
    public boolean f;
    public int[] g;
    public float[] h;
    public int i;
    public boolean j;
    public String k;
    public float[] l;
    public ReadableArray m;

    public void BackgroundDecorView(Context p0,ViewManager p1){
       super(p0);
       this.c = null;
       this.d = null;
       this.e = null;
       this.g = null;
       this.h = null;
       this.i = 180;
       this.k = null;
       this.l = null;
       this.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       this.f = false;
       this.j = false;
       this.c = p1;
       this.setBackgroundColor(false);
    }
    public static BackgroundDecorView i(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BackgroundDecorView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getTag(0x7f0a03a3);
    }
    public void dispatchDraw(Canvas p0){
       BackgroundDecorView k;
       float[] uofloatArray1;
       int i5;
       int i6;
       float f1;
       float f3;
       float f4;
       float[] uofloatArray2;
       float f6;
       float[] uofloatArray3;
       float[] uofloatArray = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj, uofloatArray, BackgroundDecorView.class, "12")) {
          return;
       }
       if (uofloatArray.f != null && (uofloatArray.e != null && uofloatArray.g != null)) {
          int i = 4;
          int i1 = 0;
          int i2 = 2;
          int i3 = 3;
          int i4 = 0;
          if (uofloatArray.j != null) {
             k = uofloatArray.k;
             uofloatArray1 = PatchProxy.applyOneRefs(k, uofloatArray, BackgroundDecorView.class, "13");
             if (uofloatArray1 != patchProxyRe) {
             }else if(k == null){
                uofloatArray1 = new float[i]{0,0,0,0};
             }else {
                f3 = (float)this.getWidth();
                f4 = (float)this.getHeight();
                int i7 = -1;
                switch (k.hashCode()){
                    case 0x9bb2a0d2:
                      if (k.equals("bottomLeft")) {
                         i7 = 0;
                      }
                      break;
                    case 0xbc0b22fc:
                      if (k.equals("topLeft")) {
                         i7 = 1;
                      }
                      break;
                    case 0xc5af9dc7:
                      if (k.equals("topRight")) {
                         i7 = 2;
                      }
                      break;
                    case 0xdaf7dab1:
                      if (k.equals("bottomRight")) {
                         i7 = 3;
                      }
                      break;
                    default:
                }
             label_007e :
                if (i7) {
                   if (i7 != 1) {
                      if (i7 != i2) {
                         if (i7 != i3) {
                            uofloatArray1 = new float[i]{0,0,0,0};
                         }else {
                            uofloatArray2 = new float[i];
                            uofloatArray2[i1] = i4;
                            uofloatArray2[1] = i4;
                            uofloatArray2[i2] = f3;
                            uofloatArray2[i3] = f4;
                         }
                      }else {
                         uofloatArray2 = new float[i];
                         uofloatArray2[i1] = i4;
                         uofloatArray2[1] = f4;
                         uofloatArray2[i2] = f3;
                         uofloatArray2[i3] = i4;
                      }
                   }else {
                      uofloatArray2 = new float[i];
                      uofloatArray2[i1] = f3;
                      uofloatArray2[1] = f4;
                      uofloatArray2[i2] = i4;
                      uofloatArray2[i3] = i4;
                   }
                }else {
                   uofloatArray2 = new float[i];
                   uofloatArray2[i1] = f3;
                   uofloatArray2[1] = i4;
                   uofloatArray2[i2] = i4;
                   uofloatArray2[i3] = f4;
                }
                uofloatArray1 = uofloatArray2;
             }
             uofloatArray.l = uofloatArray1;
          }else {
             k = uofloatArray.i;
             if (PatchProxy.isSupport(BackgroundDecorView.class)) {
                uofloatArray1 = PatchProxy.applyOneRefs(Integer.valueOf(k), uofloatArray, BackgroundDecorView.class, "14");
                if (uofloatArray1 != patchProxyRe) {
                }else {
                label_00d8 :
                   i5 = 360;
                   i6 = k % i5;
                   f4 = (float)this.getWidth();
                   float f5 = (float)this.getHeight();
                   if (i6) {
                      int i8 = 90;
                      if (i6 != i8) {
                         double d = -0.00f;
                         if (i6 != d) {
                            BackgroundDecorView uBackgroundD = 270;
                            if (i6 != uBackgroundD) {
                               if (i6 < i8 && i6 > 0) {
                                  f3 = (float)Math.tan((double)uofloatArray.j(i6)) * f5;
                                  f6 = f5 - ((float)Math.tan((double)uofloatArray.j((i8 - i6))) * f4);
                                  if (f3 - f4 <= 0) {
                                     f4 = f3;
                                     f6 = 0;
                                  }
                                  f3 = f4;
                               }else if(i6 > i8 && i6 < d){
                                  f3 = (float)Math.tan((double)uofloatArray.j((i6 - 180))) * f5;
                                  f6 = (float)Math.tan((double)uofloatArray.j((i6 - i8))) * f4;
                                  if (f6 - f5 > 0) {
                                     f4 = f3;
                                  }else {
                                     f5 = f6;
                                  }
                               }else if(i6 > d && i6 < uBackgroundD){
                                  f3 = f4 - ((float)Math.tan((double)uofloatArray.j((i6 - 180))) * f5);
                                  f6 = (float)Math.tan((double)uofloatArray.j((uBackgroundD - i6))) * f4;
                                  if (f3 - i4 < 0) {
                                     f5 = f6;
                                     i5 = 0;
                                  label_019b :
                                     f1 = uofloatArray1;
                                     f6 = f5;
                                     f5 = 0;
                                  }else {
                                     goto label_019b ;
                                  }
                               }else if(i6 > uBackgroundD && i6 < i5){
                                  f3 = f4 - ((float)Math.tan((double)uofloatArray.j((i6 - 360))) * f5);
                                  f6 = f5 - ((float)Math.tan((double)uofloatArray.j((i6 - uBackgroundD))) * f4);
                                  f1 = f4;
                                  if (f3 - i4 < 0) {
                                     i5 = 0;
                                  }else {
                                     f6 = 0;
                                  }
                               }else {
                                  f4 = 0;
                                  f5 = 0;
                               }
                               f3 = f4;
                               uofloatArray1 = null;
                               goto label_019b ;
                               uofloatArray1 = new float[i];
                               uofloatArray1[i1] = i4;
                               uofloatArray1[1] = f5;
                               uofloatArray1[i2] = f3;
                               uofloatArray1[i3] = f6;
                            }else {
                               uofloatArray3 = new float[i];
                               uofloatArray3[i1] = f4;
                               uofloatArray3[1] = i4;
                               uofloatArray3[i2] = i4;
                               uofloatArray3[i3] = i4;
                            }
                         }else {
                            uofloatArray1 = new float[i];
                            uofloatArray1[i1] = i4;
                            uofloatArray1[1] = i4;
                            uofloatArray1[i2] = i4;
                            uofloatArray1[i3] = f5;
                         }
                      }else {
                         uofloatArray3 = new float[i];
                         uofloatArray3[i1] = i4;
                         uofloatArray3[1] = i4;
                         uofloatArray3[i2] = f4;
                         uofloatArray3[i3] = i4;
                      }
                      uofloatArray1 = uofloatArray3;
                   }else {
                      uofloatArray1 = new float[i];
                      uofloatArray1[i1] = i4;
                      uofloatArray1[1] = f5;
                      uofloatArray1[i2] = i4;
                      uofloatArray1[i3] = i4;
                   }
                }
             }else {
                goto label_00d8 ;
             }
             uofloatArray.l = uofloatArray1;
          }
          if (uofloatArray.h == null) {
             i5 = 0;
             k = uofloatArray.g;
             while (i5 < k.length) {
                i = 1 / k.length;
                float f = (float)i;
                i6 = k.length - 1;
                if (i5 == i6) {
                   uofloatArray.h[i5] = 0x3f800000;
                }else {
                   i4 = i5 + 1;
                   f1 = (float)i4 * f;
                   uofloatArray.h[i5] = f1;
                }
                i5 = i5 + 1;
             }
          }
          if (uofloatArray.h != null) {
             k = uofloatArray.l;
             LinearGradient linearGradie = new LinearGradient(k[i1], k[1], k[i2], k[i3], uofloatArray.g, uofloatArray.h, Shader$TileMode.CLAMP);
             uofloatArray.e.setShader(i5);
             ReactViewGroup mReactBackgr = uofloatArray.mReactBackgroundDrawable;
             if (mReactBackgr != null) {
                ReactViewBackgroundDrawable f2 = mReactBackgr.f;
                if (f2 != null) {
                   obj.drawPath(f2, uofloatArray.e);
                }
             }
             p0.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), uofloatArray.e);
          }
       }
    label_023c :
       super.dispatchDraw(p0);
       return;
    }
    public View getOriginView(){
       return this.b;
    }
    public final z h(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BackgroundDecorView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new z(JavaOnlyMap.of(p0));
    }
    public float j(int p0){
       return (((float)p0 * 0x40490fdb) / 180.00f);
    }
    public void k(ReadableArray p0){
       String str;
       Object[] objArray1;
       ReadableArray array;
       int i1;
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundDecorView.class, "4")) {
          return;
       }
       boolean b = false;
       int i = 0;
       Object[] objArray = null;
       while (i < p0.size()) {
          ReadableMap map = p0.getMap(i);
          if (map.hasKey("uri")) {
             if (!PatchProxy.applyVoidOneRefs(map, this, BackgroundDecorView.class, "5") && this.c != null) {
                this.f = b;
                str = 2;
                if (this.d == null && !PatchProxy.applyVoid(objArray, this, BackgroundDecorView.class, "6")) {
                   View view = this.c.createView(this.getContext(), objArray, objArray, objArray);
                   this.d = view;
                   this.addView(view, b, new FrameLayout$LayoutParams(-1, -1));
                   this.d.layout(b, b, this.getWidth(), this.getHeight());
                   objArray1 = new Object[str];
                   objArray1[b] = "fadeDuration";
                   objArray1[1] = Integer.valueOf(b);
                   this.c.updateProperties(this.d, this.h(objArray1));
                }
                if (this.d != null) {
                   map.toString();
                   this.toString();
                   objArray1 = new Object[str];
                   String str1 = "resizeMode";
                   objArray1[b] = str1;
                   objArray1[1] = "cover";
                   this.c.updateProperties(this.d, this.h(objArray1));
                   objArray1 = new Object[str];
                   objArray1[b] = "src";
                   Object[] objArray2 = new Object[1];
                   objArray2[b] = map;
                   objArray1[1] = JavaOnlyArray.of(objArray2);
                   this.c.updateProperties(this.d, this.h(objArray1));
                   this.d.setBackgroundSource(map);
                   Object[] objArray3 = new Object[str];
                   objArray3[b] = str1;
                   objArray3[1] = "backgroundImage";
                   this.c.updateProperties(this.d, this.h(objArray3));
                }
             }
          }else {
             String str2 = "colors";
             if (map.hasKey(str2) && (PatchProxy.applyVoidOneRefs(map, this, BackgroundDecorView.class, "8") || (map.getType(str2) == ReadableType.Array && map.getArray(str2).size() > 1))) {
                this.f = true;
                array = map.getArray(str2);
                int[] ointArray = new int[array.size()];
                this.g = ointArray;
                i1 = 0;
                while (i1 < array.size()) {
                   if (array.getType(i1) == ReadableType.Number) {
                      this.g[i1] = (int)array.getDouble(i1);
                   }
                   i1 = i1 + 1;
                }
             }
          label_0125 :
             str2 = "stops";
             if (map.hasKey(str2) && (PatchProxy.applyVoidOneRefs(map, this, BackgroundDecorView.class, "9") || (map.getType(str2) != ReadableType.Array || (map.getArray(str2).size() > 1 && map.getArray(str2).size() == this.g.length)))) {
                this.f = true;
                array = map.getArray(str2);
                float[] uofloatArray = new float[array.size()];
                this.h = uofloatArray;
                i1 = 0;
                while (i1 < array.size()) {
                   str = null;
                   if (array.getType(i1) == ReadableType.String) {
                      f = Float.valueOf((array.getString(i1)).replace("%", "")).floatValue() / 100.00f;
                   }else if(array.getType(i1) == ReadableType.Number){
                      f = (float)array.getDouble(i1);
                   }
                   if (i1 > 0) {
                      BackgroundDecorView th = this.h;
                      int i2 = i1 - 1;
                      if (f - th[i2] < 0) {
                         th[i1] = th[i2];
                      label_01b1 :
                         i1 = i1 + 1;
                      }
                   }
                   this.h[i1] = f;
                   goto label_01b1 ;
                }
             }
          label_01b4 :
             str2 = "direction";
             if (map.hasKey(str2) && !PatchProxy.applyVoidOneRefs(map, this, BackgroundDecorView.class, "10")) {
                this.f = true;
                if (map.getType(str2) == ReadableType.Number) {
                   this.j = b;
                   this.i = (int)map.getDouble(str2);
                }else if(map.getType(str2) == ReadableType.String){
                   this.j = true;
                   this.k = map.getString(str2);
                }
             }
          }
       label_01eb :
          i = i + 1;
       }
       if (this.f != null && !PatchProxy.applyVoid(objArray, this, BackgroundDecorView.class, "11")) {
          if (this.e == null) {
             this.e = new Paint();
          }
          this.toString();
          this.invalidate();
          BackgroundDecorView td = this.d;
          if (td != null) {
             this.removeView(td);
             this.d = objArray;
          }
       }
    label_0218 :
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(BackgroundDecorView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, BackgroundDecorView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       BackgroundDecorView tb = this.b;
       if (tb != null) {
          tb.layout(0, 0, this.getWidth(), this.getHeight());
       }
       tb = this.d;
       if (tb != null) {
          tb.layout(0, 0, this.getWidth(), this.getHeight());
       }
       if (this.f == null) {
          tb = this.m;
          if (tb != null) {
             this.k(tb);
          }
       }
       return;
    }
    public void setBackgroundParams(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundDecorView.class, "3")) {
          return;
       }
       if (p0 != null && p0.size()) {
          StringBuilder str = "setBackgroundParams sources = "+p0+" this = "+this;
          this.h = null;
          this.g = null;
          this.l = null;
          this.i = 180;
          this.j = false;
          this.f = false;
          this.b.setBackgroundColor(false);
          this.setBackgroundColor(false);
          this.m = p0;
          this.k(p0);
       }
       return;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(BackgroundDecorView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BackgroundDecorView.class, "15")) {
          return;
       }
       super.setBorderRadius(p0);
       if (this.c != null) {
          BackgroundDecorView td = this.d;
          if (td != null) {
             Objects.requireNonNull(td);
             if (PatchProxy.isSupport(BackgroundReactImageView.class) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(p0), td, BackgroundReactImageView.class, "2") && !d.a(td.W0, p0))) {
                td.W0 = p0;
                td.invalidate();
             }
          }
       }
       return;
    }
    public void setBorderRadius(float p0,int p1){
       if (PatchProxy.isSupport(BackgroundDecorView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, BackgroundDecorView.class, "16")) {
          return;
       }
       super.setBorderRadius(p0, p1);
       if (this.c != null) {
          BackgroundDecorView td = this.d;
          if (td != null) {
             Objects.requireNonNull(td);
             if (!PatchProxy.isSupport(BackgroundReactImageView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), td, BackgroundReactImageView.class, "3")) {
                if (td.X0 == null) {
                   float[] uofloatArray = new float[4];
                   td.X0 = uofloatArray;
                   Arrays.fill(uofloatArray, Float.NaN);
                }
                if (!d.a(td.X0[p1], p0)) {
                   td.X0[p1] = p0;
                   td.invalidate();
                }
             }
          }
       }
       return;
    }
    public void setBorderRadius(float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundDecorView.class, "17")) {
          return;
       }
       for (int i = 0; i < p0.length; i = i + 1) {
          super.setBorderRadius(p0[i], i);
       }
       if (this.c != null) {
          BackgroundDecorView td = this.d;
          if (td != null) {
             Objects.requireNonNull(td);
             if (!PatchProxy.applyVoidOneRefs(p0, td, BackgroundReactImageView.class, "4") && !Arrays.equals(td.X0, p0)) {
                if (td.X0 == null) {
                   float[] uofloatArray = new float[4];
                   td.X0 = uofloatArray;
                   Arrays.fill(uofloatArray, Float.NaN);
                }
                td.X0 = p0;
                td.invalidate();
             }
          }
       }
       return;
    }
}
