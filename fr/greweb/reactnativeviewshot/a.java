package fr.greweb.reactnativeviewshot.a;
import ze.q0;
import java.lang.Object;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.String;
import java.lang.Integer;
import java.io.File;
import java.lang.Boolean;
import com.facebook.react.bridge.ReactApplicationContext;
import android.app.Activity;
import com.facebook.react.bridge.Promise;
import android.graphics.Bitmap;
import ze.m;
import android.view.Window;
import android.view.View;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import fr.greweb.reactnativeviewshot.a$b;
import java.lang.Math;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.graphics.Point;
import android.net.Uri;
import bqd.a;
import android.widget.ScrollView;
import java.util.Iterator;
import android.graphics.Bitmap$Config;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.util.List;
import java.util.ArrayList;
import android.view.TextureView;
import android.graphics.Matrix;
import java.util.LinkedList;
import android.view.ViewParent;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import fr.greweb.reactnativeviewshot.a$a;
import android.graphics.Bitmap$CompressFormat;
import java.lang.RuntimeException;
import android.view.ViewGroup;
import java.util.Collection;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.zip.Deflater;
import android.util.Base64;
import java.nio.charset.Charset;

public class a implements q0	// class@000e59
{
    public final int a;
    public final String b;
    public final int c;
    public final double d;
    public final Integer e;
    public final Integer f;
    public final File g;
    public final String h;
    public final Promise i;
    public final Boolean j;
    public final ReactApplicationContext k;
    public final Activity l;
    public static final String m = "a";
    public static byte[] n;
    public static final Object o;
    public static final Set p;

