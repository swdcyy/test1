package com.yxcorp.retrofit.SchedulerPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SchedulerPolicy extends Enum	// class@000955
{
    public static final SchedulerPolicy[] $VALUES;
    public static final SchedulerPolicy ORIGINAL_SCHEDULER;
    public static final SchedulerPolicy UI_SCHEDULER;

    static {
       SchedulerPolicy schedulerPol = new SchedulerPolicy("ORIGINAL_SCHEDULER", 0);
       SchedulerPolicy.ORIGINAL_SCHEDULER = schedulerPol;
       SchedulerPolicy schedulerPol1 = new SchedulerPolicy("UI_SCHEDULER", 1);
       SchedulerPolicy.UI_SCHEDULER = schedulerPol1;
       SchedulerPolicy[] schedulerPol2 = new SchedulerPolicy[]{schedulerPol,schedulerPol1};
       SchedulerPolicy.$VALUES = schedulerPol2;
    }
    public void SchedulerPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static SchedulerPolicy valueOf(String p0){
       return Enum.valueOf(SchedulerPolicy.class, p0);
    }
    public static SchedulerPolicy[] values(){
       return SchedulerPolicy.$VALUES.clone();
    }
}
