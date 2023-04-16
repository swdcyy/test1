package com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapEntryLite$Metadata;
import java.lang.Object;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.FieldSet;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Map$Entry;
import com.google.protobuf.WireFormat;
import java.util.AbstractMap$SimpleImmutableEntry;
import com.google.protobuf.MapEntryLite$1;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Integer;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.MapFieldLite;

public class MapEntryLite	// class@000473
{
    public final Object key;
    public final MapEntryLite$Metadata metadata;
    public final Object value;

    public void MapEntryLite(MapEntryLite$Metadata p0,Object p1,Object p2){
       super();
       this.metadata = p0;
       this.key = p1;
       this.value = p2;
    }
    public void MapEntryLite(WireFormat$FieldType p0,Object p1,WireFormat$FieldType p2,Object p3){
       super();
       this.metadata = new MapEntryLite$Metadata(p0, p1, p2, p3);
       this.key = p1;
       this.value = p3;
    }
    public static int computeSerializedSize(MapEntryLite$Metadata p0,Object p1,Object p2){
       return (FieldSet.computeElementSize(p0.keyType, 1, p1) + FieldSet.computeElementSize(p0.valueType, 2, p2));
    }
    public static MapEntryLite newDefaultInstance(WireFormat$FieldType p0,Object p1,WireFormat$FieldType p2,Object p3){
       return new MapEntryLite(p0, p1, p2, p3);
    }
    public static Map$Entry parseEntry(CodedInputStream p0,MapEntryLite$Metadata p1,ExtensionRegistryLite p2){
       MapEntryLite$Metadata defaultKey = p1.defaultKey;
       MapEntryLite$Metadata defaultValue = p1.defaultValue;
       int i = p0.readTag();
       while (i) {
          if (i == WireFormat.makeTag(1, p1.keyType.getWireType())) {
             defaultKey = MapEntryLite.parseField(p0, p2, p1.keyType, defaultKey);
          }else if(i == WireFormat.makeTag(2, p1.valueType.getWireType())){
             defaultValue = MapEntryLite.parseField(p0, p2, p1.valueType, defaultValue);
          }else if(!p0.skipField(i)){
             break ;
          }
       }
       return new AbstractMap$SimpleImmutableEntry(defaultKey, defaultValue);
    }
    public static Object parseField(CodedInputStream p0,ExtensionRegistryLite p1,WireFormat$FieldType p2,Object p3){
       int i = MapEntryLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p2.ordinal()];
       if (i != 1) {
          if (i == 2) {
             return Integer.valueOf(p0.readEnum());
          }
          if (i != 3) {
             return FieldSet.readPrimitiveField(p0, p2, true);
          }
          throw new RuntimeException("Groups are not allowed in maps.");
       }else {
          MessageLite$Builder uBuilder = p3.toBuilder();
          p0.readMessage(uBuilder, p1);
          return uBuilder.buildPartial();
       }
    }
    public static void writeTo(CodedOutputStream p0,MapEntryLite$Metadata p1,Object p2,Object p3){
       FieldSet.writeElement(p0, p1.keyType, 1, p2);
       FieldSet.writeElement(p0, p1.valueType, 2, p3);
    }
    public int computeMessageSize(int p0,Object p1,Object p2){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(MapEntryLite.computeSerializedSize(this.metadata, p1, p2)));
    }
    public Object getKey(){
       return this.key;
    }
    public MapEntryLite$Metadata getMetadata(){
       return this.metadata;
    }
    public Object getValue(){
       return this.value;
    }
    public Map$Entry parseEntry(ByteString p0,ExtensionRegistryLite p1){
       return MapEntryLite.parseEntry(p0.newCodedInput(), this.metadata, p1);
    }
    public void parseInto(MapFieldLite p0,CodedInputStream p1,ExtensionRegistryLite p2){
       int i = p1.pushLimit(p1.readRawVarint32());
       MapEntryLite tmetadata = this.metadata;
       MapEntryLite$Metadata defaultKey = tmetadata.defaultKey;
       MapEntryLite$Metadata defaultValue = tmetadata.defaultValue;
       int i1 = p1.readTag();
       while (i1) {
          if (i1 == WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
             defaultKey = MapEntryLite.parseField(p1, p2, this.metadata.keyType, defaultKey);
          }else if(i1 == WireFormat.makeTag(2, this.metadata.valueType.getWireType())){
             defaultValue = MapEntryLite.parseField(p1, p2, this.metadata.valueType, defaultValue);
          }else if(!p1.skipField(i1)){
             break ;
          }
       }
       p1.checkLastTagWas(0);
       p1.popLimit(i);
       p0.put(defaultKey, defaultValue);
       return;
    }
    public void serializeTo(CodedOutputStream p0,int p1,Object p2,Object p3){
       p0.writeTag(p1, 2);
       p0.writeUInt32NoTag(MapEntryLite.computeSerializedSize(this.metadata, p2, p3));
       MapEntryLite.writeTo(p0, this.metadata, p2, p3);
    }
}
