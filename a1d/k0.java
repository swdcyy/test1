package a1d.k0;
import erd.g;
import a1d.m0;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;
import java.util.Objects;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import wkd.b;
import m1d.a;
import m1d.e;
import brd.t;
import cjd.e;
import erd.o;
import a1d.j0;
import a1d.i0;

public final class k0 implements g	// class@000037
{
    public final m0 b;

    public void k0(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == AuthEvent.LOGIN_SUCCESS) {
          if (tb.z.get() != null) {
             tb.R8();
             tb.P8();
             tb.A.onNext(AuthEvent.DATA_LOAD_SUCCESS);
          }else {
             tb.S8();
             if (PatchProxy.apply(null, tb, m0.class, "7") != PatchProxyResult.class) {
             }else {
                b.a(0x5cfaafff).p(e.b(), tb.p, tb.q, tb.r, tb.s, tb.v, tb.w, tb.t, tb.u).map(new e()).subscribe(new j0(tb), new i0(tb));
             }
          }
       }else if(p0 == AuthEvent.LOGIN_START){
          tb.S8();
       }
       return;
    }
}
