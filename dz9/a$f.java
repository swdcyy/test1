package dz9.a$f;
import vo5.b$b;
import dz9.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import e17.i;
import kf5.g;
import mf5.w0;

public final class a$f implements b$b	// class@002004
{
    public final a a;

    public void a$f(a p0){
       this.a = p0;
       super();
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       this.a.Y();
       i.f(R.style.arg_RES_7f11066a, p0, true);
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, a$f.class, "1")) {
          return;
       }
       this.a.Y();
       g og = this.a.q();
       if (og != null) {
          og.a();
       }
       return;
    }
}
