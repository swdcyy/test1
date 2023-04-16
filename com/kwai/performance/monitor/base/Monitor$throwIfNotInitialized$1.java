package com.kwai.performance.monitor.base.Monitor$throwIfNotInitialized$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.RuntimeException;
import java.lang.String;

public final class Monitor$throwIfNotInitialized$1 extends Lambda implements a	// class@001101
{
    public static final Monitor$throwIfNotInitialized$1 INSTANCE;

    static {
       Monitor$throwIfNotInitialized$1.INSTANCE = new Monitor$throwIfNotInitialized$1();
    }
    public void Monitor$throwIfNotInitialized$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       throw new RuntimeException("Monitor is not initialized");
    }
}
