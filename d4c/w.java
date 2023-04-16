package d4c.w;
import d46.c;
import d4c.v;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kob.r;

public class w implements c	// class@0020e1
{
    public final v a;

    public void w(v p0){
       this.a = p0;
       super();
    }
    public void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "3")) {
          return;
       }
       this.a.D.pause();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.a.D.pause();
       return;
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       this.a.D.start();
       return;
    }
}
