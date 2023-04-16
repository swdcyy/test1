package com.google.protobuf.MapFieldSchema;
import java.lang.Object;
import java.util.Map;
import com.google.protobuf.MapEntryLite$Metadata;

public interface abstract MapFieldSchema	// class@000475
{

    Map forMapData(Object p0);
    MapEntryLite$Metadata forMapMetadata(Object p0);
    Map forMutableMapData(Object p0);
    int getSerializedSize(int p0,Object p1,Object p2);
    boolean isImmutable(Object p0);
    Object mergeFrom(Object p0,Object p1);
    Object newMapField(Object p0);
    Object toImmutable(Object p0);
}
