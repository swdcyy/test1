package mf7.e;
import mf7.d;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import mf7.c;
import mf7.b;
import mf7.g;
import mf7.f;
import mf7.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;

public final class e implements d	// class@001e97
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public void a(List p0){
       a.q(p0, "tasks");
       d[] uodArray = new d[]{new c(),new b(),new g(),new f(),new a()};
       Iterator iterator = CollectionsKt__CollectionsKt.P(uodArray).iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}
