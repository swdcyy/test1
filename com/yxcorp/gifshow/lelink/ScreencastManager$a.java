package com.yxcorp.gifshow.lelink.ScreencastManager$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class ScreencastManager$a	// class@001a2a
{

    public void ScreencastManager$a(){
       super();
    }
    public void ScreencastManager$a(u p0){
       super();
    }
    public final ScreencastManager a(){
       Object obj = PatchProxy.apply(null, this, ScreencastManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScreencastManager.y.getValue();
    }
    public final boolean b(){
       return ScreencastManager.z;
    }
    public final void c(boolean p0){
       ScreencastManager.z = p0;
    }
}
