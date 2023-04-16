package com.google.protobuf.StringValue;
import com.google.protobuf.StringValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.StringValue$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.String;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.StringValue$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StringValue extends GeneratedMessageLite implements StringValueOrBuilder	// class@0004ba
{
    public String value_;
    public static final StringValue DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StringValue stringValue = new StringValue();
       StringValue.DEFAULT_INSTANCE = stringValue;
       GeneratedMessageLite.registerDefaultInstance(StringValue.class, stringValue);
    }
    public void StringValue(){
       super();
       this.value_ = "";
    }
    public static StringValue getDefaultInstance(){
       return StringValue.DEFAULT_INSTANCE;
    }
    public static StringValue$Builder newBuilder(){
       return StringValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static StringValue$Builder newBuilder(StringValue p0){
       return StringValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StringValue of(String p0){
       return StringValue.newBuilder().setValue(p0).build();
    }
    public static StringValue parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StringValue.DEFAULT_INSTANCE, p0);
    }
    public static StringValue parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StringValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringValue parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0);
    }
    public static StringValue parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringValue parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0);
    }
    public static StringValue parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringValue parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0);
    }
    public static StringValue parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringValue parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0);
    }
    public static StringValue parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringValue parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0);
    }
    public static StringValue parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StringValue.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = StringValue.getDefaultInstance().getValue();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (StringValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new StringValue();
           case 2:
             return new StringValue$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(StringValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x00", objArray);
           case 4:
             return StringValue.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StringValue.PARSER;
             if (pARSER == null) {
                _monitor_enter(StringValue.class);
                pARSER = StringValue.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StringValue.DEFAULT_INSTANCE);
                   StringValue.PARSER = pARSER;
                }
                _monitor_exit(StringValue.class);
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
    public String getValue(){
       return this.value_;
    }
    public ByteString getValueBytes(){
       return ByteString.copyFromUtf8(this.value_);
    }
    public void setValue(String p0){
       Objects.requireNonNull(p0);
       this.value_ = p0;
    }
    public void setValueBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.value_ = p0.toStringUtf8();
    }
}
