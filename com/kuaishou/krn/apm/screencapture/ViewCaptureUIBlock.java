package com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock;
import ze.q0;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$a;
import nsd.u;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$b;
import java.lang.Object;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$screenWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import ze.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$c;
import java.lang.Runnable;
import ekd.s1;
import android.view.View;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.view.ViewParent;
import java.util.Objects;
import usd.q;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.util.List;
import java.util.Iterator;
import android.view.TextureView;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ek0.d;
import android.graphics.Matrix;
import java.util.LinkedList;
import trd.a0;
import android.graphics.Point;
import java.lang.Number;
import android.view.ViewGroup;
import trd.t;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Iterable;
import qrd.l1;
import android.graphics.Bitmap$Config;
import android.widget.ScrollView;
import a2.f0;

public final class ViewCaptureUIBlock implements q0	// class@0007f9
{
    public final Object a;
    public final Set b;
    public final p c;
    public final int d;
    public final int e;
    public final int f;
    public final ViewCaptureUIBlock$b g;
    public static final ViewCaptureUIBlock$a h;

    static {
       ViewCaptureUIBlock.h = new ViewCaptureUIBlock$a(null);
    }
    public void ViewCaptureUIBlock(int p0,int p1,int p2,ViewCaptureUIBlock$b p3){
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.a = new Object();
       this.b = Collections.newSetFromMap(new WeakHashMap());
       this.c = s.c(ViewCaptureUIBlock$screenWidth$2.INSTANCE);
    }
    public void a(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewCaptureUIBlock.class, "2")) {
          return;
       }
       a.p(p0, "nativeViewHierarchyManager");
       s1.d(new ViewCaptureUIBlock$c(this, p0));
       return;
    }
    public final Bitmap b(View p0,int p1,int p2,int p3){
       Bitmap obj2;
       Point obj3;
       Object obj4;
       int width;
       int i1;
       int i2;
       int i3;
       Canvas uCanvas3;
       String str1;
       View view;
       float i1;
       float i3;
       Object obj = this;
       Object obj1 = p0;
       ViewCaptureUIBlock viewCaptureU = ViewCaptureUIBlock.class;
       if (PatchProxy.isSupport(viewCaptureU)) {
          obj2 = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ViewCaptureUIBlock.class, "3");
          if (obj2 != PatchProxyResult.class) {
             return obj2;
          }
       }
       String str = "null cannot be cast to non-null type android.view.View";
       if (PatchProxy.isSupport(viewCaptureU)) {
          obj3 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p3), obj, viewCaptureU, "5");
          if (obj3 != PatchProxyResult.class) {
             obj4 = obj3;
          }else if(p3 <= 0 || this.f(p0)){
             obj4 = obj1;
          }else {
             width = p3;
             ViewParent viewParent = obj1;
             int i6 = width - 1;
             while (width > 0 && (viewParent.getParent() != null && !obj.f(viewParent))) {
                ViewParent parent1 = viewParent.getParent();
                Objects.requireNonNull(parent1, str);
                viewParent = parent1;
                width = i6;
             }
             obj4 = viewParent;
          }
       }else {
          goto label_0043 ;
       }
       width = obj4.getWidth();
       int height = obj4.getHeight();
       if (width <= 0 || height <= 0) {
          d.i("ScreenCaptureToolbox#ViewCaptureUIBlock, Impossible to snapshot the view for its size: w="+width+", h="+height);
          return null;
       }else {
          Bitmap uBitmap = obj.e(width, q.n(obj.c(obj4), height));
          Paint paint = new Paint();
          boolean b = true;
          paint.setAntiAlias(b);
          paint.setFilterBitmap(b);
          Canvas uCanvas = new Canvas(uBitmap);
          obj4.draw(uCanvas);
          Canvas uCanvas1 = uCanvas;
          Canvas uCanvas2 = uCanvas;
          ViewCaptureUIBlock viewCaptureU1 = null;
          if (!PatchProxy.applyVoidThreeRefs(obj4, uCanvas1, paint, this, ViewCaptureUIBlock.class, "6")) {
             Iterator iterator = obj.d(obj4).iterator();
             while (iterator.hasNext()) {
                Object obj5 = iterator.next();
                if (obj5 instanceof TextureView) {
                   Bitmap obj6 = obj5;
                   if (!obj6.getVisibility()) {
                      obj6.setOpaque(viewCaptureU1);
                      obj6 = obj5.getBitmap(obj.e(obj5.getWidth(), obj5.getHeight()));
                      if (obj6 != null) {
                         a.o(obj6, "try {\n        child.getB\x20\x02 null\n      } ?: continue\x00");
                         int i4 = uCanvas2.save();
                         Object obj7 = obj5;
                         if (PatchProxy.applyThreeRefs(uCanvas2, obj4, obj5, this, ViewCaptureUIBlock.class, "7") != PatchProxyResult.class) {
                         }else {
                            Matrix matrix = new Matrix();
                            LinkedList linkedList = new LinkedList();
                            obj5 = obj7;
                            do {
                               linkedList.add(obj5);
                               ViewParent parent = obj5.getParent();
                               Objects.requireNonNull(parent, str);
                               i2 = a.g(parent, obj4) ^ b;
                            } while (!i2);
                            a0.c1(linkedList);
                            Iterator iterator1 = linkedList.iterator();
                            while (iterator1.hasNext()) {
                               view = iterator1.next();
                               uCanvas2.save();
                               a.o(view, "v");
                               i1 = view.getLeft();
                               Object obj8 = obj7;
                               i3 = a.g(view, obj8) ^ b;
                               i3 = (i3)? view.getPaddingLeft(): 0;
                               i1 = i1 + i3;
                               i1 = (float)i1 + view.getTranslationX();
                               i3 = view.getTop();
                               int i5 = a.g(view, obj8) ^ 0x01;
                               i5 = (i5)? view.getPaddingTop(): 0;
                               i3 = i3 + i5;
                               i3 = (float)i3 + view.getTranslationY();
                               uCanvas3 = uCanvas2;
                               uCanvas3.translate(i1, i3);
                               obj7 = obj8;
                               uCanvas3.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
                               uCanvas3.scale(view.getScaleX(), view.getScaleY());
                               matrix.postTranslate(i1, i3);
                               matrix.postRotate(view.getRotation(), view.getPivotX(), view.getPivotY());
                               matrix.postScale(view.getScaleX(), view.getScaleY());
                               iterator1 = iterator1;
                               uCanvas2 = uCanvas3;
                               str = str;
                               b = 1;
                            }
                         }
                         uCanvas3 = uCanvas2;
                         str1 = str;
                         uCanvas3.drawBitmap(obj6, 0, 0, paint);
                         uCanvas3.restoreToCount(i4);
                         obj.g(obj6);
                      label_0207 :
                         uCanvas2 = uCanvas3;
                         str = str1;
                         viewCaptureU1 = false;
                         uCanvas3 = 1;
                      }
                   }
                }
                uCanvas3 = uCanvas2;
                str1 = str;
                ViewCaptureUIBlock viewCaptureU2 = null;
                goto label_0207 ;
             }
          }
          int i = 0;
          obj3 = new Point(p1, p2);
          obj2 = PatchProxy.applyFourRefs(uBitmap, obj4, p0, obj3, this, ViewCaptureUIBlock.class, "4");
          if (obj2 != PatchProxyResult.class) {
          }else {
             int[] ointArray = new int[2];
             obj4.getLocationOnScreen(ointArray);
             int[] ointArray1 = new int[2];
             obj1.getLocationOnScreen(ointArray1);
             Point x = obj3.x;
             obj3 = obj3.y;
             i1 = q.n(((ointArray1[i] + (p0.getWidth() / 2)) - (x / 2)), ointArray[i]);
             i2 = q.n(((ointArray1[1] + (p0.getHeight() / 2)) - (obj3 / 2)), ointArray[1]);
             if ((i1 + x) > (ointArray[i] + obj4.getWidth())) {
                x = (ointArray[i] + obj4.getWidth()) - i1;
             }
             i3 = q.n(obj.c(obj4), obj4.getHeight());
             if ((i2 + obj3) > (ointArray[1] + i3)) {
                width = (ointArray[1] + i3) - i2;
             }
             uBitmap.getWidth();
             uBitmap.getHeight();
             obj2 = Bitmap.createBitmap(uBitmap, (i1 - ointArray[i]), (i2 - ointArray[1]), x, width);
             a.o(obj2, "Bitmap.createBitmap\(src, x, y, w, h\)");
          }
          obj.g(uBitmap);
          return obj2;
       }
    }
    public final int c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewCaptureUIBlock.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (this.f(p0)) {
          if (!p0 instanceof ViewGroup) {
             p0 = null;
          }
          if (p0 != null) {
             i = p0.getChildCount();
             int i1 = 0;
             for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                View childAt = p0.getChildAt(i2);
                int height = (childAt != null)? childAt.getHeight(): 0;
                i1 = i1 + height;
             }
             i = i1;
          }
       }
       return i;
    }
    public final List d(View p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, ViewCaptureUIBlock.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0 instanceof ViewGroup) {
          return t.k(p0);
       }
       obj = new ArrayList();
       int childCount = p0.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          View childAt = p0.getChildAt(i);
          a.o(childAt, "child");
          obj.addAll(this.d(childAt));
       }
       return obj;
    }
    public final Bitmap e(int p0,int p1){
       Bitmap uBitmap;
       ViewCaptureUIBlock viewCaptureU = ViewCaptureUIBlock.class;
       if (PatchProxy.isSupport(viewCaptureU)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, viewCaptureU, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       viewCaptureU = this.a;
       _monitor_enter(viewCaptureU);
       ViewCaptureUIBlock tb = this.b;
       a.o(tb, "weakBitmaps");
       Iterator iterator = tb.iterator();
       while (true) {
          if (iterator.hasNext()) {
             uBitmap = iterator.next();
             a.o(uBitmap, "bmp");
             if (uBitmap.getWidth() == p0 && uBitmap.getHeight() == p1) {
                break ;
             }
          }else {
             _monitor_exit(viewCaptureU);
             Bitmap uBitmap1 = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
             a.o(uBitmap1, "Bitmap.createBitmap\(w, h, Bitmap.Config.ARGB_8888\)");
             return uBitmap1;
          }
       }
       this.b.remove(uBitmap);
       uBitmap.eraseColor(0);
       _monitor_exit(viewCaptureU);
       return uBitmap;
    }
    public final boolean f(View p0){
       boolean b = (p0 instanceof ScrollView || p0 instanceof f0)? true: false;
       return b;
    }
    public final void g(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewCaptureUIBlock.class, "10")) {
          return;
       }
       ViewCaptureUIBlock ta = this.a;
       _monitor_enter(ta);
       this.b.add(p0);
       _monitor_exit(ta);
       return;
    }
}
