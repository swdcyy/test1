package com.tachikoma.component.common.resource.TKImageResource$b;
import erd.g;
import com.tachikoma.component.common.resource.TKImageResource;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKImageResource$b implements g	// class@000ce8
{
    public final TKImageResource b;

    public void TKImageResource$b(TKImageResource p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageResource$b.class, "1")) {
       }else {
          this.b.callOnFail(p0.getMessage());
       }
       return;
    }
}
