package com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand;
import com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand$MockState;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand$LightState;

public final class LiveWishLightEffectCommand	// class@0012ae
{
    public LiveWishLightEffectCommand$LightState lightState;
    public LiveWishLightEffectCommand$MockState mockState;
    public static final LiveWishLightEffectCommand$a a;

    static {
       LiveWishLightEffectCommand.a = new LiveWishLightEffectCommand$a(null);
    }
    public void LiveWishLightEffectCommand(){
       super();
    }
    public void LiveWishLightEffectCommand(String p0,LiveMultiMagicEffectInfo p1,String p2,LiveWishLightEffectCommand$MockState p3){
       a.p(p0, "id");
       a.p(p1, "info");
       a.p(p2, "avatarPath");
       super();
       this.mockState = p3;
       this.lightState = new LiveWishLightEffectCommand$LightState(p0, p1, p2);
    }
}
