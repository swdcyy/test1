package com.kwai.live.gzone.accompanyplay.anchor.z$c;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.z;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public class z$c implements g	// class@000b48
{
    public final z b;

    public void z$c(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$c.class, "1")) {
       }else if(!p0.intValue()){
          this.b.o();
       }
       return;
    }
}
