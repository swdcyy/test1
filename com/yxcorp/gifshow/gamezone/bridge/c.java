package com.yxcorp.gifshow.gamezone.bridge.c;
import erd.g;
import com.yxcorp.gifshow.gamezone.bridge.d$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.c;

public class c implements g	// class@0012b9
{
    public final d$a b;

    public void c(d$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          p0 = this.b;
          p0 = this.b;
          p0.o.l(p0.k, FunctionResultParams.createErrorResult(-1, ""), p0.l, p0.m, null, p0.n);
       }
       return;
    }
}
