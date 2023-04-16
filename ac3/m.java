package ac3.m;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.u1;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$c;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;

public final class m	// class@000070
{
    public final PublishSubject a;

    public void m(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.a = publishSubje;
       u1.a(this);
    }
    public final void onEventMainThread(NetworkTypeMonitor$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       a.p(p0, "event");
       this.a.onNext(Boolean.TRUE);
       return;
    }
    public final void onEventMainThread(NetworkTypeMonitor$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "4")) {
          return;
       }
       a.p(p0, "event");
       this.a.onNext(Boolean.FALSE);
       return;
    }
    public final void onEventMainThread(NetworkTypeMonitor$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "3")) {
          return;
       }
       a.p(p0, "event");
       this.a.onNext(Boolean.TRUE);
       return;
    }
}
