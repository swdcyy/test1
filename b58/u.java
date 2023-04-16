package b58.u;
import erd.o;
import b58.w;
import java.lang.Object;
import com.mini.host.download.MiniDownloadRequest;
import java.util.Objects;
import io.reactivex.subjects.SingleSubject;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import com.mini.host.download.HostDownLoadManager;
import n88.b;
import java.util.concurrent.atomic.AtomicInteger;
import b58.v;
import com.mini.host.download.MiniDownloadListener;

public final class u implements o	// class@000311
{
    public final w b;

    public void u(w p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       SingleSubject singleSubjec = SingleSubject.k0();
       HostDownLoadManager hostDownLoad = a.d.b().a.l();
       AtomicInteger uAtomicInteg = new AtomicInteger();
       uAtomicInteg.set(hostDownLoad.start(p0, new v(tb, hostDownLoad, uAtomicInteg, singleSubjec)));
       uAtomicInteg.get();
       return singleSubjec;
    }
}
