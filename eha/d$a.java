package eha.d$a;
import eha.d;
import java.lang.Object;
import dda.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;

public final class d$a	// class@002681
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void onEventMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       this.a.b.onNext(p0);
       return;
    }
}
