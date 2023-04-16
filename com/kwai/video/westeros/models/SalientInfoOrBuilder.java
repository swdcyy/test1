package com.kwai.video.westeros.models.SalientInfoOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.Rect;

public interface abstract SalientInfoOrBuilder implements MessageLiteOrBuilder	// class@001038
{

    float getConfidence();
    Rect getPosition();
    int getType();
    boolean hasPosition();
}
