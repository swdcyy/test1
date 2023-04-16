package g3b.e;
import java.lang.Runnable;
import g3b.g;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import g3b.h;
import g3b.b;
import java.lang.String;
import k2b.b3;
import com.yxcorp.gifshow.log.utils.c;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.yxcorp.utility.Log;

public final class e implements Runnable	// class@002a71
{
    public final g b;
    public final MessageNano c;

    public void e(g p0,MessageNano p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       try{
          Objects.requireNonNull(tb);
          Iterator iterator = tb.h.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             h value = uEntry.getValue();
             b uob = tb.i.get(uEntry.getKey());
             if (value != null) {
                h c = value.c;
                if (c != null && (!c.size() || uob == null)) {
                   continue ;
                }else {
                   String str = b3.k(tc);
                   value = value.c.get(str);
                   if (value != null) {
                      h a = value.a;
                      if (a != null) {
                         Object obj = c.g(tc, a.split("\\."));
                         if (c.a(obj, value, str)) {
                            uob.a(MessageNano.toByteArray(obj), obj.getClass());
                         }
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e0){
          Log.d("MappingManager", "extractorEvent exception: "+e0.getMessage());
       }
       return;
    }
}
