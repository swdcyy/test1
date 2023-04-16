package com.android.kwai.foundation.network.ThreadType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ThreadType extends Enum	// class@0003d3
{
    public static final ThreadType[] $VALUES;
    public static final ThreadType Main;
    public static final ThreadType WorkThread;

    static {
       ThreadType threadType = new ThreadType("Main", 0);
       ThreadType.Main = threadType;
       ThreadType threadType1 = new ThreadType("WorkThread", 1);
       ThreadType.WorkThread = threadType1;
       ThreadType[] threadTypeAr = new ThreadType[]{threadType,threadType1};
       ThreadType.$VALUES = threadTypeAr;
    }
    public void ThreadType(String p0,int p1){
       super(p0, p1);
    }
    public static ThreadType valueOf(String p0){
       return Enum.valueOf(ThreadType.class, p0);
    }
    public static ThreadType[] values(){
       return ThreadType.$VALUES.clone();
    }
}
