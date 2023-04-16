package bz8.m;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import bz8.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class m	// class@0004a0
{
    public static final List a;
    public static final List b;
    public static final m c;

    static {
       Integer integer1;
       m.c = new m();
       Integer integer = Integer.valueOf(4);
       Integer[] integerArray = new Integer[]{integer1,Integer.valueOf(2),Integer.valueOf(3),integer};
       integer1 = Integer.valueOf(1);
       m.a = CollectionsKt__CollectionsKt.P(integerArray);
       integerArray = new Integer[]{integer1,integer};
       m.b = CollectionsKt__CollectionsKt.P(integerArray);
    }
    public void m(){
       super();
    }
    public final n a(int p0,Object p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, om, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          return null;
       }else {
          return new n(p0, p1);
       }
    }
}
