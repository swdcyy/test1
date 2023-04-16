package com.kwai.video.westeros.models.PickMediaOutputOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickingMediaResType;

public interface abstract PickMediaOutputOrBuilder implements MessageLiteOrBuilder	// class@000ff2
{

    String getKey();
    ByteString getKeyBytes();
    boolean getNeedFaceData();
    PickingMediaResType getType();
    int getTypeValue();
}
