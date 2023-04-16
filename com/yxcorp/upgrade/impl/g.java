package com.yxcorp.upgrade.impl.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zjd.d;
import akd.p;
import android.app.Application;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.Exception;
import com.yxcorp.upgrade.impl.g$a;
import android.content.SharedPreferences;
import akd.b0;
import java.lang.CharSequence;
import android.text.TextUtils;
import akd.v;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class g	// class@000999
{
    public static String a = "";

    public void g(){
       super();
    }
    public static String a(){
       return g.a;
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c().getApplication().getPackageName()+p0+".apk";
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return g.a()+File.separator+g.b(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return v1;
       }
    }
    public static g$a d(){
       Object[] objArray = null;
       SharedPreferences obj = PatchProxy.apply(objArray, objArray, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b0.a();
       String str = obj.getString("upgrade_title", objArray);
       String str1 = obj.getString("upgrade_content", objArray);
       String str2 = obj.getString("upgrade_version", objArray);
       long l = 0;
       long longx = obj.getLong("upgrade_time", l);
       int i = -1;
       int intx = obj.getInt("upgrade_version_code", i);
       if (TextUtils.isEmpty(str) || (TextUtils.isEmpty(str1) || (TextUtils.isEmpty(str2) || (intx != i && longx - l)))) {
          g$a uoa = new g$a(str, str1, str2, longx, intx);
       }
    label_0056 :
       return objArray;
    }
    public static String e(){
       g$a obj = PatchProxy.apply(null, null, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = g.d();
       if (obj != null) {
          return g.c(obj.c);
       }
       return null;
    }
    public static void f(){
       if (PatchProxy.applyVoid(null, null, g.class, "4")) {
          return;
       }
       String str = g.e();
       if (str != null) {
          v.b(str);
       }
       return;
    }
    public static void g(g$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "3")) {
          return;
       }
       SharedPreferences$Editor uEditor = b0.a().edit();
       uEditor.putString("upgrade_title", p0.a);
       uEditor.putString("upgrade_content", p0.b);
       uEditor.putString("upgrade_version", p0.c);
       uEditor.putLong("upgrade_time", p0.d);
       uEditor.putInt("upgrade_version_code", p0.e);
       g.a(uEditor);
       return;
    }
}
