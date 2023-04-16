package com.kwai.video.westeros.models.TransFaceIndex;
import com.kwai.video.westeros.models.TransFaceIndexOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$IntList;
import com.kwai.video.westeros.models.TransFaceIndex$Builder;
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
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.TransFaceIndex$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;

public final class TransFaceIndex extends GeneratedMessageLite implements TransFaceIndexOrBuilder	// class@00105b
{
    public int indexMemoizedSerializedSize;
    public Internal$IntList index_;
    public static final TransFaceIndex DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TransFaceIndex transFaceInd = new TransFaceIndex();
       TransFaceIndex.DEFAULT_INSTANCE = transFaceInd;
       GeneratedMessageLite.registerDefaultInstance(TransFaceIndex.class, transFaceInd);
    }
    public void TransFaceIndex(){
       super();
       this.indexMemoizedSerializedSize = -1;
       this.index_ = GeneratedMessageLite.emptyIntList();
    }
    public static TransFaceIndex getDefaultInstance(){
       return TransFaceIndex.DEFAULT_INSTANCE;
    }
    public static TransFaceIndex$Builder newBuilder(){
       return TransFaceIndex.DEFAULT_INSTANCE.createBuilder();
    }
    public static TransFaceIndex$Builder newBuilder(TransFaceIndex p0){
       return TransFaceIndex.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TransFaceIndex parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(TransFaceIndex.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceIndex parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(TransFaceIndex.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceIndex parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceIndex parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceIndex parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceIndex parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceIndex parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceIndex parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceIndex parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceIndex parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFaceIndex parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0);
    }
    public static TransFaceIndex parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFaceIndex.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return TransFaceIndex.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllIndex(Iterable p0){
       this.ensureIndexIsMutable();
       AbstractMessageLite.addAll(p0, this.index_);
    }
    public void addIndex(int p0){
       this.ensureIndexIsMutable();
       this.index_.addInt(p0);
    }
    public void clearIndex(){
       this.index_ = GeneratedMessageLite.emptyIntList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (TransFaceIndex$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new TransFaceIndex();
           case 2:
             return new TransFaceIndex$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "index_";
             return GeneratedMessageLite.newMessageInfo(TransFaceIndex.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\'\x00", objArray);
           case 4:
             return TransFaceIndex.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TransFaceIndex.PARSER;
             if (pARSER == null) {
                _monitor_enter(TransFaceIndex.class);
                pARSER = TransFaceIndex.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TransFaceIndex.DEFAULT_INSTANCE);
                   TransFaceIndex.PARSER = pARSER;
                }
                _monitor_exit(TransFaceIndex.class);
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
    public final void ensureIndexIsMutable(){
       if (!this.index_.isModifiable()) {
          this.index_ = GeneratedMessageLite.mutableCopy(this.index_);
       }
       return;
    }
    public int getIndex(int p0){
       return this.index_.getInt(p0);
    }
    public int getIndexCount(){
       return this.index_.size();
    }
    public List getIndexList(){
       return this.index_;
    }
    public void setIndex(int p0,int p1){
       this.ensureIndexIsMutable();
       this.index_.setInt(p0, p1);
    }
}
