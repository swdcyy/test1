package d59.v$d;
import erd.g;
import d59.v;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.ad.tachikoma.a;
import yx.j0;

public final class v$d implements g	// class@002063
{
    public final v b;

    public void v$d(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, v.class, "9")) {
             p0.y.destroy();
             Object[] objArray = new Object[0];
             j0.f("adtkLoadPresenter", "maybe network error or other reason, now render again", objArray);
             p0.R8();
          }
       }
       return;
    }
}
