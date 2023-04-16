package c97.a;
import z1.k;
import c97.d;
import h97.i;
import java.lang.Object;
import x97.n;
import g97.b;
import x97.k;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;
import java.lang.StringBuilder;
import t97.c;
import g97.a;
import h97.g;
import u97.d;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor;
import c97.c;

public final class a implements k	// class@000393
{
    public final d b;
    public final i c;

    public void a(d p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(){
       ArrayList uArrayList;
       a tb = this.b;
       d b = tb.b;
       n on = this.c.b();
       b uob = new b(on.a());
       List list = on.i();
       boolean b1 = on.d();
       if (list != null && !list.isEmpty()) {
          uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (str.startsWith("http")) {
                uArrayList.add(str);
             }else if(b1){
                str = "https://"+str;
             }else {
                str = "http://"+str;
             }
             uArrayList.add(str);
          }
       }else {
          uArrayList = null;
       }
       c uoc = new c(new a(b));
       a.q(uob, "builder");
       uoc.f = uob;
       String str1 = (b.isTestMode())? "test": "online";
       a.q(str1, "env");
       uoc.b = str1;
       if (uArrayList != null) {
          uoc.a = uArrayList;
       }
       if (on.b() != null) {
          Iterator iterator1 = on.b().iterator();
          while (iterator1.hasNext()) {
             Interceptor interceptor = iterator1.next();
             a.q(interceptor, "interceptor");
             if (!uoc.c.contains(interceptor)) {
                uoc.c.add(interceptor);
             }
          }
       }
       c uoc1 = new c(tb, on);
       a.q(uoc1, "blocker");
       uoc.e = uoc1;
       return uoc;
    }
}
