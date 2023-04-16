package com.kuaishou.aegon.okhttp.CronetInterceptorConfig;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.aegon.okhttp.CronetInterceptorConfig$ListType;
import bo.t;
import io.a;

public class CronetInterceptorConfig	// class@0005ea
{
    public static String[] a;
    public static String[] b;
    public static Map c;
    public static String[] d;
    public static boolean e;
    public static boolean f;
    public static int g;

    static {
       CronetInterceptorConfig.c = new HashMap();
       CronetInterceptorConfig.d = null;
       CronetInterceptorConfig.e = false;
       CronetInterceptorConfig.f = true;
       CronetInterceptorConfig.g = 0;
    }
    public void CronetInterceptorConfig(){
       super();
    }
    public static boolean a(String p0,String[] p1,boolean p2){
       if (PatchProxy.isSupport(CronetInterceptorConfig.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, CronetInterceptorConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != null && p1 != null) {
          int len = p1.length;
          int i = 0;
          while (i < len) {
             object oobject = p1[i];
             if (oobject != null) {
                if (("*").equals(oobject)) {
                   return true;
                }else if(p2 && p0.startsWith(oobject)){
                   return true;
                }else if(!p2 && p0.equals(oobject)){
                   return true;
                }
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static void b(String[] p0,CronetInterceptorConfig$ListType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, CronetInterceptorConfig.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          Object[] objArray = new Object[]{p1.getType(),p0[i]};
          t.c("CronetInterceptorConfig", String.format("Set cronet interceptor %s: %s", objArray));
       }
       if (p1 == CronetInterceptorConfig$ListType.WHITE_LIST) {
          CronetInterceptorConfig.a = p0;
       }else if(p1 == CronetInterceptorConfig$ListType.BLACK_LIST){
          CronetInterceptorConfig.b = p0;
       }
       return;
    }
    public static void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CronetInterceptorConfig.class, "3")) {
          return;
       }
       CronetInterceptorConfig.b(a.a(p0), CronetInterceptorConfig$ListType.WHITE_LIST);
       return;
    }
}
