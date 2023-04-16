package com.yxcorp.gifshow.longinus.LonginusInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.longinus.LonginusInfo$a;
import nsd.u;
import java.lang.Object;

public final class LonginusInfo implements Serializable	// class@001b68
{
    public long requestIntervalMs;
    public int silenceEnd;
    public int silentStart;
    public static final LonginusInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LonginusInfo.Companion = new LonginusInfo$a(null);
    }
    public void LonginusInfo(){
       super();
       this.silentStart = -1;
       this.silenceEnd = -1;
       this.requestIntervalMs = (long)-1;
    }
    public final long getRequestIntervalMs(){
       return this.requestIntervalMs;
    }
    public final int getSilenceEnd(){
       return this.silenceEnd;
    }
    public final int getSilentStart(){
       return this.silentStart;
    }
    public final boolean isValid(){
       boolean b = (this.silentStart > null && (this.silenceEnd > null && this.requestIntervalMs > 0))? true: false;
       return b;
    }
    public final void setRequestIntervalMs(long p0){
       this.requestIntervalMs = p0;
    }
    public final void setSilenceEnd(int p0){
       this.silenceEnd = p0;
    }
    public final void setSilentStart(int p0){
       this.silentStart = p0;
    }
}
