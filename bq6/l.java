package bq6.l;
import bq6.l$a;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import cp6.p;
import com.kwai.chat.sdk.signal.BizDispatcher;
import to6.q;
import com.kwai.imsdk.d;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import aq6.d;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import brd.t;
import l85.c;
import l85.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import pq6.a;
import bq6.c;
import io.reactivex.g;
import bq6.i;
import erd.o;
import bq6.b;
import erd.r;
import bq6.j;
import bq6.g;
import erd.g;

public class l	// class@00059d
{
    public final String a;
    public final p b;
    public final q c;
    public final Set d;
    public static final BizDispatcher e;

    static {
       l.e = new l$a();
    }
    public void l(String p0){
       super();
       this.d = new CopyOnWriteArraySet();
       this.a = p0;
       this.b = p.b.get(p0);
       this.c = q.c.get(p0);
    }
    public static l a(String p0){
       return l.e.get(p0);
    }
    public void b(d p0,List p1){
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod != null && !b.c(p1)) {
             uod.c(p0, p1);
          }
       }
       return;
    }
    public t c(d p0){
       c uoc = new c("KwaiIMAttachmentManager#syncMessageAttachments");
       b.a(uoc.d("sync attachment start"));
       AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
       AtomicLong uAtomicLong = new AtomicLong(a.b());
       d uod = p0;
       c uoc1 = new c(this, uAtomicLong, uod, uAtomicBoole, uoc);
       AtomicBoolean uAtomicBoole1 = uAtomicBoole;
       j oj = new j(this, uoc, uod, new AtomicBoolean(false), uAtomicBoole1, uAtomicLong);
       return t.create(v10).repeat().flatMap(super(this, uoc, p0)).takeUntil(new b(uoc)).map(v11).doOnError(new g(this, uoc));
    }
}
