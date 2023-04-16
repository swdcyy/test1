package com.kwai.performance.stability.crash.monitor.util.ScreenshotUtil;
import com.kwai.performance.stability.crash.monitor.util.ScreenshotUtil$mThread$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.app.Activity;
import android.graphics.Bitmap;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.WindowManager;
import com.kwai.performance.stability.crash.monitor.util.g;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.performance.stability.crash.monitor.util.ScreenshotUtil$a;
import android.graphics.Rect;
import nsd.s0;
import java.lang.NullPointerException;
import java.lang.Exception;
import java.lang.Throwable;
import qrd.i;
import yf7.h;
import java.util.Collection;
import android.graphics.Bitmap$Config;
import java.lang.IllegalStateException;
import android.view.View;
import android.view.WindowManager$LayoutParams;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import java.lang.NoSuchFieldException;
import kotlin.jvm.internal.Ref$BooleanRef;
import android.view.Window;
import vg7.g;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.PixelCopy;
import qrd.l1;
import com.kwai.performance.stability.crash.monitor.util.ScreenshotUtil$b;
import java.lang.Iterable;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.view.SurfaceView;
import android.view.ViewParent;
import java.util.Objects;
import usd.q;
import vg7.f;
import android.os.IBinder;
import java.util.LinkedList;
import android.view.ViewGroup;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public final class ScreenshotUtil	// class@001210
{
    public static final ScreenshotUtil a;
    public static final p b;
    public static final Object c;

    static {
       ScreenshotUtil.a = new ScreenshotUtil();
       ScreenshotUtil.b = s.c(ScreenshotUtil$mThread$2.INSTANCE);
       ScreenshotUtil.c = new Object();
    }
    public void ScreenshotUtil(){
       super();
    }
    public final Bitmap a(Activity p0){
       int i;
       Iterator iterator;
       Rect rect;
       a.p(p0, "activity");
       Collection uCollection = null;
       try{
          i = 1;
          p0 = g.d(p0.getWindowManager(), "mGlobal");
          Iterator obj = g.d(p0, "mRoots");
          p0 = g.d(p0, "mParams");
          if (obj != null) {
             if (p0 != null) {
                uCollection = this.k(obj, p0);
                if (uCollection.isEmpty() ^ i) {
                   List list = uCollection;
                   obj = list.iterator();
                   int i2 = Integer.MAX_VALUE;
                   int i3 = Integer.MAX_VALUE;
                   while (obj.hasNext()) {
                      ScreenshotUtil$a b1 = obj.next().b;
                      Rect top = b1.top;
                      if (top < i2) {
                         i2 = top;
                      }
                      Rect left = b1.left;
                      if (left < i3) {
                         i3 = left;
                      }
                   }
                   iterator = list.iterator();
                   while (iterator.hasNext()) {
                      int i4 = - i3;
                      int i5 = - i2;
                      iterator.next().b.offset(i4, i5);
                   }
                   this.f(s0.g(uCollection));
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<android.view.WindowManager.LayoutParams>");
             }
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          h.b("ScreenshotUtil", i.i(e8));
       }
       if (uCollection != null && !uCollection.isEmpty()) {
          rect = 0;
       }
       if (!i) {
          iterator = uCollection.iterator();
          i = Integer.MIN_VALUE;
          int i1 = Integer.MIN_VALUE;
          while (iterator.hasNext()) {
             ScreenshotUtil$a b = iterator.next().b;
             Rect right = b.right;
             if (right > i) {
                rect = right;
             }
             Rect bottom = b.bottom;
             if (bottom > i1) {
                i1 = bottom;
             }
          }
          Bitmap uBitmap = Bitmap.createBitmap(i, i1, Bitmap$Config.ARGB_8888);
          a.o(uBitmap, "bitmap");
          Iterator iterator1 = uCollection.iterator();
          while (iterator1.hasNext()) {
             this.c(iterator1.next(), uBitmap);
          }
          return uBitmap;
       }else {
          throw new IllegalStateException("Failed to get root views!");
       }
    }
    public final Bitmap b(View p0){
       p0.setDrawingCacheEnabled(true);
       p0.buildDrawingCache();
       return p0.getDrawingCache();
    }
    public final void c(ScreenshotUtil$a p0,Bitmap p1){
       int i = 2;
       if ((p0.c.flags & i) == i) {
          new Canvas(p1).drawARGB((int)((float)255 * p0.c.dimAmount), 0, 0, 0);
       }
       int i1 = 1;
       if (Build$VERSION.SDK_INT >= 24) {
          List list = this.g(p0);
          if (list.isEmpty() ^ i1) {
             try{
                i1 = this.e(list, p0, p1);
             }catch(java.lang.NoSuchFieldException e0){
                e0.printStackTrace();
                h.b("ScreenshotUtil", a.C("drawSurfaceViews failed: ", e0));
             }
          }
       }
    }
    public final Bitmap d(ScreenshotUtil$a p0){
       ScreenshotUtil$a a = p0.a;
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       if (Build$VERSION.SDK_INT < 26) {
          return this.b(a);
       }
       p0 = p0.b;
       Bitmap uBitmap = Bitmap.createBitmap((p0.right - p0.left), (p0.bottom - p0.top), Bitmap$Config.ARGB_8888);
       View rootView = a.getRootView();
       try{
          PixelCopy.request(g.d(rootView, "mWindow"), uBitmap, new g(uBooleanRef), new Handler(this.h().getLooper()));
          Object c = ScreenshotUtil.c;
          _monitor_enter(c);
          c.wait(1000);
          _monitor_exit(c);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          h.b("ScreenshotUtil", a.C("PixelCopy window failed: ", e2));
       }
       if (uBooleanRef.element == null) {
          uBitmap = this.b(a);
       }
       return uBitmap;
    }
    public final boolean e(List p0,ScreenshotUtil$a p1,Bitmap p2){
       ScreenshotUtil$a uoa = p1;
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       Iterator iterator = CollectionsKt___CollectionsKt.f5(p0, new ScreenshotUtil$b()).iterator();
       int i = 1;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.getVisibility()) {
             continue ;
          }else {
             ViewParent parent = obj.getParent();
             Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
             int i1 = q.u(parent.getWidth(), uoa.b.width());
             int i2 = q.u(parent.getHeight(), uoa.b.height());
             int[] ointArray = new int[2];
             parent.getLocationOnScreen(ointArray);
             int i3 = ointArray[0];
             int i4 = ointArray[i];
             int i5 = i3 + i1;
             int i6 = i4 + i2;
             Bitmap uBitmap = Bitmap.createBitmap(i1, i2, Bitmap$Config.ARGB_8888);
             a.o(uBitmap, "createBitmap\(width, height, Bitmap.Config.ARGB_8888\)");
             f uof = new f(obj, uBooleanRef, p1, p2, i3, i4, i5, i6, uBitmap);
             PixelCopy.request(obj, uBitmap, v15, new Handler(this.h().getLooper()));
             Object c = ScreenshotUtil.c;
             _monitor_enter(c);
             c.wait(1000);
             _monitor_exit(c);
          }
       }
       return (uBooleanRef.element ^ i);
    }
    public final void f(List p0){
       ScreenshotUtil$a uoa1;
       IBinder iBinder;
       if (p0.size() <= 1) {
          return;
       }
       int i = p0.size() - 1;
       if (i > 0) {
          int i1 = 0;
          while (true) {
             int i2 = i1 + 1;
             ScreenshotUtil$a uoa = p0.get(i1);
             if (uoa.c.type == 2) {
                uoa1 = 1;
             label_0023 :
                if (uoa1) {
                   if (uoa.a() == null) {
                      return;
                   }else {
                      int i3 = p0.size();
                      if (i2 < i3) {
                         int i4 = i2;
                         while (true) {
                            int i5 = i4 + 1;
                            ScreenshotUtil$a uoa2 = p0.get(i4);
                            if (uoa2.c.type == 1) {
                               iBinder = 1;
                            label_0045 :
                               if (iBinder && uoa2.a() == uoa.a()) {
                                  p0.remove(uoa2);
                                  p0.add(i1, uoa2);
                               }else if(i5 >= i3){
                                  i4 = i5;
                               }
                            }else {
                               iBinder = null;
                               goto label_0045 ;
                            }
                         }
                      }
                   }
                }
                if (i2 < i) {
                   i1 = i2;
                }
             }else {
                uoa1 = null;
                goto label_0023 ;
             }
          }
       }
       return;
    }
    public final List g(ScreenshotUtil$a p0){
       ArrayList uArrayList = new ArrayList();
       LinkedList linkedList = new LinkedList();
       linkedList.addLast(p0.a);
       int i = linkedList.isEmpty() ^ 0x01;
       while (i) {
          View last = linkedList.getLast();
          linkedList.pollLast();
          if (last instanceof SurfaceView && !last.getVisibility()) {
             uArrayList.add(last);
          }
          if (last instanceof ViewGroup) {
             int i1 = last.getChildCount() - 1;
             if (i1 >= 0) {
                int i2 = i1 - 1;
                linkedList.addLast(last.getChildAt(i1));
                while (i2 >= 0) {
                   i1 = i2;
                }
             }
          }
       }
       return uArrayList;
    }
    public final HandlerThread h(){
       return ScreenshotUtil.b.getValue();
    }
    public final void i(ScreenshotUtil$a p0,Bitmap p1,Bitmap p2,Rect p3){
       Canvas uCanvas = new Canvas(p1);
       p0 = p0.b;
       uCanvas.translate((float)p0.left, (float)p0.top);
       Paint paint = new Paint();
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.ADD));
       uCanvas.drawBitmap(p2, null, p3, paint);
    }
    public final void j(ScreenshotUtil$a p0,Bitmap p1){
       Bitmap uBitmap = this.d(p0);
       ScreenshotUtil$a b = p0.b;
       Rect rect = new Rect(0, 0, (b.right - b.left), (b.bottom - b.top));
       if (uBitmap == null) {
       }else {
          ScreenshotUtil.a.i(p0, p1, uBitmap, rect);
       }
       return;
    }
    public final List k(List p0,List p1){
       ArrayList uArrayList = new ArrayList();
       int i = p0.size() - 1;
       if (i >= 0) {
          int i1 = 0;
          while (true) {
             int i2 = i1 + 1;
             View view = g.d(p0.get(i1), "mView");
             if (view == null || !view.isShown()) {
             label_004e :
                if (i2 <= i) {
                   i1 = i2;
                }
             }else {
                int[] ointArray = new int[2];
                view.getLocationOnScreen(ointArray);
                int i3 = ointArray[0];
                int i4 = ointArray[1];
                int i5 = view.getWidth() + i3;
                int i6 = view.getHeight() + i4;
                Rect rect = new Rect(i3, i4, i5, i6);
                uArrayList.add(new ScreenshotUtil$a(view, rect, p1.get(i1)));
                goto label_004e ;
             }
          }
       }
       return uArrayList;
    }
}
