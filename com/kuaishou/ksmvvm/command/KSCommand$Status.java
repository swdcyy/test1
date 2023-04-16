package com.kuaishou.ksmvvm.command.KSCommand$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KSCommand$Status extends Enum	// class@000928
{
    public final int mIndex;
    public static final KSCommand$Status[] $VALUES;
    public static final KSCommand$Status EXECUTING;
    public static final KSCommand$Status FAILURE;
    public static final KSCommand$Status SUCCESS;
    public static final KSCommand$Status UNABLE;
    public static final KSCommand$Status UNKNOWN;
    public static final KSCommand$Status WAITING;

    static {
       KSCommand$Status status = new KSCommand$Status("UNKNOWN", 0, 0);
       KSCommand$Status.UNKNOWN = status;
       KSCommand$Status status1 = new KSCommand$Status("SUCCESS", 1, 1);
       KSCommand$Status.SUCCESS = status1;
       KSCommand$Status status2 = new KSCommand$Status("FAILURE", 2, 2);
       KSCommand$Status.FAILURE = status2;
       KSCommand$Status status3 = new KSCommand$Status("WAITING", 3, 3);
       KSCommand$Status.WAITING = status3;
       KSCommand$Status status4 = new KSCommand$Status("EXECUTING", 4, 4);
       KSCommand$Status.EXECUTING = status4;
       KSCommand$Status status5 = new KSCommand$Status("UNABLE", 5, 5);
       KSCommand$Status.UNABLE = status5;
       KSCommand$Status[] statusArray = new KSCommand$Status[]{status,status1,status2,status3,status4,status5};
       KSCommand$Status.$VALUES = statusArray;
    }
    public void KSCommand$Status(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static KSCommand$Status valueOf(String p0){
       return Enum.valueOf(KSCommand$Status.class, p0);
    }
    public static KSCommand$Status[] values(){
       return KSCommand$Status.$VALUES.clone();
    }
}
