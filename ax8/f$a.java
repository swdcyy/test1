package ax8.f$a;
import erd.g;
import ax8.f;
import java.lang.Object;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;

public final class f$a implements g	// class@000330
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
       }else {
          this.b.a.onNext(p0);
       }
       return;
    }
}
