package cd7.f;
import com.yxcorp.download.k;
import brd.v;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import java.lang.Throwable;
import brd.g;
import java.io.File;

public class f extends k	// class@000536
{
    public final v c;

    public void f(v p0){
       this.c = p0;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       this.c.onError(new Exception("task is cancel"));
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.c.onNext(new File(p0.getTargetFilePath()));
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       this.c.onError(p1);
       return;
    }
}
