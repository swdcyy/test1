package com.google.protobuf.Empty;
import com.google.protobuf.EmptyOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Empty$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.Empty$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Empty extends GeneratedMessageLite implements EmptyOrBuilder	// class@0003fd
{
    public static final Empty DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Empty uEmpty = new Empty();
       Empty.DEFAULT_INSTANCE = uEmpty;
       GeneratedMessageLite.registerDefaultInstance(Empty.class, uEmpty);
    }
    public void Empty(){
       super();
    }
    public static Empty getDefaultInstance(){
       return Empty.DEFAULT_INSTANCE;
    }
    public static Empty$Builder newBuilder(){
       return Empty.DEFAULT_INSTANCE.createBuilder();
    }
    public static Empty$Builder newBuilder(Empty p0){
       return Empty.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Empty parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Empty.DEFAULT_INSTANCE, p0);
    }
    public static Empty parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Empty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Empty parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0);
    }
    public static Empty parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Empty parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0);
    }
    public static Empty parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Empty parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0);
    }
    public static Empty parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Empty parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0);
    }
    public static Empty parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Empty parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0);
    }
    public static Empty parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Empty.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = null;
       switch (Empty$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Empty();
           case 2:
             return new Empty$Builder(p1);
           case 3:
             return GeneratedMessageLite.newMessageInfo(Empty.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02\x00", p1);
           case 4:
             return Empty.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Empty.PARSER;
             if (pARSER == null) {
                _monitor_enter(Empty.class);
                pARSER = Empty.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Empty.DEFAULT_INSTANCE);
                   Empty.PARSER = pARSER;
                }
                _monitor_exit(Empty.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(1);
           case 7:
             return p1;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
