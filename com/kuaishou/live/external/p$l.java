package com.kuaishou.live.external.p$l;
import qs5.e;
import com.kuaishou.live.external.p;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import os5.l;

public class p$l extends e	// class@001bb7
{
    public final p d;

    public void p$l(p p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$l.class, "1")) {
          return;
       }
       this.d.n().Vp();
       return;
    }
}