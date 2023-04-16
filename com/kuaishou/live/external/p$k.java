package com.kuaishou.live.external.p$k;
import qs5.e;
import com.kuaishou.live.external.p;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import os5.l;

public class p$k extends e	// class@001bb6
{
    public final RequestTiming d;
    public final p e;

    public void p$k(p p0,String p1,RequestTiming p2){
       this.e = p0;
       this.d = p2;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$k.class, "1")) {
          return;
       }
       this.e.n().A9(this.d);
       return;
    }
}
