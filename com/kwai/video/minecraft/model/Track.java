package com.kwai.video.minecraft.model.Track;
import com.kwai.video.minecraft.model.Item;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.String;
import java.util.Set;

public interface abstract Track implements Item	// class@000a27
{

    ImmutableArray children();
    String kind();
    Set tags();
    String trackId();
}
