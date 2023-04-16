package q0d.a;
import id.c;
import id.s;
import q0d.g;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.image.network.ImageHttpStatistics;
import com.facebook.imagepipeline.producers.n$a;
import android.os.SystemClock;

public abstract class a extends c	// class@002218
{

    public void a(){
       super();
    }
    public void b(s p0,int p1){
       this.f(p0, p1);
    }
    public Map d(s p0,int p1){
       Map map;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          map = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (map != PatchProxyResult.class) {
          label_0023 :
             return map;
          }
       }
       g f = p0.f;
       f.mByteSize = p1;
       map = f.saveToMap();
       goto label_0023 ;
    }
    public void e(s p0,n$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
       }else {
          p0.f.mMillisSubmit = SystemClock.elapsedRealtime();
          this.g(p0, p1);
       }
       return;
    }
    public void f(g p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       p0.mMillisFetched = SystemClock.elapsedRealtime();
       return;
    }
    public abstract void g(g p0,n$a p1);
}
