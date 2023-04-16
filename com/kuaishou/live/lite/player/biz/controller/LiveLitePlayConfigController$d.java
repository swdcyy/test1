package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$d;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLitePlayConfigController$d implements g	// class@000a87
{
    public final LiveLitePlayConfigController b;

    public void LiveLitePlayConfigController$d(LiveLitePlayConfigController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayConfigController$d.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, LiveLitePlayConfigController.class, "9")) {
             b.P(LiveLiteLogTag.PLAYER.appendTag(p0.a), "Login status change");
             p0.e();
          }
       }
       return;
    }
}
