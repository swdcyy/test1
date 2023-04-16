package com.kwai.live.gzone.accompanyplay.audience.p0$d;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import lnc.a1;

public class p0$d implements g	// class@000ba5
{
    public final p0 b;

    public void p0$d(p0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0$d.class, "1")) {
       }else if(!this.b.s.s(p0)){
          this.b.s.b(a1.p(R.string.arg_RES_7f1023d5));
       }
       return;
    }
}
