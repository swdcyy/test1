package a10.d;
import a10.f;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import z1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Iterable;
import b35.d;
import java.nio.ByteBuffer;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import a10.c;
import a10.b;
import a10.a;

public class d implements f	// class@00000e
{
    public final Set b;

    public void d(){
       super();
       this.b = Collections.newSetFromMap(new ConcurrentHashMap(8));
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       d.b(this.b, p0);
       return;
    }
    public void c2(int p0,ByteBuffer p1,int p2,int p3,int p4,long p5,short p6,int p7){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),Short.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uod, "7")) {
             return;
          }
       }
       c uoc = new c(p0, p1, p2, p3, p4, p5, p6, p7);
       this.a(uod);
       return;
    }
    public void onQosEventUpdated(int p0,String p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "5")) {
          return;
       }
       this.a(new b(p0, p1));
       return;
    }
    public void v3(int p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "6")) {
          return;
       }
       this.a(new a(p0, p1));
       return;
    }
}
