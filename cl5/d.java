package cl5.d;
import jl5.q;
import cl5.e$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.customize.CustomizeEmotionActivity;
import cl5.e;
import xk5.c;

public class d extends q	// class@0006ed
{
    public final e$a c;

    public void d(e$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       CustomizeEmotionActivity.F2();
       e r = this.c.a.r;
       if (r != null) {
          r.e();
       }
       return;
    }
}
