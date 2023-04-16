package jh9.b;
import erd.g;
import jh9.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hb0.a;
import java.lang.StringBuilder;
import q87.c;
import io.reactivex.subjects.PublishSubject;

public final class b implements g	// class@002ad4
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("PostToolBox", "refresh finish, result:"+p0, objArray);
          this.b.R8().onNext(p0);
          PatchProxy.onMethodExit(b.class, "1");
       }
       return;
    }
}
