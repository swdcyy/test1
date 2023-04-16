package c03.j;
import c03.l;
import c03.k;
import c03.k$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.effect.resource.download.v2.Status;

public class j implements l	// class@000490
{
    public final k$b a;
    public final String b;
    public final l c;
    public final int d;
    public final k e;

    public void j(k p0,k$b p1,String p2,l p3,int p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(String p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, j.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.PARALLEL_EFFECT, "onDownloadFailed");
       this.a.b(this.b, Status.DOWNLOAD_FAIL);
       this.e.a(this.a, this.c, this.d);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.PARALLEL_EFFECT, "onDownloadCompleted");
       this.a.b(this.b, Status.DOWNLOAD_SUCCESS);
       this.e.a(this.a, this.c, this.d);
       return;
    }
}
