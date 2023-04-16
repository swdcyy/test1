package com.kuaishou.edit.draft.EnhanceColorFilterResult;
import z30.c0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.EnhanceColorFilterResult$b;
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
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.EnhanceColorFilterResult$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class EnhanceColorFilterResult extends GeneratedMessageLite implements c0	// class@001787
{
    public Internal$ProtobufList analysisResultsResources_;
    public int enhanceLevel_;
    public boolean useResultLut_;
    public static final EnhanceColorFilterResult DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EnhanceColorFilterResult uEnhanceColo = new EnhanceColorFilterResult();
       EnhanceColorFilterResult.DEFAULT_INSTANCE = uEnhanceColo;
       GeneratedMessageLite.registerDefaultInstance(EnhanceColorFilterResult.class, uEnhanceColo);
    }
    public void EnhanceColorFilterResult(){
       super();
       this.analysisResultsResources_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static EnhanceColorFilterResult getDefaultInstance(){
       return EnhanceColorFilterResult.DEFAULT_INSTANCE;
    }
    public static EnhanceColorFilterResult$b newBuilder(){
       return EnhanceColorFilterResult.DEFAULT_INSTANCE.createBuilder();
    }
    public static EnhanceColorFilterResult$b newBuilder(EnhanceColorFilterResult p0){
       return EnhanceColorFilterResult.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EnhanceColorFilterResult parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilterResult parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilterResult parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilterResult parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilterResult parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilterResult parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilterResult parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilterResult parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilterResult parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilterResult parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilterResult parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilterResult parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilterResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EnhanceColorFilterResult.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllAnalysisResultsResources(Iterable p0){
       this.ensureAnalysisResultsResourcesIsMutable();
       AbstractMessageLite.addAll(p0, this.analysisResultsResources_);
    }
    public void addAnalysisResultsResources(String p0){
       Objects.requireNonNull(p0);
       this.ensureAnalysisResultsResourcesIsMutable();
       this.analysisResultsResources_.add(p0);
    }
    public void addAnalysisResultsResourcesBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureAnalysisResultsResourcesIsMutable();
       this.analysisResultsResources_.add(p0.toStringUtf8());
    }
    public void clearAnalysisResultsResources(){
       this.analysisResultsResources_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearEnhanceLevel(){
       this.enhanceLevel_ = 0;
    }
    public void clearUseResultLut(){
       this.useResultLut_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EnhanceColorFilterResult$a.a[p0.ordinal()]){
           case 1:
             return new EnhanceColorFilterResult();
           case 2:
             return new EnhanceColorFilterResult$b(p2);
           case 3:
             Object[] objArray = new Object[]{"analysisResultsResources_","enhanceLevel_","useResultLut_"};
             return GeneratedMessageLite.newMessageInfo(EnhanceColorFilterResult.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x0b\x03\x07\x00", objArray);
           case 4:
             return EnhanceColorFilterResult.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EnhanceColorFilterResult.PARSER;
             if (pARSER == null) {
                _monitor_enter(EnhanceColorFilterResult.class);
                pARSER = EnhanceColorFilterResult.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EnhanceColorFilterResult.DEFAULT_INSTANCE);
                   EnhanceColorFilterResult.PARSER = pARSER;
                }
                _monitor_exit(EnhanceColorFilterResult.class);
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
    public final void ensureAnalysisResultsResourcesIsMutable(){
       if (!this.analysisResultsResources_.isModifiable()) {
          this.analysisResultsResources_ = GeneratedMessageLite.mutableCopy(this.analysisResultsResources_);
       }
       return;
    }
    public String getAnalysisResultsResources(int p0){
       return this.analysisResultsResources_.get(p0);
    }
    public ByteString getAnalysisResultsResourcesBytes(int p0){
       return ByteString.copyFromUtf8(this.analysisResultsResources_.get(p0));
    }
    public int getAnalysisResultsResourcesCount(){
       return this.analysisResultsResources_.size();
    }
    public List getAnalysisResultsResourcesList(){
       return this.analysisResultsResources_;
    }
    public int getEnhanceLevel(){
       return this.enhanceLevel_;
    }
    public boolean getUseResultLut(){
       return this.useResultLut_;
    }
    public void setAnalysisResultsResources(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureAnalysisResultsResourcesIsMutable();
       this.analysisResultsResources_.set(p0, p1);
    }
    public void setEnhanceLevel(int p0){
       this.enhanceLevel_ = p0;
    }
    public void setUseResultLut(boolean p0){
       this.useResultLut_ = p0;
    }
}
