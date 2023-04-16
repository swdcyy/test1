package com.kuaishou.live.external.p$a;
import qs5.e;
import com.kuaishou.live.external.p;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import os5.l;

public class p$a extends e	// class@001bac
{
    public final boolean d;
    public final boolean e;
    public final RequestTiming f;
    public final boolean g;
    public final p h;

    public void p$a(p p0,String p1,boolean p2,boolean p3,RequestTiming p4,boolean p5){
       this.h = p0;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       this.h.n().Ds(this.d, this.e, this.f, this.g);
       return;
    }
}
