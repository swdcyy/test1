package gb1.w;
import eb1.a;
import gb1.z;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import db1.b;
import bb1.b;
import lnc.a1;
import gb1.v;

public final class w implements a	// class@002493
{
    public final z a;

    public void w(z p0){
       this.a = p0;
    }
    public final void run(){
       w ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, z.class, "3")) {
       }else {
          ta.h(a1.r(R.string.arg_RES_7f101ff4, ta.b.b().h()), new v(ta));
       }
       return;
    }
}
