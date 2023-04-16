package ee0.f;
import com.yxcorp.download.k;
import java.lang.String;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.lang.Throwable;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ce0.b;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;

public class f extends k	// class@0020f5
{
    public final String c;
    public final String d;
    public final File[] e;
    public final CountDownLatch f;
    public final Throwable[] g;

    public void f(String p0,String p1,File[] p2,CountDownLatch p3,Throwable[] p4){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("AnimationResourceManager", "download canceled, url = "+this.c+", dstFilePath = "+this.d, objArray);
       p0[0] = new Exception("task is cancel");
       this.f.countDown();
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("AnimationResourceManager", "download completed, url = "+this.c+", dstFilePath = "+this.d, objArray);
       this.e[0] = new File(p0.getTargetFilePath());
       this.f.countDown();
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().u("AnimationResourceManager", p1, objArray);
       Object[] objArray1 = new Object[0];
       b.C().w("AnimationResourceManager", "download error, url = "+this.c+", dstFilePath = "+this.d, objArray1);
       p0[0] = p1;
       this.f.countDown();
       return;
    }
}