    static {
       byte[] uobyteArray = new byte[0x10000];
       a.n = uobyteArray;
       a.o = new Object();
       a.p = Collections.newSetFromMap(new WeakHashMap());
    }
    public void a(int p0,String p1,int p2,double p3,Integer p4,Integer p5,File p6,String p7,Boolean p8,ReactApplicationContext p9,Activity p10,Promise p11){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.j = p8;
       this.k = p9;
       this.l = p10;
       this.i = p11;
    }
    public static void e(Bitmap p0){
       Object o = a.o;
       _monitor_enter(o);
       a.p.add(p0);
       _monitor_exit(o);
    }
    public void a(m p0){
       String str = "tmpfile";
       a ta = this.a;
       String str1 = -1;
       View view = (ta == str1)? this.l.getWindow().getDecorView().findViewById(0x1020002): p0.p(ta);
       if (view == null) {
          AssertionError uAssertionEr = new AssertionError();
          this.i.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: "+this.a);
          return;
       }else {
          a$b uob = new a$b(a.n);
          uob.d(Math.min(((view.getWidth() * view.getHeight()) * 4), 32));
          a.n = uob.c();
          if (str.equals(this.h) && str1 == this.c) {
             this.h(view);
          }else if(str.equals(this.h) && str1 != this.c){
             this.b(view, new FileOutputStream(this.g));
             this.i.resolve(Uri.fromFile(this.g).toString());
          }else if(("base64").equals(this.h) || ("zip-base64").equals(this.h)){
             this.f(view);
          }else if(("data-uri").equals(this.h)){
             this.g(view);
          }
          return;
       }
    }
    public final Point b(View p0,OutputStream p1){
       a.b(a.m, a.a(this.l));
       p1.close();
       return this.c(p0, p1);
    }
    public final Point c(View p0,OutputStream p1){
       Bitmap uBitmap;
       Bitmap uBitmap1;
       Iterator iterator4;
       Point point1;
       a uoa = this;
       View view = p0;
       OutputStream outputStream = p1;
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (width <= 0 || height <= 0) {
          throw new RuntimeException("Impossible to snapshot the view: view is invalid");
       }
       int i = 0;
       if (uoa.j.booleanValue()) {
          ScrollView scrollView = view;
          int i1 = 0;
          for (int i2 = 0; i2 < scrollView.getChildCount(); i2 = i2 + 1) {
             i1 = i1 + scrollView.getChildAt(i2).getHeight();
          }
          height = i1;
       }
       Point point = new Point(width, height);
       Paint o = a.o;
       _monitor_enter(o);
       Iterator iterator = a.p.iterator();
       while (true) {
          if (iterator.hasNext()) {
             uBitmap = iterator.next();
             if (uBitmap.getWidth() == width && uBitmap.getHeight() == height) {
                a.p.remove(uBitmap);
                uBitmap.eraseColor(i);
                _monitor_exit(o);
             }
          }else {
             _monitor_exit(o);
             uBitmap = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
          }
          o = new Paint();
          boolean b = true;
          o.setAntiAlias(b);
          o.setFilterBitmap(b);
          o.setDither(b);
          Canvas uCanvas = new Canvas(uBitmap);
          view.draw(uCanvas);
          Iterator iterator1 = this.d(p0).iterator();
          while (iterator1.hasNext()) {
             View view1 = iterator1.next();
             if (!view1 instanceof TextureView || view1.getVisibility()) {
             }else {
                View view2 = view1;
                view2.setOpaque(i);
                int width1 = view1.getWidth();
                int height1 = view1.getHeight();
                Object o1 = a.o;
                _monitor_enter(o1);
                Iterator iterator2 = a.p.iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      uBitmap1 = iterator2.next();
                      if (uBitmap1.getWidth() == width1 && uBitmap1.getHeight() == height1) {
                         a.p.remove(uBitmap1);
                         uBitmap1.eraseColor(0);
                         _monitor_exit(o1);
                      label_00e9 :
                         uBitmap1 = view2.getBitmap(uBitmap1);
                         int i3 = uCanvas.save();
                         Matrix matrix = new Matrix();
                         LinkedList linkedList = new LinkedList();
                         View view3 = view1;
                         linkedList.add(view3);
                         while (view3.getParent() != view) {
                            view = p0;
                         }
                         Collections.reverse(linkedList);
                         Iterator iterator3 = linkedList.iterator();
                         while (iterator3.hasNext()) {
                            View view4 = iterator3.next();
                            uCanvas.save();
                            int left = view4.getLeft();
                            int paddingLeft = (view4 != view1)? view4.getPaddingLeft(): 0;
                            int i4 = left + paddingLeft;
                            float f = (float)i4 + view4.getTranslationX();
                            left = view4.getTop();
                            if (view4 != view1) {
                               paddingLeft = view4.getPaddingTop();
                               iterator4 = iterator3;
                            }else {
                               iterator4 = iterator3;
                               paddingLeft = 0;
                            }
                            i = left + paddingLeft;
                            float f1 = (float)i + view4.getTranslationY();
                            uCanvas.translate(f, f1);
                            uCanvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
                            uCanvas.scale(view4.getScaleX(), view4.getScaleY());
                            matrix.postTranslate(f, f1);
                            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
                            matrix.postScale(view4.getScaleX(), view4.getScaleY());
                            iterator1 = iterator1;
                            iterator3 = iterator4;
                            view1 = view1;
                            point = point;
                         }
                         uCanvas.drawBitmap(uBitmap1, 0, 0, o);
                         uCanvas.restoreToCount(i3);
                         a.e(uBitmap1);
                         view = p0;
                         iterator1 = iterator1;
                         point = point;
                         i = false;
                         uBitmap1 = 1;
                      }else {
                         Object obj = 1;
                      }
                   }else {
                      _monitor_exit(o1);
                      uBitmap1 = Bitmap.createBitmap(width1, height1, Bitmap$Config.ARGB_8888);
                      goto label_00e9 ;
                   }
                }
             }
          }
          point1 = point;
          a e = uoa.e;
          if (e != null && (uoa.f != null && (e.intValue() != width || uoa.f.intValue() != height))) {
             a.e(uBitmap);
             uBitmap = Bitmap.createScaledBitmap(uBitmap, uoa.e.intValue(), uoa.f.intValue(), true);
          }
       label_01e5 :
          a c = uoa.c;
          if (-1 == c && outputStream instanceof a$b) {
             width = (width * height) * 4;
             a$b uob = outputStream;
             uBitmap.copyPixelsToBuffer(uob.a(width));
             uob.d(width);
          }else {
             uBitmap.compress(a$a.q[c], (int)(uoa.d * 100.00f), outputStream);
          }
       }
       a.e(uBitmap);
       return point1;
    }
    public final List d(View p0){
       ArrayList uArrayList;
       if (!p0 instanceof ViewGroup) {
          uArrayList = new ArrayList();
          uArrayList.add(p0);
          return uArrayList;
       }else {
          uArrayList = new ArrayList();
          for (int i = 0; i < p0.getChildCount(); i = i + 1) {
             uArrayList.addAll(this.d(p0.getChildAt(i)));
          }
          return uArrayList;
       }
    }
    public final void f(View p0){
       int i = 1;
       Deflater uDeflater = (-1 == this.c)? 1: null;
       boolean b = ("zip-base64").equals(this.h);
       a$b uob = new a$b(a.n);
       Point point = this.b(p0, uob);
       a.n = uob.c();
       int i1 = uob.size();
       Object[] objArray = new Object[]{Integer.valueOf(point.x),Integer.valueOf(point.y)};
       String str = String.format(Locale.US, "%d:%d|", objArray);
       if (!uDeflater) {
          str = "";
       }
       if (b) {
          uDeflater = new Deflater();
          uDeflater.setInput(a.n, 0, i1);
          uDeflater.finish();
          byte[] uobyteArray = new byte[32];
          a$b uob1 = new a$b(uobyteArray);
          uobyteArray = new byte[1024];
          while (!uDeflater.finished()) {
             uob1.write(uobyteArray, 0, uDeflater.deflate(uobyteArray));
          }
          str = str+Base64.encodeToString(uob1.c(), 0, uob1.size(), 2);
       }else {
          str = str+Base64.encodeToString(a.n, 0, i1, 2);
       }
       this.i.resolve(str);
       return;
    }
    public final void g(View p0){
       a$b uob = new a$b(a.n);
       this.b(p0, uob);
       a.n = uob.c();
       int i = uob.size();
       String str = Base64.encodeToString(a.n, 0, i, 2);
       String str1 = (("jpg").equals(this.b))? "jpeg": this.b;
       this.i.resolve("data:image/"+str1+";base64,"+str);
       return;
    }
    public final void h(View p0){
       FileOutputStream uFileOutputS = new FileOutputStream(this.g);
       a$b uob = new a$b(a.n);
       Point point = this.b(p0, uob);
       a.n = uob.c();
       Object[] objArray = new Object[]{Integer.valueOf(point.x),Integer.valueOf(point.y)};
       uFileOutputS.write((String.format(Locale.US, "%d:%d|", objArray)).getBytes(Charset.forName("US-ASCII")));
       uFileOutputS.write(a.n, 0, uob.size());
       uFileOutputS.close();
       this.i.resolve(Uri.fromFile(this.g).toString());
    }
}
