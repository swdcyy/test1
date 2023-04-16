package com.kwai.video.westeros.models.PickMediaInfoOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.PickMediaOutput;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.FMSize;

public interface abstract PickMediaInfoOrBuilder implements MessageLiteOrBuilder	// class@000fee
{

    float getDuration();
    int getMaxLength();
    PickMediaOutput getOutput();
    String getServerEffect();
    ByteString getServerEffectBytes();
    FMSize getSize();
    boolean hasOutput();
    boolean hasSize();
}
