package com.kwai.video.minecraft.model.Effect;
import com.kwai.video.minecraft.model.SerializableObject;
import java.lang.String;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import com.kwai.video.minecraft.model.TimeRange;
import java.util.Set;

public interface abstract Effect implements SerializableObject	// class@0009f9
{

    String effectId();
    MinecraftModelDefine$EffectType getEffectType();
    TimeRange sourceRange();
    Set tags();
}
