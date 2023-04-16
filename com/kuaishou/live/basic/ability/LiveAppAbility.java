package com.kuaishou.live.basic.ability.LiveAppAbility;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import asd.c;
import java.lang.Object;

public interface abstract LiveAppAbility implements LiveBaseAbility	// class@000c56
{

    Object getAppMemory(c p0);
    Object getAppVersion(c p0);
    Object getDeviceModel(c p0);
    Object getDeviceThermalState(c p0);
    Object getOsVersion(c p0);
    Object getPerformanceLevel(c p0);
    Object getPerformanceScore(c p0);
    Object getPlatform(c p0);
}
