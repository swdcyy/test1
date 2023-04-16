package com.kwai.video.minecraft.model.Transition;
import com.kwai.video.minecraft.model.Composable;
import com.kwai.video.minecraft.model.SerializableObject;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.MinecraftModelDefine$TransitionType;
import java.lang.String;

public interface abstract Transition implements Composable, SerializableObject	// class@000a29
{

    RationalTime duration(ErrorStatus p0);
    MinecraftModelDefine$TransitionType getTransitionType();
    RationalTime inOffset();
    RationalTime outOffset();
    String transitionId();
}
