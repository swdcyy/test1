package lld.e$h;
import brd.d;
import brd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import crd.b;
import lld.e$h$a;
import erd.f;

public final class e$h implements d	// class@001c51
{
    public final c b;

    public void e$h(c p0){
       this.b = p0;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, e$h.class, "2")) {
          return;
       }
       this.b.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$h.class, "3")) {
          return;
       }
       a.p(p0, "e");
       this.b.onError(p0);
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$h.class, "1")) {
          return;
       }
       a.p(p0, "d");
       this.b.setCancellable(new e$h$a(p0));
       return;
    }
}
