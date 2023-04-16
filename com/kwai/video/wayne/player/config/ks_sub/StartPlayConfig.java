package com.kwai.video.wayne.player.config.ks_sub.StartPlayConfig;
import com.kwai.video.wayne.player.config.inerface.StartPlayConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;

public class StartPlayConfig extends AbstractBaseConfig implements StartPlayConfigInterface	// class@000d01
{
    public int preLoadMs;
    public int startPlayMaxMs;
    public int startPlayTh;

    public void StartPlayConfig(){
       super();
       this.preLoadMs = 3000;
       this.startPlayTh = 1;
       this.startPlayMaxMs = 500;
    }
    public static StartPlayConfig getConfig(){
       StartPlayConfig startPlayCon = StartPlayConfig.class;
       Object obj = PatchProxy.apply(null, null, startPlayCon, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("StartPlayConfig", startPlayCon);
    }
    public int getPreLoadMs(){
       return this.preLoadMs;
    }
    public String getPrefKey(){
       return "StartPlayConfig";
    }
    public int getStartPlayMaxMs(){
       return this.startPlayMaxMs;
    }
    public int getStartPlayTh(){
       return this.startPlayTh;
    }
}
