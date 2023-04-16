package ec9.j0;
import java.lang.Runnable;
import u80.j;
import android.app.Activity;
import cc9.j;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.d;

public final class j0 implements Runnable	// class@00217e
{
    public final j b;
    public final Activity c;
    public final j d;
    public final VideoContext e;

    public void j0(j p0,Activity p1,j p2,VideoContext p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, j0.class, "1")) {
          return;
       }
       this.b.pC(this.c, this.d.d(), this.e, true);
       PatchProxy.onMethodExit(j0.class, "1");
       return;
    }
}
