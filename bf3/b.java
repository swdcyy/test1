package bf3.b;
import bf3.a;
import fq5.b;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b implements a	// class@000398
{
    public final b a;
    public LocalLifeLiveExplainMessage b;
    public Activity c;

    public void b(b p0,LocalLifeLiveExplainMessage p1,Activity p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public b b(){
       return this.a;
    }
    public void c(LocalLifeLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "message");
       this.b = p0;
       return;
    }
    public LocalLifeLiveExplainMessage d(){
       return this.b;
    }
    public void destroy(){
       this.c = null;
    }
    public Activity getActivity(){
       return this.c;
    }
}
