package com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$g;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.widget.HorizontalScrollView;
import tyc.t1;
import java.lang.Runnable;

public class GzonePagerSlidingTabStrip$g	// class@00185d
{
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public final GzonePagerSlidingTabStrip f;

    public void GzonePagerSlidingTabStrip$g(GzonePagerSlidingTabStrip p0,boolean p1,boolean p2,int p3,GzonePagerSlidingTabStrip$a p4){
       this.f = p0;
       super();
       this.a = 0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
    }
    public void a(int p0){
       GzonePagerSlidingTabStrip$g og = GzonePagerSlidingTabStrip$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "2")) {
          return;
       }
       if (p0 != this.a) {
          this.b(p0);
          this.a = p0;
       }
       return;
    }
    public void b(int p0){
       GzonePagerSlidingTabStrip$g og = GzonePagerSlidingTabStrip$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "1")) {
          return;
       }
       if (p0 && this.b != null) {
          this.a = p0;
          int childCount = this.f.B1.getChildCount();
          if (!childCount) {
             return;
          }else {
             GzonePagerSlidingTabStrip$g tf = this.f;
             GzonePagerSlidingTabStrip w1 = tf.W1;
             if (w1 <= null) {
                w1 = this.e;
             }
             float f = (float)w1;
             float f1 = (float)tf.Z1 * 0x3f800000;
             int i = 0;
             int i1 = 0;
             int i2 = 0;
             float f2 = 0;
             int i3 = 1;
             float f3 = 0;
             while (true) {
                if (i2 < childCount) {
                   View childAt = this.f.B1.getChildAt(i2);
                   View view = null;
                   if (childAt instanceof TextView) {
                      view = childAt;
                   }else {
                      childAt = childAt.findViewById(R.id.tab_text);
                      if (childAt instanceof TextView) {
                         view = childAt;
                      }
                   }
                   if (view == null || view.getText() == null) {
                      return;
                   }else {
                      float f4 = view.getPaint().measureText(view.getText().toString());
                      f2 = f2 + f4;
                      if (this.c != null) {
                         if (i3) {
                            f = f + f4;
                            f4 = f - (float)p0;
                            if (f4 - f1 > 0) {
                               i3 = 0;
                            }
                         }
                         if (i3) {
                            int i4 = childCount - 1;
                            if (i2 < i4) {
                               GzonePagerSlidingTabStrip$g te = this.e;
                               int i5 = te * 2;
                               float f5 = (float)i5 + f;
                               f5 = f5 + f1;
                               float f6 = (float)p0;
                               if (f5 - f6 >= 0) {
                                  f6 = f6 - f;
                                  f6 = f6 + f1;
                                  if (f6 - i > 0) {
                                     if (i2 <= 0) {
                                     label_00c0 :
                                        float f7 = (float)p0 - f2;
                                        tf = this.f;
                                        w1 = tf.W1;
                                        GzonePagerSlidingTabStrip gzonePagerSl = (w1 > null)? w1: 0;
                                        f7 = f7 - (float)gzonePagerSl;
                                        gzonePagerSl = tf.X1;
                                        GzonePagerSlidingTabStrip gzonePagerSl1 = (gzonePagerSl > null)? gzonePagerSl: 0;
                                        f7 = f7 - (float)gzonePagerSl1;
                                        childCount = childCount * 2;
                                        if (w1 > null) {
                                           childCount = childCount - 1;
                                        }
                                        if (gzonePagerSl > null) {
                                           childCount = childCount - 1;
                                        }
                                        if (childCount > 0) {
                                           i1 = (int)(f7 / (float)childCount);
                                        }
                                        GzonePagerSlidingTabStrip$g te1 = this.e;
                                        if (i1 <= te1) {
                                           i1 = (int)((float)te1 + f3);
                                        }
                                        if (this.d == i1) {
                                           return;
                                        }else {
                                           this.d = i1;
                                           tf.setTabPadding(i1);
                                           if (this.f.isInLayout()) {
                                              this.f.post(new t1(this));
                                              break ;
                                           }else {
                                              this.f.B1.requestLayout();
                                              break ;
                                           }
                                        }
                                     }else {
                                        i3 = i2 * 2;
                                        int i6 = (this.f.W1 > null)? 0: 1;
                                        i3 = i3 + i6;
                                        f6 = f6 / (float)i3;
                                        f3 = f6;
                                     }
                                  }
                                  i3 = 0;
                               }else {
                                  i4 = te * 2;
                                  f = f + (float)i4;
                               }
                            }
                         }
                      }
                   label_00bc :
                      i2 = i2 + 1;
                   }
                }else {
                   goto label_00c0 ;
                }
             }
          }
       }
       return;
    }
}
