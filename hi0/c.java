package hi0.c;
import com.kuaishou.krn.apm.MemoryEvent;
import com.kuaishou.krn.apm.KdsMemoryInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import android.os.Debug$MemoryInfo;
import java.lang.Integer;
import java.util.Objects;
import hi0.g;
import hi0.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class c	// class@0026cc
{

    public static final void a(MemoryEvent p0,KdsMemoryInfo p1){
       Object obj;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "1")) {
          return;
       }
       a.p(p0, "$this$assign");
       a.p(p1, "memoryInfo");
       String str = "summary.total-swap";
       String str1 = "summary.total-pss";
       String str2 = "summary.system";
       String str3 = "summary.private-other";
       String str4 = "summary.graphics";
       String str5 = "summary.stack";
       String str6 = "summary.code";
       String str7 = "summary.native-heap";
       String str8 = "summary.java-heap";
       if (p0.m()) {
          if (Build$VERSION.SDK_INT < 23) {
             p0.x(Integer.valueOf(p1.getTotalPss()));
          }else {
             p0.r(Integer.valueOf(c.b(p1, str8)));
             p0.s(Integer.valueOf(c.b(p1, str7)));
             p0.o(Integer.valueOf(c.b(p1, str6)));
             p0.v(Integer.valueOf(c.b(p1, str5)));
             p0.p(Integer.valueOf(c.b(p1, str4)));
             p0.t(Integer.valueOf(c.b(p1, str3)));
             p0.w(Integer.valueOf(c.b(p1, str2)));
             p0.x(Integer.valueOf(c.b(p1, str1)));
             p0.y(Integer.valueOf(c.b(p1, str)));
          }
          p0.u(Integer.valueOf(p1.a()));
       }else if(Build$VERSION.SDK_INT < 23){
          obj = p0.j();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, p1.getTotalPss());
       }else {
          obj = p0.d();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str8));
          obj = p0.e();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str7));
          obj = p0.a();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str6));
          obj = p0.h();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str5));
          obj = p0.b();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str4));
          obj = p0.f();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str3));
          obj = p0.i();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str2));
          obj = p0.j();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str1));
          obj = p0.k();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          h.a(obj, c.b(p1, str));
       }
       obj = p0.g();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
       h.a(obj, p1.a());
       p0.z(p1.b());
       if (!p0.l() || !p1.a()) {
          p0.q(false);
       }
       return;
    }
    public static final int b(KdsMemoryInfo p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (Build$VERSION.SDK_INT < 23) {
          return i;
       }
       String memoryStat = p0.getMemoryStat(p1);
       if (memoryStat != null) {
          i = Integer.parseInt(memoryStat);
       }
       return i;
    }
    public static final void c(MemoryEvent p0,MemoryEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "3")) {
          return;
       }
       a.p(p0, "$this$minus");
       a.p(p1, "memoryEvent");
       if (p0.m() == p1.m() && p0.m()) {
          Object obj = p1.d();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          Object obj1 = p0.d();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.r(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.e();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.e();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.s(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.a();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.a();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.o(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.h();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.h();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.v(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.b();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.b();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.p(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.f();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.f();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.t(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.i();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.i();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.w(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.j();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.j();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.x(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.k();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.k();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.y(Integer.valueOf((obj.intValue() - obj1.intValue())));
          obj = p1.g();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
          obj1 = p0.g();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          p0.u(Integer.valueOf((obj.intValue() - obj1.intValue())));
          p0.z(p1.l());
          p0.q(p1.c());
       }
       return;
    }
    public static final void d(MemoryEvent p0,MemoryEvent p1){
       Object obj;
       Object obj1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "2")) {
          return;
       }
       a.p(p0, "$this$stats");
       a.p(p1, "memoryEvent");
       if (Build$VERSION.SDK_INT < 23) {
          obj = p0.j();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.j();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
       }else {
          obj = p0.d();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.d();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
          obj = p0.e();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.e();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
          obj = p0.a();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.a();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
          obj = p0.h();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.h();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
          obj = p0.b();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.b();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
          obj = p0.f();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.f();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
          obj = p0.i();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.i();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
          obj = p0.j();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.j();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
          obj = p0.k();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
          obj1 = p1.k();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
          h.a(obj, obj1.intValue());
       }
       obj = p0.g();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.krn.apm.MemoryStat");
       obj1 = p1.g();
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Int");
       h.a(obj, obj1.intValue());
       p0.z(p1.l());
       boolean b = (p0.c() && p1.c())? true: false;
       p0.q(b);
       return;
    }
}
