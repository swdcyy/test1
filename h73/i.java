package h73.i;
import erd.g;
import h73.t;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import d61.g0;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.c;

public final class i implements g	// class@002cb6
{
    public final t b;
    public final String c;

    public void i(t p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       g0.a(R.string.arg_RES_7f10225a);
       tb.c();
       String str = "follow fail";
       if (p0 != null) {
          str = str+TextUtils.k(p0.getMessage());
       }
       if (!PatchProxy.applyVoidTwoRefs(tc, str, tb, t.class, "18") && FansGroupKswitchUtil.b()) {
          p0 = new b(true, "JoinDialog", "REQUEST_JOIN");
          p0.g(tc);
          p0.f(404);
          p0.c(str);
          c.a(p0);
       }
       return;
    }
}
