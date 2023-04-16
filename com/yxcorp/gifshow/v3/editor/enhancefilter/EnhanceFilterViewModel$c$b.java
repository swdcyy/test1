package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$c$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;

public final class EnhanceFilterViewModel$c$b implements Runnable	// class@000f77
{
    public final EnhanceFilterViewModel$c b;

    public void EnhanceFilterViewModel$c$b(EnhanceFilterViewModel$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EnhanceFilterViewModel$c$b.class, "1")) {
          return;
       }
       EnhanceFilterViewModel$c b = this.b.b;
       b.c = true;
       b.t0();
       return;
    }
}
