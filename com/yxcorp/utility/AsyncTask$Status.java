package com.yxcorp.utility.AsyncTask$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AsyncTask$Status extends Enum	// class@00099c
{
    public static final AsyncTask$Status[] $VALUES;
    public static final AsyncTask$Status FINISHED;
    public static final AsyncTask$Status PENDING;
    public static final AsyncTask$Status RUNNING;

    static {
       AsyncTask$Status status = new AsyncTask$Status("PENDING", 0);
       AsyncTask$Status.PENDING = status;
       AsyncTask$Status status1 = new AsyncTask$Status("RUNNING", 1);
       AsyncTask$Status.RUNNING = status1;
       AsyncTask$Status status2 = new AsyncTask$Status("FINISHED", 2);
       AsyncTask$Status.FINISHED = status2;
       AsyncTask$Status[] statusArray = new AsyncTask$Status[]{status,status1,status2};
       AsyncTask$Status.$VALUES = statusArray;
    }
    public void AsyncTask$Status(String p0,int p1){
       super(p0, p1);
    }
    public static AsyncTask$Status valueOf(String p0){
       return Enum.valueOf(AsyncTask$Status.class, p0);
    }
    public static AsyncTask$Status[] values(){
       return AsyncTask$Status.$VALUES.clone();
    }
}
