package com.kwai.component.uiconfig.tab.model.DefaultTabConfig$PriorityTabConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class DefaultTabConfig$PriorityTabConfig implements Serializable	// class@000bec
{
    public long mClientExpireTimestamp;
    public int[] mDefaultTab;
    public long mExpireTimeMs;
    public static final long serialVersionUID = 0x3b17baf4f6d52fed;

    public void DefaultTabConfig$PriorityTabConfig(){
       super();
    }
    public void calculateExpireTime(){
       if (PatchProxy.applyVoid(null, this, DefaultTabConfig$PriorityTabConfig.class, "1")) {
          return;
       }
       this.mClientExpireTimestamp = System.currentTimeMillis() + this.mExpireTimeMs;
       return;
    }
    public boolean isValidNow(){
       Object obj = PatchProxy.apply(null, this, DefaultTabConfig$PriorityTabConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mClientExpireTimestamp - System.currentTimeMillis() > 0)? true: false;
       return b;
    }
}
