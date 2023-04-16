package com.facebook.imagepipeline.common.Priority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Priority extends Enum	// class@0010ec
{
    public static final Priority[] $VALUES;
    public static final Priority HIGH;
    public static final Priority LOW;
    public static final Priority MEDIUM;

    static {
       Priority priority = new Priority("LOW", 0);
       Priority.LOW = priority;
       Priority priority1 = new Priority("MEDIUM", 1);
       Priority.MEDIUM = priority1;
       Priority priority2 = new Priority("HIGH", 2);
       Priority.HIGH = priority2;
       Priority[] priorityArra = new Priority[]{priority,priority1,priority2};
       Priority.$VALUES = priorityArra;
    }
    public void Priority(String p0,int p1){
       super(p0, p1);
    }
    public static Priority getHigherPriority(Priority p0,Priority p1){
       if (p0 == null) {
          return p1;
       }
       if (p1 == null) {
          return p0;
       }
       if (p0.ordinal() > p1.ordinal()) {
          return p0;
       }
       return p1;
    }
    public static Priority valueOf(String p0){
       return Enum.valueOf(Priority.class, p0);
    }
    public static Priority[] values(){
       return Priority.$VALUES.clone();
    }
}
