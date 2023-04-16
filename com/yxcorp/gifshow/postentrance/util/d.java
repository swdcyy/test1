package com.yxcorp.gifshow.postentrance.util.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ezb.k;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.util.Map;
import com.yxcorp.gifshow.postentrance.util.c;
import java.lang.reflect.Type;
import java.lang.Integer;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class d	// class@001093
{

    public void d(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return k.a.getInt(b.d("user")+"camera_icon_show_times", 0);
    }
    public static int b(){
       Object obj = PatchProxy.apply(null, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return k.a.getInt(b.d("user")+"camera_icon_version", 0);
    }
    public static Map c(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, d.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.t;
       String str = k.a.getString("home_post_bubble_failed_id_map", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public static Map d(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.v;
       String str = k.a.getString("home_post_local_bubble_shown_record", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public static Map e(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.u;
       String str = k.a.getString("post_entrance_bubble_show_record_map", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public static Map f(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.w;
       String str = k.a.getString(b.d("user")+"validate_task_failed_time_stamp", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public static void g(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uod, "5")) {
          return;
       }
       SharedPreferences$Editor uEditor = k.a.edit();
       uEditor.putInt(b.d("user")+"camera_icon_show_times", p0);
       g.a(uEditor);
       return;
    }
    public static void h(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "20")) {
          return;
       }
       SharedPreferences$Editor uEditor = k.a.edit();
       uEditor.putString("home_post_local_bubble_shown_record", b.e(p0));
       g.a(uEditor);
       return;
    }
}
