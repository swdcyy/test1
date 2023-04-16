package com.kwai.live.gzone.turntable.d;
import erd.g;
import com.kwai.live.gzone.turntable.b$c;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.b$b;

public class d implements g	// class@000e41
{
    public final b$c b;

    public void d(b$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.b.v.b();
       }
       return;
    }
}
