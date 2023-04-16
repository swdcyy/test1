package com.yxcorp.gifshow.init.module.b0;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.GameCenterInitModule;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;

public final class b0 implements Runnable	// class@0019b2
{
    public static final b0 b;

    static {
       b0.b = new b0();
    }
    public void b0(){
       super();
    }
    public final void run(){
       d.a(-1986139969).reportGameDownloadComplete();
    }
}
