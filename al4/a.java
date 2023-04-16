package al4.a;
import java.lang.Object;
import al4.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import el4.m;
import el4.d;
import el4.o;
import el4.k;
import el4.q;
import bl4.h;
import bl4.g;
import bl4.l;
import bl4.f;
import bl4.n;
import bl4.e;
import bl4.j;
import dl4.b;

public class a	// class@000093
{

    public void a(){
       super();
    }
    public static b a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 3001) {
          switch (p0){
              case 1001:
                return new j();
              case 1002:
                return new e();
              case 1003:
                return new n();
              case 1004:
                return new f();
              case 1005:
                return new l();
              case 1006:
                return new g();
              case 1007:
                return new h();
              default:
                switch (p0){
                    case 2001:
                      return new q();
                    case 2002:
                      return new k();
                    case 2003:
                      return new o();
                    case 2004:
                      return new d();
                    case 2005:
                      return new m();
                    default:
                      return null;
                }
          }
       }else {
          return new b();
       }
    }
}
