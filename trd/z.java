package trd.z;
import trd.y;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import trd.z0;
import trd.y0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import usd.k;

public class z extends y	// class@002593
{

    public void z(){
       super();
    }
    public static final List W0(List p0){
       a.p(p0, "$this$asReversed");
       return new z0(p0);
    }
    public static final List X0(List p0){
       a.p(p0, "$this$asReversed");
       return new y0(p0);
    }
    public static final int Y0(List p0,int p1){
       int i = CollectionsKt__CollectionsKt.G(p0);
       if (p1 >= 0 && i >= p1) {
          return (CollectionsKt__CollectionsKt.G(p0) - p1);
       }
       throw new IndexOutOfBoundsException("Element index "+p1+" must be in range ["+new k(0, CollectionsKt__CollectionsKt.G(p0))+"].");
    }
    public static final int Z0(List p0,int p1){
       int i = p0.size();
       if (p1 >= 0 && i >= p1) {
          return (p0.size() - p1);
       }
       throw new IndexOutOfBoundsException("Position index "+p1+" must be in range ["+new k(0, p0.size())+"].");
    }
}
