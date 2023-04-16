package com.kwai.component.photo.operate.abtest.NotLoginConfig;
import java.io.Serializable;
import com.kwai.component.photo.operate.abtest.NotLoginConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.System;

public final class NotLoginConfig implements Serializable	// class@000acf
{
    public boolean mEnable;
    public long mEndTime;
    public long mIntervalTime;
    public static final NotLoginConfig$a Companion;

    static {
       NotLoginConfig.Companion = new NotLoginConfig$a(null);
    }
    public void NotLoginConfig(){
       super();
       this.mEndTime = System.currentTimeMillis() + 5000;
       this.mIntervalTime = 0xea60;
    }
    public final boolean getMEnable(){
       return this.mEnable;
    }
    public final long getMEndTime(){
       return this.mEndTime;
    }
    public final long getMIntervalTime(){
       return this.mIntervalTime;
    }
    public final void setMEnable(boolean p0){
       this.mEnable = p0;
    }
    public final void setMEndTime(long p0){
       this.mEndTime = p0;
    }
    public final void setMIntervalTime(long p0){
       this.mIntervalTime = p0;
    }
}
