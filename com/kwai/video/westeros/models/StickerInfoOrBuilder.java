package com.kwai.video.westeros.models.StickerInfoOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import com.kwai.video.westeros.models.StickerMaskInfo;
import com.kwai.video.westeros.models.FMPoint;

public interface abstract StickerInfoOrBuilder implements MessageLiteOrBuilder	// class@001048
{

    float getAlpha();
    boolean getAlphaEnable();
    float getAnimFrameFps();
    int getBlendMode();
    String getBlendName();
    ByteString getBlendNameBytes();
    boolean getEnableFrameAnim();
    boolean getFlipX();
    boolean getFlipY();
    String getFramePaths(int p0);
    ByteString getFramePathsBytes(int p0);
    int getFramePathsCount();
    List getFramePathsList();
    boolean getLoadImgFromCb();
    StickerMaskInfo getMaskInfo();
    String getPath();
    ByteString getPathBytes();
    FMPoint getPoints(int p0);
    int getPointsCount();
    List getPointsList();
    boolean getRequireUpateImg();
    String getStickerId();
    ByteString getStickerIdBytes();
    boolean hasMaskInfo();
}
