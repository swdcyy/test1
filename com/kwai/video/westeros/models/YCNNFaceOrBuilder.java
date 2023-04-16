package com.kwai.video.westeros.models.YCNNFaceOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.YCNNPoint;
import java.util.List;
import com.kwai.video.westeros.models.YCNNRect;

public interface abstract YCNNFaceOrBuilder implements MessageLiteOrBuilder	// class@00108f
{

    float getPitch();
    YCNNPoint getPoints(int p0);
    int getPointsCount();
    List getPointsList();
    YCNNRect getRect();
    float getRoll();
    float getYaw();
    boolean hasRect();
}
