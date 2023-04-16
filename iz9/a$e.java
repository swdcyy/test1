package iz9.a$e;
import java.lang.Runnable;
import iz9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import bf5.v;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;

public final class a$e implements Runnable	// class@0028d0
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "1")) {
          return;
       }
       a$e tb = this.b;
       if (tb.x != null) {
          a v = tb.v;
          if (v == null) {
             a.S("mMilanoContainerEventBus");
          }
          v.V.onNext(new v(this.b.u, "scene_play_time_out"));
       }
       return;
    }
}
