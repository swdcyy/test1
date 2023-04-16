package gb1.f2;
import eb1.a;
import gb1.i2;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import db1.b;
import bb1.b;
import lnc.a1;
import gb1.c2;

public final class f2 implements a	// class@00245c
{
    public final i2 a;

    public void f2(i2 p0){
       this.a = p0;
    }
    public final void run(){
       f2 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, i2.class, "4")) {
       }else {
          ta.h(a1.r(R.string.arg_RES_7f101ff7, ta.b.b().h()), new c2(ta));
       }
       return;
    }
}
