package d61.k0;
import java.lang.Object;
import d61.k0$a;
import com.google.common.base.Optional;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class k0	// class@001f29
{

    public void k0(){
       super();
    }
    public static Optional a(Object p0,k0$a p1){
       k0$a[] obj = PatchProxy.applyTwoRefs(p0, p1, null, k0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new k0$a[]{p1};
       return k0.f(p0, obj);
    }
    public static Optional b(Object p0,k0$a p1,k0$a p2){
       k0$a[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, k0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new k0$a[]{p1,p2};
       return k0.f(p0, obj);
    }
    public static Optional c(Object p0,k0$a p1,k0$a p2,k0$a p3){
       k0$a[] obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, k0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new k0$a[]{p1,p2,p3};
       return k0.f(p0, obj);
    }
    public static Optional d(Object p0,k0$a p1,k0$a p2,k0$a p3,k0$a p4){
       k0$a[] obj;
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, ok0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new k0$a[]{p1,p2,p3,p4};
       return k0.f(p0, obj);
    }
    public static Optional e(Object p0,k0$a p1,k0$a p2,k0$a p3,k0$a p4,k0$a p5){
       k0$a[] obj;
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, null, ok0, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new k0$a[]{p1,p2,p3,p4,p5};
       return k0.f(p0, obj);
    }
    public static Optional f(Object p0,k0$a[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, k0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return Optional.fromNullable(p0);
          }
          object oobject = p1[i];
          if (p0 == null) {
             break ;
          }else {
             p0 = oobject.get(p0);
             i = i + 1;
          }
       }
       return Optional.absent();
    }
}
