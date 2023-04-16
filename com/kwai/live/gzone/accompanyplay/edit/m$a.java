package com.kwai.live.gzone.accompanyplay.edit.m$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.m;
import java.lang.Object;
import n37.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;

public class m$a implements g	// class@000c08
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
       }else {
          this.b.l.onNext(p0);
       }
       return;
    }
}
