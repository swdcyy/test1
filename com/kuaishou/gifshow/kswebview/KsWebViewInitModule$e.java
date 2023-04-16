package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$e;
import erd.g;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class KsWebViewInitModule$e implements g	// class@0019d9
{
    public final KsWebViewInitModule b;

    public void KsWebViewInitModule$e(KsWebViewInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsWebViewInitModule$e.class, "1")) {
       }else {
          KsWebViewInitModule$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, KsWebViewInitModule.class, "2")) {
             tb.l0();
          }
       }
       return;
    }
}
