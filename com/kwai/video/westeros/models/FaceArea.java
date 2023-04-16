package com.kwai.video.westeros.models.FaceArea;
import com.kwai.video.westeros.models.FaceAreaOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.FaceArea$Builder;
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
import com.kwai.video.westeros.models.FaceRect$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.FaceRect;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.FaceArea$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.FaceRectOrBuilder;

public final class FaceArea extends GeneratedMessageLite implements FaceAreaOrBuilder	// class@000f5e
{
    public Internal$ProtobufList rects_;
    public static final FaceArea DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceArea uFaceArea = new FaceArea();
       FaceArea.DEFAULT_INSTANCE = uFaceArea;
       GeneratedMessageLite.registerDefaultInstance(FaceArea.class, uFaceArea);
    }
    public void FaceArea(){
       super();
       this.rects_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static FaceArea getDefaultInstance(){
       return FaceArea.DEFAULT_INSTANCE;
    }
    public static FaceArea$Builder newBuilder(){
       return FaceArea.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceArea$Builder newBuilder(FaceArea p0){
       return FaceArea.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceArea parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceArea.DEFAULT_INSTANCE, p0);
    }
    public static FaceArea parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceArea parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0);
    }
    public static FaceArea parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceArea parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0);
    }
    public static FaceArea parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceArea parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0);
    }
    public static FaceArea parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceArea parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0);
    }
    public static FaceArea parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceArea parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0);
    }
    public static FaceArea parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceArea.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllRects(Iterable p0){
       this.ensureRectsIsMutable();
       AbstractMessageLite.addAll(p0, this.rects_);
    }
    public void addRects(int p0,FaceRect$Builder p1){
       this.ensureRectsIsMutable();
       this.rects_.add(p0, p1.build());
    }
    public void addRects(int p0,FaceRect p1){
       Objects.requireNonNull(p1);
       this.ensureRectsIsMutable();
       this.rects_.add(p0, p1);
    }
    public void addRects(FaceRect$Builder p0){
       this.ensureRectsIsMutable();
       this.rects_.add(p0.build());
    }
    public void addRects(FaceRect p0){
       Objects.requireNonNull(p0);
       this.ensureRectsIsMutable();
       this.rects_.add(p0);
    }
    public void clearRects(){
       this.rects_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FaceArea$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FaceArea();
           case 2:
             return new FaceArea$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"rects_",FaceRect.class};
             return GeneratedMessageLite.newMessageInfo(FaceArea.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return FaceArea.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceArea.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceArea.class);
                pARSER = FaceArea.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceArea.DEFAULT_INSTANCE);
                   FaceArea.PARSER = pARSER;
                }
                _monitor_exit(FaceArea.class);
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
    public final void ensureRectsIsMutable(){
       if (!this.rects_.isModifiable()) {
          this.rects_ = GeneratedMessageLite.mutableCopy(this.rects_);
       }
       return;
    }
    public FaceRect getRects(int p0){
       return this.rects_.get(p0);
    }
    public int getRectsCount(){
       return this.rects_.size();
    }
    public List getRectsList(){
       return this.rects_;
    }
    public FaceRectOrBuilder getRectsOrBuilder(int p0){
       return this.rects_.get(p0);
    }
    public List getRectsOrBuilderList(){
       return this.rects_;
    }
    public void removeRects(int p0){
       this.ensureRectsIsMutable();
       this.rects_.remove(p0);
    }
    public void setRects(int p0,FaceRect$Builder p1){
       this.ensureRectsIsMutable();
       this.rects_.set(p0, p1.build());
    }
    public void setRects(int p0,FaceRect p1){
       Objects.requireNonNull(p1);
       this.ensureRectsIsMutable();
       this.rects_.set(p0, p1);
    }
}
