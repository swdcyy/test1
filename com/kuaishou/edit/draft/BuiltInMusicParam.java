package com.kuaishou.edit.draft.BuiltInMusicParam;
import z30.m;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.BuiltInMusicParam$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.BuiltInMusicParam$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class BuiltInMusicParam extends GeneratedMessageLite implements m	// class@00173e
{
    public static final BuiltInMusicParam DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BuiltInMusicParam uBuiltInMusi = new BuiltInMusicParam();
       BuiltInMusicParam.DEFAULT_INSTANCE = uBuiltInMusi;
       GeneratedMessageLite.registerDefaultInstance(BuiltInMusicParam.class, uBuiltInMusi);
    }
    public void BuiltInMusicParam(){
       super();
    }
    public static BuiltInMusicParam getDefaultInstance(){
       return BuiltInMusicParam.DEFAULT_INSTANCE;
    }
    public static BuiltInMusicParam$b newBuilder(){
       return BuiltInMusicParam.DEFAULT_INSTANCE.createBuilder();
    }
    public static BuiltInMusicParam$b newBuilder(BuiltInMusicParam p0){
       return BuiltInMusicParam.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BuiltInMusicParam parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0);
    }
    public static BuiltInMusicParam parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static BuiltInMusicParam parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0);
    }
    public static BuiltInMusicParam parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static BuiltInMusicParam parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0);
    }
    public static BuiltInMusicParam parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static BuiltInMusicParam parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0);
    }
    public static BuiltInMusicParam parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static BuiltInMusicParam parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0);
    }
    public static BuiltInMusicParam parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static BuiltInMusicParam parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0);
    }
    public static BuiltInMusicParam parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BuiltInMusicParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return BuiltInMusicParam.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = null;
       switch (BuiltInMusicParam$a.a[p0.ordinal()]){
           case 1:
             return new BuiltInMusicParam();
           case 2:
             return new BuiltInMusicParam$b(p1);
           case 3:
             return GeneratedMessageLite.newMessageInfo(BuiltInMusicParam.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02\x00", p1);
           case 4:
             return BuiltInMusicParam.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BuiltInMusicParam.PARSER;
             if (pARSER == null) {
                _monitor_enter(BuiltInMusicParam.class);
                pARSER = BuiltInMusicParam.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BuiltInMusicParam.DEFAULT_INSTANCE);
                   BuiltInMusicParam.PARSER = pARSER;
                }
                _monitor_exit(BuiltInMusicParam.class);
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
