package com.kwai.video.wayne.player.main.RetryInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class RetryInfo	// class@000d95
{
    public Throwable error;
    public int extra;
    public int notCDNRetryCount;
    public int switchStrategy;
    public int totalRetryCount;
    public int what;

    public void RetryInfo(){
       super();
    }
    public static void getSwitchStrategy$annotations(){
    }
    public final Throwable getError(){
       return this.error;
    }
    public final int getExtra(){
       return this.extra;
    }
    public final int getNotCDNRetryCount(){
       return this.notCDNRetryCount;
    }
    public final int getSwitchStrategy(){
       return this.switchStrategy;
    }
    public final int getTotalRetryCount(){
       return this.totalRetryCount;
    }
    public final int getWhat(){
       return this.what;
    }
    public final void setError(Throwable p0){
       this.error = p0;
    }
    public final void setExtra(int p0){
       this.extra = p0;
    }
    public final void setNotCDNRetryCount(int p0){
       this.notCDNRetryCount = p0;
    }
    public final void setSwitchStrategy(int p0){
       this.switchStrategy = p0;
    }
    public final void setTotalRetryCount(int p0){
       this.totalRetryCount = p0;
    }
    public final void setWhat(int p0){
       this.what = p0;
    }
    public String toString(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, RetryInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "{error:";
       RetryInfo terror = this.error;
       if (terror != null) {
          objArray = terror.getMessage();
       }
       return obj+objArray+",totalRetryCount:"+this.totalRetryCount+",notCDNRetryCount:"+this.notCDNRetryCount+",extra:"+this.extra+",what:"+this.what+'}';
    }
}
