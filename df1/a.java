package df1.a;
import df1.c;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.lifecycle.LiveData;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.google.common.base.Optional;
import v91.n;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import te1.d;

public class a extends c	// class@001f89
{
    public final LiveData c;
    public final a d;
    public static final AtomicBoolean e;

    static {
       a.e = new AtomicBoolean(false);
    }
    public void a(LiveData p0,a p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Optional.fromNullable(this.c.getValue()).or(Integer.valueOf(0)).intValue();
    }
    public boolean c(){
       return true;
    }
    public int getPriority(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = Integer.MAX_VALUE;
       LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = n.d("highFrequency_localLike_v2").orNull();
       if (uFrequencyCo != null) {
          uFrequencyCo = uFrequencyCo.mPriority;
          if (uFrequencyCo != null) {
             i = uFrequencyCo;
          }
       }
       if (a.e.compareAndSet(false, true)) {
          b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "HighFluencyLocalLikeMessage.getPriority", "priority", Integer.valueOf(i));
       }
       return i;
    }
    public String h(){
       return "highFrequency_localLike_v2";
    }
    public long i(){
       return d.f;
    }
    public boolean k(){
       return false;
    }
    public LiveData l(){
       return this.c;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          td.accept(null);
       }
       return;
    }
    public String toString(){
       return "HighFluencyLocalLikeMessage{}";
    }
}
