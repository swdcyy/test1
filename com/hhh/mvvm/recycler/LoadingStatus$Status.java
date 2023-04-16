package com.hhh.mvvm.recycler.LoadingStatus$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LoadingStatus$Status extends Enum	// class@000563
{
    public static final LoadingStatus$Status[] $VALUES;
    public static final LoadingStatus$Status EMPTY;
    public static final LoadingStatus$Status FAILED;
    public static final LoadingStatus$Status INSERT;
    public static final LoadingStatus$Status NOMORE;
    public static final LoadingStatus$Status REMOVE;
    public static final LoadingStatus$Status RESTORE;
    public static final LoadingStatus$Status RUNNING;
    public static final LoadingStatus$Status SUCCESS;
    public static final LoadingStatus$Status UPDATE;

    static {
       LoadingStatus$Status status = new LoadingStatus$Status("RUNNING", 0);
       LoadingStatus$Status.RUNNING = status;
       LoadingStatus$Status status1 = new LoadingStatus$Status("SUCCESS", 1);
       LoadingStatus$Status.SUCCESS = status1;
       LoadingStatus$Status status2 = new LoadingStatus$Status("EMPTY", 2);
       LoadingStatus$Status.EMPTY = status2;
       LoadingStatus$Status status3 = new LoadingStatus$Status("NOMORE", 3);
       LoadingStatus$Status.NOMORE = status3;
       LoadingStatus$Status status4 = new LoadingStatus$Status("FAILED", 4);
       LoadingStatus$Status.FAILED = status4;
       LoadingStatus$Status status5 = new LoadingStatus$Status("INSERT", 5);
       LoadingStatus$Status.INSERT = status5;
       LoadingStatus$Status status6 = new LoadingStatus$Status("REMOVE", 6);
       LoadingStatus$Status.REMOVE = status6;
       LoadingStatus$Status status7 = new LoadingStatus$Status("UPDATE", 7);
       LoadingStatus$Status.UPDATE = status7;
       LoadingStatus$Status status8 = new LoadingStatus$Status("RESTORE", 8);
       LoadingStatus$Status.RESTORE = status8;
       LoadingStatus$Status[] statusArray = new LoadingStatus$Status[9];
       statusArray[0] = status;
       statusArray[1] = status1;
       statusArray[2] = status2;
       statusArray[3] = status3;
       statusArray[4] = status4;
       statusArray[5] = status5;
       statusArray[6] = status6;
       statusArray[7] = status7;
       statusArray[8] = status8;
       LoadingStatus$Status.$VALUES = statusArray;
    }
    public void LoadingStatus$Status(String p0,int p1){
       super(p0, p1);
    }
    public static LoadingStatus$Status valueOf(String p0){
       return Enum.valueOf(LoadingStatus$Status.class, p0);
    }
    public static LoadingStatus$Status[] values(){
       return LoadingStatus$Status.$VALUES.clone();
    }
}
