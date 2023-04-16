package ap6.n3;
import erd.o;
import com.kwai.imsdk.group.g;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.String;
import dp6.b;
import hp6.b;
import xp6.x;
import lh0.a$z1;
import lh0.a$a2;
import lh0.a$j;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import yp6.c;
import lh0.a$h0;
import brd.t;

public final class n3 implements o	// class@000357
{
    public final g b;

    public void n3(g p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       n3 tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = new ArrayList();
       HashMap hashMap = new HashMap();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          b uob = b.i(tb.c).k(p0.next());
          if (x.b(uob) && (uob.b() != null && uob.b().a != null)) {
             a$z1 a = uob.b().a;
             int len = a.length;
             int i = 0;
             while (i < len) {
                object oobject = a[i];
                if (oobject != null) {
                   a$a2 a1 = oobject.a;
                   if (a1 != null) {
                      KwaiGroupInfo kwaiGroupInf = c.b(a1);
                      c.f(kwaiGroupInf, oobject.b);
                      uArrayList.add(kwaiGroupInf);
                   }
                }
                i = i + 1;
             }
          }
       }
       return t.just(uArrayList);
    }
}
