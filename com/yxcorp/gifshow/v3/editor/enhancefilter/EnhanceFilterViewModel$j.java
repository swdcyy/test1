package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$j;
import erd.a;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;

public final class EnhanceFilterViewModel$j implements a	// class@000f7f
{
    public final EnhanceFilterViewModel b;

    public void EnhanceFilterViewModel$j(EnhanceFilterViewModel p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EnhanceFilterViewModel$j.class, "1")) {
          return;
       }
       this.b.e = false;
       Object[] objArray = new Object[false];
       a.D().w("EnhanceFilterViewModel", "startTaskInner tasks complete", objArray);
       this.b.t0();
       return;
    }
}
