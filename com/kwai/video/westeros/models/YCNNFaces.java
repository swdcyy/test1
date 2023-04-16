package com.kwai.video.westeros.models.YCNNFaces;
import com.kwai.video.westeros.models.YCNNFacesOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.YCNNFaces$Builder;
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
import com.kwai.video.westeros.models.YCNNFace$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.YCNNFace;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.YCNNFaces$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.YCNNFaceOrBuilder;

public final class YCNNFaces extends GeneratedMessageLite implements YCNNFacesOrBuilder	// class@001092
{
    public Internal$ProtobufList face_;
    public static final YCNNFaces DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       YCNNFaces yCNNFaces = new YCNNFaces();
       YCNNFaces.DEFAULT_INSTANCE = yCNNFaces;
       GeneratedMessageLite.registerDefaultInstance(YCNNFaces.class, yCNNFaces);
    }
    public void YCNNFaces(){
       super();
       this.face_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static YCNNFaces getDefaultInstance(){
       return YCNNFaces.DEFAULT_INSTANCE;
    }
    public static YCNNFaces$Builder newBuilder(){
       return YCNNFaces.DEFAULT_INSTANCE.createBuilder();
    }
    public static YCNNFaces$Builder newBuilder(YCNNFaces p0){
       return YCNNFaces.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static YCNNFaces parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNFaces.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFaces parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFaces parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFaces parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFaces parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFaces parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFaces parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFaces parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFaces parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFaces parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFaces parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFaces parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return YCNNFaces.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFace(Iterable p0){
       this.ensureFaceIsMutable();
       AbstractMessageLite.addAll(p0, this.face_);
    }
    public void addFace(int p0,YCNNFace$Builder p1){
       this.ensureFaceIsMutable();
       this.face_.add(p0, p1.build());
    }
    public void addFace(int p0,YCNNFace p1){
       Objects.requireNonNull(p1);
       this.ensureFaceIsMutable();
       this.face_.add(p0, p1);
    }
    public void addFace(YCNNFace$Builder p0){
       this.ensureFaceIsMutable();
       this.face_.add(p0.build());
    }
    public void addFace(YCNNFace p0){
       Objects.requireNonNull(p0);
       this.ensureFaceIsMutable();
       this.face_.add(p0);
    }
    public void clearFace(){
       this.face_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (YCNNFaces$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new YCNNFaces();
           case 2:
             return new YCNNFaces$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"face_",YCNNFace.class};
             return GeneratedMessageLite.newMessageInfo(YCNNFaces.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return YCNNFaces.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = YCNNFaces.PARSER;
             if (pARSER == null) {
                _monitor_enter(YCNNFaces.class);
                pARSER = YCNNFaces.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(YCNNFaces.DEFAULT_INSTANCE);
                   YCNNFaces.PARSER = pARSER;
                }
                _monitor_exit(YCNNFaces.class);
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
    public final void ensureFaceIsMutable(){
       if (!this.face_.isModifiable()) {
          this.face_ = GeneratedMessageLite.mutableCopy(this.face_);
       }
       return;
    }
    public YCNNFace getFace(int p0){
       return this.face_.get(p0);
    }
    public int getFaceCount(){
       return this.face_.size();
    }
    public List getFaceList(){
       return this.face_;
    }
    public YCNNFaceOrBuilder getFaceOrBuilder(int p0){
       return this.face_.get(p0);
    }
    public List getFaceOrBuilderList(){
       return this.face_;
    }
    public void removeFace(int p0){
       this.ensureFaceIsMutable();
       this.face_.remove(p0);
    }
    public void setFace(int p0,YCNNFace$Builder p1){
       this.ensureFaceIsMutable();
       this.face_.set(p0, p1.build());
    }
    public void setFace(int p0,YCNNFace p1){
       Objects.requireNonNull(p1);
       this.ensureFaceIsMutable();
       this.face_.set(p0, p1);
    }
}
