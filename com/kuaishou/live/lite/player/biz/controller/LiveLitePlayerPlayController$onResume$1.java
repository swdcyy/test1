package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$onResume$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLitePlayerPlayController$onResume$1 extends Lambda implements l	// class@000a98
{
    public static final LiveLitePlayerPlayController$onResume$1 INSTANCE;

    static {
       LiveLitePlayerPlayController$onResume$1.INSTANCE = new LiveLitePlayerPlayController$onResume$1();
    }
    public void LiveLitePlayerPlayController$onResume$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLitePlayerPlayController$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController$onResume$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.onResume();
       return;
    }
}