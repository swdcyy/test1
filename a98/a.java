package a98.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Application;
import zi8.p;
import android.content.Context;
import ekd.l1;
import com.yxcorp.utility.RomUtils;
import android.os.Build;
import android.os.Build$VERSION;
import android.content.res.Resources;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public class a	// class@00004f
{
    public static Boolean a;
    public static final String[] b;

    static {
       String[] stringArray = new String[]{"V1932A","V1932T","V1938A","V1938T","V1949A","V1949T"};
       a.b = stringArray;
    }
    public void a(){
       super();
    }
    public static boolean a(){
       Object[] objArray = null;
       Resources obj = PatchProxy.apply(objArray, objArray, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.a != null) {
          return a.a.booleanValue();
       }
       a.a = Boolean.valueOf(l1.a(p.a()));
       boolean b = true;
       if (a.a.booleanValue()) {
          return b;
       }
       if (RomUtils.w()) {
          a.a = Boolean.valueOf(a.b(Build.MODEL));
          return a.a.booleanValue();
       }else if(Build$VERSION.SDK_INT >= 26){
          try{
             obj = p.a().getResources();
             int identifier = obj.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
             if (identifier > 0) {
                objArray = obj.getString(identifier);
             }
             if (TextUtils.x(objArray)) {
                b = false;
             }
             a.a = Boolean.valueOf(b);
          }catch(java.lang.Exception e0){
             Log.k(e0);
          }
       }
    }
    public static boolean b(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.b;
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if ((obj[i]).equalsIgnoreCase(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
