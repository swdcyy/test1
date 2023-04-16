package com.google.protobuf.ValueOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Value$KindCase;
import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Struct;

public interface abstract ValueOrBuilder implements MessageLiteOrBuilder	// class@0004f4
{

    boolean getBoolValue();
    Value$KindCase getKindCase();
    ListValue getListValue();
    NullValue getNullValue();
    int getNullValueValue();
    double getNumberValue();
    String getStringValue();
    ByteString getStringValueBytes();
    Struct getStructValue();
    boolean hasListValue();
    boolean hasStructValue();
}
