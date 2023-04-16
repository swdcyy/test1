package eha.e$a;
import eha.e;
import java.lang.Object;
import dda.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;

public final class e$a	// class@002683
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.a.b.onNext(p0);
       return;
    }
}
