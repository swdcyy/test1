package com.yxcorp.gifshow.growth.cleaner.impl.CleanerPushSwitch;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerPushSwitch$a;
import nsd.u;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerPushSwitch$Companion$DEFAULT_CONFIG$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;

public final class CleanerPushSwitch implements Serializable	// class@00130c
{
    public int pushCycleHitCount;
    public int pushCycleNotActiveCount;
    public int pushCycleNotClickCount;
    public long pushLeftMB;
    public static final CleanerPushSwitch$a Companion;
    public static final p DEFAULT_CONFIG$delegate;
    public static final int defaultHitCount;
    public static final long defaultMB;
    public static final int defaultNotActiveCount;
    public static final int defaultNotClickCount;
    public static final long serialVersionUID;

    static {
       CleanerPushSwitch.Companion = new CleanerPushSwitch$a(null);
       CleanerPushSwitch.serialVersionUID = 0xff6bff961d422051;
       CleanerPushSwitch.defaultMB = 5120;
       CleanerPushSwitch.defaultHitCount = 10;
       CleanerPushSwitch.defaultNotClickCount = 5;
       CleanerPushSwitch.defaultNotActiveCount = 2;
       CleanerPushSwitch.DEFAULT_CONFIG$delegate = s.c(CleanerPushSwitch$Companion$DEFAULT_CONFIG$2.INSTANCE);
    }
    public void CleanerPushSwitch(){
       super();
       this.pushLeftMB = CleanerPushSwitch.defaultMB;
       this.pushCycleHitCount = CleanerPushSwitch.defaultHitCount;
       this.pushCycleNotClickCount = CleanerPushSwitch.defaultNotClickCount;
       this.pushCycleNotActiveCount = CleanerPushSwitch.defaultNotActiveCount;
    }
    public static final int getDefaultHitCount(){
       return CleanerPushSwitch.defaultHitCount;
    }
    public static final long getDefaultMB(){
       return CleanerPushSwitch.defaultMB;
    }
    public static final int getDefaultNotActiveCount(){
       return CleanerPushSwitch.defaultNotActiveCount;
    }
    public static final int getDefaultNotClickCount(){
       return CleanerPushSwitch.defaultNotClickCount;
    }
    public static final long getSerialVersionUID(){
       return CleanerPushSwitch.serialVersionUID;
    }
}
