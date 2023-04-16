package d4c.g0;
import d46.c;
import d4c.h0$a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d4c.h0;
import kob.r;

public class g0 implements c	// class@0020cd
{
    public final h0$a a;

    public void g0(h0$a p0){
       this.a = p0;
       super();
    }
    public void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "3")) {
          return;
       }
       this.a.a.z.pause();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g0.class, "1")) {
          return;
       }
       this.a.a.z.pause();
       return;
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, g0.class, "2")) {
          return;
       }
       this.a.a.z.start();
       return;
    }
}
