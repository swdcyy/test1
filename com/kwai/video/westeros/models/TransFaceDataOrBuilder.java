package com.kwai.video.westeros.models.TransFaceDataOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.TransFacePoint;
import java.util.List;

public interface abstract TransFaceDataOrBuilder implements MessageLiteOrBuilder	// class@001058
{

    TransFacePoint getData(int p0);
    int getDataCount();
    List getDataList();
    boolean getIsMirror();
}
