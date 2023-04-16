package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarItemConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveConfigStartupResponse$LiteBottomBarItemConfig implements Serializable	// class@001022
{
    public int mId;
    public int mPriority;
    public int mSlot;
    public static final long serialVersionUID = 0x29aa063bced75fc4;

    public void LiveConfigStartupResponse$LiteBottomBarItemConfig(){
       super();
    }
    public LiveConfigStartupResponse$LiteBottomBarItemConfig copy(){
       LiveConfigStartupResponse$LiteBottomBarItemConfig obj = PatchProxy.apply(null, this, LiveConfigStartupResponse$LiteBottomBarItemConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       obj.mId = this.mId;
       obj.mSlot = this.mSlot;
       obj.mPriority = this.mPriority;
       return obj;
    }
}
