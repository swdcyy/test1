package com.kuaishou.edit.draft.Encode;
import z30.a0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.Encode$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.Encode$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class Encode extends GeneratedMessageLite implements a0	// class@001781
{
    public String paramsKey_;
    public static final Encode DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Encode uEncode = new Encode();
       Encode.DEFAULT_INSTANCE = uEncode;
       GeneratedMessageLite.registerDefaultInstance(Encode.class, uEncode);
    }
    public void Encode(){
       super();
       this.paramsKey_ = "";
    }
    public static Encode getDefaultInstance(){
       return Encode.DEFAULT_INSTANCE;
    }
    public static Encode$b newBuilder(){
       return Encode.DEFAULT_INSTANCE.createBuilder();
    }
    public static Encode$b newBuilder(Encode p0){
       return Encode.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Encode parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Encode.DEFAULT_INSTANCE, p0);
    }
    public static Encode parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Encode.DEFAULT_INSTANCE, p0, p1);
    }
    public static Encode parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0);
    }
    public static Encode parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0, p1);
    }
    public static Encode parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0);
    }
    public static Encode parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0, p1);
    }
    public static Encode parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0);
    }
    public static Encode parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0, p1);
    }
    public static Encode parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0);
    }
    public static Encode parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0, p1);
    }
    public static Encode parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0);
    }
    public static Encode parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Encode.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Encode.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearParamsKey(){
       this.paramsKey_ = Encode.getDefaultInstance().getParamsKey();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Encode$a.a[p0.ordinal()]){
           case 1:
             return new Encode();
           case 2:
             return new Encode$b(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "paramsKey_";
             return GeneratedMessageLite.newMessageInfo(Encode.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x00", objArray);
           case 4:
             return Encode.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Encode.PARSER;
             if (pARSER == null) {
                _monitor_enter(Encode.class);
                pARSER = Encode.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Encode.DEFAULT_INSTANCE);
                   Encode.PARSER = pARSER;
                }
                _monitor_exit(Encode.class);
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
    public String getParamsKey(){
       return this.paramsKey_;
    }
    public ByteString getParamsKeyBytes(){
       return ByteString.copyFromUtf8(this.paramsKey_);
    }
    public void setParamsKey(String p0){
       Objects.requireNonNull(p0);
       this.paramsKey_ = p0;
    }
    public void setParamsKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.paramsKey_ = p0.toStringUtf8();
    }
}
