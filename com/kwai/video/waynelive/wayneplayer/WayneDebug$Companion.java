package com.kwai.video.waynelive.wayneplayer.WayneDebug$Companion;
import java.lang.Object;
import nsd.u;
import com.kwai.video.waynelive.wayneplayer.WayneDebug;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class WayneDebug$Companion	// class@000e3d
{

    public void WayneDebug$Companion(){
       super();
    }
    public void WayneDebug$Companion(u p0){
       super();
    }
    public final WayneDebug getInstance(){
       Object obj = PatchProxy.apply(null, this, WayneDebug$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WayneDebug.instance$delegate.getValue();
    }
}
