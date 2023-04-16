package com.kwai.yoda.function.system.StartNativeDebuggerFunction$d;
import erd.g;
import com.kwai.yoda.function.system.StartNativeDebuggerFunction;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.kernel.YodaException;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.FunctionResultParams$a;
import com.kwai.yoda.function.c;

public final class StartNativeDebuggerFunction$d implements g	// class@0011fe
{
    public final StartNativeDebuggerFunction b;
    public final YodaBaseWebView c;
    public final String d;
    public final String e;
    public final String f;

    public void StartNativeDebuggerFunction$d(StartNativeDebuggerFunction p0,YodaBaseWebView p1,String p2,String p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StartNativeDebuggerFunction$d.class, "1")) {
       }else if(p0 instanceof YodaException){
          p0 = FunctionResultParams.Companion.a(p0.getResultCode(), p0.getMessage());
       }else {
          p0 = FunctionResultParams.Companion.a(0x1e84a, p0.getMessage());
       }
       this.b.l(this.c, p0, this.d, this.e, null, this.f);
       return;
    }
}
