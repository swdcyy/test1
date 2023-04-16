package com.kwai.video.westeros.models.PickingVideoConfig;
import com.kwai.video.westeros.models.PickingVideoConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.PickingVideoConfig$Builder;
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
import com.kwai.video.westeros.models.PickingVideoConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PickingVideoConfig extends GeneratedMessageLite implements PickingVideoConfigOrBuilder	// class@001004
{
    public float duration_;
    public int height_;
    public String jsonExtraSettings_;
    public int width_;
    public static final PickingVideoConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PickingVideoConfig pickingVideo = new PickingVideoConfig();
       PickingVideoConfig.DEFAULT_INSTANCE = pickingVideo;
       GeneratedMessageLite.registerDefaultInstance(PickingVideoConfig.class, pickingVideo);
    }
    public void PickingVideoConfig(){
       super();
       this.jsonExtraSettings_ = "";
    }
    public static PickingVideoConfig getDefaultInstance(){
       return PickingVideoConfig.DEFAULT_INSTANCE;
    }
    public static PickingVideoConfig$Builder newBuilder(){
       return PickingVideoConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static PickingVideoConfig$Builder newBuilder(PickingVideoConfig p0){
       return PickingVideoConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PickingVideoConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0);
    }
    public static PickingVideoConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingVideoConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0);
    }
    public static PickingVideoConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingVideoConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0);
    }
    public static PickingVideoConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingVideoConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0);
    }
    public static PickingVideoConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingVideoConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0);
    }
    public static PickingVideoConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingVideoConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0);
    }
    public static PickingVideoConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingVideoConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PickingVideoConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDuration(){
       this.duration_ = 0;
    }
    public void clearHeight(){
       this.height_ = 0;
    }
    public void clearJsonExtraSettings(){
       this.jsonExtraSettings_ = PickingVideoConfig.getDefaultInstance().getJsonExtraSettings();
    }
    public void clearWidth(){
       this.width_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PickingVideoConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PickingVideoConfig();
           case 2:
             return new PickingVideoConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"width_","height_","duration_","jsonExtraSettings_"};
             return GeneratedMessageLite.newMessageInfo(PickingVideoConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x03\x01\x04\x02\x02\x00", objArray);
           case 4:
             return PickingVideoConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PickingVideoConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(PickingVideoConfig.class);
                pARSER = PickingVideoConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PickingVideoConfig.DEFAULT_INSTANCE);
                   PickingVideoConfig.PARSER = pARSER;
                }
                _monitor_exit(PickingVideoConfig.class);
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
    public float getDuration(){
       return this.duration_;
    }
    public int getHeight(){
       return this.height_;
    }
    public String getJsonExtraSettings(){
       return this.jsonExtraSettings_;
    }
    public ByteString getJsonExtraSettingsBytes(){
       return ByteString.copyFromUtf8(this.jsonExtraSettings_);
    }
    public int getWidth(){
       return this.width_;
    }
    public void setDuration(float p0){
       this.duration_ = p0;
    }
    public void setHeight(int p0){
       this.height_ = p0;
    }
    public void setJsonExtraSettings(String p0){
       Objects.requireNonNull(p0);
       this.jsonExtraSettings_ = p0;
    }
    public void setJsonExtraSettingsBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.jsonExtraSettings_ = p0.toStringUtf8();
    }
    public void setWidth(int p0){
       this.width_ = p0;
    }
}
