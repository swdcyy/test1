package com.kwai.video.westeros.models.EmbeddedPickingMediaOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickingMediaResType;

public interface abstract EmbeddedPickingMediaOrBuilder implements MessageLiteOrBuilder	// class@000f4c
{

    float getDuration();
    String getIconPath();
    ByteString getIconPathBytes();
    String getMediaPath();
    ByteString getMediaPathBytes();
    boolean getPick();
    PickingMediaResType getType();
    int getTypeValue();
}
