package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$onStart$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLitePlayerPlayController$onStart$3 extends Lambda implements l	// class@000a99
{
    public static final LiveLitePlayerPlayController$onStart$3 INSTANCE;

    static {
       LiveLitePlayerPlayController$onStart$3.INSTANCE = new LiveLitePlayerPlayController$onStart$3();
    }
    public void LiveLitePlayerPlayController$onStart$3(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLitePlayerPlayController$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController$onStart$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.onStart();
       return;
    }
}
