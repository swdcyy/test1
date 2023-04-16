package f3b.d;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences;
import vid.b;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class d	// class@0015be
{

    public void d(){
       super();
    }
    public static int a(Context p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, d.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == null || TextUtils.x(p2)) {
          return p3;
       }else {
          return b.c(p0, p1, 4).getInt(p2, p3);
       }
    }
    public static String b(Context p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || TextUtils.x(p1)) {
          return p2;
       }
       return b.c(p0, "log_store", 4).getString(p1, p2);
    }
    public static void c(Context p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, d.class, "7")) {
          return;
       }
       if (p0 != null && !TextUtils.x(p2)) {
          SharedPreferences$Editor uEditor = b.c(p0, p1, 4).edit();
          uEditor.putInt(p2, p3);
          g.a(uEditor);
       }
       return;
    }
    public static void d(Context p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "1")) {
          return;
       }
       if (p0 != null && !TextUtils.x(p1)) {
          SharedPreferences$Editor uEditor = b.c(p0, "log_store", 4).edit();
          uEditor.putString(p1, p2);
          g.a(uEditor);
       }
       return;
    }
}
