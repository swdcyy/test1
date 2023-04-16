package bed.z$a;
import com.yxcorp.gifshow.music.utils.a$a;
import bed.z;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;
import java.io.File;
import kqb.b;

public class z$a implements a$a	// class@000429
{
    public final v a;
    public final z b;

    public void z$a(z p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "2")) {
          return;
       }
       this.a.onError(p0);
       return;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "1")) {
          return;
       }
       this.a.onNext(p0);
       this.a.onComplete();
       return;
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       b.c(this, p0, p1);
    }
}
