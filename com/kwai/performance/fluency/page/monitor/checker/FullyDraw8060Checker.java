package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker;
import ff7.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$a;
import nsd.u;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$mCalculatorHandler$1;
import android.os.Handler;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import android.os.Looper;
import android.view.ViewGroup;
import msd.l;
import kotlin.jvm.internal.a;
import hf7.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$start$1;
import java.lang.Runnable;
import hf7.a$a;
import msd.t;
import java.lang.Integer;
import java.util.Map;
import gf7.a;
import zsd.q;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calPixelArray$$inlined$apply$lambda$1;
import msd.a;
import android.view.View;
import qrd.l1;
import kotlin.jvm.internal.Ref$IntRef;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$isViewGroupValid$1;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$3;
import androidx.viewpager.widget.ViewPager;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$4;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$5;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.CharSequence;
import android.widget.EditText;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$8;
import android.view.ViewParent;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$checkParentRadio$1;
import java.lang.NullPointerException;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$9;
import kotlin.Pair;
import java.lang.Number;
import android.app.Application;
import yf7.k;
import android.app.Activity;
import yf7.p;
import android.view.Window;
import qrd.r0;
import yf7.h;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$hasFinishTag$1;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$hasInvalidTag$1;
import gf7.h;
import java.lang.Class;
import android.content.res.Resources;
import android.os.Message;

public final class FullyDraw8060Checker implements a	// class@0010b4
{
    public l a;
    public a b;
    public WeakReference c;
    public Map d;
    public Pair e;
    public final FullyDraw8060Checker$mCalculatorHandler$1 f;
    public static final String g;
    public static final FullyDraw8060Checker$a h;

