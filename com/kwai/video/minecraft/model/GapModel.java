package com.kwai.video.minecraft.model.GapModel;
import com.kwai.video.minecraft.model.ComposableModel;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableGap;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.String;
import com.kwai.video.minecraft.model.TimeRange;

public interface abstract GapModel implements ComposableModel	// class@0009ff
{

    MutableGap cloneGap(ErrorStatus p0);
    RationalTime getDuration(ErrorStatus p0);
    ImmutableArray getEffects(ErrorStatus p0);
    String getGapId(ErrorStatus p0);
    TimeRange getSourceRange(ErrorStatus p0);
    TimeRange getTrimmedRange(ErrorStatus p0);
}
