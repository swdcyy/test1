package com.kwai.video.westeros.models.EffectLookupParamOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.EffectResource;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.EffectLookupResType;

public interface abstract EffectLookupParamOrBuilder implements MessageLiteOrBuilder	// class@000f29
{

    int getDimension();
    EffectResource getEffectRes();
    float getIntensity();
    String getPath();
    ByteString getPathBytes();
    EffectLookupResType getResType();
    int getResTypeValue();
    int getType();
    boolean hasEffectRes();
}
