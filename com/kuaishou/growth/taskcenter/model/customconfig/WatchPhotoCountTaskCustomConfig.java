package com.kuaishou.growth.taskcenter.model.customconfig.WatchPhotoCountTaskCustomConfig;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.customconfig.WatchPhotoCountTaskCustomConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class WatchPhotoCountTaskCustomConfig implements Serializable	// class@000758
{
    public String[] mEffectPage2List;
    public int[] mEffectPageList;
    public static final WatchPhotoCountTaskCustomConfig$a Companion;
    public static final long serialVersionUID;

    static {
       WatchPhotoCountTaskCustomConfig.Companion = new WatchPhotoCountTaskCustomConfig$a(null);
       WatchPhotoCountTaskCustomConfig.serialVersionUID = 0x833391ae4d36e3ee;
    }
    public void WatchPhotoCountTaskCustomConfig(){
       super();
    }
    public static final long getSerialVersionUID(){
       return WatchPhotoCountTaskCustomConfig.serialVersionUID;
    }
    public final String[] getMEffectPage2List(){
       return this.mEffectPage2List;
    }
    public final int[] getMEffectPageList(){
       return this.mEffectPageList;
    }
    public final void setMEffectPage2List(String[] p0){
       this.mEffectPage2List = p0;
    }
    public final void setMEffectPageList(int[] p0){
       this.mEffectPageList = p0;
    }
}
