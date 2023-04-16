package kotlin.collections.AbstractMap$a;
import java.lang.Object;
import nsd.u;
import java.util.Map$Entry;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class AbstractMap$a	// class@001828
{

    public void AbstractMap$a(){
       super();
    }
    public void AbstractMap$a(u p0){
       super();
    }
    public final boolean a(Map$Entry p0,Object p1){
       a.p(p0, "e");
       boolean b = false;
       if (!p1 instanceof Map$Entry) {
          return b;
       }
       if (a.g(p0.getKey(), p1.getKey()) && a.g(p0.getValue(), p1.getValue())) {
          b = true;
       }
       return b;
    }
    public final int b(Map$Entry p0){
       a.p(p0, "e");
       Object key = p0.getKey();
       int i = 0;
       int i1 = (key != null)? key.hashCode(): 0;
       p0 = p0.getValue();
       if (p0 != null) {
          i = p0.hashCode();
       }
       return (i1 ^ i);
    }
    public final String c(Map$Entry p0){
       a.p(p0, "e");
       return p0.getKey()+'='+p0.getValue();
    }
}
