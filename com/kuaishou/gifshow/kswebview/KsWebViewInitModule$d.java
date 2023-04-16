package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$d;
import erd.g;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import java.lang.Object;
import eda.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class KsWebViewInitModule$d implements g	// class@0019d8
{
    public final KsWebViewInitModule b;

    public void KsWebViewInitModule$d(KsWebViewInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsWebViewInitModule$d.class, "1")) {
       }else {
          KsWebViewInitModule$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, KsWebViewInitModule.class, "3")) {
             tb.l0();
          }
       }
       return;
    }
}
