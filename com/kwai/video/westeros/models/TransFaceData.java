package com.kwai.video.westeros.models.TransFaceData;
import com.kwai.video.westeros.models.TransFaceDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.TransFaceData$Builder;
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
import com.kwai.video.westeros.models.TransFacePoint$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.TransFacePoint;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.TransFaceData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.TransFacePointOrBuilder;

public final class TransFaceData extends GeneratedMessageLite implements TransFaceDataOrBuilder	// class@001057
{
    public Internal$ProtobufList data_;
    public boolean isMirror_;
    public static final TransFaceData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TransFaceData transFaceDat = new TransFaceData();
       TransFaceData.DEFAULT_INSTANCE = transFaceDat;
       GeneratedMessageLite.registerDefaultInstance(TransFaceData.class, transFaceDat);
    }
    public void TransFaceData(){
       super();
       this.data_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static TransFaceData getDefaultInstance(){
       return TransFaceData.DEFAULT_INSTANCE;
    }
    public static TransFaceData$Builder newBuilder(){
       return TransFaceData.DEFAULT_INSTANCE.createBuilder();
    }
    public static TransFaceData$Builder newBuilder(TransFaceData p0){
       return TransFaceData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TransFaceData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(TransFaceData.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(TransFaceData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return TransFaceData.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllData(Iterable p0){
       this.ensureDataIsMutable();
       AbstractMessageLite.addAll(p0, this.data_);
    }
    public void addData(int p0,TransFacePoint$Builder p1){
       this.ensureDataIsMutable();
       this.data_.add(p0, p1.build());
    }
    public void addData(int p0,TransFacePoint p1){
       Objects.requireNonNull(p1);
       this.ensureDataIsMutable();
       this.data_.add(p0, p1);
    }
    public void addData(TransFacePoint$Builder p0){
       this.ensureDataIsMutable();
       this.data_.add(p0.build());
    }
    public void addData(TransFacePoint p0){
       Objects.requireNonNull(p0);
       this.ensureDataIsMutable();
       this.data_.add(p0);
    }
    public void clearData(){
       this.data_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearIsMirror(){
       this.isMirror_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (TransFaceData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new TransFaceData();
           case 2:
             return new TransFaceData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"data_",TransFacePoint.class,"isMirror_"};
             return GeneratedMessageLite.newMessageInfo(TransFaceData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x07\x00", objArray);
           case 4:
             return TransFaceData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TransFaceData.PARSER;
             if (pARSER == null) {
                _monitor_enter(TransFaceData.class);
                pARSER = TransFaceData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TransFaceData.DEFAULT_INSTANCE);
                   TransFaceData.PARSER = pARSER;
                }
                _monitor_exit(TransFaceData.class);
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
    public final void ensureDataIsMutable(){
       if (!this.data_.isModifiable()) {
          this.data_ = GeneratedMessageLite.mutableCopy(this.data_);
       }
       return;
    }
    public TransFacePoint getData(int p0){
       return this.data_.get(p0);
    }
    public int getDataCount(){
       return this.data_.size();
    }
    public List getDataList(){
       return this.data_;
    }
    public TransFacePointOrBuilder getDataOrBuilder(int p0){
       return this.data_.get(p0);
    }
    public List getDataOrBuilderList(){
       return this.data_;
    }
    public boolean getIsMirror(){
       return this.isMirror_;
    }
    public void removeData(int p0){
       this.ensureDataIsMutable();
       this.data_.remove(p0);
    }
    public void setData(int p0,TransFacePoint$Builder p1){
       this.ensureDataIsMutable();
       this.data_.set(p0, p1.build());
    }
    public void setData(int p0,TransFacePoint p1){
       Objects.requireNonNull(p1);
       this.ensureDataIsMutable();
       this.data_.set(p0, p1);
    }
    public void setIsMirror(boolean p0){
       this.isMirror_ = p0;
    }
}
