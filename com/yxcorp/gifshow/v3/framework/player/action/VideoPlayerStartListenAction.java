package com.yxcorp.gifshow.v3.framework.player.action.VideoPlayerStartListenAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.TimeUpdateConfig;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.TimeUpdateConfig$Companion;

public final class VideoPlayerStartListenAction extends b	// class@00152b
{
    public final TimeUpdateConfig timeUpdateConfig;

    public void VideoPlayerStartListenAction(){
       super(null, 1, null);
    }
    public void VideoPlayerStartListenAction(TimeUpdateConfig p0){
       a.p(p0, "timeUpdateConfig");
       super();
       this.timeUpdateConfig = p0;
    }
    public void VideoPlayerStartListenAction(TimeUpdateConfig p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = TimeUpdateConfig.c.a();
       }
       super(p0);
       return;
    }
    public final TimeUpdateConfig getTimeUpdateConfig(){
       return this.timeUpdateConfig;
    }
}
