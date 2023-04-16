package com.kwai.video.westeros.models.MmuFaces;
import com.kwai.video.westeros.models.MmuFacesOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.MmuFaces$Builder;
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
import com.kwai.video.westeros.models.MmuFace$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuFace;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.MmuFaces$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.MmuFaceOrBuilder;

public final class MmuFaces extends GeneratedMessageLite implements MmuFacesOrBuilder	// class@000fcf
{
    public Internal$ProtobufList face_;
    public static final MmuFaces DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuFaces mmuFaces = new MmuFaces();
       MmuFaces.DEFAULT_INSTANCE = mmuFaces;
       GeneratedMessageLite.registerDefaultInstance(MmuFaces.class, mmuFaces);
    }
    public void MmuFaces(){
       super();
       this.face_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static MmuFaces getDefaultInstance(){
       return MmuFaces.DEFAULT_INSTANCE;
    }
    public static MmuFaces$Builder newBuilder(){
       return MmuFaces.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuFaces$Builder newBuilder(MmuFaces p0){
       return MmuFaces.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuFaces parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFaces.DEFAULT_INSTANCE, p0);
    }
    public static MmuFaces parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFaces parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0);
    }
    public static MmuFaces parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFaces parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0);
    }
    public static MmuFaces parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFaces parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0);
    }
    public static MmuFaces parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFaces parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0);
    }
    public static MmuFaces parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFaces parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0);
    }
    public static MmuFaces parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFaces.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuFaces.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFace(Iterable p0){
       this.ensureFaceIsMutable();
       AbstractMessageLite.addAll(p0, this.face_);
    }
    public void addFace(int p0,MmuFace$Builder p1){
       this.ensureFaceIsMutable();
       this.face_.add(p0, p1.build());
    }
    public void addFace(int p0,MmuFace p1){
       Objects.requireNonNull(p1);
       this.ensureFaceIsMutable();
       this.face_.add(p0, p1);
    }
    public void addFace(MmuFace$Builder p0){
       this.ensureFaceIsMutable();
       this.face_.add(p0.build());
    }
    public void addFace(MmuFace p0){
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
       switch (MmuFaces$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuFaces();
           case 2:
             return new MmuFaces$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"face_",MmuFace.class};
             return GeneratedMessageLite.newMessageInfo(MmuFaces.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return MmuFaces.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuFaces.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuFaces.class);
                pARSER = MmuFaces.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuFaces.DEFAULT_INSTANCE);
                   MmuFaces.PARSER = pARSER;
                }
                _monitor_exit(MmuFaces.class);
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
    public MmuFace getFace(int p0){
       return this.face_.get(p0);
    }
    public int getFaceCount(){
       return this.face_.size();
    }
    public List getFaceList(){
       return this.face_;
    }
    public MmuFaceOrBuilder getFaceOrBuilder(int p0){
       return this.face_.get(p0);
    }
    public List getFaceOrBuilderList(){
       return this.face_;
    }
    public void removeFace(int p0){
       this.ensureFaceIsMutable();
       this.face_.remove(p0);
    }
    public void setFace(int p0,MmuFace$Builder p1){
       this.ensureFaceIsMutable();
       this.face_.set(p0, p1.build());
    }
    public void setFace(int p0,MmuFace p1){
       Objects.requireNonNull(p1);
       this.ensureFaceIsMutable();
       this.face_.set(p0, p1);
    }
}
