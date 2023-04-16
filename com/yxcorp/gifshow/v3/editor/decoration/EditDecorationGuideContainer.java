package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationGuideContainer;
import wpc.u;
import xpc.b$b;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationGuideContainer$mGuideLineHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import xpc.b;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.decoration.guideline.GuideLineView;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.graphics.Rect;
import kotlin.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.Log;
import usd.f;
import usd.p;
import java.lang.Comparable;
import android.graphics.PointF;
import android.view.View;
import com.yxcorp.gifshow.v3.f;
import java.lang.Math;
import java.lang.Number;
import usd.k;
import android.widget.RelativeLayout;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import wpc.v;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.decoration.guideline.FakeFeedComponent;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class EditDecorationGuideContainer extends FrameLayout implements u, b$b	// class@000f05
{
    public final String b;
    public boolean c;
    public boolean d;
    public v e;
    public FakeFeedComponent f;
    public boolean g;
    public final p h;
    public HashMap i;

    public void EditDecorationGuideContainer(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = "EditDecorationGuideContainer";
       this.g = true;
       this.h = s.c(new EditDecorationGuideContainer$mGuideLineHelper$2(this));
       this.i(p0);
    }
    public void EditDecorationGuideContainer(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = "EditDecorationGuideContainer";
       this.g = true;
       this.h = s.c(new EditDecorationGuideContainer$mGuideLineHelper$2(this));
       this.i(p0);
    }
    public void EditDecorationGuideContainer(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = "EditDecorationGuideContainer";
       this.g = true;
       this.h = s.c(new EditDecorationGuideContainer$mGuideLineHelper$2(this));
       this.i(p0);
    }
    public void a(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(EditDecorationGuideContainer.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, EditDecorationGuideContainer.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.b, "updatePreviewAreaTransform translateX = "+p0+", translateY = "+p1+", scaleX = "+p2+", scaleY = "+p3, objArray);
       b mGuideLineHe = this.getMGuideLineHelper();
       Objects.requireNonNull(mGuideLineHe);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), mGuideLineHe, b.class, "13")) {
          mGuideLineHe = mGuideLineHe.c;
          mGuideLineHe.h = (int)p0;
          mGuideLineHe.i = (int)p1;
          mGuideLineHe.j = p2;
          mGuideLineHe.k = p3;
       }
       return;
    }
    public void b(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationGuideContainer.class, "10")) {
          return;
       }
       a.p(p0, "previewAreaRect");
       Object[] objArray = new Object[0];
       a.D().w(this.b, "updatePreviewAreaRect width = "+p0.width()+", height = "+p0.height(), objArray);
       b mGuideLineHe = this.getMGuideLineHelper();
       Objects.requireNonNull(mGuideLineHe);
       if (!PatchProxy.applyVoidOneRefs(p0, mGuideLineHe, b.class, "12")) {
          a.p(p0, "rect");
          mGuideLineHe.c.setPreviewAreaRect(p0);
       }
       return;
    }
    public Pair c(MotionEvent p0,float p1,float p2,Rect p3,boolean p4){
       String obj;
       b obj1;
       b uob1;
       b this;
       b uob2;
       Pair pair;
       PatchProxyResult patchProxyRe1;
       float f2;
       float f3;
       object oobject2;
       Pair pair1;
       float rawX;
       float f5;
       float f6;
       float f7;
       PointF pointF;
       int this1;
       object oobject = p0;
       float f = p1;
       float f1 = p2;
       object oobject1 = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       boolean i4 = 0;
       int i5 = 1;
       if (PatchProxy.isSupport(EditDecorationGuideContainer.class)) {
          Object[] objArray = new Object[i];
          objArray[i4] = oobject;
          objArray[i5] = Float.valueOf(p1);
          objArray[i3] = Float.valueOf(p2);
          objArray[i2] = oobject1;
          objArray[i1] = Boolean.valueOf(p4);
          obj = PatchProxy.apply(objArray, this, EditDecorationGuideContainer.class, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }else {
          this1 = this;
       }
       obj = "event";
       a.p(oobject, obj);
       String str = "paintRect";
       a.p(oobject1, str);
       if (!this.h() || !this.g()) {
          return new Pair(Float.valueOf(p1), Float.valueOf(p2));
       }else {
          b mGuideLineHe = this.getMGuideLineHelper();
          Objects.requireNonNull(mGuideLineHe);
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray1 = new Object[i];
             objArray1[i4] = oobject;
             objArray1[i5] = Float.valueOf(p1);
             objArray1[i3] = Float.valueOf(p2);
             objArray1[i2] = oobject1;
             objArray1[4] = Boolean.valueOf(p4);
             obj1 = PatchProxy.apply(objArray1, mGuideLineHe, uob, "14");
             if (obj1 != patchProxyRe) {
             }else {
             label_008e :
                a.p(oobject, obj);
                a.p(oobject1, str);
                if (PatchProxy.isSupport(uob)) {
                   uob1 = uob;
                   obj1 = mGuideLineHe;
                   this = obj1;
                   uob2 = obj1;
                   pair = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), p3, this, b.class, "16");
                   if (pair != patchProxyRe) {
                      patchProxyRe1 = patchProxyRe;
                   }else {
                   label_00c5 :
                      RectF previewAreaR1 = uob2.c.getPreviewAreaRect();
                      f2 = previewAreaR1.centerX() - previewAreaR1.left;
                      f7 = previewAreaR1.centerY() - previewAreaR1.top;
                      int i6 = p3.centerX();
                      this1 = p3.centerY();
                      StringBuilder str1 = "guideArea="+previewAreaR1;
                      obj = ", ";
                      String str2 = "drawerCenterX=";
                      Log.g("EditDecorationGuideLineHelper", str1+", centerX="+f2+", centerY="+f7+obj+str2+i6+", drawerCenterY="+this1+", guideAreaWidth="+uob2.b);
                      f5 = (float)uob2.b;
                      if (f2 - f5 < 0 || f7 - f5 < 0) {
                         patchProxyRe1 = patchProxyRe;
                         pair = new Pair(Float.valueOf(p1), Float.valueOf(p2));
                      }else {
                         f uof = p.d((f7 - f5), (f5 + f7));
                         float f8 = (float)uob2.b;
                         patchProxyRe1 = patchProxyRe;
                         float f9 = f2 - f8;
                         f uof1 = p.d(f9, (f8 + f2));
                         Log.g("EditDecorationGuideLineHelper", "horizontalGuideRange="+uof+", verticalGuideRange="+uof1);
                         b d = uob2.d;
                         if (d == null) {
                            float f10 = (float)this1;
                            f8 = f10 - f1;
                            if (uof.contains(Float.valueOf(f8))) {
                               Log.g("EditDecorationGuideLineHelper", "drawerCenterY="+this1+", distanceY="+f1+", drawerCenterY - "+"distanceY="+f8);
                               uob2.d = new PointF(p0.getRawX(), p0.getRawY());
                               f7 = f10 - f7;
                               if (!PatchProxy.applyVoid(null, uob2, uob1, "6")) {
                                  if (uob2.c.getVisibility()) {
                                     uob2.c.setVisibility(0);
                                  }
                                  this = uob2.c;
                                  if (this.m == null) {
                                     this.setDrawHorizontalGuideLine(true);
                                     f.P(20);
                                     Log.g("EditDecorationGuideLineHelper", "show Horizontal guide line");
                                  }
                               }
                               Log.g("EditDecorationGuideLineHelper", "enter Horizontal guide area, hBlockingPoint="+uob2.d+obj+"resultDistanceY="+f7);
                            }else {
                               f7 = f1;
                            }
                         }else {
                            f7 = Math.abs((p0.getRawY() - d.y));
                            Log.g("EditDecorationGuideLineHelper", "in horizontal guide area...event.rawY="+p0.getRawY()+", hPoint.y="+d.y+obj+"distance="+f7);
                            if (f7 - (float)uob2.b < 0) {
                               Log.g("EditDecorationGuideLineHelper", "in horizontal guide area...freeze");
                               f7 = 0;
                            }else {
                               f7 = d.y - p0.getRawY();
                               uob2.c();
                               Log.g("EditDecorationGuideLineHelper", "out horizontal guide area...resultDistanceY="+f7);
                            }
                         }
                         this = uob2.e;
                         if (this == null) {
                            f3 = (float)i6;
                            float this2 = f3 - f;
                            if (uof1.contains(Float.valueOf(this2))) {
                               Log.g("EditDecorationGuideLineHelper", str2+i6+", distanceX="+f+", drawerCenterX - "+"distanceX="+this2);
                               uob2.e = new PointF(p0.getRawX(), p0.getRawY());
                               f3 = f3 - f2;
                               if (!PatchProxy.applyVoid(null, uob2, uob1, "7")) {
                                  if (uob2.c.getVisibility()) {
                                     uob2.c.setVisibility(0);
                                  }
                                  b c = uob2.c;
                                  if (c.n == null) {
                                     c.setDrawVerticalGuideLine(true);
                                     f.P(20);
                                     Log.g("EditDecorationGuideLineHelper", "show vertical guide line");
                                  }
                               }
                               Log.g("EditDecorationGuideLineHelper", "enter vertical guide area, "+"vBlockingPoint="+uob2.e+", resultDistanceX="+f3);
                            }else {
                               f3 = f;
                            }
                         }else {
                            f2 = Math.abs((p0.getRawX() - this.x));
                            Log.g("EditDecorationGuideLineHelper", "in vertical guide area...event.rawX="+p0.getRawX()+obj+"vPoint.x="+this.x+", distance="+f2);
                            if (f2 - (float)uob2.b < 0) {
                               Log.g("EditDecorationGuideLineHelper", "in vertical guide area...freeze");
                               f3 = 0;
                            }else {
                               f3 = this.x - p0.getRawX();
                               uob2.d();
                               Log.g("EditDecorationGuideLineHelper", "out vertical guide area...resultDistanceX="+f3);
                            }
                         }
                         pair = new Pair(Float.valueOf(f3), Float.valueOf(f7));
                      }
                   }
                }else {
                   uob1 = uob;
                   uob2 = mGuideLineHe;
                   String str3 = 1;
                   goto label_00c5 ;
                }
                f2 = pair.getFirst().floatValue();
                f3 = pair.getSecond().floatValue();
                if (PatchProxy.isSupport(uob1)) {
                   Object[] objArray2 = new Object[]{p0,Float.valueOf(f2),Float.valueOf(f3),oobject2,Boolean.valueOf(p4)};
                   oobject2 = p3;
                   pair1 = PatchProxy.apply(objArray2, uob2, uob1, "15");
                   if (pair1 != patchProxyRe1) {
                   }else {
                   label_03c6 :
                      uob = uob2.c;
                      if (uob.g == null) {
                         pair1 = new Pair(Float.valueOf(f2), Float.valueOf(f3));
                      }else {
                         int[] airWallLimit = uob.getAirWallLimitsAsToPreview();
                         RectF previewAreaR = uob2.c.getPreviewAreaRect();
                         if (airWallLimit.length == 4) {
                            i4 = 0;
                            float f4 = (float)i4;
                            if (previewAreaR.width() - f4 > 0 && previewAreaR.height() - f4 > 0) {
                               k ok = new k((airWallLimit[i4] - uob2.b), (airWallLimit[i4] + uob2.b));
                               k ok1 = new k((airWallLimit[1] - uob2.b), (airWallLimit[1] + uob2.b));
                               k ok2 = new k((airWallLimit[2] - uob2.b), (airWallLimit[2] + uob2.b));
                               k ok3 = new k((airWallLimit[3] - uob2.b), (airWallLimit[3] + uob2.b));
                               obj1 = uob2.f;
                               if (obj1 == null) {
                                  if (ok.q((int)((float)oobject2.left - f2))) {
                                     if (!p4) {
                                        rawX = p0.getRawX();
                                        f4 = p0.getRawY();
                                     }else {
                                        rawX = (float)oobject2.left;
                                        f4 = (float)p3.centerY();
                                     }
                                     uob2.f = new PointF(rawX, f4);
                                     f5 = (!p4)? (float)(oobject2.left - airWallLimit[0]): f2;
                                     uob2.a(true, true, (p4 ^ 0x01));
                                  }else {
                                  label_0499 :
                                     f5 = f2;
                                  }
                               }else if(p4){
                                  rawX = Math.abs(((float)oobject2.left - obj1.x));
                                  if ((float)oobject2.left - obj1.x > 0 && rawX - (float)uob2.b > 0) {
                                     uob2.a(false, 1, (p4 ^ 0x01));
                                     goto label_0499 ;
                                  }else {
                                     goto label_0499 ;
                                  }
                               }else if(Math.abs((p0.getRawX() - obj1.x)) - (float)uob2.b < 0){
                                  pointF = null;
                               }else {
                                  f5 = obj1.x - p0.getRawX();
                                  uob2.a(false, 1, (p4 ^ 0x01));
                               }
                               b h = uob2.h;
                               if (h == null) {
                                  if (ok2.q((int)((previewAreaR.width() - (float)oobject2.right) - f2))) {
                                     if (!p4) {
                                        rawX = p0.getRawX();
                                        f4 = p0.getRawY();
                                     }else {
                                        rawX = (float)oobject2.right;
                                        f4 = (float)p3.centerY();
                                     }
                                     uob2.h = new PointF(rawX, f4);
                                     if (!p4) {
                                        f2 = (previewAreaR.width() - (float)oobject2.right) - (float)airWallLimit[2];
                                     }
                                     uob2.a(true, 3, (p4 ^ 0x01));
                                  }else {
                                     f2 = f5;
                                  }
                               }else if(p4){
                                  f5 = Math.abs(((float)oobject2.right - h.x));
                                  if ((float)oobject2.right - h.x < 0 && f5 - (float)uob2.b > 0) {
                                     uob2.a(false, 3, (p4 ^ 0x01));
                                  }
                               }else if(Math.abs((p0.getRawX() - h.x)) - (float)uob2.b < 0){
                                  f2 = 0;
                               }else {
                                  f2 = h.x - p0.getRawX();
                                  uob2.a(false, 3, (p4 ^ 0x01));
                               }
                               obj1 = uob2.g;
                               if (obj1 == null) {
                                  if (ok1.q((int)((float)oobject2.top - f3))) {
                                     if (!p4) {
                                        rawX = p0.getRawX();
                                        f4 = p0.getRawY();
                                     }else {
                                        rawX = (float)p3.centerX();
                                        f4 = (float)oobject2.top;
                                     }
                                     uob2.g = new PointF(rawX, f4);
                                     if (!p4) {
                                        i4 = 1;
                                        f5 = (float)(oobject2.top - airWallLimit[i4]);
                                     }else {
                                        i4 = true;
                                        f5 = f3;
                                     }
                                     uob2.a(i4, 2, (p4 ^ 0x01));
                                  }else {
                                  label_05a9 :
                                     f5 = f3;
                                  }
                               }else if(p4){
                                  rawX = Math.abs(((float)oobject2.top - obj1.y));
                                  if ((float)oobject2.top - obj1.y > 0 && rawX - (float)uob2.b > 0) {
                                     uob2.a(false, 2, (p4 ^ 0x01));
                                     goto label_05a9 ;
                                  }else {
                                     goto label_05a9 ;
                                  }
                               }else if(Math.abs((p0.getRawY() - obj1.y)) - (float)uob2.b < 0){
                                  pointF = null;
                               }else {
                                  pointF = obj1.y - p0.getRawY();
                                  uob2.a(false, 2, (p4 ^ 0x01));
                               }
                               h = uob2.i;
                               if (h == null) {
                                  if (ok3.q((int)((previewAreaR.height() - (float)oobject2.bottom) - f3))) {
                                     if (!p4) {
                                        rawX = p0.getRawX();
                                        f4 = p0.getRawY();
                                     }else {
                                        rawX = (float)p3.centerX();
                                        f4 = (float)oobject2.bottom;
                                     }
                                     uob2.i = new PointF(rawX, f4);
                                     if (!p4) {
                                        f3 = (previewAreaR.height() - (float)oobject2.bottom) - (float)airWallLimit[3];
                                     }
                                     f6 = f3;
                                     uob2.a(true, 4, (p4 ^ 0x01));
                                  }else {
                                     f6 = f5;
                                  }
                               }else if(p4){
                                  f7 = Math.abs(((float)oobject2.bottom - h.y));
                                  if ((float)oobject2.bottom - h.y < 0 && f7 - (float)uob2.b > 0) {
                                     uob2.a(false, 4, (p4 ^ 0x01));
                                  }
                                  f6 = f3;
                               }else if(Math.abs((p0.getRawY() - h.y)) - (float)uob2.b < 0){
                                  f6 = 0;
                               }else {
                                  f6 = h.y - p0.getRawY();
                                  uob2.a(false, 4, (p4 ^ 0x01));
                               }
                               obj1 = new Pair(Float.valueOf(f2), Float.valueOf(f6));
                            }
                         }
                         pair1 = new Pair(Float.valueOf(f2), Float.valueOf(f3));
                      }
                   }
                }else {
                   oobject2 = p3;
                   goto label_03c6 ;
                }
                obj1 = pair1;
             }
          }else {
             goto label_008e ;
          }
          return obj1;
       }
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(EditDecorationGuideContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditDecorationGuideContainer.class, "16")) {
          return;
       }
       int i = 0;
       boolean b = (this.getMGuideLineHelper().e(3) || this.getMGuideLineHelper().e(4))? true: false;
       Object[] objArray = new Object[i];
       a.D().w(this.b, "onAirWallVisibilityChanged invoked, isVisible = "+p0+", "+"shouldShowFakeComponent = "+b+", mFakeFeedComponentEnabled = "+this.g, objArray);
       EditDecorationGuideContainer tf = this.f;
       if (tf != null) {
          if (!b || this.g == null) {
             i = 8;
          }
          tf.setVisibility(i);
       }
       return;
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(EditDecorationGuideContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditDecorationGuideContainer.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.b, "updateFakeComponentAvailability invoked, enable = "+p0, objArray);
       this.g = p0;
       return;
    }
    public int[] f(boolean p0,int p1){
       b obj;
       int[] ointArray;
       int[] ointArray1;
       int[] tEXT_STICKER;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(EditDecorationGuideContainer.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, EditDecorationGuideContainer.class, "14");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.getMGuideLineHelper();
       Objects.requireNonNull(obj);
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          ointArray = PatchProxy.applyOneRefs(Integer.valueOf(p1), obj, uob, "3");
          if (ointArray != patchProxyRe) {
          }else {
          label_003e :
             int i = 0;
             Object[] objArray = new Object[i];
             String str = "EditDecorationGuideLineHelper";
             a.D().w(str, "updateAirWallLimits with airWallType = "+p1, objArray);
             RectF editRootView = obj.c.getEditRootViewRect();
             RectF previewAreaR = obj.c.getPreviewAreaRect();
             if (!p1) {
                obj.c.setAirWallUsability(i);
                ointArray = new int[4]{0,0,0,0};
             }else {
                float f = previewAreaR.width() / previewAreaR.height();
                if (PatchProxy.isSupport(uob)) {
                   ointArray1 = PatchProxy.applyTwoRefs(Integer.valueOf(p1), Float.valueOf(f), obj, uob, "4");
                   if (ointArray1 != patchProxyRe) {
                   }else {
                   label_009b :
                      Object[] objArray3 = new Object[i];
                      a.D().w(str, "getStandardLimits with airWallType = "+p1+", mediaWHRatio = "+f, objArray3);
                      if (!p1) {
                         ointArray1 = EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_NONE;
                         a.o(ointArray1, "TEXT_STICKER_LIMIT_NONE");
                      }else {
                         String str1 = "TEXT_STICKER_LIMIT_LARGE";
                         String str2 = "TEXT_STICKER_LIMIT_SMALL";
                         if (p1 == 3 || p1 == 1) {
                            if (obj.f(f, obj.a)) {
                               tEXT_STICKER = EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_LARGE;
                               a.o(tEXT_STICKER, str1);
                            }else {
                               tEXT_STICKER = EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_SMALL;
                               a.o(tEXT_STICKER, str2);
                            }
                         }else if(PostExperimentUtils.i1()){
                            tEXT_STICKER = EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_SMALL;
                            a.o(tEXT_STICKER, str2);
                         }else if(obj.f(f, obj.a)){
                            tEXT_STICKER = EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_LARGE;
                            a.o(tEXT_STICKER, str1);
                         }else {
                            tEXT_STICKER = EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_SMALL;
                            a.o(tEXT_STICKER, str2);
                         }
                         ointArray1 = tEXT_STICKER;
                      }
                   }
                }else {
                   goto label_009b ;
                }
                Object[] objArray1 = new Object[i];
                a.D().w(str, "updateAirWallLimits standardLimits = "+ointArray1, objArray1);
                obj.c.setAirWallUsability(1);
                ointArray = new int[]{Math.max((int)(previewAreaR.left - editRootView.left), ointArray1[i]) - (int)(previewAreaR.left - editRootView.left),Math.max((int)(previewAreaR.top - editRootView.top), ointArray1[1]) - (int)(previewAreaR.top - editRootView.top),Math.max((int)(editRootView.right - previewAreaR.right), ointArray1[2]) - (int)(editRootView.right - previewAreaR.right),Math.max((int)(editRootView.bottom - previewAreaR.bottom), ointArray1[3]) - (int)(editRootView.bottom - previewAreaR.bottom)};
                obj = obj.c;
                Objects.requireNonNull(obj);
                if (!PatchProxy.applyVoidOneRefs(ointArray, obj, GuideLineView.class, "2")) {
                   a.p(ointArray, "limits");
                   Object[] objArray2 = new Object[i];
                   a.D().w("GuideLineView", "updateAirWallLimitsAsToPreview with limits = "+ointArray, objArray2);
                   GuideLineView f1 = obj.f;
                   if (4 == f1.length) {
                      f1 = f1.length;
                      for (; i < f1; i = i + 1) {
                         obj.f[i] = ointArray[i];
                      }
                   }
                }
             }
          }
       }else {
          goto label_003e ;
       }
       return ointArray;
    }
    public final boolean g(){
       Object[] objArray = null;
       v obj = PatchProxy.apply(objArray, this, EditDecorationGuideContainer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getDecorationGuideEventHost();
       if (obj != null) {
          objArray = obj.getActiveDrawer();
       }
       if (objArray instanceof EditDecorationBaseDrawer) {
          Object[] objArray1 = objArray;
          if (objArray1.isNewTextType()) {
             return objArray1.mGuideLineEnabled;
          }
       }
       boolean b = false;
       boolean b1 = (objArray != null)? objArray.isHorizontalMoveEnable(): false;
       boolean b2 = (objArray != null)? objArray.isVerticalMoveEnable(): false;
       if (b1 || b2) {
          b = true;
       }
       return b;
    }
    public final v getDecorationGuideEventHost(){
       Object[] objArray = null;
       EditDecorationGuideContainer obj = PatchProxy.apply(objArray, this, EditDecorationGuideContainer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          return obj;
       }
       ViewParent parent = this.getParent();
       if (!parent instanceof View) {
          parent = objArray;
       }
       View view = (parent != null)? parent.findViewById(R.id.new_text_decoration_editor_view): objArray;
       if (view instanceof v) {
          objArray = view;
       }
       this.e = objArray;
       return objArray;
    }
    public final b getMGuideLineHelper(){
       Object obj = PatchProxy.apply(null, this, EditDecorationGuideContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final boolean h(){
       boolean b = (this.c != null || this.d != null)? true: false;
       return b;
    }
    public final void i(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationGuideContainer.class, "2")) {
          return;
       }
       this.c = PostExperimentUtils.z();
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, EditDecorationGuideContainer.class, "13")) {
          return;
       }
       if (this.h() && this.g()) {
          this.getMGuideLineHelper().b();
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, EditDecorationGuideContainer.class, "6")) {
          return;
       }
       super.onAttachedToWindow();
       Object[] objArray = new Object[0];
       a.D().w(this.b, "onAttachedToWindow", objArray);
       if (this.h()) {
          FakeFeedComponent uFakeFeedCom = this.findViewById(R.id.decoration_guide_fake_feed_component);
          this.f = uFakeFeedCom;
          if (uFakeFeedCom != null) {
             uFakeFeedCom.b();
          }
          v decorationGu = this.getDecorationGuideEventHost();
          if (decorationGu != null) {
             decorationGu.a(this);
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, EditDecorationGuideContainer.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       Object[] objArray = new Object[0];
       a.D().w(this.b, "onDetachedFromWindow", objArray);
       if (this.h()) {
          v decorationGu = this.getDecorationGuideEventHost();
          if (decorationGu != null) {
             decorationGu.b(this);
          }
       }
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditDecorationGuideContainer.class, "5")) {
          return;
       }
       super.onFinishInflate();
       int i = 0;
       if (this.h()) {
          if (!PatchProxy.applyVoid(objArray, this, EditDecorationGuideContainer.class, "9")) {
             Object[] objArray1 = new Object[i];
             a.D().w(this.b, "addGuideLineView invoked", objArray1);
             FrameLayout$LayoutParams layoutParams = this.generateDefaultLayoutParams();
             layoutParams.width = -1;
             layoutParams.height = -1;
             this.addView(this.getMGuideLineHelper().c, layoutParams);
             this.getMGuideLineHelper().b();
             EditDecorationGuideContainer tf = this.f;
             if (tf != null) {
                tf.setVisibility(8);
             }
          }
       }else {
          i = 8;
       }
       this.setVisibility(i);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(EditDecorationGuideContainer.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, EditDecorationGuideContainer.class, "8")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       p1 = 0;
       Object[] objArray = new Object[p1];
       a.D().w(this.b, "onSizeChanged w = "+p0+", h = "+p1+", oldw = "+p2+", oldh = "+p3, objArray);
       if (this.h()) {
          Object[] objArray1 = new Object[p1];
          a.D().w(this.b, "onSizeChanged guideEnabled, update", objArray1);
          b mGuideLineHe = this.getMGuideLineHelper();
          Objects.requireNonNull(mGuideLineHe);
          if (!PatchProxy.applyVoid(null, mGuideLineHe, b.class, "1")) {
             mGuideLineHe.c.c();
          }
       }
       return;
    }
}
