package f66.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q87.d;
import com.kwai.logger.KwaiLog;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import f66.j;
import java.lang.Boolean;
import xf6.j;
import f66.g;
import pkd.a;
import com.kwai.framework.debuglog.DiagnosisClientLogLevel;
import f66.c;
import q87.e;
import q87.f;

public class d	// class@0015d6
{
    public static Boolean a;

    public void d(){
       super();
    }
    public static void a(String p0,String p1,String p2,Object[] p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "11")) {
          return;
       }
       KwaiLog.a(d.d(p0, p1, p2, p3));
       return;
    }
    public static void b(String p0,String p1,String p2,int p3,String p4,Object[] p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uod, "12")) {
             return;
          }
       }
       d uod1 = d.d(p0, p1, p2, p5);
       uod1.j = p3;
       uod1.i = p4;
       KwaiLog.a(uod1);
       return;
    }
    public static void c(String p0,String p1,String p2,int p3,String p4,Object[] p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uod, "9")) {
             return;
          }
       }
       d.b(p0, p1, p2, p3, p4, p5);
       return;
    }
    public static d d(String p0,String p1,String p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = -1;
       int i = p0.hashCode();
       int i1 = 4;
       if (i != 68) {
          if (i != 69) {
             if (i != 73) {
                if (i != 86) {
                   if (i == 87 && p0.equals("W")) {
                      obj = 1;
                   }
                }else if(p0.equals("V")){
                   obj = 5;
                }
             }else if(p0.equals("I")){
                obj = 3;
             }
          }else if(p0.equals("E")){
             obj = 0;
          }
       }else if(p0.equals("D")){
          obj = 4;
       }
       if (obj) {
          if (obj != 1) {
             if (obj != i1) {
                if (obj == 5) {
                   i1 = 1;
                }
             }else {
                i1 = 2;
             }
          }else {
             i1 = 8;
          }
       }else {
          i1 = 16;
       }
       p3 = new Object[0];
       return KwaiLog.k(p1, i1, p2, j.b(p3), p3);
    }
    public static boolean e(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.apply(null, null, uod, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (d.a == null) {
          boolean b = false;
          if (!j.a() && (!g.a() && !a.a)) {
             Object obj1 = PatchProxy.apply(null, null, uod, "3");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(c.a() == DiagnosisClientLogLevel.ERROR || c.a() == DiagnosisClientLogLevel.ALL){
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b1) {
             label_0050 :
                d.a = Boolean.valueOf(b);
             }
          }
       label_004f :
          b = true;
          goto label_0050 ;
       }
       return d.a.booleanValue();
    }
    public static void f(String p0,String p1,byte[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       d uod = KwaiLog.k(p0, 4, p1, "", objArray);
       uod.k = p2;
       f.b("network").d(uod);
       return;
    }
    public static void g(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.b("network").d(KwaiLog.k(p0, 4, p1, p2, objArray));
       return;
    }
}
