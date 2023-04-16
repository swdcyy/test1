package com.kwai.video.westeros.models.BokehConfig;
import com.kwai.video.westeros.models.BokehConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.BokehConfig$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.BokehConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class BokehConfig extends GeneratedMessageLite implements BokehConfigOrBuilder	// class@000ec3
{
    public boolean useGray_;
    public static final BokehConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BokehConfig uBokehConfig = new BokehConfig();
       BokehConfig.DEFAULT_INSTANCE = uBokehConfig;
       GeneratedMessageLite.registerDefaultInstance(BokehConfig.class, uBokehConfig);
    }
    public void BokehConfig(){
       super();
    }
    public static BokehConfig getDefaultInstance(){
       return BokehConfig.DEFAULT_INSTANCE;
    }
    public static BokehConfig$Builder newBuilder(){
       return BokehConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static BokehConfig$Builder newBuilder(BokehConfig p0){
       return BokehConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BokehConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(BokehConfig.DEFAULT_INSTANCE, p0);
    }
    public static BokehConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(BokehConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0);
    }
    public static BokehConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0);
    }
    public static BokehConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0);
    }
    public static BokehConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0);
    }
    public static BokehConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0);
    }
    public static BokehConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return BokehConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearUseGray(){
       this.useGray_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (BokehConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new BokehConfig();
           case 2:
             return new BokehConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "useGray_";
             return GeneratedMessageLite.newMessageInfo(BokehConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x00", objArray);
           case 4:
             return BokehConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BokehConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(BokehConfig.class);
                pARSER = BokehConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BokehConfig.DEFAULT_INSTANCE);
                   BokehConfig.PARSER = pARSER;
                }
                _monitor_exit(BokehConfig.class);
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
    public boolean getUseGray(){
       return this.useGray_;
    }
    public void setUseGray(boolean p0){
       this.useGray_ = p0;
    }
}
