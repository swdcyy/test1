package com.kuaishou.live.effect.resource.download.common.j;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController;
import java.util.HashMap;
import java.util.Map;

public final class j implements Runnable	// class@001b40
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void run(){
       LiveMagicGiftDownloadController.t().x(new HashMap(LiveMagicGiftDownloadController.t().f), 0);
    }
}
