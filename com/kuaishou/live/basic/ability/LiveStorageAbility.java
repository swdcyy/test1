package com.kuaishou.live.basic.ability.LiveStorageAbility;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import com.kuaishou.live.basic.ability.LiveStorageAbility$GetStorageParams;
import asd.c;
import java.lang.Object;
import com.kuaishou.live.basic.ability.LiveStorageAbility$SetStorageParams;

public interface abstract LiveStorageAbility implements LiveBaseAbility	// class@000c8c
{

    Object getStorage(LiveStorageAbility$GetStorageParams p0,c p1);
    Object setStorage(LiveStorageAbility$SetStorageParams p0,c p1);
}
