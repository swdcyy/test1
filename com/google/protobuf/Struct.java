package com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Struct$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Struct$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.Struct$FieldsDefaultEntryHolder;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.Collections;
import com.google.protobuf.Value;
import java.util.HashMap;
import java.lang.IllegalArgumentException;

public final class Struct extends GeneratedMessageLite implements StructOrBuilder	// class@0004bf
{
    public MapFieldLite fields_;
    public static final Struct DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Struct struct = new Struct();
       Struct.DEFAULT_INSTANCE = struct;
       GeneratedMessageLite.registerDefaultInstance(Struct.class, struct);
    }
    public void Struct(){
       super();
       this.fields_ = MapFieldLite.emptyMapField();
    }
    public static Struct getDefaultInstance(){
       return Struct.DEFAULT_INSTANCE;
    }
    public static Struct$Builder newBuilder(){
       return Struct.DEFAULT_INSTANCE.createBuilder();
    }
    public static Struct$Builder newBuilder(Struct p0){
       return Struct.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Struct parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Struct.DEFAULT_INSTANCE, p0);
    }
    public static Struct parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Struct.DEFAULT_INSTANCE, p0, p1);
    }
    public static Struct parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0);
    }
    public static Struct parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0, p1);
    }
    public static Struct parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0);
    }
    public static Struct parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0, p1);
    }
    public static Struct parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0);
    }
    public static Struct parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0, p1);
    }
    public static Struct parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0);
    }
    public static Struct parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0, p1);
    }
    public static Struct parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0);
    }
    public static Struct parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Struct.DEFAULT_INSTANCE.getParserForType();
    }
    public boolean containsFields(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetFields().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Struct$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Struct();
           case 2:
             return new Struct$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"fields_",Struct$FieldsDefaultEntryHolder.defaultEntry};
             return GeneratedMessageLite.newMessageInfo(Struct.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012\x00", objArray);
           case 4:
             return Struct.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Struct.PARSER;
             if (pARSER == null) {
                _monitor_enter(Struct.class);
                pARSER = Struct.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Struct.DEFAULT_INSTANCE);
                   Struct.PARSER = pARSER;
                }
                _monitor_exit(Struct.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public Map getFields(){
       return this.getFieldsMap();
    }
    public int getFieldsCount(){
       return this.internalGetFields().size();
    }
    public Map getFieldsMap(){
       return Collections.unmodifiableMap(this.internalGetFields());
    }
    public Value getFieldsOrDefault(String p0,Value p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetFields();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public Value getFieldsOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetFields();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public Map getMutableFieldsMap(){
       return this.internalGetMutableFields();
    }
    public final MapFieldLite internalGetFields(){
       return this.fields_;
    }
    public final MapFieldLite internalGetMutableFields(){
       if (!this.fields_.isMutable()) {
          this.fields_ = this.fields_.mutableCopy();
       }
       return this.fields_;
    }
}
