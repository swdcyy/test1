package com.kuaishou.live.external.p$h;
import qs5.e;
import com.kuaishou.live.external.p;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import os5.l;

public class p$h extends e	// class@001bb3
{
    public final RequestTiming d;
    public final p e;

    public void p$h(p p0,String p1,RequestTiming p2){
       this.e = p0;
       this.d = p2;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$h.class, "1")) {
          return;
       }
       this.e.n().na(this.d);
       return;
    }
}
