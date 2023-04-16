package com.kuaishou.live.basic.ability.LiveResourceAbility;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import com.kuaishou.live.basic.ability.LiveResourceAbility$Params;
import asd.c;
import java.lang.Object;
import com.kuaishou.live.basic.ability.LiveResourceAbility$GetMagicFacePathParams;

public interface abstract LiveResourceAbility implements LiveBaseAbility	// class@000c78
{

    Object getImagePath(LiveResourceAbility$Params p0,c p1);
    Object getMagicFacePath(LiveResourceAbility$GetMagicFacePathParams p0,c p1);
}
