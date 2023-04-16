package bq6.u1;
import erd.o;
import bq6.p2;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import java.util.ArrayList;
import java.util.Iterator;
import eq6.b;
import com.kwai.imsdk.d;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import brd.t;

public final class u1 implements o	// class@0005c0
{
    public final p2 b;
    public final List c;

    public void u1(p2 p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       u1 tb = this.b;
       u1 tc = this.c;
       Objects.requireNonNull(tb);
       if (!b.c(p0)) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             uArrayList.add(uob);
             Iterator iterator1 = p0.iterator();
             while (iterator1.hasNext()) {
                tb.b(iterator1.next(), uob);
             }
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                if (TextUtils.isEmpty(iterator2.next().d())) {
                   iterator2.remove();
                }
             }
          }
          p0 = t.just(uArrayList);
       }else {
          p0 = t.just(tc);
       }
       return p0;
    }
}
