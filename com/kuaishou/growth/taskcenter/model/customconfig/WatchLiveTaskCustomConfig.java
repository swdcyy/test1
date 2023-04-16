package com.kuaishou.growth.taskcenter.model.customconfig.WatchLiveTaskCustomConfig;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.customconfig.WatchLiveTaskCustomConfig$a;
import nsd.u;
import java.lang.Object;
import java.util.List;

public final class WatchLiveTaskCustomConfig implements Serializable	// class@000756
{
    public List mRestrictiveUserIds;
    public static final WatchLiveTaskCustomConfig$a Companion;
    public static final long serialVersionUID;

    static {
       WatchLiveTaskCustomConfig.Companion = new WatchLiveTaskCustomConfig$a(null);
       WatchLiveTaskCustomConfig.serialVersionUID = 0x4445e6442165a8a4;
    }
    public void WatchLiveTaskCustomConfig(){
       super();
    }
    public static final long getSerialVersionUID(){
       return WatchLiveTaskCustomConfig.serialVersionUID;
    }
    public final List getMRestrictiveUserIds(){
       return this.mRestrictiveUserIds;
    }
    public final void setMRestrictiveUserIds(List p0){
       this.mRestrictiveUserIds = p0;
    }
}
