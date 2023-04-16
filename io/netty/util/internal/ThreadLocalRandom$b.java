package io.netty.util.internal.ThreadLocalRandom$b;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import io.netty.util.internal.ThreadLocalRandom;
import java.lang.String;
import ard.b;

public final class ThreadLocalRandom$b implements Thread$UncaughtExceptionHandler	// class@001120
{

    public void ThreadLocalRandom$b(){
       super();
    }
    public void uncaughtException(Thread p0,Throwable p1){
       ThreadLocalRandom.logger.debug("An exception has been raised by {}", p0.getName(), p1);
    }
}
