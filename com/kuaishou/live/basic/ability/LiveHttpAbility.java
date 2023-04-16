package com.kuaishou.live.basic.ability.LiveHttpAbility;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import com.kuaishou.live.basic.ability.LiveHttpAbility$Params;
import asd.c;
import java.lang.Object;

public interface abstract LiveHttpAbility implements LiveBaseAbility	// class@000c68
{

    Object get(LiveHttpAbility$Params p0,c p1);
    Object post(LiveHttpAbility$Params p0,c p1);
}
