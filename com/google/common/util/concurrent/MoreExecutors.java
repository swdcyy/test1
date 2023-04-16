package com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.MoreExecutors$DirectExecutor;

public final class MoreExecutors	// class@001930
{

    public static Executor a(){
       return MoreExecutors$DirectExecutor.INSTANCE;
    }
}
