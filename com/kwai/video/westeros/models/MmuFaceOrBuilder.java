package com.kwai.video.westeros.models.MmuFaceOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.MmuPoint;
import java.util.List;
import com.kwai.video.westeros.models.MmuRect;

public interface abstract MmuFaceOrBuilder implements MessageLiteOrBuilder	// class@000fc0
{

    float getPitch();
    MmuPoint getPoints(int p0);
    int getPointsCount();
    List getPointsList();
    MmuRect getRect();
    float getRoll();
    float getYaw();
    boolean hasRect();
}
