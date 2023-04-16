package com.kwai.video.westeros.models.MemojiConfig;
import com.kwai.video.westeros.models.MemojiConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MemojiConfig$Builder;
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
import com.kwai.video.westeros.models.MemojiConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class MemojiConfig extends GeneratedMessageLite implements MemojiConfigOrBuilder	// class@000faf
{
    public String animojiScriptPath_;
    public String facePropScriptPath_;
    public String stylesJsonPath_;
    public static final MemojiConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MemojiConfig memojiConfig = new MemojiConfig();
       MemojiConfig.DEFAULT_INSTANCE = memojiConfig;
       GeneratedMessageLite.registerDefaultInstance(MemojiConfig.class, memojiConfig);
    }
    public void MemojiConfig(){
       super();
       this.facePropScriptPath_ = "";
       this.animojiScriptPath_ = "";
       this.stylesJsonPath_ = "";
    }
    public static MemojiConfig getDefaultInstance(){
       return MemojiConfig.DEFAULT_INSTANCE;
    }
    public static MemojiConfig$Builder newBuilder(){
       return MemojiConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static MemojiConfig$Builder newBuilder(MemojiConfig p0){
       return MemojiConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MemojiConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MemojiConfig.DEFAULT_INSTANCE, p0);
    }
    public static MemojiConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MemojiConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0);
    }
    public static MemojiConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0);
    }
    public static MemojiConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0);
    }
    public static MemojiConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0);
    }
    public static MemojiConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0);
    }
    public static MemojiConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MemojiConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAnimojiScriptPath(){
       this.animojiScriptPath_ = MemojiConfig.getDefaultInstance().getAnimojiScriptPath();
    }
    public void clearFacePropScriptPath(){
       this.facePropScriptPath_ = MemojiConfig.getDefaultInstance().getFacePropScriptPath();
    }
    public void clearStylesJsonPath(){
       this.stylesJsonPath_ = MemojiConfig.getDefaultInstance().getStylesJsonPath();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MemojiConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MemojiConfig();
           case 2:
             return new MemojiConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"facePropScriptPath_","animojiScriptPath_","stylesJsonPath_"};
             return GeneratedMessageLite.newMessageInfo(MemojiConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x00", objArray);
           case 4:
             return MemojiConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MemojiConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(MemojiConfig.class);
                pARSER = MemojiConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MemojiConfig.DEFAULT_INSTANCE);
                   MemojiConfig.PARSER = pARSER;
                }
                _monitor_exit(MemojiConfig.class);
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
    public String getAnimojiScriptPath(){
       return this.animojiScriptPath_;
    }
    public ByteString getAnimojiScriptPathBytes(){
       return ByteString.copyFromUtf8(this.animojiScriptPath_);
    }
    public String getFacePropScriptPath(){
       return this.facePropScriptPath_;
    }
    public ByteString getFacePropScriptPathBytes(){
       return ByteString.copyFromUtf8(this.facePropScriptPath_);
    }
    public String getStylesJsonPath(){
       return this.stylesJsonPath_;
    }
    public ByteString getStylesJsonPathBytes(){
       return ByteString.copyFromUtf8(this.stylesJsonPath_);
    }
    public void setAnimojiScriptPath(String p0){
       Objects.requireNonNull(p0);
       this.animojiScriptPath_ = p0;
    }
    public void setAnimojiScriptPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.animojiScriptPath_ = p0.toStringUtf8();
    }
    public void setFacePropScriptPath(String p0){
       Objects.requireNonNull(p0);
       this.facePropScriptPath_ = p0;
    }
    public void setFacePropScriptPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.facePropScriptPath_ = p0.toStringUtf8();
    }
    public void setStylesJsonPath(String p0){
       Objects.requireNonNull(p0);
       this.stylesJsonPath_ = p0;
    }
    public void setStylesJsonPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.stylesJsonPath_ = p0.toStringUtf8();
    }
}
