package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$retryLogic$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ow2.a;

public final class TheaterPlayerController$retryLogic$2 extends Lambda implements a	// class@0019d8
{
    public final TheaterPlayerController this$0;

    public void TheaterPlayerController$retryLogic$2(TheaterPlayerController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, TheaterPlayerController$retryLogic$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.this$0.g.a;
    }
}
