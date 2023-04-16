package com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;

public abstract class AbstractBaseConfig	// class@000cea
{

    public void AbstractBaseConfig(){
       super();
    }
    public abstract String getPrefKey();
    public void saveConfig(){
       if (PatchProxy.applyVoid(null, this, AbstractBaseConfig.class, "1")) {
          return;
       }
       KpMidConfigManager.instance().saveConfig(this.getPrefKey(), this);
       return;
    }
}
