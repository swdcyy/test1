package com.kuaishou.live.basic.ability.LiveModuleAbility;
import lp3.c;
import java.lang.Class;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import java.lang.String;

public interface abstract LiveModuleAbility implements c	// class@000c6e
{

    LiveBaseAbility getAbility(Class p0);
    LiveBaseAbility getAbility(String p0);
}
