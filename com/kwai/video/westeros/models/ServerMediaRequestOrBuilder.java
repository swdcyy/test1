package com.kwai.video.westeros.models.ServerMediaRequestOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickingMediaResType;

public interface abstract ServerMediaRequestOrBuilder implements MessageLiteOrBuilder	// class@00103c
{

    boolean getDisableCache();
    String getKey();
    ByteString getKeyBytes();
    String getServerAction();
    ByteString getServerActionBytes();
    String getText();
    ByteString getTextBytes();
    PickingMediaResType getType();
    int getTypeValue();
}
