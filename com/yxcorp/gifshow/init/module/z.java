package com.yxcorp.gifshow.init.module.z;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import pxa.e;
import java.lang.String;
import q87.c;
import ak5.j;

public final class z implements Runnable	// class@0019e7
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final void run(){
       Object[] objArray = new Object[0];
       e.C().w("EmotionPluginInitModule", "onLaunchFinish", objArray);
       j.o().x(0);
    }
}
