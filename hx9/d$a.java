package hx9.d$a;
import erd.g;
import hx9.d;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d$a implements g	// class@002728
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d$a.class, "1")) {
       }else {
          this.b.c9();
          PatchProxy.onMethodExit(d$a.class, "1");
       }
       return;
    }
}
