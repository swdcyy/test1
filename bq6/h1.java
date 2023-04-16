package bq6.h1;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import eq6.a;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import brd.t;

public final class h1 implements o	// class@00058a
{
    public final p2 b;
    public final c c;

    public void h1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       h1 tb = this.b;
       h1 tc = this.c;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          a uoa = p0.next();
          if (uoa.h()) {
             uArrayList1.add(uoa);
          }else {
             uArrayList.add(uoa);
          }
       }
       b.a(tc.d("added folder list: "+uArrayList.size()));
       b.a(tc.d("deleted folder list: "+uArrayList1.size()));
       if (uArrayList.size() > 0) {
          tb.l(1, uArrayList);
       }
       if (uArrayList1.size() > 0) {
          tb.l(2, uArrayList1);
       }
       return t.just(new EmptyResponse());
    }
}
