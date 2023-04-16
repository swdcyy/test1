package by6.e$a;
import by6.e$b;
import by6.e;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import by6.d;
import java.lang.Object;
import dy6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import by6.b;
import java.lang.StringBuilder;
import java.lang.Integer;

public class e$a implements e$b	// class@0004b2
{
    public final e$b a;
    public final NetworkDetectConfig b;
    public final d c;
    public final e d;

    public void e$a(e p0,e$b p1,NetworkDetectConfig p2,d p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       this.d.a.remove(this.c);
       this.a.a(p0);
       p0 = p0.a;
       b.a("NetworkDetectorManager detect complete");
       if (p0 != null) {
          b.a("NetworkDetectorManager detect complete id:"+p0.id+" mode:"+p0.mMode);
       }
       return;
    }
    public void onProgress(int p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.onProgress(p0);
       b.a("NetworkDetectorManager detect progress id:"+this.b.id+" percentage:"+p0);
       return;
    }
}
