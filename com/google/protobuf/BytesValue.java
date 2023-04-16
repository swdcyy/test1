package com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.BytesValue$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import java.util.Objects;

public final class BytesValue extends GeneratedMessageLite implements BytesValueOrBuilder	// class@0003d9
{
    public ByteString value_;
    public static final BytesValue DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BytesValue uBytesValue = new BytesValue();
       BytesValue.DEFAULT_INSTANCE = uBytesValue;
       GeneratedMessageLite.registerDefaultInstance(BytesValue.class, uBytesValue);
    }
    public void BytesValue(){
       super();
       this.value_ = ByteString.EMPTY;
    }
    public static BytesValue getDefaultInstance(){
       return BytesValue.DEFAULT_INSTANCE;
    }
    public static BytesValue$Builder newBuilder(){
       return BytesValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static BytesValue$Builder newBuilder(BytesValue p0){
       return BytesValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BytesValue of(ByteString p0){
       return BytesValue.newBuilder().setValue(p0).build();
    }
    public static BytesValue parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(BytesValue.DEFAULT_INSTANCE, p0);
    }
    public static BytesValue parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(BytesValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesValue parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0);
    }
    public static BytesValue parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesValue parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0);
    }
    public static BytesValue parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesValue parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0);
    }
    public static BytesValue parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesValue parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0);
    }
    public static BytesValue parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesValue parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0);
    }
    public static BytesValue parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return BytesValue.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = BytesValue.getDefaultInstance().getValue();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (BytesValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new BytesValue();
           case 2:
             return new BytesValue$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(BytesValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\x00", objArray);
           case 4:
             return BytesValue.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BytesValue.PARSER;
             if (pARSER == null) {
                _monitor_enter(BytesValue.class);
                pARSER = BytesValue.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BytesValue.DEFAULT_INSTANCE);
                   BytesValue.PARSER = pARSER;
                }
                _monitor_exit(BytesValue.class);
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
    public ByteString getValue(){
       return this.value_;
    }
    public void setValue(ByteString p0){
       Objects.requireNonNull(p0);
       this.value_ = p0;
    }
}
