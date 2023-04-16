package com.google.common.util.concurrent.MoreExecutors$DirectExecutor;
import java.util.concurrent.Executor;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Runnable;

public final class MoreExecutors$DirectExecutor extends Enum implements Executor	// class@00192f
{
    public static final MoreExecutors$DirectExecutor[] $VALUES;
    public static final MoreExecutors$DirectExecutor INSTANCE;

    static {
       MoreExecutors$DirectExecutor uDirectExecu = new MoreExecutors$DirectExecutor("INSTANCE", 0);
       MoreExecutors$DirectExecutor.INSTANCE = uDirectExecu;
       MoreExecutors$DirectExecutor[] uDirectExecu1 = new MoreExecutors$DirectExecutor[]{uDirectExecu};
       MoreExecutors$DirectExecutor.$VALUES = uDirectExecu1;
    }
    public void MoreExecutors$DirectExecutor(String p0,int p1){
       super(p0, p1);
    }
    public static MoreExecutors$DirectExecutor valueOf(String p0){
       return Enum.valueOf(MoreExecutors$DirectExecutor.class, p0);
    }
    public static MoreExecutors$DirectExecutor[] values(){
       return MoreExecutors$DirectExecutor.$VALUES.clone();
    }
    public void execute(Runnable p0){
       p0.run();
    }
    public String toString(){
       return "MoreExecutors.directExecutor\(\)";
    }
}
