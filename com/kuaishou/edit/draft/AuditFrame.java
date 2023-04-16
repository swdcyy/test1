package com.kuaishou.edit.draft.AuditFrame;
import z30.k;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.AuditFrame$b;
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
import com.kuaishou.edit.draft.FaceInfo$b;
import java.lang.Object;
import com.kuaishou.edit.draft.FaceInfo;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.AuditFrame$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import z30.f0;

public final class AuditFrame extends GeneratedMessageLite implements k	// class@00172f
{
    public Internal$ProtobufList faceInfo_;
    public String file_;
    public String jsonFile_;
    public static final AuditFrame DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AuditFrame uAuditFrame = new AuditFrame();
       AuditFrame.DEFAULT_INSTANCE = uAuditFrame;
       GeneratedMessageLite.registerDefaultInstance(AuditFrame.class, uAuditFrame);
    }
    public void AuditFrame(){
       super();
       this.faceInfo_ = GeneratedMessageLite.emptyProtobufList();
       this.file_ = "";
       this.jsonFile_ = "";
    }
    public static AuditFrame getDefaultInstance(){
       return AuditFrame.DEFAULT_INSTANCE;
    }
    public static AuditFrame$b newBuilder(){
       return AuditFrame.DEFAULT_INSTANCE.createBuilder();
    }
    public static AuditFrame$b newBuilder(AuditFrame p0){
       return AuditFrame.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AuditFrame parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AuditFrame.DEFAULT_INSTANCE, p0);
    }
    public static AuditFrame parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AuditFrame.DEFAULT_INSTANCE, p0, p1);
    }
    public static AuditFrame parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0);
    }
    public static AuditFrame parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0, p1);
    }
    public static AuditFrame parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0);
    }
    public static AuditFrame parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0, p1);
    }
    public static AuditFrame parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0);
    }
    public static AuditFrame parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0, p1);
    }
    public static AuditFrame parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0);
    }
    public static AuditFrame parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0, p1);
    }
    public static AuditFrame parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0);
    }
    public static AuditFrame parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AuditFrame.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AuditFrame.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFaceInfo(Iterable p0){
       this.ensureFaceInfoIsMutable();
       AbstractMessageLite.addAll(p0, this.faceInfo_);
    }
    public void addFaceInfo(int p0,FaceInfo$b p1){
       this.ensureFaceInfoIsMutable();
       this.faceInfo_.add(p0, p1.build());
    }
    public void addFaceInfo(int p0,FaceInfo p1){
       Objects.requireNonNull(p1);
       this.ensureFaceInfoIsMutable();
       this.faceInfo_.add(p0, p1);
    }
    public void addFaceInfo(FaceInfo$b p0){
       this.ensureFaceInfoIsMutable();
       this.faceInfo_.add(p0.build());
    }
    public void addFaceInfo(FaceInfo p0){
       Objects.requireNonNull(p0);
       this.ensureFaceInfoIsMutable();
       this.faceInfo_.add(p0);
    }
    public void clearFaceInfo(){
       this.faceInfo_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearFile(){
       this.file_ = AuditFrame.getDefaultInstance().getFile();
    }
    public void clearJsonFile(){
       this.jsonFile_ = AuditFrame.getDefaultInstance().getJsonFile();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AuditFrame$a.a[p0.ordinal()]){
           case 1:
             return new AuditFrame();
           case 2:
             return new AuditFrame$b(p2);
           case 3:
             Object[] objArray = new Object[]{"faceInfo_",FaceInfo.class,"file_","jsonFile_"};
             return GeneratedMessageLite.newMessageInfo(AuditFrame.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x02\x02\x03\x02\x02\x00", objArray);
           case 4:
             return AuditFrame.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AuditFrame.PARSER;
             if (pARSER == null) {
                _monitor_enter(AuditFrame.class);
                pARSER = AuditFrame.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AuditFrame.DEFAULT_INSTANCE);
                   AuditFrame.PARSER = pARSER;
                }
                _monitor_exit(AuditFrame.class);
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
    public final void ensureFaceInfoIsMutable(){
       if (!this.faceInfo_.isModifiable()) {
          this.faceInfo_ = GeneratedMessageLite.mutableCopy(this.faceInfo_);
       }
       return;
    }
    public FaceInfo getFaceInfo(int p0){
       return this.faceInfo_.get(p0);
    }
    public int getFaceInfoCount(){
       return this.faceInfo_.size();
    }
    public List getFaceInfoList(){
       return this.faceInfo_;
    }
    public f0 getFaceInfoOrBuilder(int p0){
       return this.faceInfo_.get(p0);
    }
    public List getFaceInfoOrBuilderList(){
       return this.faceInfo_;
    }
    public String getFile(){
       return this.file_;
    }
    public ByteString getFileBytes(){
       return ByteString.copyFromUtf8(this.file_);
    }
    public String getJsonFile(){
       return this.jsonFile_;
    }
    public ByteString getJsonFileBytes(){
       return ByteString.copyFromUtf8(this.jsonFile_);
    }
    public void removeFaceInfo(int p0){
       this.ensureFaceInfoIsMutable();
       this.faceInfo_.remove(p0);
    }
    public void setFaceInfo(int p0,FaceInfo$b p1){
       this.ensureFaceInfoIsMutable();
       this.faceInfo_.set(p0, p1.build());
    }
    public void setFaceInfo(int p0,FaceInfo p1){
       Objects.requireNonNull(p1);
       this.ensureFaceInfoIsMutable();
       this.faceInfo_.set(p0, p1);
    }
    public void setFile(String p0){
       Objects.requireNonNull(p0);
       this.file_ = p0;
    }
    public void setFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.file_ = p0.toStringUtf8();
    }
    public void setJsonFile(String p0){
       Objects.requireNonNull(p0);
       this.jsonFile_ = p0;
    }
    public void setJsonFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.jsonFile_ = p0.toStringUtf8();
    }
}
