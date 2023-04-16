package com.kwai.component.uiconfig.tab.model.DefaultTabConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.uiconfig.tab.model.DefaultTabConfig$PriorityTabConfig;

public class DefaultTabConfig implements Serializable	// class@000bed
{
    public DefaultTabConfig$PriorityTabConfig mPriorityTabConfig;
    public static final long serialVersionUID = 0xfd332cf365fc2756;

    public void DefaultTabConfig(){
       super();
    }
    public void calculateExpireTime(){
       if (PatchProxy.applyVoid(null, this, DefaultTabConfig.class, "1")) {
          return;
       }
       DefaultTabConfig tmPriorityTa = this.mPriorityTabConfig;
       if (tmPriorityTa != null) {
          tmPriorityTa.calculateExpireTime();
       }
       return;
    }
}
