package com.kwai.video.westeros.models.MmuResourceConfigOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;

public interface abstract MmuResourceConfigOrBuilder implements MessageLiteOrBuilder	// class@000fe3
{

    boolean getIsBuiltin();
    String getMmuModelPath(int p0);
    ByteString getMmuModelPathBytes(int p0);
    int getMmuModelPathCount();
    List getMmuModelPathList();
    String getResourcePath();
    ByteString getResourcePathBytes();
    String getYcnnModelPath();
    ByteString getYcnnModelPathBytes();
}
