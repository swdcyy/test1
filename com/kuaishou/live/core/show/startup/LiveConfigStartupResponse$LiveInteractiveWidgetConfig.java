package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveWidgetConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveConfigStartupResponse$LiveInteractiveWidgetConfig implements Serializable	// class@00104b
{
    public long mWidgetDisplayDurationMs;
    public long mWidgetRollingDurationMsMs;
    public int mWidgetShowLimit;
    public static final long serialVersionUID = 0x9f76063fe5c5a773;

    public void LiveConfigStartupResponse$LiveInteractiveWidgetConfig(){
       super();
    }
    public static LiveConfigStartupResponse$LiveInteractiveWidgetConfig createDefaultConfig(){
       LiveConfigStartupResponse$LiveInteractiveWidgetConfig obj = PatchProxy.apply(null, null, LiveConfigStartupResponse$LiveInteractiveWidgetConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveConfigStartupResponse$LiveInteractiveWidgetConfig();
       obj.mWidgetShowLimit = 3;
       obj.mWidgetRollingDurationMsMs = 5000;
       obj.mWidgetDisplayDurationMs = 5000;
       return obj;
    }
}
