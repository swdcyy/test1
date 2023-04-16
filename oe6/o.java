package oe6.o;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.a;
import java.util.Map;
import java.lang.ref.WeakReference;
import java.lang.System;
import java.lang.Thread;
import vid.b;
import java.util.Set;
import java.util.Iterator;
import com.tencent.mmkv.MMKV;
import android.content.SharedPreferences$Editor;

public class o	// class@00201c
{
    public static long a = 0x7fffffffffffffff;
    public static long b = 0xff;
    public static final Map c;
    public static final Map d;
    public static SharedPreferences e;

    static {
       o.c = new ConcurrentHashMap();
       o.d = new ConcurrentHashMap();
    }
    public void o(){
       super();
    }
    public static void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, o.class, "5")) {
          return;
       }
       if (o.e == null) {
          o.e = p0.getSharedPreferences("sp_strategy", 0);
       }
       return;
    }
    public static int b(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       o.a(p0);
       return o.e.getInt(p1, -1);
    }
    public static SharedPreferences c(Context p0,String p1,int p2){
       SharedPreferences obj;
       Object[] objArray;
       Map d;
       SharedPreferences sharedPrefer2;
       Context uContext = p0;
       object oobject = p1;
       if (PatchProxy.isSupport(o.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, o.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = true;
       int i = 3;
       int i1 = 0;
       if (!a.t().d("MmkvReplaceSp", b)) {
          objArray = new Object[i];
          objArray[i1] = oobject;
          objArray[b] = Integer.valueOf(p2);
          objArray[2] = "kswitch return false";
          String.format("Replace sp\(name: %s, mode: %d\) with mmkv fail; reason: %s", objArray);
          SharedPreferences sharedPrefer = p0.getSharedPreferences(p1, p2);
          o.c.put(oobject, sharedPrefer);
          return sharedPrefer;
       }else {
          objArray = new Object[i];
          objArray[i1] = oobject;
          objArray[b] = Integer.valueOf(p2);
          Map c = o.c;
          objArray[2] = Integer.valueOf(c.size());
          String.format("Replace sp\(name: %s, mode: %d\) with mmkv success£»Total Replace Size£º%d", objArray);
          obj = c.get(oobject);
          if (obj != null) {
             return obj;
          }else {
             d = o.d;
             WeakReference weakReferenc = d.get(oobject);
             if (weakReferenc != null) {
                SharedPreferences sharedPrefer1 = weakReferenc.get();
                if (sharedPrefer1 != null) {
                   return sharedPrefer1;
                }
             }
             String str = p1.intern();
             _monitor_enter(str);
             long l = System.currentTimeMillis();
             long id = Thread.currentThread().getId();
             if (l - o.a <= 0) {
                sharedPrefer2 = p0.getSharedPreferences(p1, p2);
                o.d(uContext, oobject, i1);
                c.put(oobject, sharedPrefer2);
             }else if(l - (o.a + 50) <= 0 && id - o.b){
                int i2 = o.b(p0, p1);
                if (i2 == b) {
                   sharedPrefer2 = b.c(p0, p1, p2);
                   d.put(oobject, new WeakReference(sharedPrefer2));
                }else {
                   sharedPrefer2 = p0.getSharedPreferences(p1, p2);
                   if (i2 == -1) {
                      o.d(uContext, oobject, i1);
                   }
                   c.put(oobject, sharedPrefer2);
                }
             }else {
                SharedPreferences sharedPrefer4 = b.c(p0, p1, p2);
                o.d(uContext, oobject, b);
                d.put(oobject, new WeakReference(sharedPrefer4));
                sharedPrefer2 = sharedPrefer4;
             }
             _monitor_exit(str);
             Iterator iterator = d.keySet().iterator();
             while (iterator.hasNext()) {
                str = iterator.next();
                Map d1 = o.d;
                if (d1.get(str).get() == null) {
                   SharedPreferences sharedPrefer3 = b.c(uContext, str, 2);
                   if (sharedPrefer3 != null && sharedPrefer3 instanceof MMKV) {
                      sharedPrefer3.close();
                   }
                   d1.remove(str);
                }
             }
             return sharedPrefer2;
          }
       }
    }
    public static void d(Context p0,String p1,int p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, o.class, "4")) {
          return;
       }
       o.a(p0);
       o.e.edit().putInt(p1, p2).apply();
       return;
    }
}
