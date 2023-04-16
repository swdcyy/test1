package com.kwai.video.westeros.models.MmuFeatureParams;
import com.kwai.video.westeros.models.MmuFeatureParamsOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MmuFeatureParams$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuFeatureParams$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.MemojiConfig;
import com.kwai.video.westeros.models.MmuFacePropConfig;
import java.util.Objects;
import com.kwai.video.westeros.models.MemojiConfig$Builder;
import com.kwai.video.westeros.models.MmuFacePropConfig$Builder;

public final class MmuFeatureParams extends GeneratedMessageLite implements MmuFeatureParamsOrBuilder	// class@000fd3
{
    public MemojiConfig memojiConfig_;
    public MmuFacePropConfig mmuFacePropConfig_;
    public static final MmuFeatureParams DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuFeatureParams mmuFeaturePa = new MmuFeatureParams();
       MmuFeatureParams.DEFAULT_INSTANCE = mmuFeaturePa;
       GeneratedMessageLite.registerDefaultInstance(MmuFeatureParams.class, mmuFeaturePa);
    }
    public void MmuFeatureParams(){
       super();
    }
    public static MmuFeatureParams getDefaultInstance(){
       return MmuFeatureParams.DEFAULT_INSTANCE;
    }
    public static MmuFeatureParams$Builder newBuilder(){
       return MmuFeatureParams.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuFeatureParams$Builder newBuilder(MmuFeatureParams p0){
       return MmuFeatureParams.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuFeatureParams parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static MmuFeatureParams parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFeatureParams parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static MmuFeatureParams parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFeatureParams parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static MmuFeatureParams parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFeatureParams parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static MmuFeatureParams parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFeatureParams parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static MmuFeatureParams parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFeatureParams parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static MmuFeatureParams parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuFeatureParams.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearMemojiConfig(){
       this.memojiConfig_ = null;
    }
    public void clearMmuFacePropConfig(){
       this.mmuFacePropConfig_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MmuFeatureParams$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuFeatureParams();
           case 2:
             return new MmuFeatureParams$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"memojiConfig_","mmuFacePropConfig_"};
             return GeneratedMessageLite.newMessageInfo(MmuFeatureParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x00", objArray);
           case 4:
             return MmuFeatureParams.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuFeatureParams.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuFeatureParams.class);
                pARSER = MmuFeatureParams.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuFeatureParams.DEFAULT_INSTANCE);
                   MmuFeatureParams.PARSER = pARSER;
                }
                _monitor_exit(MmuFeatureParams.class);
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
    public MemojiConfig getMemojiConfig(){
       MmuFeatureParams tmemojiConfi = this.memojiConfig_;
       if (tmemojiConfi == null) {
          tmemojiConfi = MemojiConfig.getDefaultInstance();
       }
       return tmemojiConfi;
    }
    public MmuFacePropConfig getMmuFacePropConfig(){
       MmuFeatureParams tmmuFaceProp = this.mmuFacePropConfig_;
       if (tmmuFaceProp == null) {
          tmmuFaceProp = MmuFacePropConfig.getDefaultInstance();
       }
       return tmmuFaceProp;
    }
    public boolean hasMemojiConfig(){
       boolean b = (this.memojiConfig_ != null)? true: false;
       return b;
    }
    public boolean hasMmuFacePropConfig(){
       boolean b = (this.mmuFacePropConfig_ != null)? true: false;
       return b;
    }
    public void mergeMemojiConfig(MemojiConfig p0){
       Objects.requireNonNull(p0);
       MmuFeatureParams tmemojiConfi = this.memojiConfig_;
       this.memojiConfig_ = (tmemojiConfi != null && tmemojiConfi != MemojiConfig.getDefaultInstance())? MemojiConfig.newBuilder(this.memojiConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMmuFacePropConfig(MmuFacePropConfig p0){
       Objects.requireNonNull(p0);
       MmuFeatureParams tmmuFaceProp = this.mmuFacePropConfig_;
       this.mmuFacePropConfig_ = (tmmuFaceProp != null && tmmuFaceProp != MmuFacePropConfig.getDefaultInstance())? MmuFacePropConfig.newBuilder(this.mmuFacePropConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setMemojiConfig(MemojiConfig$Builder p0){
       this.memojiConfig_ = p0.build();
    }
    public void setMemojiConfig(MemojiConfig p0){
       Objects.requireNonNull(p0);
       this.memojiConfig_ = p0;
    }
    public void setMmuFacePropConfig(MmuFacePropConfig$Builder p0){
       this.mmuFacePropConfig_ = p0.build();
    }
    public void setMmuFacePropConfig(MmuFacePropConfig p0){
       Objects.requireNonNull(p0);
       this.mmuFacePropConfig_ = p0;
    }
}
