package b58.v;
import com.mini.host.download.MiniDownloadListener;
import b58.w;
import com.mini.host.download.HostDownLoadManager;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.subjects.SingleSubject;
import java.lang.Object;
import com.mini.host.download.MiniDownloadTask;
import r98.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.util.Objects;
import java.io.File;

public class v implements MiniDownloadListener	// class@000312
{
    public final HostDownLoadManager a;
    public final AtomicInteger b;
    public final SingleSubject c;
    public final w d;

    public void v(w p0,HostDownLoadManager p1,AtomicInteger p2,SingleSubject p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onCancel(MiniDownloadTask p0){
       a.a(this, p0);
    }
    public void onFailure(MiniDownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       Objects.toString(p0.getFailureReason());
       this.c.hashCode();
       this.a.removeListener(this.b.get(), this);
       this.c.onError(p0.getFailureReason());
       return;
    }
    public void onProgress(MiniDownloadTask p0){
       a.b(this, p0);
    }
    public void onStart(MiniDownloadTask p0){
       a.c(this, p0);
    }
    public void onSuccess(MiniDownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.a.removeListener(this.b.get(), this);
       this.c.onSuccess(new File(p0.getTargetFilePath()));
       return;
    }
}
