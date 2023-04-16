package trd.a0;
import trd.z;
import java.lang.Iterable;
import java.lang.Class;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import msd.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Comparator;

public class a0 extends z	// class@002567
{

    public void a0(){
       super();
    }
    public static final List a1(Iterable p0,Class p1){
       a.p(p0, "$this$filterIsInstance");
       a.p(p1, "klass");
       return a0.b1(p0, new ArrayList(), p1);
    }
    public static final Collection b1(Iterable p0,Collection p1,Class p2){
       a.p(p0, "$this$filterIsInstanceTo");
       a.p(p1, "destination");
       a.p(p2, "klass");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (p2.isInstance(obj)) {
             p1.add(obj);
          }
       }
       return p1;
    }
    public static final void c1(List p0){
       a.p(p0, "$this$reverse");
       Collections.reverse(p0);
    }
    public static final BigDecimal d1(Iterable p0,l p1){
       BigDecimal uBigDecimal = BigDecimal.valueOf((long)0);
       a.o(uBigDecimal, "BigDecimal.valueOf\(this.toLong\(\)\)");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uBigDecimal = uBigDecimal.add(p1.invoke(iterator.next()));
          a.o(uBigDecimal, "this.add\(other\)");
       }
       return uBigDecimal;
    }
    public static final BigInteger e1(Iterable p0,l p1){
       BigInteger uBigInteger = BigInteger.valueOf((long)0);
       a.o(uBigInteger, "BigInteger.valueOf\(this.toLong\(\)\)");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uBigInteger = uBigInteger.add(p1.invoke(iterator.next()));
          a.o(uBigInteger, "this.add\(other\)");
       }
       return uBigInteger;
    }
    public static final SortedSet f1(Iterable p0){
       a.p(p0, "$this$toSortedSet");
       return CollectionsKt___CollectionsKt.B5(p0, new TreeSet());
    }
    public static final SortedSet g1(Iterable p0,Comparator p1){
       a.p(p0, "$this$toSortedSet");
       a.p(p1, "comparator");
       return CollectionsKt___CollectionsKt.B5(p0, new TreeSet(p1));
    }
}
