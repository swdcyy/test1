package qk.o0;
import java.util.SortedSet;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import java.lang.Iterable;
import java.lang.Object;
import ok.n;
import qk.n0;

public final class o0	// class@002a0e
{

    public static Comparator a(SortedSet p0){
       Comparator uComparator = p0.comparator();
       if (uComparator == null) {
          uComparator = Ordering.natural();
       }
       return uComparator;
    }
    public static boolean b(Comparator p0,Iterable p1){
       Comparator uComparator;
       n.j(p0);
       n.j(p1);
       if (p1 instanceof SortedSet) {
          uComparator = o0.a(p1);
       }else if(p1 instanceof n0){
          uComparator = p1.comparator();
       }else {
          return false;
       }
       return p0.equals(uComparator);
    }
}
