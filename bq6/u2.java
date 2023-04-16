package bq6.u2;
import erd.o;
import bq6.x2;
import l85.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import ph0.a$d;
import java.util.Objects;
import java.lang.String;
import l85.b;
import java.lang.StringBuilder;
import com.kwai.imsdk.internal.util.b;
import ph0.a$a;
import rh0.a$b;
import op6.a;
import bq6.y2;
import cp6.h;
import nq6.s;
import java.util.Map;
import java.lang.Boolean;
import java.util.HashMap;
import java.lang.Integer;
import com.kwai.middleware.azeroth.network.EmptyResponse;

public final class u2 implements o	// class@0005c1
{
    public final x2 b;
    public final c c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final AtomicLong f;

    public void u2(x2 p0,c p1,AtomicBoolean p2,AtomicBoolean p3,AtomicLong p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object apply(Object p0){
       boolean b;
       u2 tb = this.b;
       u2 tc = this.c;
       u2 td = this.d;
       u2 te = this.e;
       u2 tf = this.f;
       Objects.requireNonNull(tb);
       if (p0 == null) {
          b.c("sync tag response is null");
       }else {
          b.a(tc.d("sync attachment result: "+p0.f+", "+b.h(p0.c)+", "+b.h(p0.e)+", "+b.h(p0.d)));
       }
       if (p0 != null) {
          int i = 0;
          if (!b.e(p0.c)) {
             tb.d(i, p0.c);
          }
          if (!b.e(p0.d)) {
             tb.d(true, p0.d);
          }
          int i1 = 2;
          if (!b.e(p0.e)) {
             tb.d(i1, p0.e);
          }
          a$d a = p0.a;
          if (a != null) {
             Object[] objArray = new Object[i1];
             objArray[i] = tb.a;
             objArray[1] = y2.a();
             h.d(new a(String.format("%s_key_attachment_sync_offset_%s", objArray), String.valueOf(a.a), 3005));
          }
          if (p0.f == null) {
             tb.c(i, "");
          }
       }
       b = td.get();
       boolean b1 = te.get();
       long l = tf.get();
       if (p0 != null) {
          s os = s.t(tb.a);
          Map map = os.x("IMSDK.ConversationTag.Sync");
          Map map1 = map;
          map1.put("isNextPage", Boolean.valueOf(b));
          map1.put("isNewSync", Boolean.valueOf(b1));
          map1.put("addedTagCount", Integer.valueOf(tb.a(p0.c)));
          map1.put("updatedTagCount", Integer.valueOf(tb.a(p0.d)));
          map1.put("deletedTagCount", Integer.valueOf(tb.a(p0.e)));
          os.b(map, l);
          os.E(map, 0.00f);
       }
       td.set(true);
       return new EmptyResponse();
    }
}
