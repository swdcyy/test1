package gk9.c;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gk9.b;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Integer;
import java.lang.Boolean;
import wkd.b;

public class c	// class@0024bc
{

    public void c(){
       super();
    }
    public static t a(String p0,String p1,String p2,String p3,String p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, uoc, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.f().s(p0, p1, p2, p3, p4);
    }
    public static t b(String p0,String p1,int p2,boolean p3,String p4,String p5,String p6,RequestTiming p7,String p8,String p9,String p10,String p11){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[12];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          Object obj = PatchProxy.apply(objArray, null, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.f().g(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
    public static t c(String p0,String p1,int p2,boolean p3,String p4,String p5,String p6,RequestTiming p7,String p8,String p9,String p10,String p11,boolean p12,int p13,int p14){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[15];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          objArray[12] = Boolean.valueOf(p12);
          objArray[13] = Integer.valueOf(p13);
          objArray[14] = Integer.valueOf(p14);
          Object obj = PatchProxy.apply(objArray, null, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.f().f(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
    }
    public static t d(String p0,String p1,String p2,String p3,String p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.f().n(p0, p1, p2, p3, p4);
    }
    public static t e(String p0,String p1,String p2,String p3,String p4,int p5,boolean p6,String p7,String p8,String p9,RequestTiming p10,int p11,int p12){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[13];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = Integer.valueOf(p11);
          objArray[12] = Integer.valueOf(p12);
          Object obj = PatchProxy.apply(objArray, null, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.f().b(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p11, p10, p12);
    }
    public static b f(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-437774926);
    }
}
