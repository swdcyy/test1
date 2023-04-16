package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.robust.PatchProxyResult;
import jp3.a;
import oe6.e;
import kotlin.jvm.internal.a;

public final class AudienceTheaterPlayerController$a implements g	// class@0019df
{
    public final AudienceTheaterPlayerController b;

    public void AudienceTheaterPlayerController$a(AudienceTheaterPlayerController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterPlayerController$a.class, "1")) {
       }else {
          Object obj = PatchProxy.apply(null, null, e.class, "19");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!a.a() && e.F() > 0){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             a.o(p0, "it");
             this.b.E(p0.booleanValue());
          }
       }
       return;
    }
}
