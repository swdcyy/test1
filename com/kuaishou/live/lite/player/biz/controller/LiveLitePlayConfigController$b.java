package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$b;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Object;
import jc3.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLitePlayConfigController$b implements g	// class@000a85
{
    public final LiveLitePlayConfigController b;
    public final boolean c;
    public final QLivePlayConfig d;

    public void LiveLitePlayConfigController$b(LiveLitePlayConfigController p0,boolean p1,QLivePlayConfig p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayConfigController$b.class, "1")) {
       }else {
          p0.nh(this.c, this.d, this.b.d);
       }
       return;
    }
}
