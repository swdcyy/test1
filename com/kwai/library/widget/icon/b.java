package com.kwai.library.widget.icon.b;
import com.kwai.library.widget.icon.b$a;
import android.os.Looper;
import android.util.LongSparseArray;
import android.os.Handler;
import android.os.Message;
import java.lang.String;
import android.app.Application;
import java.util.Map;
import android.content.res.Resources;
import u0.d;
import android.content.Context;
import android.content.res.Configuration;
import pd6.a;
import com.kwai.library.widget.icon.a;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.Integer;
import android.util.Pair;
import com.kwai.library.widget.icon.c;
import com.kwai.library.widget.icon.c$a;
import com.kwai.library.widget.icon.b$b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.util.TypedValue;
import java.lang.Class;
import com.kwai.library.widget.icon.b$c;
import java.lang.reflect.Field;
import java.lang.UnsupportedOperationException;
import ukd.a;

public class b	// class@000948
{
    public static final int[] a;
    public static long b;
    public static boolean c;
    public static TypedValue d;
    public static Application e;
    public static int f;
    public static Map g;
    public static final int h;
    public static SharedPreferences i;
    public static final Handler j;

    static {
       b.a = new int[2]{0,1};
       b.f = -2;
       b.h = 0x7f080f6d;
       b.j = new b$a(Looper.getMainLooper());
    }
    public static void a(){
       b.b(null, 500);
    }
    public static void b(LongSparseArray p0,long p1){
       Handler j = b.j;
       j.removeMessages(666);
       Message message = Message.obtain();
       message.obj = p0;
       message.what = 666;
       j.sendMessageDelayed(message, p1);
    }
    public static void c(String p0,int p1,Application p2,Map p3,LongSparseArray p4){
       int[] ointArray;
       a a;
       int i = p1;
       LongSparseArray longSparseAr = p4;
       b.f = i;
       int i1 = 0;
       int i2 = 1;
       if (!i || i == i2) {
          ointArray = new int[i2];
          ointArray[i1] = i;
       }else {
          ointArray = b.a;
       }
       if (p3 != null && !p3.isEmpty()) {
          Resources resources = p2.getResources();
          if (b.c) {
             d uod = new d(p2, i1);
             Configuration uConfigurati = new Configuration(resources.getConfiguration());
             uConfigurati.uiMode = 32;
             a.a(uod, uConfigurati);
             resources = uod.getResources();
          }else {
             int i4 = p2;
          }
          a = a.a;
          Iterator iterator = p3.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object obj = uEntry.getKey();
             c uoc = new c(p2, obj.intValue(), obj.intValue(), uEntry.getValue().second.intValue(), a);
             int len = ointArray.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                longSparseAr.put(b.d(resources, obj.intValue(), ointArray[i3]), v15);
             }
          }
          if (p4.size() > 0) {
             b.b = longSparseAr.keyAt(i1);
          }
          if (longSparseAr instanceof b$b) {
             longSparseAr.c = longSparseAr.size();
          }
          Log.g("KwaiIconHookHelper", "Kid hack inject icon method "+p0+" check key: "+b.b+" with rule "+i+" success!");
       }
       return;
    }
    public static long d(Resources p0,int p1,int p2){
       if (b.d == null) {
          b.d = new TypedValue();
       }
       TypedValue d = b.d;
       p0.getValue(p1, d, true);
       long l = 32;
       if (p2 == 1) {
          TypedValue data = d.data;
          return ((long)data | ((long)data << l));
       }else {
          return (((long)d.assetCookie << l) | (long)d.data);
       }
    }
    public static Class e(){
       try{
          return Class.forName("android.content.res.ResourcesImpl");
       }catch(java.lang.Exception e0){
          return Resources.class;
       }
    }
    public static LongSparseArray f(Application p0,Map p1,b$c p2){
       int h;
       b$b uob;
       Resources resources = p0.getResources();
       Field declaredFiel = b.e().getDeclaredField("sPreloadedDrawables");
       declaredFiel.setAccessible(true);
       Object obj = declaredFiel.get(resources);
       long[] olongArray = new long[]{b.d(resources, h, 0),b.d(resources, h, true)};
       h = b.h;
       if (obj instanceof LongSparseArray) {
          uob = new b$b(obj, olongArray);
          declaredFiel.set(resources, uob);
       }else if(obj instanceof LongSparseArray[] && obj.length > 0){
          uob = new b$b(obj[0], olongArray);
          obj[0] = uob;
       }else {
          uob = null;
       }
       if (uob != null) {
          b.c("hackPreloadDrawableWithCheck", 0, p0, p1, uob);
          return uob;
       }else {
          throw new UnsupportedOperationException("Kid hack preload drawables fail£¨1£©!");
       }
    }
    public static LongSparseArray g(Resources p0){
       return b.h(p0);
    }
    public static LongSparseArray h(Resources p0){
       Object[] objArray = new Object[0];
       return a.a(p0, "getPreloadedDrawables", objArray);
    }
    public static boolean i(Resources p0){
       boolean b = ((p0.getConfiguration().uiMode & 0x30) == 32)? true: false;
       return b;
    }
}
