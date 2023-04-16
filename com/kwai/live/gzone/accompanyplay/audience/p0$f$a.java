package com.kwai.live.gzone.accompanyplay.audience.p0$f$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.p0$f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import com.kwai.live.gzone.accompanyplay.audience.q0;
import xl6.h;
import xl6.b;

public class p0$f$a implements g	// class@000ba7
{
    public final p0$f b;

    public void p0$f$a(p0$f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0$f$a.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.b.a;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, p0.class, "4")) {
             p0 t = p0.t;
             if (t != null) {
                t.b(new q0(p0));
             }
          }
       }
       return;
    }
}
