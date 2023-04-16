package ok.s$c;
import ok.s;
import ok.q;
import java.lang.Object;
import ok.n;
import java.lang.CharSequence;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.Iterable;
import ok.s$b;
import java.util.Iterator;
import java.lang.String;
import java.util.Collections;

public final class s$c	// class@0027fc
{
    public final s a;
    public final s b;

    public void s$c(s p0,s p1,q p2){
       super();
       this.a = p0;
       n.j(p1);
       this.b = p1;
    }
    public Map a(CharSequence p0){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = this.a.d(p0).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Iterator iterator1 = this.b.f(str);
          n.g(iterator1.hasNext(), "Chunk [%s] is not a valid entry", str);
          String str1 = iterator1.next();
          int i = linkedHashMa.containsKey(str1) ^ 0x01;
          n.g(i, "Duplicate key [%s] found.", str1);
          n.g(iterator1.hasNext(), "Chunk [%s] is not a valid entry", str);
          linkedHashMa.put(str1, iterator1.next());
          int i1 = iterator1.hasNext() ^ 0x01;
          n.g(i1, "Chunk [%s] is not a valid entry", str);
       }
       return Collections.unmodifiableMap(linkedHashMa);
    }
}
