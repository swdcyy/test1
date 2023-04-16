package com.yxcorp.gifshow.l;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.player.config.PhotoPlayerConfig;

public final class l implements Runnable	// class@001e44
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final void run(){
       PhotoPlayerConfig.c();
    }
}
