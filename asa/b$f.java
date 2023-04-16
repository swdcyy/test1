package asa.b$f;
import zq6.u;
import asa.b;
import java.lang.Object;
import gsa.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lr6.a;
import gr6.b;
import lr6.f;
import xra.a;
import kotlin.jvm.internal.a;
import java.util.Objects;
import mrd.a;

public final class b$f implements u	// class@0002e4
{
    public final b a;

    public void b$f(b p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, str)) {
       }else {
          a uoa = b.R8(this.a).c();
          a.o(p0, "it");
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(p0, uoa, a.class, str)) {
             a.p(p0, "info");
             uoa.a.onNext(p0);
          }
       }
       return;
    }
}
