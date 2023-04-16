package com.kwai.live.gzone.accompanyplay.audience.p0$f$b;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.p0$f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import xl6.b;

public class p0$f$b implements g	// class@000ba8
{
    public final p0$f b;

    public void p0$f$b(p0$f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0$f$b.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.b.a;
          p0 t = p0.t;
          if (t != null) {
             p0.W8(t.getGameId());
          }
       }
       return;
    }
}
