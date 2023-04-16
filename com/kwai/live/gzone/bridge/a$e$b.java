package com.kwai.live.gzone.bridge.a$e$b;
import erd.g;
import com.kwai.live.gzone.bridge.a$e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f55.g;
import com.kwai.live.gzone.bridge.a;

public class a$e$b implements g	// class@000c79
{
    public final a$e b;

    public void a$e$b(a$e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e$b.class, "1")) {
       }else {
          p0 = this.b;
          p0.e.Oa(p0.b, -1, R.string.arg_RES_7f105019);
       }
       return;
    }
}
