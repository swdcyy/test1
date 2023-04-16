package com.kwai.sdk.eve.proto.HetuTag;
import com.kwai.sdk.eve.proto.HetuTagOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$IntList;
import com.kwai.sdk.eve.proto.HetuTag$Builder;
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
import com.kwai.sdk.eve.proto.HetuTag$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;

public final class HetuTag extends GeneratedMessageLite implements HetuTagOrBuilder	// class@0015ec
{
    public int hetuOneMemoizedSerializedSize;
    public Internal$IntList hetuOne_;
    public int hetuThreeMemoizedSerializedSize;
    public Internal$IntList hetuThree_;
    public int hetuTwoMemoizedSerializedSize;
    public Internal$IntList hetuTwo_;
    public static final HetuTag DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       HetuTag hetuTag = new HetuTag();
       HetuTag.DEFAULT_INSTANCE = hetuTag;
       GeneratedMessageLite.registerDefaultInstance(HetuTag.class, hetuTag);
    }
    public void HetuTag(){
       super();
       this.hetuOneMemoizedSerializedSize = -1;
       this.hetuTwoMemoizedSerializedSize = -1;
       this.hetuThreeMemoizedSerializedSize = -1;
       this.hetuOne_ = GeneratedMessageLite.emptyIntList();
       this.hetuTwo_ = GeneratedMessageLite.emptyIntList();
       this.hetuThree_ = GeneratedMessageLite.emptyIntList();
    }
    public static HetuTag getDefaultInstance(){
       return HetuTag.DEFAULT_INSTANCE;
    }
    public static HetuTag$Builder newBuilder(){
       return HetuTag.DEFAULT_INSTANCE.createBuilder();
    }
    public static HetuTag$Builder newBuilder(HetuTag p0){
       return HetuTag.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static HetuTag parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(HetuTag.DEFAULT_INSTANCE, p0);
    }
    public static HetuTag parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(HetuTag.DEFAULT_INSTANCE, p0, p1);
    }
    public static HetuTag parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0);
    }
    public static HetuTag parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0, p1);
    }
    public static HetuTag parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0);
    }
    public static HetuTag parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0, p1);
    }
    public static HetuTag parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0);
    }
    public static HetuTag parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0, p1);
    }
    public static HetuTag parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0);
    }
    public static HetuTag parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0, p1);
    }
    public static HetuTag parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0);
    }
    public static HetuTag parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(HetuTag.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return HetuTag.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllHetuOne(Iterable p0){
       this.ensureHetuOneIsMutable();
       AbstractMessageLite.addAll(p0, this.hetuOne_);
    }
    public void addAllHetuThree(Iterable p0){
       this.ensureHetuThreeIsMutable();
       AbstractMessageLite.addAll(p0, this.hetuThree_);
    }
    public void addAllHetuTwo(Iterable p0){
       this.ensureHetuTwoIsMutable();
       AbstractMessageLite.addAll(p0, this.hetuTwo_);
    }
    public void addHetuOne(int p0){
       this.ensureHetuOneIsMutable();
       this.hetuOne_.addInt(p0);
    }
    public void addHetuThree(int p0){
       this.ensureHetuThreeIsMutable();
       this.hetuThree_.addInt(p0);
    }
    public void addHetuTwo(int p0){
       this.ensureHetuTwoIsMutable();
       this.hetuTwo_.addInt(p0);
    }
    public void clearHetuOne(){
       this.hetuOne_ = GeneratedMessageLite.emptyIntList();
    }
    public void clearHetuThree(){
       this.hetuThree_ = GeneratedMessageLite.emptyIntList();
    }
    public void clearHetuTwo(){
       this.hetuTwo_ = GeneratedMessageLite.emptyIntList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (HetuTag$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new HetuTag();
           case 2:
             return new HetuTag$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"hetuOne_","hetuTwo_","hetuThree_"};
             return GeneratedMessageLite.newMessageInfo(HetuTag.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\'\x02\'\x03\'\x00", objArray);
           case 4:
             return HetuTag.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = HetuTag.PARSER;
             if (pARSER == null) {
                _monitor_enter(HetuTag.class);
                pARSER = HetuTag.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(HetuTag.DEFAULT_INSTANCE);
                   HetuTag.PARSER = pARSER;
                }
                _monitor_exit(HetuTag.class);
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
    public final void ensureHetuOneIsMutable(){
       if (!this.hetuOne_.isModifiable()) {
          this.hetuOne_ = GeneratedMessageLite.mutableCopy(this.hetuOne_);
       }
       return;
    }
    public final void ensureHetuThreeIsMutable(){
       if (!this.hetuThree_.isModifiable()) {
          this.hetuThree_ = GeneratedMessageLite.mutableCopy(this.hetuThree_);
       }
       return;
    }
    public final void ensureHetuTwoIsMutable(){
       if (!this.hetuTwo_.isModifiable()) {
          this.hetuTwo_ = GeneratedMessageLite.mutableCopy(this.hetuTwo_);
       }
       return;
    }
    public int getHetuOne(int p0){
       return this.hetuOne_.getInt(p0);
    }
    public int getHetuOneCount(){
       return this.hetuOne_.size();
    }
    public List getHetuOneList(){
       return this.hetuOne_;
    }
    public int getHetuThree(int p0){
       return this.hetuThree_.getInt(p0);
    }
    public int getHetuThreeCount(){
       return this.hetuThree_.size();
    }
    public List getHetuThreeList(){
       return this.hetuThree_;
    }
    public int getHetuTwo(int p0){
       return this.hetuTwo_.getInt(p0);
    }
    public int getHetuTwoCount(){
       return this.hetuTwo_.size();
    }
    public List getHetuTwoList(){
       return this.hetuTwo_;
    }
    public void setHetuOne(int p0,int p1){
       this.ensureHetuOneIsMutable();
       this.hetuOne_.setInt(p0, p1);
    }
    public void setHetuThree(int p0,int p1){
       this.ensureHetuThreeIsMutable();
       this.hetuThree_.setInt(p0, p1);
    }
    public void setHetuTwo(int p0,int p1){
       this.ensureHetuTwoIsMutable();
       this.hetuTwo_.setInt(p0, p1);
    }
}
