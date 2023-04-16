package com.facebook.imagepipeline.producers.JobScheduler$JobState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class JobScheduler$JobState extends Enum	// class@001117
{
    public static final JobScheduler$JobState[] $VALUES;
    public static final JobScheduler$JobState IDLE;
    public static final JobScheduler$JobState QUEUED;
    public static final JobScheduler$JobState RUNNING;
    public static final JobScheduler$JobState RUNNING_AND_PENDING;

    static {
       JobScheduler$JobState jobState = new JobScheduler$JobState("IDLE", 0);
       JobScheduler$JobState.IDLE = jobState;
       JobScheduler$JobState jobState1 = new JobScheduler$JobState("QUEUED", 1);
       JobScheduler$JobState.QUEUED = jobState1;
       JobScheduler$JobState jobState2 = new JobScheduler$JobState("RUNNING", 2);
       JobScheduler$JobState.RUNNING = jobState2;
       JobScheduler$JobState jobState3 = new JobScheduler$JobState("RUNNING_AND_PENDING", 3);
       JobScheduler$JobState.RUNNING_AND_PENDING = jobState3;
       JobScheduler$JobState[] jobStateArra = new JobScheduler$JobState[]{jobState,jobState1,jobState2,jobState3};
       JobScheduler$JobState.$VALUES = jobStateArra;
    }
    public void JobScheduler$JobState(String p0,int p1){
       super(p0, p1);
    }
    public static JobScheduler$JobState valueOf(String p0){
       return Enum.valueOf(JobScheduler$JobState.class, p0);
    }
    public static JobScheduler$JobState[] values(){
       return JobScheduler$JobState.$VALUES.clone();
    }
}
