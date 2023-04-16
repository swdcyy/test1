package com.yxcorp.gifshow.init.module.o0;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.PltHackInitModule;
import com.kwai.performance.stability.hack.JitHacker;

public final class o0 implements Runnable	// class@0019d0
{
    public static final o0 b;

    static {
       o0.b = new o0();
    }
    public void o0(){
       super();
    }
    public final void run(){
       JitHacker.protectCodeCache();
    }
}
