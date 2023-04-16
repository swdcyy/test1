package com.kwai.edge.reco.afk.config.AFKDetectorConfig$a;
import java.lang.Object;
import nsd.u;
import com.kwai.edge.reco.afk.config.AFKDetectorConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qrd.p;

public final class AFKDetectorConfig$a	// class@000d2b
{

    public void AFKDetectorConfig$a(){
       super();
    }
    public void AFKDetectorConfig$a(u p0){
       super();
    }
    public final AFKDetectorConfig a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AFKDetectorConfig$a uoa = AFKDetectorConfig$a.class;
       Object obj = PatchProxy.apply(null, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uoa, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = AFKDetectorConfig.d.getValue();
       }
       return obj1;
    }
}
