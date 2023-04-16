package com.kuaishou.live.external.p$i;
import qs5.e;
import com.kuaishou.live.external.p;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import os5.l;

public class p$i extends e	// class@001bb4
{
    public final p d;

    public void p$i(p p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$i.class, "1")) {
          return;
       }
       this.d.n().rW();
       return;
    }
}
