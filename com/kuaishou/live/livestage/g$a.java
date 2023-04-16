package com.kuaishou.live.livestage.g$a;
import java.lang.Object;
import je3.i;
import je3.k;
import je3.c;
import je3.n;
import ee3.f;
import ee3.z;
import ee3.g;
import oe3.f;
import ee3.a;
import ee3.g$a;
import je3.g;
import com.kuaishou.live.livestage.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ee3.i;

public final class g$a	// class@000bed
{
    public static final g$a a;

    static {
       g$a.a = new g$a();
    }
    public void g$a(){
       super();
    }
    public static a b(g$a p0,i p1,k p2,c p3,n p4,f p5,z p6,g p7,f p8,int p9,Object p10){
       g og = (p9 & 0x40)? g.b.a(): null;
       return p0.a(p1, p2, p3, p4, p5, p6, og, p8);
    }
    public static g d(g$a p0,i p1,k p2,g p3,c p4,n p5,f p6,z p7,g p8,f p9,int p10,Object p11){
       g og = (p10 & 0x0080)? g.b.a(): null;
       return p0.c(p1, p2, p3, p4, p5, p6, p7, og, p9);
    }
    public final a a(i p0,k p1,c p2,n p3,f p4,z p5,g p6,f p7){
       i obj;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       object oobject6 = p7;
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,oobject2,oobject3,oobject4,oobject5,oobject6};
          obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p1, "snow");
       a.p(p2, "camera");
       a.p(oobject2, "renderViewFactory");
       a.p(oobject3, "serverTimeClock");
       a.p(oobject4, "self");
       a.p(oobject5, "context");
       a.p(oobject6, "switch");
       obj = new i(true, p1, null, p2, p3, p4, p5, p6, p7);
       return v11;
    }
    public final g c(i p0,k p1,g p2,c p3,n p4,f p5,z p6,g p7,f p8){
       i obj;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       object oobject6 = p7;
       object oobject7 = p8;
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = oobject4;
          objArray[6] = oobject5;
          objArray[7] = oobject6;
          objArray[8] = oobject7;
          obj = PatchProxy.apply(objArray, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p1, "snow");
       a.p(p2, "player");
       a.p(oobject2, "camera");
       a.p(oobject3, "renderViewFactory");
       a.p(oobject4, "serverTimeClock");
       a.p(oobject5, "self");
       a.p(oobject6, "context");
       a.p(oobject7, "switch");
       obj = new i(false, p1, p2, p3, p4, p5, p6, p7, p8);
       return v10;
    }
}
