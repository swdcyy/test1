package a29.d;
import erd.g;
import a29.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i$b;
import e17.i;
import com.yxcorp.gifshow.photoad.k;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import a29.i;

public final class d implements g	// class@000030
{
    public final k b;

    public void d(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "18")) {
       }else {
          p0 = new i$b();
          p0.x(R.string.arg_RES_7f104a4b);
          p0.l(true);
          i.z(p0);
          p0 = new k(tb.t.mEntity);
          p0.l("tag_type", "MUSIC");
          o.z().p(141, p0).d(i.b).a();
       }
       return;
    }
}
