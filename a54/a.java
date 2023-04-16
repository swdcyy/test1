package a54.a;
import ra4.a;
import java.lang.String;
import java.util.Map;
import com.kuaishou.merchant.preload.net.MethodRequest;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d34.c;
import d34.b;
import brd.t;
import a54.a$a;
import a54.a$b;
import erd.g;
import crd.b;
import java.util.List;
import va4.c;
import java.lang.Integer;
import va4.a;
import nsd.u;

public final class a extends a	// class@00002a
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public String a(){
       return "MERCHANT_AUDIENCE_ON_SALE_ULTRON";
    }
    public void c(Map p0,MethodRequest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       if (p1.getParamMap() != null) {
          b.a().e1(p0, p1.getParamMap()).subscribe(a$a.b, a$b.b);
       }
       return;
    }
    public void e(List p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, a.class, "2")) {
          return;
       }
       c uoc = new c(Integer.valueOf(0x7f0d04e2), 1, 0, null, null, 28, null);
       obj.add(v1);
       c uoc1 = new c(Integer.valueOf(0x7f0d068b), 6, 0, null, null, 28, null);
       obj.add(v1);
       uoc = new c(Integer.valueOf(0x7f0d0a55), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc1 = new c(Integer.valueOf(0x7f0d0687), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc = new c(Integer.valueOf(0x7f0d0689), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc1 = new c(Integer.valueOf(0x7f0d0686), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc = new c(Integer.valueOf(0x7f0d0688), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc1 = new c(Integer.valueOf(0x7f0d0aa1), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc = new c(Integer.valueOf(0x7f0d0aa2), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc1 = new c(Integer.valueOf(0x7f0d033f), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc = new c(Integer.valueOf(0x7f0d024b), 1, 0, null, null, 28, null);
       obj.add(v1);
       return;
    }
}
