package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$d$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$d;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$Size;
import java.lang.StringBuilder;

public final class HomeLiveAutoPlayPresenter$d$a implements Runnable	// class@0010be
{
    public final HomeLiveAutoPlayPresenter$d b;
    public final LiveStageProto$LayoutConfig c;

    public void HomeLiveAutoPlayPresenter$d$a(HomeLiveAutoPlayPresenter$d p0,LiveStageProto$LayoutConfig p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, HomeLiveAutoPlayPresenter$d$a.class, "1")) {
          return;
       }
       LiveStageProto$LayoutConfig canvasSize = this.c.canvasSize;
       this.b.b("onSeiInfo, type="+this.c.bizType, canvasSize.width, canvasSize.height);
       PatchProxy.onMethodExit(HomeLiveAutoPlayPresenter$d$a.class, "1");
       return;
    }
}
