package com.kwai.video.westeros.models.YCNNResourceConfigOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.YCNNModelInConfig;

public interface abstract YCNNResourceConfigOrBuilder implements MessageLiteOrBuilder	// class@0010a3
{

    boolean getIsBuiltin();
    String getMmuModelPath();
    ByteString getMmuModelPathBytes();
    YCNNModelInConfig getModelinConfig();
    String getResourcePath();
    ByteString getResourcePathBytes();
    String getYcnnModelPath();
    ByteString getYcnnModelPathBytes();
    boolean hasModelinConfig();
}
