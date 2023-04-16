package com.kwai.video.minecraft.model.TrackModel;
import com.kwai.video.minecraft.model.Overdueable;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableTrack;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.RationalTime;
import java.lang.String;
import java.util.Set;

public interface abstract TrackModel implements Overdueable	// class@000a28
{

    MutableTrack cloneTrack(ErrorStatus p0);
    TimeRange getAvailableRange(ErrorStatus p0);
    ImmutableArray getChildren(ErrorStatus p0);
    RationalTime getDuration(ErrorStatus p0);
    ImmutableArray getEffects(ErrorStatus p0);
    String getKind(ErrorStatus p0);
    TimeRange getSourceRange(ErrorStatus p0);
    Set getTags(ErrorStatus p0);
    String getTrackId(ErrorStatus p0);
    TimeRange getTrimmedRange(ErrorStatus p0);
}
