package dv8.b;
import android.content.SharedPreferences;
import java.lang.Object;
import java.util.Map;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import com.yxcorp.experiment.logger.LogEventWrapper;
import wu8.a;
import java.lang.Long;
import java.lang.Exception;
import java.lang.CharSequence;
import yb7.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.Set;
import java.util.Iterator;

public class b	// class@0020ec
{
    public final SharedPreferences a;

    public void b(SharedPreferences p0){
       super();
       this.a = p0;
    }
    public synchronized Map a(){
       try{
          HashMap hashMap = new HashMap();
          int i = 0;
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          String[] stringArray = this.a.getClass().getMethod("allKeys", uClassArray).invoke(this.a, objArray);
          if (stringArray != null && stringArray.length > 0) {
             int len = stringArray.length;
             while (i < len) {
                object oobject = stringArray[i];
                LogEventWrapper logEventWrap = a.e(this.a.getString(oobject, null), LogEventWrapper.class);
                if (logEventWrap != null) {
                   try{
                      hashMap.put(Long.valueOf(oobject), logEventWrap);
                   }catch(java.lang.Exception e4){
                      e4.printStackTrace();
                   }
                }
                i = i + 1;
             }
          }
          return hashMap;
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public synchronized void b(Long p0,LogEventWrapper p1){
       if (p0 == null) {
          return;
       }
       String str = a.d(p1);
       if (!o.c(str)) {
          g.a(this.a.edit().putString(String.valueOf(p0), str));
       }
       return;
    }
    public synchronized void c(Set p0){
       if (p0 == null || !p0.size()) {
          return;
       }
       SharedPreferences$Editor uEditor = this.a.edit();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uEditor.remove(String.valueOf(iterator.next()));
       }
       g.a(uEditor);
       return;
    }
}
