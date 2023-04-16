package com.kwai.video.westeros.models.FaceAreaOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.FaceRect;
import java.util.List;

public interface abstract FaceAreaOrBuilder implements MessageLiteOrBuilder	// class@000f5f
{

    FaceRect getRects(int p0);
    int getRectsCount();
    List getRectsList();
}
