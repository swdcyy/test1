package com.kwai.live.gzone.guess.kshell.h0$b;
import erd.g;
import com.kwai.live.gzone.guess.kshell.h0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h0$b implements g	// class@000d3c
{
    public final h0 b;

    public void h0$b(h0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0$b.class, "1")) {
       }else if(p0.booleanValue()){
          this.b.R8();
       }
       return;
    }
}
