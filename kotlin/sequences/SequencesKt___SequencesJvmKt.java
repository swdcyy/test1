package kotlin.sequences.SequencesKt___SequencesJvmKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import wsd.m;
import msd.l;
import java.math.BigInteger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collection;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.Comparator;
import java.lang.Class;
import kotlin.sequences.SequencesKt___SequencesJvmKt$filterIsInstance$1;
import java.util.Objects;
import java.math.BigDecimal;

public class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt	// class@0018c6
{

    public void SequencesKt___SequencesJvmKt(){
       super();
    }
    public static final BigInteger A(m p0,l p1){
       BigInteger uBigInteger = BigInteger.valueOf((long)0);
       a.o(uBigInteger, "BigInteger.valueOf\(this.toLong\(\)\)");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uBigInteger = uBigInteger.add(p1.invoke(iterator.next()));
          a.o(uBigInteger, "this.add\(other\)");
       }
       return uBigInteger;
    }
    public static final SortedSet B(m p0){
       a.p(p0, "$this$toSortedSet");
       return SequencesKt___SequencesKt.T2(p0, new TreeSet());
    }
    public static final SortedSet C(m p0,Comparator p1){
       a.p(p0, "$this$toSortedSet");
       a.p(p1, "comparator");
       return SequencesKt___SequencesKt.T2(p0, new TreeSet(p1));
    }
    public static final m x(m p0,Class p1){
       a.p(p0, "$this$filterIsInstance");
       a.p(p1, "klass");
       p0 = SequencesKt___SequencesKt.i0(p0, new SequencesKt___SequencesJvmKt$filterIsInstance$1(p1));
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
       return p0;
    }
    public static final Collection y(m p0,Collection p1,Class p2){
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
    public static final BigDecimal z(m p0,l p1){
       BigDecimal uBigDecimal = BigDecimal.valueOf((long)0);
       a.o(uBigDecimal, "BigDecimal.valueOf\(this.toLong\(\)\)");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uBigDecimal = uBigDecimal.add(p1.invoke(iterator.next()));
          a.o(uBigDecimal, "this.add\(other\)");
       }
       return uBigDecimal;
    }
}
