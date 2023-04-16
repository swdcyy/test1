package qrd.r0;
import java.lang.Object;
import kotlin.Pair;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.Triple;

public final class r0	// class@0022d5
{

    public static final Pair a(Object p0,Object p1){
       return new Pair(p0, p1);
    }
    public static final List b(Pair p0){
       a.p(p0, "$this$toList");
       Object[] objArray = new Object[]{p0.getFirst(),p0.getSecond()};
       return CollectionsKt__CollectionsKt.L(objArray);
    }
    public static final List c(Triple p0){
       a.p(p0, "$this$toList");
       Object[] objArray = new Object[]{p0.getFirst(),p0.getSecond(),p0.getThird()};
       return CollectionsKt__CollectionsKt.L(objArray);
    }
}
