package com.kwai.video.minecraft.model.Clip;
import com.kwai.video.minecraft.model.Item;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.String;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import com.kwai.video.minecraft.model.MediaReference;

public interface abstract Clip implements Item	// class@0009e8
{

    TimeRange availableRange(ErrorStatus p0);
    String clipId();
    MinecraftModelDefine$ClipType getClipType();
    MediaReference mediaReference();
}
