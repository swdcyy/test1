package nmd.s;
import z1.a;
import nmd.q;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fmd.a;
import qmd.a;
import lnc.a1;
import kotlin.jvm.internal.a;

public final class s implements a	// class@001e75
{
    public final q a;

    public void s(q p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
       }else {
          p0 = this.a.g0();
          if (p0 != null) {
             p0 = p0.b();
             if (p0 != null) {
                String str = a1.p(R.string.arg_RES_7f10424f);
                a.o(str, "CommonUtil.string\(R.stri¡­_sticker_no_friends_hint\)");
                p0.c(str, 0);
             }
          }
       }
       return;
    }
}
