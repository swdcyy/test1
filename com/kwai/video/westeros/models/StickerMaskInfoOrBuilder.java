package com.kwai.video.westeros.models.StickerMaskInfoOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.FMPoint;
import java.util.List;

public interface abstract StickerMaskInfoOrBuilder implements MessageLiteOrBuilder	// class@00104c
{

    boolean getDecodeShader();
    boolean getDisableRender();
    boolean getIsEdit();
    float getMaskFeatherRadius();
    String getMaskPath();
    ByteString getMaskPathBytes();
    String getMaskShaderPath();
    ByteString getMaskShaderPathBytes();
    FMPoint getPoints(int p0);
    int getPointsCount();
    List getPointsList();
    boolean getRequestUpdate();
    boolean getReverse();
    boolean getShaderPathBuiltin();
}
