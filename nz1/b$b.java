package nz1.b$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner$a;

public final class b$b implements Runnable	// class@003440
{
    public static final b$b b;

    static {
       b$b.b = new b$b();
    }
    public void b$b(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       LiveMaterialResourceCleaner.d.a().a();
       return;
    }
}
