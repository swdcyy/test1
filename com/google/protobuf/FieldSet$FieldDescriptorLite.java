package com.google.protobuf.FieldSet$FieldDescriptorLite;
import java.lang.Comparable;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.MessageLite;

public interface abstract FieldSet$FieldDescriptorLite implements Comparable	// class@000426
{

    Internal$EnumLiteMap getEnumType();
    WireFormat$JavaType getLiteJavaType();
    WireFormat$FieldType getLiteType();
    int getNumber();
    MessageLite$Builder internalMergeFrom(MessageLite$Builder p0,MessageLite p1);
    boolean isPacked();
    boolean isRepeated();
}
