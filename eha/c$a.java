package eha.c$a;
import eha.c;
import java.lang.Object;
import cda.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;

public final class c$a	// class@00267f
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.a.b.onNext(p0);
       return;
    }
}
