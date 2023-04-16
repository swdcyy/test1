package com.facebook.imagepipeline.producers.JobScheduler$c;
import com.facebook.imagepipeline.producers.JobScheduler$JobState;
import java.lang.Enum;

public class JobScheduler$c	// class@00111a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JobScheduler$JobState.values().length];
       try{
          JobScheduler$c.a = ointArray;
          ointArray[JobScheduler$JobState.IDLE.ordinal()] = 1;
          try{
             JobScheduler$c.a[JobScheduler$JobState.QUEUED.ordinal()] = 2;
             try{
                JobScheduler$c.a[JobScheduler$JobState.RUNNING.ordinal()] = 3;
                try{
                   JobScheduler$c.a[JobScheduler$JobState.RUNNING_AND_PENDING.ordinal()] = 4;
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
