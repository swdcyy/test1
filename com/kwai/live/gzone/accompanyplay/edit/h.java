package com.kwai.live.gzone.accompanyplay.edit.h;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import lnc.a1;
import h37.f0;

public class h implements g	// class@000bf7
{
    public final g b;

    public void h(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else if(a1.i(this.b.i)){
          p0 = this.b;
          p0.p(p0.n);
       }
       return;
    }
}
