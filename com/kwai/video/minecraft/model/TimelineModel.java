package com.kwai.video.minecraft.model.TimelineModel;
import com.kwai.video.minecraft.model.Overdueable;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableTimeline;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.RationalTime;
import java.lang.String;

public interface abstract TimelineModel implements Overdueable	// class@000a26
{

    MutableTimeline cloneTimeline(ErrorStatus p0);
    ImmutableArray getAudioTrackModels(ErrorStatus p0);
    RationalTime getDuration(ErrorStatus p0);
    ImmutableArray getEffectModels(ErrorStatus p0);
    ImmutableArray getTrackModels(ErrorStatus p0);
    ImmutableArray getTrackModelsByTag(String p0,ErrorStatus p1);
    ImmutableArray getVideoTrackModels(ErrorStatus p0);
}
