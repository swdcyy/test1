package bq6.l1;
import erd.o;
import bq6.p2;
import l85.c;
import java.util.List;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.lang.String;
import l85.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.imsdk.d;
import eq6.b;
import java.lang.StringBuilder;
import java.lang.Iterable;
import brd.t;
import bq6.j1;
import bq6.v;
import brd.a0;
import bq6.v1;
import bq6.y1;

public final class l1 implements o	// class@00059b
{
    public final p2 b;
    public final c c;
    public final int d;
    public final List e;

    public void l1(p2 p0,c p1,int p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       l1 tb = this.b;
       l1 tc = this.c;
       l1 td = this.d;
       l1 te = this.e;
       Objects.requireNonNull(tb);
       Set set = p0.keySet();
       b.a(tc.d("start to deal folder references"));
       ArrayList uArrayList = new ArrayList();
       p0 = p0.entrySet().iterator();
       while (p0.hasNext()) {
          Map$Entry uEntry = p0.next();
          Iterator iterator = uEntry.getValue().iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             b uob = new b();
             uob.j(uEntry.getKey());
             uob.g(uod.getTarget());
             uob.h(uod.getTargetType());
             uArrayList.add(uob);
          }
       }
       b.a(tc.d("references: "+uArrayList));
       return t.fromIterable(uArrayList).flatMap(new j1(tb, tc)).map(new v(td)).toList().w(new v1(tb, te, tc, td)).flatMap(new y1(tb, set));
    }
}
