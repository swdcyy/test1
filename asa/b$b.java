package asa.b$b;
import hsa.b;
import asa.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import ra6.a;
import kotlin.jvm.internal.a;
import gr6.b;
import lr6.f;
import xra.a;
import io.reactivex.subjects.PublishSubject;

public final class b$b implements b	// class@0002e0
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       b$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, b.class, "5") && a.e()) {
          b t = ta.t;
          if (t == null) {
             a.S("actionBarController");
          }
          a uoa = t.c();
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(null, uoa, a.class, "2")) {
             uoa.b.onNext(Boolean.TRUE);
          }
       }
    label_0051 :
       return;
    }
}