    static {
       FullyDraw8060Checker$a uoa = new FullyDraw8060Checker$a(null);
       FullyDraw8060Checker.h = uoa;
       FullyDraw8060Checker.g = "PageMonitor_check_fully_draw"+uoa.hashCode();
    }
    public void FullyDraw8060Checker(){
       super();
       this.c = new WeakReference(null);
       this.d = new HashMap();
       this.f = new FullyDraw8060Checker$mCalculatorHandler$1(this, Monitor_ThreadKt.c().getLooper());
    }
    public void a(ViewGroup p0,l p1){
       a.p(p0, "rootView");
       this.stop();
       this.a = p1;
       this.c = new WeakReference(p0);
       a.c(a.d, new FullyDraw8060Checker$start$1(this), null, 2, null);
    }
    public final void b(ViewGroup p0,t p1){
       int[] ointArray = this.d.get(Integer.valueOf(p0.hashCode()));
       if (ointArray != null) {
       }else {
          ointArray = new int[2];
       }
       int i = 0;
       int i1 = (ointArray[i] > 0)? ointArray[i]: 0;
       int i2 = ((p0.getWidth() + i1) > this.f())? this.f(): p0.getWidth() + i1;
       int i3 = 1;
       if (ointArray[i3] > 0) {
          i = ointArray[i3];
       }
       int i4 = ((p0.getHeight() + i) > this.e())? this.e(): p0.getHeight() + i;
       FullyDraw8060Checker tb = this.b;
       if (tb != null) {
          q.Y(tb.e);
          tb.a(new FullyDraw8060Checker$calPixelArray$$inlined$apply$lambda$1(i1, i, i2, i4));
       }
       int[] ointArray1 = new int[i2];
       int[] ointArray2 = new int[i4];
       p1.invoke(ointArray1, ointArray2, Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i4));
       return;
    }
    public final void c(ViewGroup p0){
       FullyDraw8060Checker a;
       int b1;
       int i3;
       View view1;
       int i4;
       int i6;
       int i7;
       Ref$IntRef intRef4;
       View view2;
       Ref$IntRef intRef5;
       int i8;
       FullyDraw8060Checker$calculateFillRate$8 uocalculateF3;
       View view3;
       Ref$IntRef element;
       Ref$IntRef element1;
       Ref$IntRef element2;
       Ref$IntRef element3;
       ViewParent parent;
       float f;
       float f1;
       float f2;
       FullyDraw8060Checker b3;
       FullyDraw8060Checker$checkParentRadio$1 uocheckParen;
       CharSequence text;
       FullyDraw8060Checker uFullyDraw80 = this;
       ViewGroup viewGroup = p0;
       a.p(viewGroup, "rootView");
       FullyDraw8060Checker b = uFullyDraw80.b;
       if (b != null) {
          int i = 1;
          if (b == null || (b.g() == i || (p0.getWidth() <= 0 || (p0.getHeight() > 0 && !this.h(p0))))) {
             if (this.g(p0)) {
                b = uFullyDraw80.b;
                if (b != null) {
                   b.j();
                   a = uFullyDraw80.a;
                   if (a != null) {
                      a.invoke(b);
                   }
                }
                this.stop();
                return;
             }else {
                Ref$IntRef intRef = new Ref$IntRef();
                int i1 = 0;
                intRef.element = i1;
                Ref$IntRef intRef1 = new Ref$IntRef();
                intRef1.element = i1;
                Ref$IntRef intRef2 = new Ref$IntRef();
                intRef2.element = i1;
                Ref$IntRef intRef3 = new Ref$IntRef();
                intRef3.element = i1;
                int[] tag = viewGroup.getTag(R.id.view_status_tag);
                if (tag != null && tag instanceof String) {
                   b1 = a.g("valid", tag);
                   if (b1) {
                      a = uFullyDraw80.b;
                      if (a != null) {
                         a.a(new FullyDraw8060Checker$isViewGroupValid$1(viewGroup));
                      }
                   }
                }else {
                   b1 = false;
                }
                if (b1) {
                   tag = uFullyDraw80.d.get(Integer.valueOf(p0.hashCode()));
                   if (tag != null) {
                      int i2 = (tag[i1] > 0)? tag[i1]: 0;
                      intRef.element = i2;
                      i2 = ((i2 + p0.getWidth()) > this.f())? this.f(): intRef.element + p0.getWidth();
                      intRef1.element = i2;
                      b1 = (tag[i] > 0)? tag[i]: 0;
                      intRef2.element = b1;
                      b1 = ((b1 + p0.getHeight()) > this.e())? this.e(): intRef2.element + p0.getHeight();
                      intRef3.element = b1;
                      uFullyDraw80.i(viewGroup, intRef.element, intRef1.element);
                      uFullyDraw80.j(viewGroup, intRef2.element, intRef3.element);
                      i3 = 1;
                   label_00f2 :
                      FullyDraw8060Checker b2 = uFullyDraw80.b;
                      if (b2 != null) {
                         FullyDraw8060Checker$calculateFillRate$3 uocalculateF = v6;
                         FullyDraw8060Checker$calculateFillRate$3 uocalculateF1 = v6;
                         uocalculateF = new FullyDraw8060Checker$calculateFillRate$3(p0, intRef, intRef2, intRef1, intRef3);
                         b2.a(uocalculateF1);
                      }
                      View view = null;
                      if (viewGroup instanceof ViewPager) {
                         view1 = viewGroup.getChildAt(viewGroup.getCurrentItem());
                         i4 = 1;
                      }else {
                         view1 = view;
                         i4 = 0;
                      }
                      int childCount = p0.getChildCount();
                      int i5 = 0;
                      while (true) {
                         if (i5 < childCount) {
                            b = uFullyDraw80.b;
                            if (b != null && (b == null || b.g() != i)) {
                               View childAt = viewGroup.getChildAt(i5);
                               if (childAt != null && (childAt.getHeight() <= 0 || childAt.getWidth() <= 0)) {
                               label_0340 :
                                  i6 = i5;
                                  i7 = childCount;
                                  intRef4 = intRef;
                                  view2 = view1;
                                  intRef5 = intRef1;
                                  i8 = 0;
                               }else {
                                  tag = uFullyDraw80.d.get(Integer.valueOf(childAt.hashCode()));
                                  if (tag != null) {
                                     i8 = 0;
                                     int i9 = (tag[i8] > 0)? tag[i8]: 0;
                                     int i10 = p0.getWidth() + i9;
                                     i10 = (i10 > this.f())? this.f(): p0.getWidth() + i9;
                                     int i11 = i10;
                                     i10 = (tag[i] > 0)? tag[i]: 0;
                                     b1 = p0.getHeight() + i10;
                                     b1 = (b1 > this.e())? this.e(): p0.getHeight() + i10;
                                     i = b1;
                                     if (i4) {
                                        b1 = a.g(childAt, view1) ^ 0x01;
                                        if (b1) {
                                           b = uFullyDraw80.b;
                                           if (b != null) {
                                              view2 = view1;
                                              i6 = i5;
                                              i7 = childCount;
                                              FullyDraw8060Checker$calculateFillRate$4 uocalculateF2 = new FullyDraw8060Checker$calculateFillRate$4(childAt, p0, i9, i10, i11, i);
                                              b.a(viewGroup);
                                           }else {
                                              i6 = i5;
                                              i7 = childCount;
                                              view2 = view1;
                                           }
                                        }else {
                                        label_01cd :
                                           int i12 = i10;
                                           int i13 = i11;
                                           i6 = i5;
                                           i7 = childCount;
                                           view2 = view1;
                                           if (i3 && i9 > intRef.element) {
                                              i10 = i13;
                                              if (i10 < intRef1.element) {
                                                 i11 = i12;
                                                 if (i11 >= intRef2.element || i <= intRef3.element) {
                                                 }
                                              }else {
                                                 i11 = i12;
                                              }
                                           }else {
                                              i11 = i12;
                                              i10 = i13;
                                           }
                                        }
                                     }else {
                                        goto label_01cd ;
                                     }
                                  label_01fe :
                                     intRef4 = intRef;
                                     intRef5 = intRef1;
                                  label_0200 :
                                     childAt = 1;
                                  }else {
                                     goto label_0340 ;
                                  }
                               }
                               i5 = i6 + 1;
                               viewGroup = p0;
                               intRef = intRef4;
                               intRef1 = intRef5;
                               view1 = view2;
                               childCount = i7;
                               i = 1;
                            }
                         }
                      }
                   }
                }
                i3 = 0;
                goto label_00f2 ;
             }
          }
       }
    label_0358 :
       return;
    }
    public final Pair d(){
       View decorView;
       FullyDraw8060Checker te = this.e;
       if (te != null) {
          if (te != null && !te.getFirst().intValue()) {
             te = this.e;
             if (te != null && !te.getSecond().intValue()) {
             label_0022 :
                Activity uActivity = p.a(k.b());
                if (uActivity != null) {
                   Window window = uActivity.getWindow();
                   if (window != null) {
                      decorView = window.getDecorView();
                      if (decorView != null) {
                         decorView = decorView.findViewById(0x1020002);
                      label_0041 :
                         int i = 0;
                         int width = (decorView != null)? decorView.getWidth(): 0;
                         Integer integer = Integer.valueOf(width);
                         if (decorView != null) {
                            i = decorView.getHeight();
                         }
                         this.e = r0.a(integer, Integer.valueOf(i));
                      }
                   }
                }
                decorView = null;
                goto label_0041 ;
             }
          }
       }else {
          goto label_0022 ;
       }
       te = this.e;
       a.m(te);
       return te;
    }
    public final int e(){
       return this.d().getSecond().intValue();
    }
    public final int f(){
       return this.d().getFirst().intValue();
    }
    public final boolean g(View p0){
       FullyDraw8060Checker tag = p0.getTag(R.id.view_status_tag);
       if (tag == null || (!tag instanceof String || !a.g(tag, "FinalFinish"))) {
          return false;
       }
       h.a("PageMonitor FullyDraw8060Checker", "calculateFillRate finish of "+p0+" VIEW TAG is "+tag);
       tag = this.b;
       if (tag != null) {
          tag.a(new FullyDraw8060Checker$hasFinishTag$1(p0));
       }
       return true;
    }
    public final boolean h(View p0){
       Object tag = p0.getTag(R.id.view_status_tag);
       boolean b = false;
       if (tag != null && tag instanceof String) {
          if (!a.g("invalid", tag) && (a.g("ignore", tag) || a.g("error", tag))) {
             b = true;
          }
          if (b) {
             FullyDraw8060Checker tb = this.b;
             if (tb != null) {
                tb.a(new FullyDraw8060Checker$hasInvalidTag$1(p0, tag));
             }
          }
       }
    label_0035 :
       return b;
    }
    public final void i(View p0,int p1,int p2){
       FullyDraw8060Checker tb = this.b;
       if (tb != null && !tb.h()) {
          while (p1 < p2 && !tb.h()) {
             try{
                if (tb.f().f()[p1] != 1) {
                   tb.f().f()[p1] = 1;
                   h oh = tb.f();
                   int i = oh.e() + 1;
                   oh.a = i;
                }
             }catch(java.lang.ArrayIndexOutOfBoundsException e1){
                h.b("PageMonitor FullyDraw8060Checker", p0.getClass().getName()+' '+p0.getResources().getResourceEntryName(p0.getId())+" cal X error : "+e1);
             }
             p1++;
          }
       }
       return;
    }
    public final void j(View p0,int p1,int p2){
       FullyDraw8060Checker tb = this.b;
       if (tb != null && !tb.i()) {
          while (p1 < p2 && !tb.i()) {
             try{
                if (tb.f().h()[p1] != 1) {
                   tb.f().h()[p1] = 1;
                   h oh = tb.f();
                   int i = oh.g() + 1;
                   oh.b = i;
                }
             }catch(java.lang.ArrayIndexOutOfBoundsException e1){
                h.b("PageMonitor FullyDraw8060Checker", p0.getClass().getName()+' '+p0.getResources().getResourceEntryName(p0.getId())+" cal Y error : "+e1);
             }
             p1++;
          }
       }
       return;
    }
    public final void k(){
       Message message = this.f.obtainMessage();
       a.o(message, "mCalculatorHandler.obtainMessage\(\)");
       message.obj = FullyDraw8060Checker.g;
       this.f.sendMessage(message);
    }
    public final void l(ViewGroup p0){
       int[] ointArray = new int[2];
       p0.getLocationOnScreen(ointArray);
       this.d.put(Integer.valueOf(p0.hashCode()), ointArray);
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          if (childAt == null || (childAt.getHeight() > 0 && childAt.getWidth() > 0)) {
             if (childAt instanceof ViewGroup) {
                this.l(childAt);
             }
             int[] ointArray1 = new int[2];
             childAt.getLocationOnScreen(ointArray1);
             this.d.put(Integer.valueOf(childAt.hashCode()), ointArray1);
          }
       label_0049 :
          i = i + 1;
       }
       return;
    }
    public void stop(){
       this.f.removeCallbacksAndMessages(null);
       this.c.clear();
       this.a = null;
       this.b = null;
       this.d.clear();
    }
}
