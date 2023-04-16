package com.kwai.video.minecraft.model.Item;
import com.kwai.video.minecraft.model.SerializableObject;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.TimeRange;

public interface abstract Item implements SerializableObject	// class@000a00
{

    RationalTime absoluteDuration();
    RationalTime duration(ErrorStatus p0);
    ImmutableArray effects();
    boolean enabled();
    TimeRange sourceRange();
    TimeRange trimmedRange(ErrorStatus p0);
}
