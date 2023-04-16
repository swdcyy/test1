package b77.r;
import erd.g;
import b77.q;
import java.lang.Object;
import com.kwai.live.gzone.api.model.LiveGzoneTextImageInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.kwai.imsdk.m;
import b77.t;
import com.kwai.imsdk.internal.v;
import ca7.u;
import bp6.o1;
import java.util.concurrent.Callable;
import qo6.k;
import b77.v;
import qo6.t1;

public class r implements g	// class@0003ec
{
    public final q b;

    public void r(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
       }else if(!TextUtils.x(p0.getLiveTextImageId())){
          r tb = this.b;
          p0 = p0.getLiveTextImageId();
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, q.class, "7")) {
             tb.S8();
             tb.x = p0;
             p0 = "WOG_2022";
             q x = tb.x;
             t ot = new t(tb);
             tb.z = ot;
             v ov = v.m(m.G(p0).c);
             Objects.requireNonNull(ov);
             if (u.c(x)) {
                ot.onError(-113, "wrong input value");
             }else {
                ov.a(new o1(ov, false, x, false), ot);
             }
             ov = new v(tb);
             tb.B = ov;
             m.G(p0).u0(ov);
          }
       }else {
          this.b.S8();
       }
       return;
    }
}
