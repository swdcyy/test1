package com.kwai.performance.fluency.page.monitor.utils.ScreenshotUtil$captureScreenshot$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.lang.Object;
import qrd.l1;
import android.app.Application;
import yf7.k;
import android.app.Activity;
import yf7.p;
import hf7.c;
import java.util.Objects;
import android.view.WindowManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.s;
import java.util.List;
import java.util.ArrayList;
import nsd.s0;
import java.lang.NullPointerException;
import java.lang.Exception;
import java.lang.Throwable;
import qrd.i;
import yf7.h;
import java.util.Collection;
import java.util.Iterator;
import hf7.c$a;
import android.graphics.Rect;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.Closeable;
import isd.b;
import java.lang.IllegalStateException;

public final class ScreenshotUtil$captureScreenshot$1 extends Lambda implements a	// class@0010d0
{
    public final File $outputFile;

    public void ScreenshotUtil$captureScreenshot$1(File p0){
       this.$outputFile = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       int i1;
       List obj;
       Activity uActivity = p.a(k.b());
       if (uActivity == null) {
          return;
       }
       c b = c.b;
       Objects.requireNonNull(b);
       int i = 1;
       try{
          i1 = 0;
          WindowManager windowManage = uActivity.getWindowManager();
          a.o(windowManage, "activity.windowManager");
          obj = s.e(windowManage, "mGlobal");
          if (obj != null) {
             Object obj1 = s.e(obj, "mRoots");
             Object obj2 = s.e(obj, "mParams");
             if (obj1 != null) {
                if (obj2 != null) {
                   obj = b.k(obj1, obj2);
                   try{
                      if (obj.isEmpty() ^ i) {
                         b.h(obj);
                         b.f(s0.g(obj));
                      }
                   }catch(java.lang.Exception e4){
                   }
                   e4.printStackTrace();
                   h.b("ScreenshotUtil", i.i(e4));
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<android.view.WindowManager.LayoutParams>");
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
             }
          }else {
             obj = i1;
          }
          if (obj != null && !obj.isEmpty()) {
             i = 0;
          }
          if (!i) {
             Iterator iterator = obj.iterator();
             Rect rect = Integer.MIN_VALUE;
             Rect rect1 = Integer.MIN_VALUE;
             while (iterator.hasNext()) {
                c$a uoa = iterator.next();
                if (uoa.c().right > rect) {
                   rect = uoa.c().right;
                }
                if (uoa.c().bottom > rect1) {
                   rect1 = uoa.c().bottom;
                }
             }
             Bitmap uBitmap = Bitmap.createBitmap(rect, rect1, Bitmap$Config.ARGB_8888);
             a.o(uBitmap, "bitmap");
             Iterator iterator1 = obj.iterator();
             while (iterator1.hasNext()) {
                b.c(iterator1.next(), uBitmap);
             }
             if (this.$outputFile != null) {
                BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(this.$outputFile));
                if (uBitmap != null) {
                   uBitmap.compress(Bitmap$CompressFormat.JPEG, 30, uBufferedOut);
                }
                uBufferedOut.flush();
                b.a(uBufferedOut, i1);
             }
             return;
          }else {
             throw new IllegalStateException("Failed to get root views!");
          }
       }catch(java.lang.Exception e4){
          obj = i1;
          goto label_0065 ;
       }
    }
}
