package com.google.protobuf.MessageInfo;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;

public interface abstract MessageInfo	// class@000478
{

    MessageLite getDefaultInstance();
    ProtoSyntax getSyntax();
    boolean isMessageSetWireFormat();
}
