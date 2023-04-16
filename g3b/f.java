package g3b.f;
import java.lang.Runnable;
import g3b.g;
import java.lang.String;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.util.Objects;
import java.util.Map;
import q2b.l;
import g3b.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.yxcorp.utility.Log;

public final class f implements Runnable	// class@002a72
{
    public final g b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final MessageNano g;

    public void f(g p0,String p1,String p2,String p3,String p4,MessageNano p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       g c1;
       Object obj;
       f uof = this;
       f b = uof.b;
       f c = uof.c;
       f d = uof.d;
       f e = uof.e;
       f f = uof.f;
       f g = uof.g;
       try{
          Objects.requireNonNull(b);
          if (b.b != null) {
             c1 = b.c;
             if (c1 != null && c1.containsKey(c)) {
                obj = b.c.get(c);
                if (obj != null && (obj.mFilterInfo != null && !b.m(c, obj, d, e, f))) {
                   b.q(g, obj, d, e, b.b, b.d);
                }
             }
          }
          c1 = b.f;
          if (c1 != null && c1.size() > 0) {
             c1 = b.e;
             if (c1 != null && (c1.size() > 0 && b.g != null)) {
                Iterator iterator = b.f.entrySet().iterator();
                while (iterator.hasNext()) {
                   String key = iterator.next().getKey();
                   Map map = b.f.get(key);
                   obj = b.e.get(key);
                   ConcurrentLinkedQueue uConcurrentL = b.g.get(key);
                   if (uConcurrentL == null) {
                      uConcurrentL = new ConcurrentLinkedQueue();
                      b.g.put(key, uConcurrentL);
                   }
                   ConcurrentLinkedQueue uConcurrentL1 = uConcurrentL;
                   if (obj != null && (map != null && map.containsKey(c))) {
                      Object obj1 = map.get(c);
                      if (obj1 != null && obj1.mFilterInfo != null) {
                         Object obj2 = obj1;
                         if (!b.m(c, obj1, d, e, f)) {
                            b.s(g, obj2, d, e, obj, uConcurrentL1, c);
                         }
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e0){
          Log.d("MappingManager", "mapping exception: "+e0.getMessage());
       }
    label_00ee :
       return;
    }
}
