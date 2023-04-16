package com.yxcorp.gifshow.init.module.y;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import pxa.e;
import java.lang.String;
import q87.c;
import ak5.j;

public final class y implements Runnable	// class@0019e5
{
    public static final y b;

    static {
       y.b = new y();
    }
    public void y(){
       super();
    }
    public final void run(){
       Object[] objArray = new Object[0];
       e.C().w("EmotionPluginInitModule", "onLoginEventMainThread", objArray);
       j.o().z();
       j.o().x(true);
    }
}
