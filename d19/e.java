package d19.e;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.d;
import java.lang.Object;
import ub6.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.b;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public final class e implements g	// class@00202b
{
    public final d b;

    public void e(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "4")) {
       }else if(p0 == null || (!b.h(tb.p) && tb.q.getPlayer().b() == 7)){
          tb.q.z(tb.p);
       }
       return;
    }
}
