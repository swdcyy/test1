package lf9.p;
import lf9.b;
import lf9.m;
import lf9.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import kf9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import kf9.f;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import if9.a;
import if9.c;
import java.lang.Integer;
import if9.b;

public final class p extends b	// class@002ddc
{
    public final q b;

    public void p(m p0,q p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       int i;
       p op = p.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          HashMap hashMap = null;
          f uof = f.a(uob, hashMap, uob.b(), p0.b(), null, false, false, 57, null);
          this.a().h(uof);
          Objects.requireNonNull(uof);
          String str = "3";
          f obj = PatchProxy.apply(hashMap, uof, f.class, str);
          if (obj != PatchProxyResult.class) {
             hashMap = obj;
          }else {
             obj = uof.c;
             if (obj >= null && obj < uof.d.size()) {
                hashMap = uof.d.get(uof.c);
             }
          }
          if (hashMap instanceof c) {
             i = p0.b();
             if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, op, "2")) {
                b uob1 = this.a().j();
                if (!uob1.d()) {
                   this.a().h(f.a(uob1, null, 0, 0, null, false, true, 31, null));
                }
                this.b.v0(new c(7, i));
             }
          }else if(hashMap instanceof b){
             i = p0.b();
             if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, op, str)) {
                b uob2 = this.a().j();
                if (uob2.d()) {
                   this.a().h(f.a(uob2, null, 0, 0, null, false, false, 31, null));
                }
             }
          }
       }
    label_00ed :
       return;
    }
}
