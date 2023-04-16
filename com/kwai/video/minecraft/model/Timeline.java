package com.kwai.video.minecraft.model.Timeline;
import com.kwai.video.minecraft.model.Item;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.minecraft.model.Timeline$FontResolveHandler;
import com.kwai.video.minecraft.model.nano.Minecraft$TimelineConfig;

public interface abstract Timeline implements Item	// class@000a25
{

    ImmutableArray audioTracks();
    ImmutableArray deletedRanges();
    Minecraft$Color marginColor();
    Minecraft$Color paddingColor();
    long projectHeight();
    long projectId();
    long projectWidth();
    void setFontResolveHandler(Timeline$FontResolveHandler p0);
    Minecraft$TimelineConfig timelineConfig();
    ImmutableArray tracks();
    ImmutableArray videoTracks();
}
