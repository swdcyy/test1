package com.kuaishou.live.basic.ability.LiveStreamInfoAbility;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import asd.c;
import java.lang.Object;

public interface abstract LiveStreamInfoAbility implements LiveBaseAbility	// class@000c90
{

    Object getAnchorId(c p0);
    Object getChatId(c p0);
    Object getLiveStreamId(c p0);
    Object getPkId(c p0);
    Object getUserId(c p0);
    Object getVoicePartyId(c p0);
    Object isAnchor(c p0);
}
