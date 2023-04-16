package com.kwai.video.westeros.models.AdjustIntensityConfigOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;

public interface abstract AdjustIntensityConfigOrBuilder implements MessageLiteOrBuilder	// class@000e9a
{

    float getDefaultIntensity();
    float getDefaultLookupIntensity();
    boolean getDefaultMaleMakeupIntenistyEnabled();
    float getDefaultMaleMakeupIntensity();
    String getEffectTypes(int p0);
    ByteString getEffectTypesBytes(int p0);
    int getEffectTypesCount();
    List getEffectTypesList();
    boolean getEnabled();
}
