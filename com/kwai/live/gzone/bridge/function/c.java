package com.kwai.live.gzone.bridge.function.c;
import erd.g;
import a47.c;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.FunctionResultParams;
import android.os.Bundle;

public class c implements g	// class@000c87
{
    public final g b;
    public final c c;

    public void c(c p0,g p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.a(-1, FunctionResultParams.createErrorResult(-1, "").mMessage, null);
       }
       return;
    }
}
