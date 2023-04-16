package com.kwai.plugin.dva.feature.core.loader.AssetManagerHook$a;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook$b;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import android.content.res.AssetManager;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import java.lang.Throwable;
import qj7.d;
import com.kwai.plugin.dva.feature.core.loader.a$b;
import java.lang.reflect.Field;
import com.kwai.plugin.dva.util.b;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.util.Map;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import android.content.res.Resources;
import java.lang.StringBuilder;
import java.util.Collection;
import java.util.Arrays;
import java.util.Objects;
import java.lang.Long;

public class AssetManagerHook$a implements AssetManagerHook$b	// class@00130a
{
    public final Context a;
    public final Map b;
    public Throwable c;
    public static final boolean d;

    public void AssetManagerHook$a(Context p0){
       super();
       this.b = new ConcurrentHashMap();
       this.c = null;
       this.a = p0;
    }
    public boolean a(AssetManager p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AssetManagerHook$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT < 28 || this.c != null) {
          return false;
       }
       return this.b(p0, p1);
    }
    public final boolean b(AssetManager p0,List p1){
       int len;
       int this;
       Object[] objArray3;
       Iterator obj8;
       int len1;
       ArrayMap obj10;
       Object obj11;
       ArrayMap uArrayMap2;
       Object obj = this;
       Object obj1 = p0;
       AssetManagerHook$a uoa = AssetManagerHook$a.class;
       a$b uob = a$b.class;
       Field obj2 = PatchProxy.applyTwoRefs(obj1, p1, obj, uoa, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       Object[] objArray = null;
       obj2 = PatchProxy.apply(objArray, objArray, uob, "20");
       if (obj2 != PatchProxyResult.class) {
       }else if(a$b.b == null){
          a$b.b = b.d(AssetManager.class, "mApkAssets");
       }
       obj2 = a$b.b;
       Object obj3 = obj2;
       obj2 = PatchProxy.apply(objArray, objArray, uob, "21");
       if (obj2 != PatchProxyResult.class) {
       }else if(a$b.c == null){
          a$b.c = b.d(AssetManager.class, "mObject");
       }
       obj2 = a$b.c;
       Object obj4 = obj2;
       Method method = a$b.e();
       Method method1 = PatchProxy.apply(objArray, objArray, uob, "27");
       int i = 1;
       if (method1 != PatchProxyResult.class) {
       }else if(a$b.i == null){
          Class[] uClassArray = new Class[i];
          uClassArray[0] = Integer.TYPE;
          a$b.i = b.f(AssetManager.class, "invalidateCachesLocked", uClassArray);
       }
       method1 = a$b.i;
       String obj5 = method1;
       Object obj6 = obj5;
       Collection obj7 = PatchProxy.applyThreeRefs(p1, obj3, method, this, AssetManagerHook$a.class, "4");
       if (obj7 != PatchProxyResult.class) {
       }else {
          ArrayMap uArrayMap = new ArrayMap(p1.size());
          Iterator iterator = p1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                Object[] obj9 = iterator.next();
                obj10 = obj.b.get(obj9);
                if (obj10 == null) {
                   obj11 = obj9;
                   ArrayMap uArrayMap1 = uArrayMap;
                   obj10 = PatchProxy.applyThreeRefs(obj9, obj3, method, this, AssetManagerHook$a.class, "5");
                   if (obj10 == PatchProxyResult.class) {
                      Object[] objArray5 = obj3.get(obj.a.getResources().getAssets());
                      len1 = objArray5.length;
                      len = 0;
                      while (true) {
                         if (len < len1) {
                            object this1 = objArray5[len];
                            obj9 = new Object[false];
                            if (obj11.equals(method.invoke(this1, obj9))) {
                               obj10 = this1;
                            }else {
                               len = len + 1;
                            }
                         }else {
                            obj10 = null;
                         }
                      }
                   }
                   if (obj10 == null) {
                      d.c(obj11+" ApkAssets not found");
                      obj10 = null;
                   }else {
                      obj.b.put(obj11, obj10);
                      uArrayMap2 = uArrayMap1;
                   }
                }else {
                   obj11 = obj9;
                   uArrayMap2 = uArrayMap;
                }
                uArrayMap2.put(obj11, obj10);
                uArrayMap = uArrayMap2;
                obj11 = 1;
             }else {
                obj10 = uArrayMap;
             }
          }
       }
       if (obj7 == null) {
          return false;
       }else {
          _monitor_enter(p0);
          Object[] objArray1 = obj3.get(obj1);
          len = objArray1.length;
          this = 0;
          while (true) {
             if (this < len) {
                Object[] objArray2 = new Object[false];
                obj5 = method.invoke(objArray1[this], objArray2);
                if (obj5 != null && (obj7.remove(obj5) != null && obj7.isEmpty())) {
                   _monitor_exit(p0);
                   return true;
                }else {
                   this++;
                }
             }else {
                obj7 = obj7.values();
                objArray3 = PatchProxy.applyTwoRefs(obj7, objArray1, null, uoa, "3");
                if (objArray3 != PatchProxyResult.class) {
                   break ;
                }else {
                   objArray3 = Arrays.copyOf(objArray1, (objArray1.length + obj7.size()));
                   len1 = objArray1.length;
                   obj8 = obj7.iterator();
                   while (obj8.hasNext()) {
                      this = len1 + 1;
                      objArray3[len1] = obj8.next();
                      len1 = this;
                   }
                }
                break ;
             }
          }
          obj3.set(obj1, objArray3);
          obj8 = obj4.get(obj1);
          Objects.requireNonNull(obj8);
          Object[] objArray4 = new Object[]{Long.valueOf(obj8.longValue()),objArray3,Boolean.TRUE};
          a$b.h(objArray3).invoke(null, objArray4);
          objArray3 = new Object[]{Integer.valueOf(-1)};
          obj6.invoke(obj1, objArray3);
          _monitor_exit(p0);
          return true;
       }
    }
}
