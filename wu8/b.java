package wu8.b;
import wu8.v;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.experiment.ABConfig;
import android.content.SharedPreferences;
import wu8.a;
import java.util.Map;
import java.util.HashMap;
import java.lang.Class;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class b	// class@002784
{
    public v a;
    public String b;

    public void b(v p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public ABConfig a(String p0){
       SharedPreferences sharedPrefer = this.a.c(this.b);
       ABConfig uABConfig = (sharedPrefer != null)? a.a(sharedPrefer.getString(p0, null)): null;
       if (uABConfig == null) {
          SharedPreferences sharedPrefer1 = this.a.a();
          if (sharedPrefer1 != null) {
             uABConfig = a.a(sharedPrefer1.getString(p0, null));
          }
       }
       if (uABConfig != null) {
          uABConfig.setKey(p0);
       }
       return uABConfig;
    }
    public Map b(){
       Map map;
       HashMap hashMap = new HashMap();
       SharedPreferences sharedPrefer = this.a.a();
       if (sharedPrefer != null) {
          map = this.c(sharedPrefer);
          if (map == null) {
             map = this.d(sharedPrefer);
          }
          if (map.size() > 0) {
             hashMap.putAll(map);
          }
       }
       sharedPrefer = this.a.c(this.b);
       if (sharedPrefer != null) {
          map = this.c(sharedPrefer);
          if (map == null) {
             map = this.d(sharedPrefer);
          }
          if (map.size() > 0) {
             hashMap.putAll(map);
          }
       }
       return hashMap;
    }
    public final Map c(SharedPreferences p0){
       int i;
       HashMap hashMap = new HashMap();
       try{
          i = 0;
          int i1 = 0;
          Class[] uClassArray = new Class[i1];
          Object[] objArray = new Object[i1];
          String[] stringArray = p0.getClass().getMethod("allKeys", uClassArray).invoke(p0, objArray);
          if (stringArray != null && stringArray.length > 0) {
             int len = stringArray.length;
             while (i1 < len) {
                object oobject = stringArray[i1];
                ABConfig uABConfig = a.a(p0.getString(oobject, i));
                if (uABConfig != null) {
                   uABConfig.setKey(oobject);
                   hashMap.put(oobject, uABConfig);
                }
                i1 = i1 + 1;
             }
          }
          return hashMap;
       }catch(java.lang.Exception e0){
          return i;
       }
    }
    public final Map d(SharedPreferences p0){
       HashMap hashMap = new HashMap();
       Map all = p0.getAll();
       if (all != null && all.size() > 0) {
          Iterator iterator = all.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             ABConfig value = uEntry.getValue();
             if (key == null || value == null) {
                continue ;
             }else {
                value = a.a(p0.getString(key, null));
                if (value != null) {
                   value.setKey(key);
                   hashMap.put(key, value);
                }
             }
          }
       }
       return hashMap;
    }
}
