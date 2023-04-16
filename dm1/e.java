package dm1.e;
import com.kuaishou.live.common.core.basic.tools.g$a;
import dm1.f;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dm1.i;
import dm1.b;
import java.lang.Throwable;

public class e implements g$a	// class@001fc4
{
    public final Gift a;
    public final String b;
    public final f c;

    public void e(f p0,Gift p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(DownloadTask p0,long p1,long p2){
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       b.a(this.a, this.b, 5, null, i.c());
       return;
    }
    public void c(DownloadTask p0){
    }
    public void d(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       b.a(this.a, this.b, 6, p1, i.c());
       return;
    }
}
