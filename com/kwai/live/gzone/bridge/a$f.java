package com.kwai.live.gzone.bridge.a$f;
import n67.a$a;
import com.kwai.live.gzone.bridge.a;
import f55.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import com.kwai.yoda.function.FunctionResultParams;

public class a$f implements a$a	// class@000c7b
{
    public final g a;
    public final a b;

    public void a$f(a p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "2")) {
          return;
       }
       this.a.a(-1, p0, null);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$f.class, "1")) {
          return;
       }
       this.a.onSuccess(FunctionResultParams.createSuccessResult());
       return;
    }
}
