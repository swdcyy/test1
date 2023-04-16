package com.kwai.video.westeros.models.UiTouchEventOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.Point2d;
import java.util.List;
import com.kwai.video.westeros.models.UiTouchEventType;

public interface abstract UiTouchEventOrBuilder implements MessageLiteOrBuilder	// class@001078
{

    Point2d getPoints(int p0);
    int getPointsCount();
    List getPointsList();
    UiTouchEventType getType();
    int getTypeValue();
}
