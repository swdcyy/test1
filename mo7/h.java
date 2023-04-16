package mo7.h;
import android.content.SharedPreferences;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import mo7.e;
import com.google.gson.Gson;
import lo7.f;
import java.lang.Exception;

public class h	// class@001eba
{
    public String a;
    public String b;
    public SharedPreferences c;
    public Method d;
    public ConfigPriority e;

    public void h(SharedPreferences p0,ConfigPriority p1,String p2){
       super();
       this.e = p1;
       this.c = p0;
       this.b = p2;
       this.a = "user_"+this.b+"_";
    }
    public final String a(String p0){
       return "device_"+p0;
    }
    public String[] b(){
       String[] stringArray = null;
       try{
          int i = 0;
          if (this.d == null) {
             Class[] uClassArray = new Class[i];
             this.d = this.c.getClass().getMethod("allKeys", uClassArray);
          }
          h td = this.d;
          if (td != null) {
             Object[] objArray = new Object[i];
             stringArray = td.invoke(this.c, objArray);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public Map c(){
       object oobject;
       String[] stringArray = this.b();
       if (stringArray == null || !stringArray.length) {
          return new HashMap();
       }
       HashMap hashMap = new HashMap();
       int len = stringArray.length;
       int i = 0;
       int i1 = 0;
       String str = "";
       String str1 = null;
       while (i1 < len) {
          oobject = stringArray[i1];
          String str2 = "device_";
          if (oobject.startsWith(str2)) {
             SwitchConfig switchConfig = this.e(this.c.getString(oobject, str1));
             if (switchConfig != null) {
                hashMap.put(oobject.replaceFirst(str2, str), switchConfig);
             }
          }
          i1 = i1 + 1;
       }
       h tb = this.b;
       if (tb != null && !tb.isEmpty()) {
          String str3 = "user_"+this.b+"_";
          i1 = stringArray.length;
          while (i < i1) {
             oobject = stringArray[i];
             if (oobject.startsWith(str3)) {
                SwitchConfig switchConfig1 = this.e(this.c.getString(oobject, str1));
                if (switchConfig1 != null) {
                   hashMap.put(oobject.replaceFirst(str3, str), switchConfig1);
                }
             }
             i = i + 1;
          }
       }
       return hashMap;
    }
    public ConfigPriority d(){
       return this.e;
    }
    public final SwitchConfig e(String p0){
       try{
          if (p0 == null || p0.isEmpty()) {
          }else {
             SwitchConfig switchConfig = e.a.h(p0, SwitchConfig.class);
             switchConfig.setConfigPriority(this.e);
             return switchConfig;
          }
       }catch(java.lang.Exception e4){
          if (f.a()) {
             e4.getMessage();
          }
       }
    label_0024 :
       return null;
    }
    public final String f(String p0){
       return this.a+p0;
    }
}
