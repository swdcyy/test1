package ay9.d;
import erd.g;
import ay9.q;
import java.lang.Object;
import gya.c;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.information.caption.l;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import pp7.b;

public final class d implements g	// class@0002f1
{
    public final q b;

    public void d(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (TextUtils.n(tb.v.getPhotoId(), p0.a)) {
          Object[] objArray = new Object[0];
          o.C().w("CommonTag", "ÖØ»æ"+tb.v.getCaption(), objArray);
          p0 = tb.E();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, l.class, "12")) {
             p0.h.f(Boolean.TRUE);
          }
       }
       return;
    }
}
