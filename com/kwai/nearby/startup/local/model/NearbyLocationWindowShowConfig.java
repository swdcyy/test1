package com.kwai.nearby.startup.local.model.NearbyLocationWindowShowConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class NearbyLocationWindowShowConfig implements Serializable	// class@001027
{
    public int mFeedCountWhenShow;
    public List mShowStrategy;
    public static final long serialVersionUID = 0x64450cbe2952c297;

    public void NearbyLocationWindowShowConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyLocationWindowShowConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyLocationWindowShowConfig{mShowStrategy="+this.mShowStrategy+", mFeedCountWhenShow="+this.mFeedCountWhenShow+'}';
    }
}
