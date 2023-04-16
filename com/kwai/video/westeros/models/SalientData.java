package com.kwai.video.westeros.models.SalientData;
import com.kwai.video.westeros.models.SalientDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.SalientData$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.video.westeros.models.SalientInfo$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.SalientInfo;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.SalientData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.SalientInfoOrBuilder;

public final class SalientData extends GeneratedMessageLite implements SalientDataOrBuilder	// class@001033
{
    public int farScene_;
    public Internal$ProtobufList infos_;
    public static final SalientData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SalientData salientData = new SalientData();
       SalientData.DEFAULT_INSTANCE = salientData;
       GeneratedMessageLite.registerDefaultInstance(SalientData.class, salientData);
    }
    public void SalientData(){
       super();
       this.infos_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static SalientData getDefaultInstance(){
       return SalientData.DEFAULT_INSTANCE;
    }
    public static SalientData$Builder newBuilder(){
       return SalientData.DEFAULT_INSTANCE.createBuilder();
    }
    public static SalientData$Builder newBuilder(SalientData p0){
       return SalientData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SalientData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(SalientData.DEFAULT_INSTANCE, p0);
    }
    public static SalientData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(SalientData.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0);
    }
    public static SalientData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0);
    }
    public static SalientData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0);
    }
    public static SalientData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0);
    }
    public static SalientData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0);
    }
    public static SalientData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return SalientData.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllInfos(Iterable p0){
       this.ensureInfosIsMutable();
       AbstractMessageLite.addAll(p0, this.infos_);
    }
    public void addInfos(int p0,SalientInfo$Builder p1){
       this.ensureInfosIsMutable();
       this.infos_.add(p0, p1.build());
    }
    public void addInfos(int p0,SalientInfo p1){
       Objects.requireNonNull(p1);
       this.ensureInfosIsMutable();
       this.infos_.add(p0, p1);
    }
    public void addInfos(SalientInfo$Builder p0){
       this.ensureInfosIsMutable();
       this.infos_.add(p0.build());
    }
    public void addInfos(SalientInfo p0){
       Objects.requireNonNull(p0);
       this.ensureInfosIsMutable();
       this.infos_.add(p0);
    }
    public void clearFarScene(){
       this.farScene_ = 0;
    }
    public void clearInfos(){
       this.infos_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (SalientData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new SalientData();
           case 2:
             return new SalientData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"infos_",SalientInfo.class,"farScene_"};
             return GeneratedMessageLite.newMessageInfo(SalientData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x04\x00", objArray);
           case 4:
             return SalientData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SalientData.PARSER;
             if (pARSER == null) {
                _monitor_enter(SalientData.class);
                pARSER = SalientData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SalientData.DEFAULT_INSTANCE);
                   SalientData.PARSER = pARSER;
                }
                _monitor_exit(SalientData.class);
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
    public final void ensureInfosIsMutable(){
       if (!this.infos_.isModifiable()) {
          this.infos_ = GeneratedMessageLite.mutableCopy(this.infos_);
       }
       return;
    }
    public int getFarScene(){
       return this.farScene_;
    }
    public SalientInfo getInfos(int p0){
       return this.infos_.get(p0);
    }
    public int getInfosCount(){
       return this.infos_.size();
    }
    public List getInfosList(){
       return this.infos_;
    }
    public SalientInfoOrBuilder getInfosOrBuilder(int p0){
       return this.infos_.get(p0);
    }
    public List getInfosOrBuilderList(){
       return this.infos_;
    }
    public void removeInfos(int p0){
       this.ensureInfosIsMutable();
       this.infos_.remove(p0);
    }
    public void setFarScene(int p0){
       this.farScene_ = p0;
    }
    public void setInfos(int p0,SalientInfo$Builder p1){
       this.ensureInfosIsMutable();
       this.infos_.set(p0, p1.build());
    }
    public void setInfos(int p0,SalientInfo p1){
       Objects.requireNonNull(p1);
       this.ensureInfosIsMutable();
       this.infos_.set(p0, p1);
    }
}
