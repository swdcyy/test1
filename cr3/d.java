package cr3.d;
import cr3.a;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public class d extends a	// class@0023c2
{

    public void d(a p0){
       super(p0);
    }
    public void b(LiveMaterialResourceDownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "task");
       a uoa = this.a();
       if (uoa != null) {
          uoa.b(p0);
       }
       return;
    }
    public void c(LiveMaterialResourceDownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "task");
       return;
    }
}
