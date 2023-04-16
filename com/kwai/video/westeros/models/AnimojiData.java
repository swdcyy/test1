package com.kwai.video.westeros.models.AnimojiData;
import com.kwai.video.westeros.models.AnimojiDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.AnimojiData$Builder;
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
import com.kwai.video.westeros.models.AnimojiOutFace$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.AnimojiOutFace;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.AnimojiData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.AnimojiOutFaceOrBuilder;

public final class AnimojiData extends GeneratedMessageLite implements AnimojiDataOrBuilder	// class@000e9d
{
    public Internal$ProtobufList datas_;
    public static final AnimojiData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AnimojiData uAnimojiData = new AnimojiData();
       AnimojiData.DEFAULT_INSTANCE = uAnimojiData;
       GeneratedMessageLite.registerDefaultInstance(AnimojiData.class, uAnimojiData);
    }
    public void AnimojiData(){
       super();
       this.datas_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AnimojiData getDefaultInstance(){
       return AnimojiData.DEFAULT_INSTANCE;
    }
    public static AnimojiData$Builder newBuilder(){
       return AnimojiData.DEFAULT_INSTANCE.createBuilder();
    }
    public static AnimojiData$Builder newBuilder(AnimojiData p0){
       return AnimojiData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AnimojiData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AnimojiData.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AnimojiData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AnimojiData.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllDatas(Iterable p0){
       this.ensureDatasIsMutable();
       AbstractMessageLite.addAll(p0, this.datas_);
    }
    public void addDatas(int p0,AnimojiOutFace$Builder p1){
       this.ensureDatasIsMutable();
       this.datas_.add(p0, p1.build());
    }
    public void addDatas(int p0,AnimojiOutFace p1){
       Objects.requireNonNull(p1);
       this.ensureDatasIsMutable();
       this.datas_.add(p0, p1);
    }
    public void addDatas(AnimojiOutFace$Builder p0){
       this.ensureDatasIsMutable();
       this.datas_.add(p0.build());
    }
    public void addDatas(AnimojiOutFace p0){
       Objects.requireNonNull(p0);
       this.ensureDatasIsMutable();
       this.datas_.add(p0);
    }
    public void clearDatas(){
       this.datas_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AnimojiData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new AnimojiData();
           case 2:
             return new AnimojiData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"datas_",AnimojiOutFace.class};
             return GeneratedMessageLite.newMessageInfo(AnimojiData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return AnimojiData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AnimojiData.PARSER;
             if (pARSER == null) {
                _monitor_enter(AnimojiData.class);
                pARSER = AnimojiData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AnimojiData.DEFAULT_INSTANCE);
                   AnimojiData.PARSER = pARSER;
                }
                _monitor_exit(AnimojiData.class);
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
    public final void ensureDatasIsMutable(){
       if (!this.datas_.isModifiable()) {
          this.datas_ = GeneratedMessageLite.mutableCopy(this.datas_);
       }
       return;
    }
    public AnimojiOutFace getDatas(int p0){
       return this.datas_.get(p0);
    }
    public int getDatasCount(){
       return this.datas_.size();
    }
    public List getDatasList(){
       return this.datas_;
    }
    public AnimojiOutFaceOrBuilder getDatasOrBuilder(int p0){
       return this.datas_.get(p0);
    }
    public List getDatasOrBuilderList(){
       return this.datas_;
    }
    public void removeDatas(int p0){
       this.ensureDatasIsMutable();
       this.datas_.remove(p0);
    }
    public void setDatas(int p0,AnimojiOutFace$Builder p1){
       this.ensureDatasIsMutable();
       this.datas_.set(p0, p1.build());
    }
    public void setDatas(int p0,AnimojiOutFace p1){
       Objects.requireNonNull(p1);
       this.ensureDatasIsMutable();
       this.datas_.set(p0, p1);
    }
}
