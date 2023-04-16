package bk2.i;
import erd.g;
import com.kuaishou.live.core.show.statistics.d;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import yt5.e;

public final class i implements g	// class@000404
{
    public final d b;

    public void i(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "5")) {
       }else if(TextUtils.n(tb.p.Z2.d(), p0.b) && p0.c != null){
          tb.s.e(p0.a);
       }
       return;
    }
}
