package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$d;
import java.util.concurrent.Callable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mca.a;
import sqc.f;

public final class EnhanceFilterViewModel$d implements Callable	// class@000f79
{
    public final List b;

    public void EnhanceFilterViewModel$d(List p0){
       this.b = p0;
       super();
    }
    public Object call(){
       EnhanceFilterViewModel$d uod = PatchProxy.apply(null, this, EnhanceFilterViewModel$d.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          a.u();
          f.c("real start task");
          uod = this.b;
       }
       return uod;
    }
}
