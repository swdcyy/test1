package com.kwai.library.wolverine.WolverineInitializer$a;
import v27.a;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import brd.z;
import t45.d;

public final class WolverineInitializer$a implements a	// class@000a9a
{

    public void WolverineInitializer$a(){
       super();
    }
    public Context a(){
       Application uApplication = PatchProxy.apply(null, this, WolverineInitializer$a.class, "1");
       if (uApplication != PatchProxyResult.class) {
       }else {
          uApplication = a.b();
       }
       return uApplication;
    }
    public z b(){
       return d.c;
    }
    public boolean c(){
       return true;
    }
}
