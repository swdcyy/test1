package com.yxcorp.gifshow.util.PictureMemoryUtils;
import com.yxcorp.gifshow.util.PictureMemoryUtils$unRecyclableBitmapList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.util.PictureMemoryUtils$pictureSizeList$2;
import java.lang.Object;
import ekd.b0;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.yxcorp.gifshow.media.util.h;
import com.kwai.sdk.switchconfig.a;
import orc.a;
import nsd.u;
import java.lang.reflect.Type;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import yb7.n;
import java.util.ArrayList;
import ch7.i;
import com.kwai.performance.stability.oom.leakfix.base.LowMemoryLevel;
import java.lang.OutOfMemoryError;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class PictureMemoryUtils	// class@001f0d
{
    public static final p a;
    public static final p b;
    public static long c;
    public static final PictureMemoryUtils d;

    static {
       PictureMemoryUtils.d = new PictureMemoryUtils();
       PictureMemoryUtils.a = s.c(PictureMemoryUtils$unRecyclableBitmapList$2.INSTANCE);
       PictureMemoryUtils.b = s.c(PictureMemoryUtils$pictureSizeList$2.INSTANCE);
    }
    public void PictureMemoryUtils(){
       super();
    }
    public static final void a(b0 p0){
       try{
          a.p(p0, "pictureDimension");
          PictureMemoryUtils.f(p0);
       }catch(java.lang.NullPointerException e2){
          PostUtils.D("PictureMemoryUtils", "checkMemory", e2);
       }
       return;
    }
    public static final void b(){
       try{
          PictureMemoryUtils.g();
       }catch(java.lang.NullPointerException e0){
          PostUtils.D("PictureMemoryUtils", "clearMemory", e0);
       }
       return;
    }
    public static final Size c(String p0){
       a.p(p0, "picPath");
       BitmapFactory$Options options = new BitmapFactory$Options();
       boolean b = true;
       options.inJustDecodeBounds = b;
       BitmapFactory.decodeFile(p0, options);
       if ((h.b(p0) % 180) == 90) {
       }else {
          b = false;
       }
       BitmapFactory$Options outHeight = (b)? options.outHeight: options.outWidth;
       options = (b)? options.outWidth: options.outHeight;
       return new Size(outHeight, options);
    }
    public static final void f(b0 p0){
       Object[] objArray1;
       b0 uob01;
       boolean b;
       b0 uob0 = p0;
       a uoa = new a(0, 0, 3, null);
       a value = a.t().getValue("editPagePictureConfiguration", a.class, v10);
       String str = "pictureMaxThreshold = ";
       String str1 = "remainingMemMinThreshold = ";
       Object[] objArray = new Object[0];
       a.D().w("PictureMemoryUtils", "checkMemory kswitch "+str+value.a()+' '+str1+value.b(), objArray);
       PictureMemoryUtils d = PictureMemoryUtils.d;
       a.o(value, "editPagePictureConfiguration");
       Objects.requireNonNull(d);
       if (value.a() - 0x47310 < 0) {
          objArray1 = new Object[0];
          a.D().w("PictureMemoryUtils", "checkConfigValid pictureMaxThreshold is too small", objArray1);
       }else if(value.b() - 0x80000000 > 0){
          objArray1 = new Object[0];
          a.D().w("PictureMemoryUtils", "checkConfigValid remainingMemMinThreshold is too big", objArray1);
       }else {
          uob01 = 1;
       label_008d :
          if (!uob01) {
             return;
          }else if(((long)uob0.a * (long)uob0.b) - value.a() >= 0){
             b = true;
          }else {
             b = false;
          }
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          Objects.requireNonNull(d);
          String str2 = str1;
          String str3 = "PictureMemoryUtils";
          long l = (long)4;
          Object[] objArray2 = new Object[0];
          a.D().w(str3, "getBitmapMemOccupation "+"bitmapMemOccupation = "+(((long)uob0.a * (long)uob0.b) * l), objArray2);
          boolean b1 = ((n.a(uoc.a()) - (((long)uob0.a * (long)uob0.b) * l)) - value.b() <= 0)? true: false;
          if (b || b1) {
             String str4 = "checkMemory isPictureTooBig = "+b+", "+"isMemoryNotEnough = "+b1+", may lead to OOM, "+"pictureDimensionWidth = "+uob0.a+' '+"pictureDimensionHeight = "+uob0.b+' '+str+value.a()+' '+str2+value.b();
             Object[] objArray3 = new Object[0];
             String str5 = str3;
             a.D().A(str5, str4, objArray3);
             c uoc1 = a.a();
             a.o(uoc1, "AppEnv.get\(\)");
             if (uoc1.c()) {
                d.e().clear();
             }
             c uoc2 = a.a();
             a.o(uoc2, "AppEnv.get\(\)");
             Object[] objArray4 = new Object[0];
             a.D().w(str5, "checkMemory before gc, available memory:"+'['+n.a(uoc2.a())+']', objArray4);
             i.d().i(str4, LowMemoryLevel.LEVEL5);
             c uoc3 = a.a();
             a.o(uoc3, "AppEnv.get\(\)");
             Object[] objArray5 = new Object[0];
             a.D().w(str5, "checkMemory after gc, available memory:"+'['+n.a(uoc3.a())+']', objArray5);
          }
          return;
       }
       uob01 = null;
       goto label_008d ;
    }
    public static final void g(){
       Object[] objArray = new Object[0];
       a.D().A("PictureMemoryUtils", "clearMemory available memory is not enough, may lead to OOM", objArray);
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       Object[] objArray1 = new Object[0];
       a.D().w("PictureMemoryUtils", "clearMemory before gc, available memory:"+'['+n.a(uoc.a())+']', objArray1);
       i.d().i("clearMemory available memory is not enough, may lead to OOM", LowMemoryLevel.LEVEL5);
       c uoc1 = a.a();
       a.o(uoc1, "AppEnv.get\(\)");
       Object[] objArray2 = new Object[0];
       a.D().w("PictureMemoryUtils", "clearMemory after gc, available memory:"+'['+n.a(uoc1.a())+']', objArray2);
    }
    public static final void h(OutOfMemoryError p0){
       a.p(p0, "outOfMemoryError");
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       StringBuilder str = "PictureMemoryUtils available memory when enter edit page:"+PictureMemoryUtils.c+' '+"available memory when OOM: "+n.a(uoc.a())+' ';
       Iterator iterator = PictureMemoryUtils.d.d().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          str = str+"index: "+i+" width: "+obj.b+" height: "+obj.c+"; ";
          i = i1;
       }
       String str1 = str;
       a.o(str1, "stringBuilder.toString\(\)");
       PostUtils.D("PictureMemoryUtils", str1, p0);
       return;
    }
    public static final void i(OutOfMemoryError p0,b0 p1){
       a.p(p0, "outOfMemoryError");
       a.p(p1, "pictureDimension");
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       ExceptionHandler.handleCaughtException(new RuntimeException("PictureMemoryUtils pictureDimensionWidth = "+p1.a+' '+"pictureDimensionHeight = "+p1.b+' '+"available memory: "+n.a(uoc.a()), p0));
    }
    public final ArrayList d(){
       return PictureMemoryUtils.b.getValue();
    }
    public final ArrayList e(){
       return PictureMemoryUtils.a.getValue();
    }
}
