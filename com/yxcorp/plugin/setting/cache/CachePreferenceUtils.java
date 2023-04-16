package com.yxcorp.plugin.setting.cache.CachePreferenceUtils;
import com.yxcorp.plugin.setting.cache.CachePreferenceUtils$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v56.g;
import android.content.SharedPreferences;
import km8.b;
import java.util.HashMap;

public class CachePreferenceUtils	// class@000827
{
    public static final Type a;

    static {
       CachePreferenceUtils.a = new CachePreferenceUtils$1().getType();
    }
    public void CachePreferenceUtils(){
       super();
    }
    public static Map a(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, CachePreferenceUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = CachePreferenceUtils.a;
       String str = g.a.getString("CleanableCacheMap", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          return new HashMap();
       }else {
          return objArray;
       }
    }
}
