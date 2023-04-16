package com.kuaishou.utils.SnowLogHelperKt;
import com.kuaishou.utils.SnowLogHelperKt$sb$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class SnowLogHelperKt	// class@001194
{
    public static final p a;

    static {
       SnowLogHelperKt.a = s.c(SnowLogHelperKt$sb$2.INSTANCE);
    }
    public static final StringBuffer a(String p0,Object p1,StringBuffer p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, SnowLogHelperKt.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p2 = (p0 != null)? p2+", "+p0+" = "+SnowLogHelperKt.c(p1): null;
       return p2;
    }
    public static final String b(String p0,Object p1,String p2,Object p3,String p4,Object p5,String p6,Object p7,String p8,Object p9,String p10,Object p11){
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       object oobject6 = p7;
       object oobject7 = p8;
       object oobject8 = p9;
       object oobject9 = p10;
       object oobject10 = p11;
       SnowLogHelperKt snowLogHelpe = SnowLogHelperKt.class;
       if (PatchProxy.isSupport(snowLogHelpe)) {
          Object[] objArray = new Object[12];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = oobject4;
          objArray[6] = oobject5;
          objArray[7] = oobject6;
          objArray[8] = oobject7;
          objArray[9] = oobject8;
          objArray[10] = oobject9;
          objArray[11] = oobject10;
          Object obj = PatchProxy.apply(objArray, null, snowLogHelpe, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(oobject, "k1");
       (SnowLogHelperKt.d()).delete(0, (SnowLogHelperKt.d()).length())+": "+oobject+" = "+SnowLogHelperKt.c(p1);
       String str = SnowLogHelperKt.a(oobject1, oobject2, SnowLogHelperKt.d());
       if (str != null) {
          str = SnowLogHelperKt.a(oobject3, oobject4, str);
          if (str != null) {
             str = SnowLogHelperKt.a(oobject5, oobject6, str);
             if (str != null) {
                str = SnowLogHelperKt.a(oobject7, oobject8, str);
                if (str != null) {
                   SnowLogHelperKt.a(oobject9, oobject10, str);
                }
             }
          }
       }
       str = SnowLogHelperKt.d();
       a.o(str, "sb.toString\(\)");
       return str;
    }
    public static final String c(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SnowLogHelperKt.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.toString();
          if (p0 != null) {
          label_001b :
             return p0;
          }
       }
       p0 = "null";
       goto label_001b ;
    }
    public static final StringBuffer d(){
       Object obj = PatchProxy.apply(null, null, SnowLogHelperKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SnowLogHelperKt.a.getValue();
    }
}
