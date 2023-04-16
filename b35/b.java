package b35.b;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kuaishou.utils.SnowLogHelperKt;
import java.lang.Long;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Number;
import android.os.SystemClock;
import jw4.c;

public final class b	// class@00033b
{
    public static final ConcurrentHashMap a;
    public static final b b;

    static {
       b.b = new b();
       b.a = new ConcurrentHashMap();
    }
    public void b(){
       super();
    }
    public static void d(b p0,String p1,String p2,String p3,Object p4,String p5,Object p6,String p7,Object p8,String p9,Object p10,String p11,Object p12,String p13,Object p14,int p15,Object p16){
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       int i = p15;
       object oobject3 = null;
       object oobject4 = (i & 0x10)? oobject3: p5;
       object oobject5 = (i & 0x20)? oobject3: p6;
       object oobject6 = (i & 0x40)? oobject3: p7;
       if (!(i & 0x0080)) {
          oobject3 = p8;
       }
       object oobject7 = null;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[14];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = p4;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = oobject6;
          objArray[7] = oobject3;
          objArray[8] = null;
          objArray[9] = null;
          objArray[10] = null;
          objArray[11] = null;
          objArray[12] = null;
          objArray[13] = oobject7;
          if (PatchProxy.applyVoid(objArray, p0, uob, "1")) {
          label_00d0 :
             return;
          }
       }else {
          int i1 = p0;
       }
       a.p(oobject, "tag");
       a.p(oobject1, "message");
       a.p(oobject2, "k1");
       p0.a(p1, oobject+oobject1, oobject1+SnowLogHelperKt.b(p3, p4, oobject4, oobject5, oobject6, oobject3, null, null, null, null, null, null), 1000);
       goto label_00d0 ;
    }
    public final void a(String p0,String p1,String p2,long p3){
       boolean b;
       ConcurrentHashMap obj;
       boolean b1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), this, b.class, "12")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "coldTimeKey");
       a.p(p2, "message");
       int i = 1;
       b = (!p2.length())? true: false;
       if (!b) {
          if (PatchProxy.isSupport(uob)) {
             obj = PatchProxy.applyTwoRefs(p1, Long.valueOf(p3), this, uob, "16");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             label_0081 :
                if (!b1) {
                   b.a.put(p1, Long.valueOf(SystemClock.elapsedRealtime()));
                   c.a(p0, p2);
                }
             }
          }
          obj = b.a;
          if (obj.get(p1) == null) {
             obj.put(p1, Long.valueOf(0));
          }
          Object obj1 = obj.get(p1);
          a.m(obj1);
          a.o(obj1, "tagIntervalMap[coldTimeKey]!!");
          if ((SystemClock.elapsedRealtime() - obj1.longValue()) - p3 >= 0) {
             i = 0;
          }
          b1 = i;
          goto label_0081 ;
       }
       return;
    }
    public final void b(String p0,String p1,String p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "11")) {
          return;
       }
       b.d(this, p0, p1, p2, p3, null, null, null, null, null, null, null, null, null, null, 0x3ff0, null);
       return;
    }
    public final void c(String p0,String p1,String p2,Object p3,String p4,Object p5,String p6,Object p7){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
             return;
          }
       }else {
          int i = this;
       }
       b.d(this, p0, p1, p2, p3, p4, p5, p6, p7, null, null, null, null, null, null, 0x3f00, null);
       return;
    }
}
