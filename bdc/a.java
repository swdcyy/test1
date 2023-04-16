package bdc.a;
import bdc.b;
import bdc.a$a;
import bdc.c;
import java.util.LinkedHashMap;
import java.lang.Integer;
import bdc.a$b;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bdc.j;
import bdc.i;
import z1.k;
import bdc.m;
import bdc.l;
import yec.c;
import yec.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import kotlin.jvm.internal.a;

public final class a	// class@00044f
{
    public static final b a;
    public static final Map b;
    public static final a c;

    static {
       a.c = new a();
       a.a = new b(new a$a());
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       linkedHashMa.put(Integer.valueOf(0), a$b.b);
       a.b = linkedHashMa;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, a.class, "1")) {
       }else if(PatchProxy.applyVoid(objArray, objArray, j.class, "1")){
          a.d(1, i.b);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, m.class, "1")) {
          a.d(2, l.b);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, c.class, "1")) {
          a.d(3, b.b);
       }
    }
    public void a(){
       super();
    }
    public static final b a(){
       return a.a;
    }
    public static final boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getEntity() != null && (!r1.S2(p0.getEntity()) && (!r1.r3(p0.getEntity()) && !r1.k3(p0.getEntity()))))? true: false;
       return b;
    }
    public static final b c(int p0){
       b uob;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       k ok = a.b.get(Integer.valueOf(p0));
       if (ok != null) {
          uob = ok.get();
          if (uob != null) {
          label_0033 :
             return uob;
          }
       }
       uob = a.a;
       goto label_0033 ;
    }
    public static final void d(int p0,k p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoa, "2")) {
          return;
       }
       a.p(p1, "factory");
       a.b.put(Integer.valueOf(p0), p1);
       return;
    }
}
