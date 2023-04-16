package com.kuaishou.android.model.response.LiveRetryConfig;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;

public class LiveRetryConfig implements Cloneable	// class@000e94
{
    public boolean autoSwitchCDNEnabled;
    public int emptyReadSizeDuration;
    public int stalledDurationInOneMinute;

    public void LiveRetryConfig(){
       super();
       this.emptyReadSizeDuration = 10;
       this.stalledDurationInOneMinute = 15;
    }
    public LiveRetryConfig a(){
       LiveRetryConfig liveRetryCon;
       Object obj = PatchProxy.apply(null, this, LiveRetryConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          liveRetryCon = super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
       }
       return liveRetryCon;
    }
    public Object clone(){
       return this.a();
    }
}
