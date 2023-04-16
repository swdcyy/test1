package d19.i;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.g;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;

public final class i implements g	// class@00202f
{
    public final g b;

    public void i(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, g.class, "3")) {
          tb.q.a(tb.r);
       }
       return;
    }
}
