package fc2.e;
import im8.b;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.pendant.a;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import java.lang.Class;
import im8.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Set;
import java.util.HashSet;

public final class e implements b	// class@00292f
{
    public Set a;
    public Set b;

    public void e(){
       super();
    }
    public void a(Object p0,Object p1){
       if (e.d(p1, LiveTopPendantTempPlayService.class)) {
          p1 = e.b(p1, LiveTopPendantTempPlayService.class);
          if (p1 != null) {
             p0.c = p1;
          }else {
             throw new IllegalArgumentException("mLiveTopPendantService ²»ÄÜÎª¿Õ");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          this.a = new HashSet();
       }
       return this.a;
    }
    public void c(Object p0){
       p0.c = null;
    }
    public final Set d(){
       if (this.b == null) {
          HashSet hashSet = new HashSet();
          this.b = hashSet;
          hashSet.add(LiveTopPendantTempPlayService.class);
       }
       return this.b;
    }
}
