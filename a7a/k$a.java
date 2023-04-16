package a7a.k$a;
import d6a.a;
import a7a.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class k$a extends a	// class@00005b
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, k$a.class, "1")) {
          return;
       }
       if (this.b.q.get() != null) {
          this.b.q.get().enterAtlasCoverMode();
       }
       PatchProxy.onMethodExit(k$a.class, "1");
       return;
    }
}
