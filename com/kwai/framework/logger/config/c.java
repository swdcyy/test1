package com.kwai.framework.logger.config.c;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.sdk.switchconfig.a;
import y96.d;
import io7.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public class c	// class@000b90
{
    public static final Map a;
    public static SharedPreferences b;

    static {
       c.a = new HashMap();
       c.b = b.c("log_switch_config", 0);
    }
    public void c(){
       super();
    }
    public static void a(String p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "2")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       a.t().p(p0, new d(p1));
       return;
    }
    public static boolean b(String p0,boolean p1){
       Map obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (TextUtils.x(p0)) {
          return p1;
       }else {
          obj = c.a;
          if (!obj.containsKey(p0)) {
             boolean b = a.t().d(p0, p1);
             c.c(p0, Boolean.valueOf(b), p1);
             return b;
          }else {
             Boolean uBoolean = obj.get(p0);
             if (uBoolean != null) {
                return uBoolean.booleanValue();
             }else {
                return p1;
             }
          }
       }
    }
    public static void c(String p0,Boolean p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, c.class, "4")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       if (p1 != null) {
          c.a.put(p0, p1);
       }else {
          c.a.put(p0, Boolean.valueOf(p2));
       }
       return;
    }
}
