package com.kwai.video.minecraft.model.TransitionModel;
import com.kwai.video.minecraft.model.ComposableModel;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableTransition;
import com.kwai.video.minecraft.model.RationalTime;
import java.lang.String;

public interface abstract TransitionModel implements ComposableModel	// class@000a2a
{

    MutableTransition cloneTransition(ErrorStatus p0);
    RationalTime getDuration(ErrorStatus p0);
    RationalTime getInOffset(ErrorStatus p0);
    RationalTime getOutOffset(ErrorStatus p0);
    String getTransitionId(ErrorStatus p0);
}
