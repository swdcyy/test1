package e11.b$a;
import java.lang.Runnable;
import e11.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e11.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public final class b$a implements Runnable	// class@002082
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b$a.class, "1")) {
          return;
       }
       b b = this.b.b;
       a w = b.w;
       if (w != null) {
          a q = b.q;
          if (q == null) {
             a.S("liveRouterManager");
          }
          q.r4(w, this.b.b.getContext());
       }
       PatchProxy.onMethodExit(b$a.class, "1");
       return;
    }
}
