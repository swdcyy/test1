package hx9.c$a;
import erd.g;
import hx9.c;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$a implements g	// class@002724
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$a.class, "1")) {
       }else {
          this.b.c9();
          PatchProxy.onMethodExit(c$a.class, "1");
       }
       return;
    }
}
