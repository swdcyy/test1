package bk2.j;
import erd.g;
import com.kuaishou.live.core.show.statistics.d;
import java.lang.Object;
import bk2.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import yt5.e;

public final class j implements g	// class@000405
{
    public final d b;

    public void j(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "6")) {
       }else {
          tb.s.e(p0.a);
       }
       return;
    }
}
