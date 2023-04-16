package com.kwai.video.minecraft.model.MediaReference;
import com.kwai.video.minecraft.model.SerializableObject;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.String;

public interface abstract MediaReference implements SerializableObject	// class@000a01
{

    TimeRange availableRange();
    String referenceId();
}
