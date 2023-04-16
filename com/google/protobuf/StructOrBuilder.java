package com.google.protobuf.StructOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.Value;

public interface abstract StructOrBuilder implements MessageLiteOrBuilder	// class@0004c0
{

    boolean containsFields(String p0);
    Map getFields();
    int getFieldsCount();
    Map getFieldsMap();
    Value getFieldsOrDefault(String p0,Value p1);
    Value getFieldsOrThrow(String p0);
}
