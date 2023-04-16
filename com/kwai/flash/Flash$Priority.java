package com.kwai.flash.Flash$Priority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Flash$Priority extends Enum	// class@0014c1
{
    public static final Flash$Priority[] $VALUES;
    public static final Flash$Priority HIGH;
    public static final Flash$Priority IMMEDIATE;
    public static final Flash$Priority LOW;
    public static final Flash$Priority NORMAL;

    static {
       Flash$Priority priority = new Flash$Priority("IMMEDIATE", 0);
       Flash$Priority.IMMEDIATE = priority;
       Flash$Priority priority1 = new Flash$Priority("HIGH", 1);
       Flash$Priority.HIGH = priority1;
       Flash$Priority priority2 = new Flash$Priority("NORMAL", 2);
       Flash$Priority.NORMAL = priority2;
       Flash$Priority priority3 = new Flash$Priority("LOW", 3);
       Flash$Priority.LOW = priority3;
       Flash$Priority[] priorityArra = new Flash$Priority[]{priority,priority1,priority2,priority3};
       Flash$Priority.$VALUES = priorityArra;
    }
    public void Flash$Priority(String p0,int p1){
       super(p0, p1);
    }
    public static Flash$Priority valueOf(String p0){
       return Enum.valueOf(Flash$Priority.class, p0);
    }
    public static Flash$Priority[] values(){
       return Flash$Priority.$VALUES.clone();
    }
}
