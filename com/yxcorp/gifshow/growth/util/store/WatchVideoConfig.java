package com.yxcorp.gifshow.growth.util.store.WatchVideoConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public class WatchVideoConfig implements Serializable	// class@0015a1
{
    public int mIntervals;
    public boolean mWatchVideoSwitch;
    public static final long serialVersionUID = 0xcfce86d8b519056c;

    public void WatchVideoConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, WatchVideoConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
