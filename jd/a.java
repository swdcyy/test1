package jd.a;
import jd.c;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import com.facebook.cache.common.CacheKey;
import android.graphics.Bitmap;
import sc.d;
import com.facebook.common.references.a;
import vc.k;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class a implements c	// class@0023ec
{
    public static final Bitmap$Config a;
    public static Method b;

    static {
       a.a = Bitmap$Config.ARGB_8888;
    }
    public void a(){
       super();
    }
    public CacheKey a(){
       return null;
    }
    public a b(Bitmap p0,d p1){
       Bitmap$Config config = p0.getConfig();
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (config != null) {
       }else {
          config = a.a;
       }
       a uoa = p1.i(width, height, config);
       this.e(uoa.j(), p0);
       a.f(uoa);
       return uoa.a();
    }
    public void d(Bitmap p0){
    }
    public void e(Bitmap p0,Bitmap p1){
       if (k.a() && p0.getConfig() == p1.getConfig()) {
          try{
             int i = 2;
             if (a.b == null) {
                Class[] uClassArray = new Class[i];
                uClassArray[0] = Bitmap.class;
                uClassArray[1] = Bitmap.class;
                a.b = Bitmaps.class.getDeclaredMethod("copyBitmap", uClassArray);
             }
             Object[] objArray = new Object[i];
             objArray[0] = p0;
             objArray[1] = p1;
             a.b.invoke(null, objArray);
          }catch(java.lang.ClassNotFoundException e10){
             throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
          }catch(java.lang.IllegalAccessException e10){
             throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
          }catch(java.lang.NoSuchMethodException e10){
             throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
          }catch(java.lang.reflect.InvocationTargetException e10){
             throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
          }
       }else {
          new Canvas(p0).drawBitmap(p1, 0, 0, null);
       }
       this.d(p0);
       return;
    }
    public String getName(){
       return "Unknown postprocessor";
    }
}
