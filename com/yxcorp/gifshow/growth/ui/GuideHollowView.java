package com.yxcorp.gifshow.growth.ui.GuideHollowView;
import android.view.View;
import android.content.Context;
import java.lang.String;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.widget.TextView;
import android.graphics.Xfermode;
import java.lang.Integer;

public final class GuideHollowView extends View	// class@001581
{
    public int b;
    public int c;
    public PointF d;
    public Paint e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final PorterDuffXfermode j;
    public WeakReference k;
    public boolean l;
    public final int[] m;
    public final PointF n;

    public void GuideHollowView(Context p0){
       super(p0);
       this.b = Color.parseColor("#B3000000");
       this.c = Color.parseColor("#1A000000");
       this.d = new PointF(0, 0);
       this.e = new Paint(1);
       this.f = 50.00f;
       this.j = new PorterDuffXfermode(PorterDuff$Mode.CLEAR);
       this.l = true;
       int[] ointArray = new int[2];
       this.m = ointArray;
       this.n = this.d;
       this.e.setColor(-1);
       this.e.setStyle(Paint$Style.FILL);
    }
    public final int getGuideBackgroundColor(){
       return this.b;
    }
    public final int getGuideHollowColor(){
       return this.c;
    }
    public final PointF getHollowLocationInParent(){
       return this.n;
    }
    public void onDraw(Canvas p0){
       float f1;
       int i6;
       float f7;
       int i8;
       float f = this;
       View obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, f, GuideHollowView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (obj == null) {
          return;
       }
       GuideHollowView k = f.k;
       int i = 0;
       if (k != null) {
          View view = k.get();
          if (!PatchProxy.applyVoidOneRefs(view, f, GuideHollowView.class, "5")) {
             if (view == null) {
                f.f = 0;
             }else {
                f.getLocationOnScreen(f.m);
                GuideHollowView m = f.m;
                int i2 = m[i];
                int i3 = 1;
                int i4 = m[i3];
                view.getLocationOnScreen(m);
                m = f.m;
                float f2 = (float)m[i];
                float f3 = (float)m[i3];
                float f4 = 2.00f;
                if (f.l != null) {
                   float f5 = (float)view.getWidth() / f4;
                   float f6 = (float)view.getHeight() / f4;
                   f.d.set((((f2 + f5) - (float)i2) + f.h), (((f3 + f6) - (float)i4) + f.i));
                   f.f = (float)Math.sqrt((double)((f5 * f5) + (f6 * f6))) + f.g;
                }else {
                   int width = view.getWidth();
                   int height = view.getHeight();
                   int paddingLeft = view.getPaddingLeft();
                   int paddingRight = view.getPaddingRight();
                   int paddingTop = view.getPaddingTop();
                   int paddingBotto = view.getPaddingBottom();
                   ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                   if (layoutParams != null) {
                      ViewGroup$LayoutParams width1 = layoutParams.width;
                      ViewGroup$LayoutParams height1 = layoutParams.height;
                      int i5 = -2;
                      if (width1 != i5 || height1 != i5) {
                         layoutParams.width = i5;
                         layoutParams.height = i5;
                         view.setLayoutParams(layoutParams);
                         i6 = i4;
                         i5 = 0;
                         f7 = f3;
                         view.measure(View$MeasureSpec.makeMeasureSpec(i5, i5), View$MeasureSpec.makeMeasureSpec(i5, i5));
                         i4 = view.getMeasuredHeight();
                         int i7 = width - view.getMeasuredWidth();
                         if (i7 > 0) {
                            if (view instanceof TextView) {
                               obj = view;
                               i8 = i2;
                               if ((obj.getGravity() & 0x01) == 1) {
                                  i7 = i7 / 2;
                               }else {
                                  i2 = 5;
                                  if ((obj.getGravity() & i2) == i2) {
                                     paddingLeft = paddingLeft + i7;
                                  }else {
                                     i2 = 3;
                                     if ((obj.getGravity() & i2) == i2) {
                                     label_00f5 :
                                        paddingRight = paddingRight + i7;
                                     }
                                  }
                               }
                            }else {
                               i8 = i2;
                               i7 = i7 / 2;
                            }
                            paddingLeft = paddingLeft + i7;
                            goto label_00f5 ;
                         }else {
                            i8 = i2;
                         }
                         int i1 = height - i4;
                         if (i1 > 0) {
                            if (view instanceof TextView) {
                               View view1 = view;
                               i4 = 16;
                               if ((view1.getGravity() & i4) == i4) {
                                  i1 = i1 / 2;
                               }else {
                                  i4 = 80;
                                  if ((view1.getGravity() & i4) == i4) {
                                     paddingTop = paddingTop + i1;
                                  }else {
                                     i2 = 48;
                                     if ((view1.getGravity() & i2) == i2) {
                                     label_0128 :
                                        paddingBotto = paddingBotto + i1;
                                     }
                                  }
                               }
                            }else {
                               i1 = i1 / 2;
                            }
                            paddingTop = paddingTop + i1;
                            goto label_0128 ;
                         }
                         layoutParams.width = width1;
                         layoutParams.height = height1;
                         view.setLayoutParams(layoutParams);
                      label_0137 :
                         f = (float)((width - paddingLeft) - paddingRight) / 2.00f;
                         f3 = (float)((height - paddingTop) - paddingBotto) / 2.00f;
                         f1 = this;
                         f1.d.set(((((f2 + f) + (float)paddingLeft) - (float)i8) + f1.h), ((((f7 + f3) + (float)paddingTop) - (float)i6) + f1.i));
                         f1.f = (float)Math.sqrt((double)((f * f) + (f3 * f3))) + f1.g;
                      label_016f :
                         i1 = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
                         Canvas uCanvas = p0;
                         uCanvas.drawColor(f1.b);
                         if (f1.f - (float)0 > 0) {
                            f1.e.setXfermode(f1.j);
                            f1.e.setColor(-1);
                            k = f1.d;
                            uCanvas.drawCircle(k.x, k.y, f1.f, f1.e);
                            f1.e.setXfermode(null);
                            f1.e.setColor(f1.c);
                            k = f1.d;
                            uCanvas.drawCircle(k.x, k.y, f1.f, f1.e);
                            f1.e.setColor(-1);
                         }
                         uCanvas.restoreToCount(i1);
                         return;
                      }
                   }
                   f7 = f3;
                   i8 = i2;
                   i6 = i4;
                   goto label_0137 ;
                }
             }
          }
       }
       f1 = f;
       goto label_016f ;
    }
    public final void setGuideBackgroundColor(int p0){
       if (PatchProxy.isSupport(GuideHollowView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuideHollowView.class, "1")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
    public final void setGuideHollowColor(int p0){
       if (PatchProxy.isSupport(GuideHollowView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuideHollowView.class, "2")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
}
