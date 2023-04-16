package com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import java.io.Serializable;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper$a;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;

public final class ResultWrapper implements Serializable	// class@001970
{
    public final HashMap extra;
    public boolean fromCache;
    public long requestNanoTime;
    public long requestWallTime;
    public long responseNanoTime;
    public long responseWallTime;
    public final Object result;
    public static final ResultWrapper$a Companion;

    static {
       ResultWrapper.Companion = new ResultWrapper$a(null);
    }
    public void ResultWrapper(Object p0){
       super();
       this.result = p0;
       this.requestWallTime = -1;
       this.requestNanoTime = -1;
       this.responseWallTime = -1;
       this.responseNanoTime = -1;
       this.extra = new HashMap();
    }
    public final HashMap getExtra(){
       return this.extra;
    }
    public final boolean getFromCache(){
       return this.fromCache;
    }
    public final long getRequestNanoTime(){
       return this.requestNanoTime;
    }
    public final long getRequestWallTime(){
       return this.requestWallTime;
    }
    public final long getResponseNanoTime(){
       return this.responseNanoTime;
    }
    public final long getResponseWallTime(){
       return this.responseWallTime;
    }
    public final Object getResult(){
       return this.result;
    }
    public final void setFromCache(boolean p0){
       this.fromCache = p0;
    }
    public final void setRequestNanoTime(long p0){
       this.requestNanoTime = p0;
    }
    public final void setRequestWallTime(long p0){
       this.requestWallTime = p0;
    }
    public final void setResponseNanoTime(long p0){
       this.responseNanoTime = p0;
    }
    public final void setResponseWallTime(long p0){
       this.responseWallTime = p0;
    }
}
