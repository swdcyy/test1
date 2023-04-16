package com.kwai.video.westeros.models.PickingMediaDataOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickingMediaResType;

public interface abstract PickingMediaDataOrBuilder implements MessageLiteOrBuilder	// class@000ffe
{

    String getKey();
    ByteString getKeyBytes();
    String getPath();
    ByteString getPathBytes();
    PickingMediaResType getType();
    int getTypeValue();
}
