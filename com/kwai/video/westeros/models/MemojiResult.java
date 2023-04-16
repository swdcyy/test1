package com.kwai.video.westeros.models.MemojiResult;
import com.kwai.video.westeros.models.MemojiResultOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.MemojiResult$Builder;
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
import com.kwai.video.westeros.models.MemojiResultSingleFace$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.MemojiResultSingleFace;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.MemojiResult$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.MemojiResultSingleFaceOrBuilder;

public final class MemojiResult extends GeneratedMessageLite implements MemojiResultOrBuilder	// class@000fb6
{
    public Internal$ProtobufList memojiResultSingleFace_;
    public static final MemojiResult DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MemojiResult memojiResult = new MemojiResult();
       MemojiResult.DEFAULT_INSTANCE = memojiResult;
       GeneratedMessageLite.registerDefaultInstance(MemojiResult.class, memojiResult);
    }
    public void MemojiResult(){
       super();
       this.memojiResultSingleFace_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static MemojiResult getDefaultInstance(){
       return MemojiResult.DEFAULT_INSTANCE;
    }
    public static MemojiResult$Builder newBuilder(){
       return MemojiResult.DEFAULT_INSTANCE.createBuilder();
    }
    public static MemojiResult$Builder newBuilder(MemojiResult p0){
       return MemojiResult.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MemojiResult parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MemojiResult.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResult parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MemojiResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResult parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResult parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResult parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResult parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResult parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResult parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResult parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResult parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResult parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResult parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MemojiResult.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllMemojiResultSingleFace(Iterable p0){
       this.ensureMemojiResultSingleFaceIsMutable();
       AbstractMessageLite.addAll(p0, this.memojiResultSingleFace_);
    }
    public void addMemojiResultSingleFace(int p0,MemojiResultSingleFace$Builder p1){
       this.ensureMemojiResultSingleFaceIsMutable();
       this.memojiResultSingleFace_.add(p0, p1.build());
    }
    public void addMemojiResultSingleFace(int p0,MemojiResultSingleFace p1){
       Objects.requireNonNull(p1);
       this.ensureMemojiResultSingleFaceIsMutable();
       this.memojiResultSingleFace_.add(p0, p1);
    }
    public void addMemojiResultSingleFace(MemojiResultSingleFace$Builder p0){
       this.ensureMemojiResultSingleFaceIsMutable();
       this.memojiResultSingleFace_.add(p0.build());
    }
    public void addMemojiResultSingleFace(MemojiResultSingleFace p0){
       Objects.requireNonNull(p0);
       this.ensureMemojiResultSingleFaceIsMutable();
       this.memojiResultSingleFace_.add(p0);
    }
    public void clearMemojiResultSingleFace(){
       this.memojiResultSingleFace_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MemojiResult$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MemojiResult();
           case 2:
             return new MemojiResult$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"memojiResultSingleFace_",MemojiResultSingleFace.class};
             return GeneratedMessageLite.newMessageInfo(MemojiResult.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return MemojiResult.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MemojiResult.PARSER;
             if (pARSER == null) {
                _monitor_enter(MemojiResult.class);
                pARSER = MemojiResult.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MemojiResult.DEFAULT_INSTANCE);
                   MemojiResult.PARSER = pARSER;
                }
                _monitor_exit(MemojiResult.class);
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
    public final void ensureMemojiResultSingleFaceIsMutable(){
       if (!this.memojiResultSingleFace_.isModifiable()) {
          this.memojiResultSingleFace_ = GeneratedMessageLite.mutableCopy(this.memojiResultSingleFace_);
       }
       return;
    }
    public MemojiResultSingleFace getMemojiResultSingleFace(int p0){
       return this.memojiResultSingleFace_.get(p0);
    }
    public int getMemojiResultSingleFaceCount(){
       return this.memojiResultSingleFace_.size();
    }
    public List getMemojiResultSingleFaceList(){
       return this.memojiResultSingleFace_;
    }
    public MemojiResultSingleFaceOrBuilder getMemojiResultSingleFaceOrBuilder(int p0){
       return this.memojiResultSingleFace_.get(p0);
    }
    public List getMemojiResultSingleFaceOrBuilderList(){
       return this.memojiResultSingleFace_;
    }
    public void removeMemojiResultSingleFace(int p0){
       this.ensureMemojiResultSingleFaceIsMutable();
       this.memojiResultSingleFace_.remove(p0);
    }
    public void setMemojiResultSingleFace(int p0,MemojiResultSingleFace$Builder p1){
       this.ensureMemojiResultSingleFaceIsMutable();
       this.memojiResultSingleFace_.set(p0, p1.build());
    }
    public void setMemojiResultSingleFace(int p0,MemojiResultSingleFace p1){
       Objects.requireNonNull(p1);
       this.ensureMemojiResultSingleFaceIsMutable();
       this.memojiResultSingleFace_.set(p0, p1);
    }
}
