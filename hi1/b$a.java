package hi1.b$a;
import hi1.g;
import hi1.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import gi1.a;
import java.lang.Throwable;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hi1.a;
import hi1.h;

public class b$a implements g	// class@0026d3
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b.P(b.y, "[onEffectReportSuccessListener] success get result effect");
       b$a ta = this.a;
       p0 = ta.L(p0);
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "7") && !q.f(p0)) {
          ta.u.H0(p0);
       }
       return;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f102a42));
       h.a(this.a.w.a(), this.a.w.getLiveStreamId(), 3, this.a.w.d(), 0);
       b.y(b.y, "[onEffectReportFailListener] fail play interactive combo task. error", p0);
       return;
    }
}
