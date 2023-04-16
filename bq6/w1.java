package bq6.w1;
import erd.o;
import bq6.p2;
import java.util.List;
import l85.c;
import java.lang.Object;
import java.util.Objects;
import java.util.Iterator;
import eq6.b;
import com.kwai.imsdk.d;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import brd.t;

public final class w1 implements o	// class@0005c8
{
    public final p2 b;
    public final List c;
    public final c d;
    public final int e;

    public void w1(p2 p0,List p1,c p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       w1 tb = this.b;
       w1 tc = this.c;
       w1 td = this.d;
       w1 te = this.e;
       Objects.requireNonNull(tb);
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          Iterator iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             tb.b(iterator1.next(), uob);
          }
       }
       b.a(td.d("added reference list: "+tc.size()));
       if (tc.size() > 0) {
          tb.m(te, tc);
       }
       return t.just(new EmptyResponse());
    }
}
