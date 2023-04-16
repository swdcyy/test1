package com.kwai.library.wolverine.utility.ThreadUtils$ACTION_HANDLER$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Looper;
import java.lang.Object;

public final class ThreadUtils$ACTION_HANDLER$2 extends Lambda implements a	// class@000acd
{
    public static final ThreadUtils$ACTION_HANDLER$2 INSTANCE;

    static {
       ThreadUtils$ACTION_HANDLER$2.INSTANCE = new ThreadUtils$ACTION_HANDLER$2();
    }
    public void ThreadUtils$ACTION_HANDLER$2(){
       super(0);
    }
    public final Handler invoke(){
       HandlerThread handlerThrea = new HandlerThread("WolverineThread");
       handlerThrea.start();
       return new Handler(handlerThrea.getLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
