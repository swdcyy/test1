package com.kuaishou.live.basic.ability.LiveEffectAbility;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import com.kuaishou.live.basic.ability.LiveEffectAbility$Params;
import asd.c;
import java.lang.Object;
import com.kuaishou.live.basic.ability.LiveEffectAbility$EffectCallback;

public interface abstract LiveEffectAbility implements LiveBaseAbility	// class@000c5d
{

    Object playEffect(LiveEffectAbility$Params p0,c p1);
    void setCommonEffectCallback(LiveEffectAbility$EffectCallback p0);
}
