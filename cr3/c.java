package cr3.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import cr3.a;

public abstract class c	// class@0023c1
{
    public c b;

    public void c(){
       super();
    }
    public final c a(){
       return this.b;
    }
    public final c b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "producer");
       p0.b = this;
       return p0;
    }
    public abstract void c(LiveMaterialResourceDownloadTask p0,a p1);
}
