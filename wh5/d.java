package wh5.d;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.reflect.Type;
import java.lang.StringBuilder;
import java.lang.RuntimeException;

public final class d	// class@00275c
{
    public static final SharedPreferences a;
    public static final Map b;

    static {
       d.a = b.b("DefaultPreferenceHelper");
       d.b = new HashMap();
    }
    public void d(){
       super();
    }
    public static void a(String p0,boolean p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, d.class, "6")) {
          return;
       }
       String str = d.d(p0);
       if (!PatchProxy.applyVoidOneRefs(str, null, d.class, "7")) {
          d.b.remove(d.d(str));
       }
       if (p1) {
          p0 = d.d(p0);
          if (!PatchProxy.applyVoidOneRefs(p0, null, d.class, "8")) {
             SharedPreferences$Editor uEditor = d.a.edit();
             uEditor.remove(d.d(p0));
             g.a(uEditor);
          }
       }
       return;
    }
    public static Object b(String p0,Class p1){
       Map obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.b;
       if (obj.get(d.d(p0)) == null) {
          obj.put(d.d(p0), d.c(p0, p1));
       }
       try{
          return obj.get(d.d(p0));
       }catch(java.lang.Exception e3){
          if (!a.a().c()) {
             Log.e("ChildLockConfigPref", "sCacheMap.get convert error", e3);
             return v1;
          }else {
             throw e3;
          }
       }
    }
    public static Object c(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = d.a.getString(d.d(p0), "");
       if (!TextUtils.x(p0)) {
          return b.a(p0, p1);
       }
       return null;
    }
    public static String d(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.d("user");
       if (p0.startsWith(obj)) {
          return p0;
       }
       return obj+p0;
    }
    public static void e(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "3")) {
          return;
       }
       if (p1 == null) {
          d.a(p0, true);
       }else {
          Map b = d.b;
          Object obj = b.get(d.d(p0));
          if (obj != null && obj.getClass() != p1.getClass()) {
             String str = "duplicated key for different type";
             if (!a.a().c()) {
                Log.e("ChildLockConfigPref", "", new RuntimeException(str));
             }else {
                throw new RuntimeException(str);
             }
          }
          b.put(d.d(p0), p1);
          SharedPreferences$Editor uEditor = d.a.edit();
          uEditor.putString(d.d(p0), b.e(p1));
          g.a(uEditor);
       }
       return;
    }
    public static String f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.startsWith("0")) {
          return p0;
       }
       return "0"+p0;
    }
}
