package com.google.protobuf.MapFieldSchemaLite;
import com.google.protobuf.MapFieldSchema;
import java.lang.Object;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MapEntryLite;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import com.google.protobuf.MapEntryLite$Metadata;

public class MapFieldSchemaLite implements MapFieldSchema	// class@000476
{

    public void MapFieldSchemaLite(){
       super();
    }
    public static int getSerializedSizeLite(int p0,Object p1,Object p2){
       int i = 0;
       if (p1.isEmpty()) {
          return i;
       }
       p1 = p1.entrySet().iterator();
       while (p1.hasNext()) {
          Map$Entry uEntry = p1.next();
          Object key = uEntry.getKey();
          i = i + p2.computeMessageSize(p0, key, uEntry.getValue());
       }
       return i;
    }
    public static MapFieldLite mergeFromLite(Object p0,Object p1){
       if (!p1.isEmpty()) {
          if (!p0.isMutable()) {
             p0 = p0.mutableCopy();
          }
          p0.mergeFrom(p1);
       }
       return p0;
    }
    public Map forMapData(Object p0){
       return p0;
    }
    public MapEntryLite$Metadata forMapMetadata(Object p0){
       return p0.getMetadata();
    }
    public Map forMutableMapData(Object p0){
       return p0;
    }
    public int getSerializedSize(int p0,Object p1,Object p2){
       return MapFieldSchemaLite.getSerializedSizeLite(p0, p1, p2);
    }
    public boolean isImmutable(Object p0){
       return (p0.isMutable() ^ 0x01);
    }
    public Object mergeFrom(Object p0,Object p1){
       return MapFieldSchemaLite.mergeFromLite(p0, p1);
    }
    public Object newMapField(Object p0){
       return MapFieldLite.emptyMapField().mutableCopy();
    }
    public Object toImmutable(Object p0){
       p0.makeImmutable();
       return p0;
    }
}
