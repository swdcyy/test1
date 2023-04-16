package com.yxcorp.gifshow.util.PostOuterTaskManager$TaskStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PostOuterTaskManager$TaskStatus extends Enum	// class@001f1b
{
    public static final PostOuterTaskManager$TaskStatus[] $VALUES;
    public static final PostOuterTaskManager$TaskStatus FAILED;
    public static final PostOuterTaskManager$TaskStatus SUCCESS;

    static {
       PostOuterTaskManager$TaskStatus taskStatus;
       PostOuterTaskManager$TaskStatus[] taskStatusAr = new PostOuterTaskManager$TaskStatus[]{taskStatus,taskStatus};
       taskStatus = new PostOuterTaskManager$TaskStatus("SUCCESS", 0);
       PostOuterTaskManager$TaskStatus.SUCCESS = taskStatus;
       taskStatus = new PostOuterTaskManager$TaskStatus("FAILED", 1);
       PostOuterTaskManager$TaskStatus.FAILED = taskStatus;
       PostOuterTaskManager$TaskStatus.$VALUES = taskStatusAr;
    }
    public void PostOuterTaskManager$TaskStatus(String p0,int p1){
       super(p0, p1);
    }
    public static PostOuterTaskManager$TaskStatus valueOf(String p0){
       return Enum.valueOf(PostOuterTaskManager$TaskStatus.class, p0);
    }
    public static PostOuterTaskManager$TaskStatus[] values(){
       return PostOuterTaskManager$TaskStatus.$VALUES.clone();
    }
}
