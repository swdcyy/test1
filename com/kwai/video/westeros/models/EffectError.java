package com.kwai.video.westeros.models.EffectError;
import com.kwai.video.westeros.models.EffectErrorOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.EffectError$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectError$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class EffectError extends GeneratedMessageLite implements EffectErrorOrBuilder	// class@000f1a
{
    public static final EffectError DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectError uEffectError = new EffectError();
       EffectError.DEFAULT_INSTANCE = uEffectError;
       GeneratedMessageLite.registerDefaultInstance(EffectError.class, uEffectError);
    }
    public void EffectError(){
       super();
    }
    public static EffectError getDefaultInstance(){
       return EffectError.DEFAULT_INSTANCE;
    }
    public static EffectError$Builder newBuilder(){
       return EffectError.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectError$Builder newBuilder(EffectError p0){
       return EffectError.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectError parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectError.DEFAULT_INSTANCE, p0);
    }
    public static EffectError parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectError.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectError parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0);
    }
    public static EffectError parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectError parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0);
    }
    public static EffectError parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectError parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0);
    }
    public static EffectError parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectError parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0);
    }
    public static EffectError parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectError parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0);
    }
    public static EffectError parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectError.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectError.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = null;
       switch (EffectError$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectError();
           case 2:
             return new EffectError$Builder(p1);
           case 3:
             return GeneratedMessageLite.newMessageInfo(EffectError.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02\x00", p1);
           case 4:
             return EffectError.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectError.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectError.class);
                pARSER = EffectError.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectError.DEFAULT_INSTANCE);
                   EffectError.PARSER = pARSER;
                }
                _monitor_exit(EffectError.class);
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
