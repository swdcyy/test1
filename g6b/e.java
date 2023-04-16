package g6b.e;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class e	// class@002a8e
{
    public final a a;

    public void e(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<@Action Int>\(\)");
       this.a = uoa;
    }
    public final void a(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "2")) {
          return;
       }
       this.a.onNext(Integer.valueOf(p0));
       return;
    }
}
