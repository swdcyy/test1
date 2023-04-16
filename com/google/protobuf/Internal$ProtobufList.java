package com.google.protobuf.Internal$ProtobufList;
import java.util.List;
import java.util.RandomAccess;

public interface abstract Internal$ProtobufList implements List, RandomAccess	// class@000456
{

    boolean isModifiable();
    void makeImmutable();
    Internal$ProtobufList mutableCopyWithCapacity(int p0);
}
