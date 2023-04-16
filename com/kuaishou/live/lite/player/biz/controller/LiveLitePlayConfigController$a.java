package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$a;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import java.lang.Object;
import jc3.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.QLivePlayConfig;

public final class LiveLitePlayConfigController$a implements g	// class@000a84
{
    public final LiveLitePlayConfigController b;
    public final boolean c;

    public void LiveLitePlayConfigController$a(LiveLitePlayConfigController p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayConfigController$a.class, "1")) {
       }else {
          p0.mb(this.c, this.b.d);
       }
       return;
    }
}
