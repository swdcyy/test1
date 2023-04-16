package com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract AnyOrBuilder implements MessageLiteOrBuilder	// class@0003ae
{

    String getTypeUrl();
    ByteString getTypeUrlBytes();
    ByteString getValue();
}
