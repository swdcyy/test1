package wk7.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import vid.b;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class e	// class@002767
{

    public void e(){
       super();
    }
    public static Boolean a(String p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Boolean.valueOf(e.d().getBoolean(p0, p1));
    }
    public static int b(String p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoe, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return e.d().getInt(p0, p1);
    }
    public static long c(String p0,long p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return e.d().getLong(p0, p1);
    }
    public static SharedPreferences d(){
       Object obj = PatchProxy.apply(null, null, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(Azeroth2.B.d(), "PRIVACY_KIT", 0);
    }
    public static String e(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.d().getString(p0, p1);
    }
    public static void f(String p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "5")) {
          return;
       }
       SharedPreferences$Editor uEditor = e.d().edit();
       uEditor.putBoolean(p0, p1);
       g.a(uEditor);
       return;
    }
    public static void g(String p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoe, "3")) {
          return;
       }
       SharedPreferences$Editor uEditor = e.d().edit();
       uEditor.putInt(p0, p1);
       g.a(uEditor);
       return;
    }
    public static void h(String p0,long p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uoe, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = e.d().edit();
       uEditor.putLong(p0, p1);
       g.a(uEditor);
       return;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "7")) {
          return;
       }
       SharedPreferences$Editor uEditor = e.d().edit();
       uEditor.putString(p0, p1);
       g.a(uEditor);
       return;
    }
}
