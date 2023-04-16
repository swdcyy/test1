package com.kwai.video.waynelive.wayneplayer.WayneLiveInject;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLiveInject$VisionEngineLibLoadedInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class WayneLiveInject	// class@000e41
{
    public static WayneLiveInject$VisionEngineLibLoadedInterface visionEngineLibLoadedIMPL;
    public static final WayneLiveInject wayneLiveInject;

    static {
       WayneLiveInject.wayneLiveInject = new WayneLiveInject();
    }
    public void WayneLiveInject(){
       super();
    }
    public static WayneLiveInject getWayneLiveInject(){
       return WayneLiveInject.wayneLiveInject;
    }
    public static void injectVisionEngineLibLoaded(WayneLiveInject$VisionEngineLibLoadedInterface p0){
       WayneLiveInject.visionEngineLibLoadedIMPL = p0;
    }
    public boolean isVisionEngineLibLoaded(){
       WayneLiveInject$VisionEngineLibLoadedInterface obj = PatchProxy.apply(null, this, WayneLiveInject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = WayneLiveInject.visionEngineLibLoadedIMPL;
       if (obj == null) {
          return false;
       }
       return obj.isVisionEngineLibLoaded();
    }
}
