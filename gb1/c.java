package gb1.c;
import eb1.a;
import gb1.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import db1.b;
import bb1.b;
import lnc.a1;
import gb1.d;

public final class c implements a	// class@002451
{
    public final g a;

    public void c(g p0){
       this.a = p0;
    }
    public final void run(){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, g.class, "3")) {
       }else {
          ta.h(a1.r(R.string.arg_RES_7f101fef, ta.b.b().h()), new d(ta));
       }
       return;
    }
}
