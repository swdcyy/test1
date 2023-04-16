package f6a.g$c;
import erd.g;
import f6a.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment;
import f6a.f;
import androidx.fragment.app.Fragment;

public final class g$c implements g	// class@0022d3
{
    public final g b;

    public void g$c(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$c.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.m9(2);
          }else if(this.b.X8().isAdded()){
             this.b.l9(2);
          }
          PatchProxy.onMethodExit(g$c.class, "1");
       }
       return;
    }
}
