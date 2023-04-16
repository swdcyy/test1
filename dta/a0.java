package dta.a0;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import java.lang.Float;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import le5.f;
import lr6.a;

public final class a0 implements u	// class@002520
{
    public final a a;

    public void a0(a p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       a0 ta = this.a;
       float f = p0.floatValue();
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), ta, uoa, "9")) {
          v1 = f - 0x3f800000;
          boolean b = (uoa)? true: false;
          ta.D = b;
          float f1 = (f.o())? f: (0x3f400000 * f) + 0.25f;
          ta.C.G(f1);
          ta.C.I(f1);
          ta.C.F(f);
          if (!uoa) {
             ta.C.A(true);
             ta.C.x(true);
             ta.C.p(true);
          }else if(!f){
             ta.C.A(false);
             ta.C.x(false);
             ta.C.p(false);
          }
       }
       return;
    }
}
