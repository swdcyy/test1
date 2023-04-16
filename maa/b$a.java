package maa.b$a;
import com.yxcorp.gifshow.edit.draft.model.c$a;
import maa.b;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$Builder;
import laa.e;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.Asset;
import java.util.List;
import java.lang.Iterable;

public class b$a implements c$a	// class@002f9f
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(c p0,boolean p1){
       b h;
       Asset$b uob;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       b$a ta = this.a;
       if (p0 == ta.h) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, b.class, "7")) {
             h = ta.h;
             if (h != null && h.F()) {
                uob = ta.f();
                uob.copyOnWrite();
                uob.instance.clearColorFilter();
                uob.copyOnWrite();
                uob.instance.addAllColorFilter(ta.h.o());
                ta.h.a0();
             }
          }
       }else if(p0 == ta.f){
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, b.class, "9")) {
             h = ta.f;
             if (h != null && h.F()) {
                uob = ta.f();
                uob.copyOnWrite();
                uob.instance.clearMakeup();
                uob.copyOnWrite();
                uob.instance.addAllMakeup(ta.f.o());
                ta.f.a0();
             }
          }
       }else if(p0 == ta.g){
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, b.class, "8")) {
             h = ta.g;
             if (h != null && h.F()) {
                uob = ta.f();
                uob.copyOnWrite();
                uob.instance.clearBeauty();
                uob.copyOnWrite();
                uob.instance.addAllBeauty(ta.g.o());
                ta.g.a0();
             }
          }
       }
       return;
    }
    public void b(c p0){
    }
    public void c(c p0){
    }
}
