package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$c;
import erd.g;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper;
import java.lang.Object;
import jsa.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TvcPluginImplWrapper$c implements g	// class@001699
{
    public final TvcPluginImplWrapper b;

    public void TvcPluginImplWrapper$c(TvcPluginImplWrapper p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper$c.class, "1")) {
       }else {
          this.b.Jl(p0);
       }
       return;
    }
}
