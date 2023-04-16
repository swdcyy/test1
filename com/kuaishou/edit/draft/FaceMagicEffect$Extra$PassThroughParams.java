package com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams$a;
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
import com.kuaishou.edit.draft.FaceMagicEffect$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class FaceMagicEffect$Extra$PassThroughParams extends GeneratedMessageLite implements FaceMagicEffect$Extra$c	// class@001794
{
    public Internal$ProtobufList sharedObject_;
    public Internal$ProtobufList yModel_;
    public static final FaceMagicEffect$Extra$PassThroughParams DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceMagicEffect$Extra$PassThroughParams uExtra$PassT = new FaceMagicEffect$Extra$PassThroughParams();
       FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE = uExtra$PassT;
       GeneratedMessageLite.registerDefaultInstance(FaceMagicEffect$Extra$PassThroughParams.class, uExtra$PassT);
    }
    public void FaceMagicEffect$Extra$PassThroughParams(){
       super();
       this.yModel_ = GeneratedMessageLite.emptyProtobufList();
       this.sharedObject_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static FaceMagicEffect$Extra$PassThroughParams getDefaultInstance(){
       return FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE;
    }
    public static FaceMagicEffect$Extra$PassThroughParams$a newBuilder(){
       return FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceMagicEffect$Extra$PassThroughParams$a newBuilder(FaceMagicEffect$Extra$PassThroughParams p0){
       return FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$PassThroughParams parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllSharedObject(Iterable p0){
       this.ensureSharedObjectIsMutable();
       AbstractMessageLite.addAll(p0, this.sharedObject_);
    }
    public void addAllYModel(Iterable p0){
       this.ensureYModelIsMutable();
       AbstractMessageLite.addAll(p0, this.yModel_);
    }
    public void addSharedObject(String p0){
       Objects.requireNonNull(p0);
       this.ensureSharedObjectIsMutable();
       this.sharedObject_.add(p0);
    }
    public void addSharedObjectBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureSharedObjectIsMutable();
       this.sharedObject_.add(p0.toStringUtf8());
    }
    public void addYModel(String p0){
       Objects.requireNonNull(p0);
       this.ensureYModelIsMutable();
       this.yModel_.add(p0);
    }
    public void addYModelBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureYModelIsMutable();
       this.yModel_.add(p0.toStringUtf8());
    }
    public void clearSharedObject(){
       this.sharedObject_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearYModel(){
       this.yModel_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FaceMagicEffect$a.a[p0.ordinal()]){
           case 1:
             return new FaceMagicEffect$Extra$PassThroughParams();
           case 2:
             return new FaceMagicEffect$Extra$PassThroughParams$a(p2);
           case 3:
             Object[] objArray = new Object[]{"yModel_","sharedObject_"};
             return GeneratedMessageLite.newMessageInfo(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceMagicEffect$Extra$PassThroughParams.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceMagicEffect$Extra$PassThroughParams.class);
                pARSER = FaceMagicEffect$Extra$PassThroughParams.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceMagicEffect$Extra$PassThroughParams.DEFAULT_INSTANCE);
                   FaceMagicEffect$Extra$PassThroughParams.PARSER = pARSER;
                }
                _monitor_exit(FaceMagicEffect$Extra$PassThroughParams.class);
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
    public final void ensureSharedObjectIsMutable(){
       if (!this.sharedObject_.isModifiable()) {
          this.sharedObject_ = GeneratedMessageLite.mutableCopy(this.sharedObject_);
       }
       return;
    }
    public final void ensureYModelIsMutable(){
       if (!this.yModel_.isModifiable()) {
          this.yModel_ = GeneratedMessageLite.mutableCopy(this.yModel_);
       }
       return;
    }
    public String getSharedObject(int p0){
       return this.sharedObject_.get(p0);
    }
    public ByteString getSharedObjectBytes(int p0){
       return ByteString.copyFromUtf8(this.sharedObject_.get(p0));
    }
    public int getSharedObjectCount(){
       return this.sharedObject_.size();
    }
    public List getSharedObjectList(){
       return this.sharedObject_;
    }
    public String getYModel(int p0){
       return this.yModel_.get(p0);
    }
    public ByteString getYModelBytes(int p0){
       return ByteString.copyFromUtf8(this.yModel_.get(p0));
    }
    public int getYModelCount(){
       return this.yModel_.size();
    }
    public List getYModelList(){
       return this.yModel_;
    }
    public void setSharedObject(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureSharedObjectIsMutable();
       this.sharedObject_.set(p0, p1);
    }
    public void setYModel(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureYModelIsMutable();
       this.yModel_.set(p0, p1);
    }
}
