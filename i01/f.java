package i01.f;
import erd.g;
import i01.j;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import l95.b;
import l95.c;

public final class f implements g	// class@0027de
{
    public final j b;

    public void f(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       s.h(a1.p(R.string.arg_RES_7f10225a));
       tb.V8();
       String str = "follow fail";
       if (p0 != null) {
          str = str+TextUtils.k(p0.getMessage());
       }
       if (!PatchProxy.applyVoidOneRefs(str, tb, j.class, "21")) {
          p0 = tb.P8(404);
          p0.c(str);
          c.a(p0);
       }
       return;
    }
}
