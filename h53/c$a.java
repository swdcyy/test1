package h53.c$a;
import mq5.h;
import h53.c;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import o63.d;

public class c$a implements h	// class@002c5b
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       if (!this.b.E.isEmpty()) {
          Iterator iterator = this.b.E.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             this.b.S8(uEntry.getValue());
             this.b.X8(uEntry.getKey());
          }
          this.b.E.clear();
       }
       return;
    }
}
