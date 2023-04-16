package com.kwai.performance.stability.crash.monitor.excluded.ExcludedHwNsdImplNpe;
import sg7.d;
import sg7.b;
import sg7.a;
import com.kwai.performance.stability.crash.monitor.excluded.ExcludedHwNsdImplNpe$b;
import java.lang.Exception;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.reflect.Field;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.excluded.ExcludedHwNsdImplNpe$SafeHashMap;
import com.kwai.performance.stability.crash.monitor.excluded.ExcludedHwNsdImplNpe$a;
import java.util.HashMap;
import java.lang.ClassNotFoundException;
import yf7.h;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;

public class ExcludedHwNsdImplNpe extends d	// class@0011d2
{
    public static String f = "HwNsdImpl";

    public void ExcludedHwNsdImplNpe(b p0){
       super(p0);
    }
    public static a e(){
       return new ExcludedHwNsdImplNpe$b();
    }
    public boolean b(Exception p0){
       return false;
    }
    public void d(){
       if (this.a()) {
          return;
       }
       Class uClass = Class.forName("android.view.HwNsdImpl");
       Class[] uClassArray = new Class[0];
       Method declaredMeth = uClass.getDeclaredMethod("getDefault", uClassArray);
       declaredMeth.setAccessible(true);
       Object[] objArray = new Object[0];
       Object obj = declaredMeth.invoke(null, objArray);
       Field declaredFiel = uClass.getDeclaredField("mMapCheckResult");
       declaredFiel.setAccessible(true);
       Map map = declaredFiel.get(obj);
       ExcludedHwNsdImplNpe$SafeHashMap safeHashMap = new ExcludedHwNsdImplNpe$SafeHashMap(null);
       if (map != null) {
          safeHashMap.putAll(map);
       }
       declaredFiel.set(obj, safeHashMap);
       return;
    }
}
