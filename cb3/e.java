package cb3.e;
import vb3.j;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ws5.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cb3.e$a;

public final class e implements j	// class@0004e1
{
    public final c a;
    public final c b;

    public void e(View p0,View p1){
       a.p(p0, "topBar");
       a.p(p1, "bottomBar");
       super();
       this.a = this.c(p0);
       this.b = this.c(p1);
    }
    public c a(){
       return this.b;
    }
    public c b(){
       return this.a;
    }
    public final c c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e$a(p0);
    }
}
