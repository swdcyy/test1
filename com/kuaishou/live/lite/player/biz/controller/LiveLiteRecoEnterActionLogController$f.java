package com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$f;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qc3.h;
import java.lang.Enum;
import java.lang.StringBuilder;
import y12.b;

public final class LiveLiteRecoEnterActionLogController$f implements LivePlayerStateChangeListener	// class@000aa2
{
    public final LiveLiteRecoEnterActionLogController b;

    public void LiveLiteRecoEnterActionLogController$f(LiveLiteRecoEnterActionLogController p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRecoEnterActionLogController$f.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = h.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2 || (i == 3 || i == 4)) {
             this.b.c.a("receive state:"+p0.name());
          }
       }else if(this.b.a()){
          this.b.c.d("receive state:"+p0.name());
       }
       return;
    }
}
