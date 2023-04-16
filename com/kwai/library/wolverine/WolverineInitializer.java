package com.kwai.library.wolverine.WolverineInitializer;
import java.lang.Object;
import v27.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.wolverine.WolverineInitializer$a;
import v27.d;
import com.kwai.library.wolverine.WolverineInitializer$b;

public final class WolverineInitializer	// class@000a9c
{

    public void WolverineInitializer(){
       super();
    }
    public final a initWolverine(){
       Object obj = PatchProxy.apply(null, this, WolverineInitializer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WolverineInitializer$a();
    }
    public final d initWolverineLog(){
       Object obj = PatchProxy.apply(null, this, WolverineInitializer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WolverineInitializer$b();
    }
}
