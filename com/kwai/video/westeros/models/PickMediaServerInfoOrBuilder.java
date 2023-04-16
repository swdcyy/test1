package com.kwai.video.westeros.models.PickMediaServerInfoOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickMediaOutput;
import java.util.List;

public interface abstract PickMediaServerInfoOrBuilder implements MessageLiteOrBuilder	// class@000ff6
{

    String getAction();
    ByteString getActionBytes();
    String getName();
    ByteString getNameBytes();
    PickMediaOutput getOutput(int p0);
    int getOutputCount();
    List getOutputList();
    String getType();
    ByteString getTypeBytes();
}
