package com.kwai.live.gzone.guess.kshell.z;
import erd.g;
import com.kwai.live.gzone.guess.kshell.x;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class z implements g	// class@000d83
{
    public final x b;

    public void z(x p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
       }else {
          this.b.Y8();
       }
       return;
    }
}
