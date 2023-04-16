package com.kwai.live.gzone.promotion.g;
import erd.g;
import com.kwai.live.gzone.promotion.f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import oq5.a;
import java.util.Queue;

public class g implements g	// class@000dc3
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          Object[] objArray = new Object[]{this.b.V8()};
          p0 = String.format(a1.p(R.string.arg_RES_7f101406), objArray);
          if (!this.b.s.H2()) {
             if (this.b.W8()) {
                this.b.X8(p0);
             }
          }else {
             this.b.z.add(p0);
          }
       }
       return;
    }
}
