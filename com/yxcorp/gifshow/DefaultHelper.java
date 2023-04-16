package com.yxcorp.gifshow.DefaultHelper;
import android.content.SharedPreferences;
import oe6.n;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import com.yxcorp.gifshow.DefaultHelper$2;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.yxcorp.gifshow.DefaultHelper$1;
import java.lang.Boolean;
import java.lang.Long;

public class DefaultHelper	// class@0012e4
{
    public static final SharedPreferences a;
    public static HashMap b;

    static {
       DefaultHelper.a = n.b();
       DefaultHelper.b = new HashMap();
    }
    public void DefaultHelper(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, DefaultHelper.class, "3")) {
          return;
       }
       SharedPreferences$Editor uEditor = DefaultHelper.a.edit();
       uEditor.remove("predict_tab");
       g.a(uEditor);
       return;
    }
    public static HashMap b(){
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, objArray, DefaultHelper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       String str = DefaultHelper.a.getString("child_xtab", objArray);
       if (str == null) {
          return obj;
       }
       return new Gson().i(str, new DefaultHelper$2().getType());
    }
    public static String c(){
       Object obj = PatchProxy.apply(null, null, DefaultHelper.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DefaultHelper.a.getString("default_xtab", "");
    }
    public static HashMap d(){
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, objArray, DefaultHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       String str = DefaultHelper.a.getString("has_enter_child_tab", objArray);
       if (str == null) {
          return obj;
       }
       return new Gson().i(str, new DefaultHelper$1().getType());
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, DefaultHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return DefaultHelper.a.getBoolean("enter_xtab", false);
    }
    public static Long f(){
       Object obj = PatchProxy.apply(null, null, DefaultHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Long.valueOf(DefaultHelper.a.getLong("last_enter_xtab_enter", 0));
    }
    public static String g(){
       Object obj = PatchProxy.apply(null, null, DefaultHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DefaultHelper.a.getString("last_memory_xtab", "");
    }
    public static void h(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DefaultHelper.class, "10")) {
          return;
       }
       SharedPreferences$Editor uEditor = DefaultHelper.a.edit();
       uEditor.putString("has_enter_child_tab", new Gson().q(p0));
       g.a(uEditor);
       return;
    }
    public static void i(boolean p0){
       DefaultHelper uDefaultHelp = DefaultHelper.class;
       if (PatchProxy.isSupport(uDefaultHelp) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uDefaultHelp, "6")) {
          return;
       }
       SharedPreferences$Editor uEditor = DefaultHelper.a.edit();
       uEditor.putBoolean("enter_xtab", p0);
       g.a(uEditor);
       return;
    }
    public static void j(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DefaultHelper.class, "14")) {
          return;
       }
       SharedPreferences$Editor uEditor = DefaultHelper.a.edit();
       uEditor.putBoolean("isPredictorTab", p0.booleanValue());
       g.a(uEditor);
       return;
    }
    public static void k(long p0){
       DefaultHelper uDefaultHelp = DefaultHelper.class;
       if (PatchProxy.isSupport(uDefaultHelp) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uDefaultHelp, "4")) {
          return;
       }
       SharedPreferences$Editor uEditor = DefaultHelper.a.edit();
       uEditor.putLong("last_enter_xtab_enter", p0);
       g.a(uEditor);
       return;
    }
}
