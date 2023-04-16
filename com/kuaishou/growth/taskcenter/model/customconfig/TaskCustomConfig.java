package com.kuaishou.growth.taskcenter.model.customconfig.TaskCustomConfig;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.customconfig.TaskCustomConfig$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.growth.taskcenter.model.customconfig.WatchLiveTaskCustomConfig;
import com.kuaishou.growth.taskcenter.model.customconfig.WatchPhotoCountTaskCustomConfig;

public class TaskCustomConfig implements Serializable	// class@000754
{
    public WatchLiveTaskCustomConfig mWatchLiveTaskCustomConfig;
    public WatchPhotoCountTaskCustomConfig mWatchPhotoCountTaskCustomConfig;
    public static final TaskCustomConfig$a Companion;
    public static final long serialVersionUID;

    static {
       TaskCustomConfig.Companion = new TaskCustomConfig$a(null);
       TaskCustomConfig.serialVersionUID = 0xe22605446e3651df;
    }
    public void TaskCustomConfig(){
       super();
    }
    public static final long getSerialVersionUID(){
       return TaskCustomConfig.serialVersionUID;
    }
    public final WatchLiveTaskCustomConfig getMWatchLiveTaskCustomConfig(){
       return this.mWatchLiveTaskCustomConfig;
    }
    public final WatchPhotoCountTaskCustomConfig getMWatchPhotoCountTaskCustomConfig(){
       return this.mWatchPhotoCountTaskCustomConfig;
    }
    public final void setMWatchLiveTaskCustomConfig(WatchLiveTaskCustomConfig p0){
       this.mWatchLiveTaskCustomConfig = p0;
    }
    public final void setMWatchPhotoCountTaskCustomConfig(WatchPhotoCountTaskCustomConfig p0){
       this.mWatchPhotoCountTaskCustomConfig = p0;
    }
}
