package com.kuaishou.live.external.p$b;
import qs5.e;
import com.kuaishou.live.external.p;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import os5.l;

public class p$b extends e	// class@001bad
{
    public final p d;

    public void p$b(p p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "1")) {
          return;
       }
       this.d.n().nN();
       return;
    }
}
