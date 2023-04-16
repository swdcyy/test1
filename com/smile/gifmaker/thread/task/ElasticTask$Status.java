package com.smile.gifmaker.thread.task.ElasticTask$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ElasticTask$Status extends Enum	// class@000fd1
{
    public static final ElasticTask$Status[] $VALUES;
    public static final ElasticTask$Status COMPLETE;
    public static final ElasticTask$Status RUNNING;
    public static final ElasticTask$Status WAITING;

    static {
       ElasticTask$Status status = new ElasticTask$Status("WAITING", 0);
       ElasticTask$Status.WAITING = status;
       ElasticTask$Status status1 = new ElasticTask$Status("RUNNING", 1);
       ElasticTask$Status.RUNNING = status1;
       ElasticTask$Status status2 = new ElasticTask$Status("COMPLETE", 2);
       ElasticTask$Status.COMPLETE = status2;
       ElasticTask$Status[] statusArray = new ElasticTask$Status[]{status,status1,status2};
       ElasticTask$Status.$VALUES = statusArray;
    }
    public void ElasticTask$Status(String p0,int p1){
       super(p0, p1);
    }
    public static ElasticTask$Status valueOf(String p0){
       return Enum.valueOf(ElasticTask$Status.class, p0);
    }
    public static ElasticTask$Status[] values(){
       return ElasticTask$Status.$VALUES.clone();
    }
}
