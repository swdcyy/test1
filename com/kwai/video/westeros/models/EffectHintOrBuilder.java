package com.kwai.video.westeros.models.EffectHintOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.EffectHintType;

public interface abstract EffectHintOrBuilder implements MessageLiteOrBuilder	// class@000f22
{

    String getCoverImage();
    ByteString getCoverImageBytes();
    String getErrorMessage();
    ByteString getErrorMessageBytes();
    boolean getFaceImageFaceDetected();
    String getFaceImagePath();
    ByteString getFaceImagePathBytes();
    String getPickMediaPath();
    ByteString getPickMediaPathBytes();
    boolean getPickMediaResult();
    EffectHintType getType();
    int getTypeValue();
}
