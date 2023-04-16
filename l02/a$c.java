package l02.a$c;
import lf3.g;
import l02.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCMultiLiveCommonAuthorInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import java.lang.Number;
import androidx.collection.LruCache;
import lf3.f;

public final class a$c implements g	// class@002e49
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a.p(p0, "commonAuthorInfo");
          a$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "6")) {
             SCMultiLiveCommonAuthorInfo timestamp = p0.timestamp;
             if (timestamp - tb.t <= 0) {
                b.Z(a.v, "onReceiveMultiLiveCommonAuthorInfo, expired msg: "+p0.timestamp);
             }else {
                tb.t = timestamp;
                SCMultiLiveCommonAuthorInfo authorLabelM = p0.authorLabelMap;
                if (authorLabelM != null) {
                   Iterator iterator = authorLabelM.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      if (tb.V8(uEntry.getValue())) {
                         b.Z(a.v, "onReceiveMultiLiveCommonAuthorInfo, remove user tag, user id: "+uEntry.getKey());
                         tb.q.remove(String.valueOf(uEntry.getKey().longValue()));
                      }else {
                         b.Z(a.v, "onReceiveMultiLiveCommonAuthorInfo, cache user tag, user id: "+uEntry.getKey()+", tag: "+uEntry.getValue());
                         tb.q.put(String.valueOf(uEntry.getKey().longValue()), uEntry.getValue());
                      }
                   }
                   tb.S8();
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
