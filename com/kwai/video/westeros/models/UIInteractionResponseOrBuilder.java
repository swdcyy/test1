package com.kwai.video.westeros.models.UIInteractionResponseOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.Point;
import java.util.List;
import com.kwai.video.westeros.models.UIInteractionResponseType;

public interface abstract UIInteractionResponseOrBuilder implements MessageLiteOrBuilder	// class@001071
{

    Point getPoints(int p0);
    int getPointsCount();
    List getPointsList();
    UIInteractionResponseType getType();
    int getTypeValue();
}
