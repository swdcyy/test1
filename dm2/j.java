package dm2.j;
import erd.g;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.vote.presenter.c$d;

public final class j implements g	// class@002548
{
    public final c b;

    public void j(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "9")) {
       }else if(!TextUtils.x(tb.U0)){
          tb.L.g();
       }
       return;
    }
}
