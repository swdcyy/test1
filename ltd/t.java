package ltd.t;
import java.lang.String;
import ltd.g0;
import ftd.j2;
import java.lang.Object;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import ltd.j;
import java.util.List;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.ServiceLoader;
import java.util.Iterator;
import wsd.m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.lang.Iterable;
import ltd.u;
import java.lang.Throwable;
import ltd.v;

public final class t	// class@001e1a
{
    public static final boolean a;
    public static final j2 b;
    public static final t c;

    static {
       t ot = new t();
       t.c = ot;
       t.a = g0.e("kotlinx.coroutines.fast.service.loader", true);
       t.b = ot.a();
    }
    public void t(){
       super();
    }
    public final j2 a(){
       MainDispatcherFactory mainDispatch1;
       j2 oj2;
       MainDispatcherFactory mainDispatch = MainDispatcherFactory.class;
       List list = (t.a)? j.a.d(): SequencesKt___SequencesKt.V2(SequencesKt__SequencesKt.h(ServiceLoader.load(mainDispatch, mainDispatch.getClassLoader()).iterator()));
       Iterator iterator = list.iterator();
       if (!iterator.hasNext()) {
          mainDispatch1 = null;
       }else {
          mainDispatch1 = iterator.next();
          if (iterator.hasNext()) {
             int i = mainDispatch1.b();
             do {
                Object obj = iterator.next();
                int i1 = obj.b();
                if (i < i1) {
                   mainDispatch1 = obj;
                   i = i1;
                }
             } while (!iterator.hasNext());
          }
       }
       if (mainDispatch1 != null) {
          oj2 = u.f(mainDispatch1, list);
          if (oj2 != null) {
          label_006c :
             return oj2;
          }
       }
       oj2 = u.c(null, null, 3, null);
       goto label_006c ;
    }
}
