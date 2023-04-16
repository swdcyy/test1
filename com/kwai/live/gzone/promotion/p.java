package com.kwai.live.gzone.promotion.p;
import erd.g;
import com.kwai.live.gzone.promotion.o;
import java.lang.Object;
import wl9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;

public class p implements g	// class@000dd5
{
    public final o b;

    public void p(o p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          p0 = this.b;
          p0.W8(p0.s.getLiveStreamId(), 0);
       }
       return;
    }
}
