package fb1.e;
import eb1.a;
import fb1.i;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import fb1.c;
import eb1.e;

public final class e implements a	// class@0022da
{
    public final i a;

    public void e(i p0){
       this.a = p0;
    }
    public final void run(){
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, i.class, "4")) {
       }else {
          ta.h(a1.p(R.string.arg_RES_7f102076), new c(ta));
       }
       return;
    }
}
