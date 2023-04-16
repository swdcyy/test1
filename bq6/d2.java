package bq6.d2;
import erd.o;
import java.util.List;
import java.lang.Object;
import eq6.b;
import java.util.Iterator;
import com.kwai.imsdk.d;
import java.lang.String;
import brd.t;

public final class d2 implements o	// class@00057b
{
    public final List b;

    public void d2(List p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if ((uod.getTarget()).equals(p0.a()) && uod.getTargetType() == p0.b()) {
             p0.f(uod);
             break ;
          }
       }
       return t.just(p0);
    }
}
