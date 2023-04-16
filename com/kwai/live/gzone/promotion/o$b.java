package com.kwai.live.gzone.promotion.o$b;
import erd.g;
import com.kwai.live.gzone.promotion.o;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u67.b;

public class o$b implements g	// class@000dd2
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "1")) {
       }else {
          this.b.V8().c(p0.booleanValue());
       }
       return;
    }
}
