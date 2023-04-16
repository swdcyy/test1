package kx9.a;
import erd.g;
import kx9.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import jx9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public final class a implements g	// class@002d14
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.p.a();
       }else {
          p0 = tb.p;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, "3")) {
             p0 = p0.b();
             if (p0 != null) {
                p0.exitStayForComments();
             }
          }
       }
       return;
    }
}
