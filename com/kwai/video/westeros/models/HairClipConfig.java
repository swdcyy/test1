package com.kwai.video.westeros.models.HairClipConfig;
import com.kwai.video.westeros.models.HairClipConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.HairClipConfig$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.HairClipConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class HairClipConfig extends GeneratedMessageLite implements HairClipConfigOrBuilder	// class@000f86
{
    public boolean isActive_;
    public int runMode_;
    public int showOptions_;
    public int usingColorMode_;
    public static final HairClipConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       HairClipConfig hairClipConf = new HairClipConfig();
       HairClipConfig.DEFAULT_INSTANCE = hairClipConf;
       GeneratedMessageLite.registerDefaultInstance(HairClipConfig.class, hairClipConf);
    }
    public void HairClipConfig(){
       super();
    }
    public static HairClipConfig getDefaultInstance(){
       return HairClipConfig.DEFAULT_INSTANCE;
    }
    public static HairClipConfig$Builder newBuilder(){
       return HairClipConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static HairClipConfig$Builder newBuilder(HairClipConfig p0){
       return HairClipConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static HairClipConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(HairClipConfig.DEFAULT_INSTANCE, p0);
    }
    public static HairClipConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(HairClipConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static HairClipConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0);
    }
    public static HairClipConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static HairClipConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0);
    }
    public static HairClipConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static HairClipConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0);
    }
    public static HairClipConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static HairClipConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0);
    }
    public static HairClipConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static HairClipConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0);
    }
    public static HairClipConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HairClipConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return HairClipConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIsActive(){
       this.isActive_ = false;
    }
    public void clearRunMode(){
       this.runMode_ = 0;
    }
    public void clearShowOptions(){
       this.showOptions_ = 0;
    }
    public void clearUsingColorMode(){
       this.usingColorMode_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (HairClipConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new HairClipConfig();
           case 2:
             return new HairClipConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"runMode_","usingColorMode_","showOptions_","isActive_"};
             return GeneratedMessageLite.newMessageInfo(HairClipConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x03\x04\x04\x07\x00", objArray);
           case 4:
             return HairClipConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = HairClipConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(HairClipConfig.class);
                pARSER = HairClipConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(HairClipConfig.DEFAULT_INSTANCE);
                   HairClipConfig.PARSER = pARSER;
                }
                _monitor_exit(HairClipConfig.class);
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
    public boolean getIsActive(){
       return this.isActive_;
    }
    public int getRunMode(){
       return this.runMode_;
    }
    public int getShowOptions(){
       return this.showOptions_;
    }
    public int getUsingColorMode(){
       return this.usingColorMode_;
    }
    public void setIsActive(boolean p0){
       this.isActive_ = p0;
    }
    public void setRunMode(int p0){
       this.runMode_ = p0;
    }
    public void setShowOptions(int p0){
       this.showOptions_ = p0;
    }
    public void setUsingColorMode(int p0){
       this.usingColorMode_ = p0;
    }
}
