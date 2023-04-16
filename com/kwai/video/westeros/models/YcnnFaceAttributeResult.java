package com.kwai.video.westeros.models.YcnnFaceAttributeResult;
import com.kwai.video.westeros.models.YcnnFaceAttributeResultOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.YcnnFaceAttributeResult$Builder;
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
import com.kwai.video.westeros.models.YcnnFaceAttributeInfo$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfo;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.YcnnFaceAttributeResult$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfoOrBuilder;

public final class YcnnFaceAttributeResult extends GeneratedMessageLite implements YcnnFaceAttributeResultOrBuilder	// class@0010aa
{
    public Internal$ProtobufList faceAttributes_;
    public static final YcnnFaceAttributeResult DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       YcnnFaceAttributeResult ycnnFaceAttr = new YcnnFaceAttributeResult();
       YcnnFaceAttributeResult.DEFAULT_INSTANCE = ycnnFaceAttr;
       GeneratedMessageLite.registerDefaultInstance(YcnnFaceAttributeResult.class, ycnnFaceAttr);
    }
    public void YcnnFaceAttributeResult(){
       super();
       this.faceAttributes_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static YcnnFaceAttributeResult getDefaultInstance(){
       return YcnnFaceAttributeResult.DEFAULT_INSTANCE;
    }
    public static YcnnFaceAttributeResult$Builder newBuilder(){
       return YcnnFaceAttributeResult.DEFAULT_INSTANCE.createBuilder();
    }
    public static YcnnFaceAttributeResult$Builder newBuilder(YcnnFaceAttributeResult p0){
       return YcnnFaceAttributeResult.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static YcnnFaceAttributeResult parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeResult parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeResult parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeResult parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeResult parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeResult parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeResult parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeResult parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeResult parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeResult parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeResult parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeResult parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return YcnnFaceAttributeResult.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFaceAttributes(Iterable p0){
       this.ensureFaceAttributesIsMutable();
       AbstractMessageLite.addAll(p0, this.faceAttributes_);
    }
    public void addFaceAttributes(int p0,YcnnFaceAttributeInfo$Builder p1){
       this.ensureFaceAttributesIsMutable();
       this.faceAttributes_.add(p0, p1.build());
    }
    public void addFaceAttributes(int p0,YcnnFaceAttributeInfo p1){
       Objects.requireNonNull(p1);
       this.ensureFaceAttributesIsMutable();
       this.faceAttributes_.add(p0, p1);
    }
    public void addFaceAttributes(YcnnFaceAttributeInfo$Builder p0){
       this.ensureFaceAttributesIsMutable();
       this.faceAttributes_.add(p0.build());
    }
    public void addFaceAttributes(YcnnFaceAttributeInfo p0){
       Objects.requireNonNull(p0);
       this.ensureFaceAttributesIsMutable();
       this.faceAttributes_.add(p0);
    }
    public void clearFaceAttributes(){
       this.faceAttributes_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (YcnnFaceAttributeResult$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new YcnnFaceAttributeResult();
           case 2:
             return new YcnnFaceAttributeResult$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"faceAttributes_",YcnnFaceAttributeInfo.class};
             return GeneratedMessageLite.newMessageInfo(YcnnFaceAttributeResult.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return YcnnFaceAttributeResult.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = YcnnFaceAttributeResult.PARSER;
             if (pARSER == null) {
                _monitor_enter(YcnnFaceAttributeResult.class);
                pARSER = YcnnFaceAttributeResult.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(YcnnFaceAttributeResult.DEFAULT_INSTANCE);
                   YcnnFaceAttributeResult.PARSER = pARSER;
                }
                _monitor_exit(YcnnFaceAttributeResult.class);
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
    public final void ensureFaceAttributesIsMutable(){
       if (!this.faceAttributes_.isModifiable()) {
          this.faceAttributes_ = GeneratedMessageLite.mutableCopy(this.faceAttributes_);
       }
       return;
    }
    public YcnnFaceAttributeInfo getFaceAttributes(int p0){
       return this.faceAttributes_.get(p0);
    }
    public int getFaceAttributesCount(){
       return this.faceAttributes_.size();
    }
    public List getFaceAttributesList(){
       return this.faceAttributes_;
    }
    public YcnnFaceAttributeInfoOrBuilder getFaceAttributesOrBuilder(int p0){
       return this.faceAttributes_.get(p0);
    }
    public List getFaceAttributesOrBuilderList(){
       return this.faceAttributes_;
    }
    public void removeFaceAttributes(int p0){
       this.ensureFaceAttributesIsMutable();
       this.faceAttributes_.remove(p0);
    }
    public void setFaceAttributes(int p0,YcnnFaceAttributeInfo$Builder p1){
       this.ensureFaceAttributesIsMutable();
       this.faceAttributes_.set(p0, p1.build());
    }
    public void setFaceAttributes(int p0,YcnnFaceAttributeInfo p1){
       Objects.requireNonNull(p1);
       this.ensureFaceAttributesIsMutable();
       this.faceAttributes_.set(p0, p1);
    }
}
