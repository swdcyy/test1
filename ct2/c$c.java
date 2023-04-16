package ct2.c$c;
import at2.b;
import ct2.c;
import java.lang.Object;
import at2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ss2.f;
import com.kuaishou.live.core.voiceparty.micseats.guide.ClickSource;
import at2.a;
import at2.c$b;
import ct2.a;
import java.util.Objects;
import java.lang.Boolean;
import yx2.d;
import co2.f2;
import qu2.a;
import lnc.i3;
import pm8.a;

public final class c$c implements b	// class@0023dd
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "2")) {
          return;
       }
       a.p(p0, "model");
       this.a.f();
       return;
    }
    public void b(c p0,f p1,ClickSource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$c.class, "3")) {
          return;
       }
       a.p(p0, "model");
       a.p(p1, "micSeatData");
       a.p(p2, "clickSource");
       a.a(this, p0, p1, p2);
       if (p0 instanceof c$b) {
          c$b uob = this.a.e();
          boolean b = p0.j();
          Objects.requireNonNull(uob);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uob, uoa, "2")) {
             d uod = new d("VOICE_PARTY_GUIDE_FOLLOW_BUBBLE", uob.a, uob.b);
             i3 oi3 = i3.f();
             String str = (b)? "AGAIN_FOLLOW": "FOLLOW";
             oi3.d("btn_type", str);
             str = oi3.e();
             a.o(str, "JsonStringBuilder.newIns¡­W\" else \"FOLLOW\"\).build\(\)");
             uod.a(str).f();
          }
       }
       return;
    }
    public void c(c p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, str)) {
          return;
       }
       a.p(p0, "model");
       if (p0 instanceof c$b) {
          c$c ta = this.a;
          int i = ta.b + 1;
          ta.b = i;
          a.d2(i);
          c$b uob = this.a.e();
          boolean b = p0.j();
          Objects.requireNonNull(uob);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uob, uoa, str)) {
             d uod = new d("VOICE_PARTY_GUIDE_FOLLOW_BUBBLE", uob.a, uob.b);
             i3 oi3 = i3.f();
             String str1 = (b)? "AGAIN_FOLLOW": "FOLLOW";
             oi3.d("btn_type", str1);
             str1 = oi3.e();
             a.o(str1, "JsonStringBuilder.newIns¡­W\" else \"FOLLOW\"\).build\(\)");
             uod.a(str1).g();
          }
       }
       return;
    }
}
