package com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import com.kwai.video.wayne.player.WaynePlayerInitor$APP;
import java.lang.Object;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.impl.KSConfigBuildImpl;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder;

public class WaynePlayerConfigImpl	// class@000cd7
{
    public static KSConfigGetInterface configGet;
    public static WaynePlayerInitor$APP mApp;

    static {
       WaynePlayerConfigImpl.mApp = WaynePlayerInitor$APP.KWAISHOU;
    }
    public void WaynePlayerConfigImpl(){
       super();
    }
    public static synchronized KSConfigGetInterface getConfigGet(){
       _monitor_enter(WaynePlayerConfigImpl.class);
       Object obj = PatchProxy.apply(null, null, WaynePlayerConfigImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(WaynePlayerConfigImpl.class);
          return obj;
       }else if(WaynePlayerConfigImpl.configGet == null){
          WaynePlayerConfigImpl.configGet = (WaynePlayerConfigImpl.mApp == WaynePlayerInitor$APP.KWAISHOU)? KSConfigBuildImpl.getInstance(): new DefaultConfigImplBuilder().bulid();
       }
    label_002e :
       _monitor_exit(WaynePlayerConfigImpl.class);
       return WaynePlayerConfigImpl.configGet;
    }
    public static void init(WaynePlayerInitor$APP p0){
       WaynePlayerConfigImpl.mApp = p0;
    }
    public static void injectConfigGetImpl(KSConfigGetInterface p0){
       WaynePlayerConfigImpl.configGet = p0;
    }
    public static void updateConfigImpl(){
       if (PatchProxy.applyVoid(null, null, WaynePlayerConfigImpl.class, "2")) {
          return;
       }
       if (WaynePlayerConfigImpl.mApp == WaynePlayerInitor$APP.KWAISHOU) {
          KSConfigBuildImpl.updateConfigImpl();
       }
       return;
    }
}
