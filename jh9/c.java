package jh9.c;
import erd.g;
import jh9.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hb0.a;
import q87.c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import w46.b;

public final class c implements g	// class@002ad5
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("PostToolBox", "refresh failed!", objArray);
          this.b.R8().onNext(Boolean.FALSE);
          a.D().e("PostToolBox", "mContentFragment refresh error", p0);
          PatchProxy.onMethodExit(c.class, "1");
       }
       return;
    }
}
