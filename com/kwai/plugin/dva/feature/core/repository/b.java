package com.kwai.plugin.dva.feature.core.repository.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import qj7.d;

public class b	// class@000e86
{
    public static final String a = "VERSION_NAME";
    public static final String b = "DYNAMIC_FEATURES";
    public static final String c = "QIGSAW_ID";
    public static final String d = "QIGSAW_MODE";
    public static String e;
    public static Class f;

    public void b(){
       super();
    }
    public static Class a(){
       Class obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = b.f;
          if (obj != null) {
             return obj;
          }
          obj = Class.forName(b.e+".QigsawConfig");
          b.f = obj;
          return obj;
       }catch(java.lang.ClassNotFoundException e0){
          d.c("Qigsaw Warning: Can\'t find class "+b.e+".QigsawConfig.class!");
          throw e0;
       }
    }
}
