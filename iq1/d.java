package iq1.d;
import iq1.d$a;
import nsd.u;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import trd.j;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ls1.b;
import iq1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class d	// class@00297e
{
    public final j a;
    public final LiveData b;
    public static final List c;
    public static final d$a d;

    static {
       d.d = new d$a(null);
       d.c = LiveLogTag.LIVE_MULTI_LINE.appendTag("MultiLineAnimationModel");
    }
    public void d(){
       super();
       this.a = new j();
       MutableLiveData mutableLiveD = new MutableLiveData(null);
       b.a(mutableLiveD);
       this.b = mutableLiveD;
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "animationItem");
       this.a.add(p0);
       if (this.b.getValue() == null) {
          b.P(d.c, "push: "+p0+", do trigger");
          this.b();
       }else {
          b.P(d.c, "push: "+p0+", animation is running");
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (this.a.isEmpty()) {
          b.P(d.c, "triggerAnimationQueue queue is empty");
       }
       b.b(this.b).setValue(this.a.F());
       return;
    }
}
