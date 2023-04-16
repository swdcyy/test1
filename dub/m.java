package dub.m;
import erd.r;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import dub.q;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.lang.Boolean;
import k2b.f2;
import wkd.b;
import j9c.d;
import dub.r;

public final class m implements r	// class@002577
{
    public final List b;
    public final String c;
    public final List d;

    public void m(List p0,String p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final boolean test(Object p0){
       boolean b;
       m tb = this.b;
       m tc = this.c;
       m td = this.d;
       int i = 0;
       if (!q.f(tb)) {
          b = y.y(tb, new q(p0)).isPresent();
          Object[] objArray = new Object[]{tc,p0,Boolean.valueOf(b)};
          f2.b("NotifyDispatcher", "observeInternal: [%1$s] updated red dots[%2$s] is monitored= %3$s", objArray);
       }else if(!q.f(td)){
          b = y.y(td, new r(p0, b.a(0x2c71dec4))).isPresent();
          Object[] objArray1 = new Object[]{tc,p0,Boolean.valueOf(b),td};
          f2.b("NotifyDispatcher", "observeInternal range: [%1$s] updated red dots[%2$s] is monitored= %3$s range= %4$s", objArray1);
       }else {
       label_0065 :
          return i;
       }
       i = b;
       goto label_0065 ;
    }
}
