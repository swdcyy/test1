package c2a.b;
import by6.e$b;
import com.yxcorp.gifshow.detail.network.feedback.init.NetworkDetectorInitModule;
import java.lang.Object;
import dy6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.network.feedback.log.a;
import java.lang.StringBuilder;
import com.kwai.library.network.detector.model.NetworkDetectConfig;

public class b implements e$b	// class@00053d
{
    public final NetworkDetectorInitModule a;

    public void b(NetworkDetectorInitModule p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.b(p0, null);
       p0 = p0.a;
       a.a("initModule detect complete");
       if (p0 != null) {
          a.a("initModule detect complete id:"+p0.id+" mode:"+p0.mMode);
       }
       return;
    }
    public void onProgress(int p0){
    }
}
