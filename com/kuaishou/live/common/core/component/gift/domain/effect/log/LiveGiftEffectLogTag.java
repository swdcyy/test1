package com.kuaishou.live.common.core.component.gift.domain.effect.log.LiveGiftEffectLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveGiftEffectLogTag extends Enum implements c	// class@0011ae
{
    public final String _name;
    public static final LiveGiftEffectLogTag[] $VALUES;
    public static final LiveGiftEffectLogTag LIVE_GIFT_EFFECT;

    static {
       LiveGiftEffectLogTag liveGiftEffe1;
       LiveGiftEffectLogTag[] liveGiftEffe = new LiveGiftEffectLogTag[]{liveGiftEffe1};
       liveGiftEffe1 = new LiveGiftEffectLogTag("LIVE_GIFT_EFFECT", 0, "LiveGiftEffect");
       LiveGiftEffectLogTag.LIVE_GIFT_EFFECT = liveGiftEffe1;
       LiveGiftEffectLogTag.$VALUES = liveGiftEffe;
    }
    public void LiveGiftEffectLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this._name = p2;
    }
    public static LiveGiftEffectLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftEffectLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftEffectLogTag.class, p0);
    }
    public static LiveGiftEffectLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftEffectLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftEffectLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this._name;
    }
    public final String get_name(){
       return this._name;
    }
}
