package gz2.h$c;
import ly2.g;
import gz2.h;
import java.lang.Object;
import ly2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hz2.c;
import pz2.a;
import pz2.c;
import cz2.d;
import iy2.h;
import java.lang.StringBuilder;
import kz2.d;
import java.util.Objects;
import gz2.i;
import java.lang.Runnable;
import e93.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class h$c implements g	// class@002bdd
{
    public final h a;

    public void h$c(h p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       h$c ta = this.a;
       h c = ta.c;
       if (ta.d != null && c != null) {
          ta.l.d();
          this.a.l.b(String.valueOf(c.b()));
          this.a.d.f(c);
       }
       if (p0 == null) {
          h.c("[onEffectDescriptionUpdated][LocalEffectLog-live-receive-cb]effectDescription is null", c);
          h$c ta1 = this.a;
          if (ta1.d != null && c != null) {
             ta1.l.a();
             ta1 = this.a;
             ta1.d.g(c, false, "EFFECT_DESCRIPTION_NULL", ta1.l);
          }
          return;
       }else {
          h.c("[onEffectDescriptionUpdated][LocalEffectLog-live-receive-cb]displayDuration:, effectDescription trackId = "+p0.e()+", displayTimeMs"+p0.a()+", errorCode = "+p0.b()+", errorMsg = "+p0.c()+", errorReason = "+p0.d(), c);
          if (p0.a()) {
             if (c instanceof d) {
                Objects.requireNonNull(c);
                l = (long)Integer.MAX_VALUE;
             }else {
                l = (long)p0.a();
             }
             f.k("initDrawer", new i(this, c), this.a, l);
          }
          return;
       }
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "3")) {
          return;
       }
       if (p0 == null) {
          h.c("[onEffectDescriptionUpdatedOnCancel][LocalEffectLog-live-receive-cb] liveEffectDescription is null", this.a.c);
       }else {
          h.c("[onEffectDescriptionUpdatedOnCancel][LocalEffectLog-live-receive-cb] cancel , effectDescription trackId = "+p0.e()+", errorCode = "+p0.b()+", errorMsg = "+p0.c()+", errorReason = "+p0.d()+", displayTimeMs = "+p0.a(), this.a.c);
       }
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "2")) {
          return;
       }
       if (p0 != null && TextUtils.n(p0.d(), "EFFECT_SDK_EFFECT_COUNT_NOT_EQUAL")) {
          h.a("[onEffectDescriptionUpdatedOnError], receive EffectErrorCode.kEffectCountNotEqual");
          return;
       }else {
          h$c ta = this.a;
          h c = ta.c;
          if (ta.d != null && c != null) {
             ta.l.d();
             this.a.l.b(String.valueOf(c.b()));
             this.a.d.f(c);
          }
          if (p0 == null) {
             h.c("[onEffectError] error is null", c);
             h$c ta1 = this.a;
             if (ta1.d != null && c != null) {
                ta1.l.a();
                ta1 = this.a;
                ta1.d.g(c, false, "EFFECT_DESCRIPTION_NULL", ta1.l);
             }
          }else {
             h.c("[onEffectDescriptionUpdatedOnError]error , effectDescription trackId = "+p0.e()+", errorCode = "+p0.b()+", errorMsg = "+p0.c()+", errorReason = "+p0.d(), c);
             h d = this.a.d;
             if (d != null && c != null) {
                d.c(c, p0.d());
             }
          }
          return;
       }
    }
}
