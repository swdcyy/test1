package com.google.protobuf.Schema;
import java.lang.Object;
import com.google.protobuf.Reader;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.Writer;

public interface abstract Schema	// class@0004a6
{

    boolean equals(Object p0,Object p1);
    int getSerializedSize(Object p0);
    int hashCode(Object p0);
    boolean isInitialized(Object p0);
    void makeImmutable(Object p0);
    void mergeFrom(Object p0,Reader p1,ExtensionRegistryLite p2);
    void mergeFrom(Object p0,Object p1);
    void mergeFrom(Object p0,byte[] p1,int p2,int p3,ArrayDecoders$Registers p4);
    Object newInstance();
    void writeTo(Object p0,Writer p1);
}
