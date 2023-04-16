package com.kwai.video.westeros.models.MmuFacePropResult;
import com.kwai.video.westeros.models.MmuFacePropResultOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.MmuFacePropResult$Builder;
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
import com.kwai.video.westeros.models.MmuFacePropSingleFace$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuFacePropSingleFace;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.MmuFacePropResult$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.MmuFacePropSingleFaceOrBuilder;

public final class MmuFacePropResult extends GeneratedMessageLite implements MmuFacePropResultOrBuilder	// class@000fc7
{
    public Internal$ProtobufList faceProps_;
    public static final MmuFacePropResult DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuFacePropResult mmuFacePropR = new MmuFacePropResult();
       MmuFacePropResult.DEFAULT_INSTANCE = mmuFacePropR;
       GeneratedMessageLite.registerDefaultInstance(MmuFacePropResult.class, mmuFacePropR);
    }
    public void MmuFacePropResult(){
       super();
       this.faceProps_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static MmuFacePropResult getDefaultInstance(){
       return MmuFacePropResult.DEFAULT_INSTANCE;
    }
    public static MmuFacePropResult$Builder newBuilder(){
       return MmuFacePropResult.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuFacePropResult$Builder newBuilder(MmuFacePropResult p0){
       return MmuFacePropResult.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuFacePropResult parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropResult parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropResult parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropResult parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropResult parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropResult parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropResult parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropResult parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropResult parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropResult parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropResult parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropResult parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuFacePropResult.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFaceProps(Iterable p0){
       this.ensureFacePropsIsMutable();
       AbstractMessageLite.addAll(p0, this.faceProps_);
    }
    public void addFaceProps(int p0,MmuFacePropSingleFace$Builder p1){
       this.ensureFacePropsIsMutable();
       this.faceProps_.add(p0, p1.build());
    }
    public void addFaceProps(int p0,MmuFacePropSingleFace p1){
       Objects.requireNonNull(p1);
       this.ensureFacePropsIsMutable();
       this.faceProps_.add(p0, p1);
    }
    public void addFaceProps(MmuFacePropSingleFace$Builder p0){
       this.ensureFacePropsIsMutable();
       this.faceProps_.add(p0.build());
    }
    public void addFaceProps(MmuFacePropSingleFace p0){
       Objects.requireNonNull(p0);
       this.ensureFacePropsIsMutable();
       this.faceProps_.add(p0);
    }
    public void clearFaceProps(){
       this.faceProps_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MmuFacePropResult$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuFacePropResult();
           case 2:
             return new MmuFacePropResult$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"faceProps_",MmuFacePropSingleFace.class};
             return GeneratedMessageLite.newMessageInfo(MmuFacePropResult.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return MmuFacePropResult.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuFacePropResult.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuFacePropResult.class);
                pARSER = MmuFacePropResult.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuFacePropResult.DEFAULT_INSTANCE);
                   MmuFacePropResult.PARSER = pARSER;
                }
                _monitor_exit(MmuFacePropResult.class);
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
    public final void ensureFacePropsIsMutable(){
       if (!this.faceProps_.isModifiable()) {
          this.faceProps_ = GeneratedMessageLite.mutableCopy(this.faceProps_);
       }
       return;
    }
    public MmuFacePropSingleFace getFaceProps(int p0){
       return this.faceProps_.get(p0);
    }
    public int getFacePropsCount(){
       return this.faceProps_.size();
    }
    public List getFacePropsList(){
       return this.faceProps_;
    }
    public MmuFacePropSingleFaceOrBuilder getFacePropsOrBuilder(int p0){
       return this.faceProps_.get(p0);
    }
    public List getFacePropsOrBuilderList(){
       return this.faceProps_;
    }
    public void removeFaceProps(int p0){
       this.ensureFacePropsIsMutable();
       this.faceProps_.remove(p0);
    }
    public void setFaceProps(int p0,MmuFacePropSingleFace$Builder p1){
       this.ensureFacePropsIsMutable();
       this.faceProps_.set(p0, p1.build());
    }
    public void setFaceProps(int p0,MmuFacePropSingleFace p1){
       Objects.requireNonNull(p1);
       this.ensureFacePropsIsMutable();
       this.faceProps_.set(p0, p1);
    }
}
