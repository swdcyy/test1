package com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.AbstractMessageLite;
import java.util.concurrent.ConcurrentHashMap;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Internal$BooleanList;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.Internal$DoubleList;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.Internal$FloatList;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.Internal$IntList;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.Internal$LongList;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.ProtobufArrayList;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import java.lang.ClassLoader;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.google.protobuf.UnsafeUtil;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.reflect.InvocationTargetException;
import java.lang.Error;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Byte;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Schema;
import java.util.List;
import com.google.protobuf.RawMessageInfo;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.WireFormat$FieldType;
import java.util.Collections;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream;
import java.io.IOException;
import com.google.protobuf.CodedInputStreamReader;
import com.google.protobuf.Reader;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Parser;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.WireFormat;
import com.google.protobuf.MessageLiteToString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.CodedOutputStreamWriter;
import com.google.protobuf.Writer;

public abstract class GeneratedMessageLite extends AbstractMessageLite	// class@00043c
{
    public int memoizedSerializedSize;
    public UnknownFieldSetLite unknownFields;
    public static Map defaultInstanceMap;

    static {
       GeneratedMessageLite.defaultInstanceMap = new ConcurrentHashMap();
    }
    public void GeneratedMessageLite(){
       super();
       this.unknownFields = UnknownFieldSetLite.getDefaultInstance();
       this.memoizedSerializedSize = -1;
    }
    public static GeneratedMessageLite$GeneratedExtension checkIsLite(ExtensionLite p0){
       if (p0.isLite()) {
          return p0;
       }
       throw new IllegalArgumentException("Expected a lite extension.");
    }
    public static GeneratedMessageLite checkMessageInitialized(GeneratedMessageLite p0){
       if (p0 == null || p0.isInitialized()) {
          return p0;
       }
       throw p0.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(p0);
    }
    public static Internal$BooleanList emptyBooleanList(){
       return BooleanArrayList.emptyList();
    }
    public static Internal$DoubleList emptyDoubleList(){
       return DoubleArrayList.emptyList();
    }
    public static Internal$FloatList emptyFloatList(){
       return FloatArrayList.emptyList();
    }
    public static Internal$IntList emptyIntList(){
       return IntArrayList.emptyList();
    }
    public static Internal$LongList emptyLongList(){
       return LongArrayList.emptyList();
    }
    public static Internal$ProtobufList emptyProtobufList(){
       return ProtobufArrayList.emptyList();
    }
    public static GeneratedMessageLite getDefaultInstance(Class p0){
       GeneratedMessageLite generatedMes = GeneratedMessageLite.defaultInstanceMap.get(p0);
       if (generatedMes == null) {
          try{
             Class.forName(p0.getName(), true, p0.getClassLoader());
             generatedMes = GeneratedMessageLite.defaultInstanceMap.get(p0);
          }catch(java.lang.ClassNotFoundException e3){
             throw new IllegalStateException("Class initialization cannot fail.", e3);
          }
       }
       if (generatedMes == null) {
          generatedMes = UnsafeUtil.allocateInstance(p0).getDefaultInstanceForType();
          if (generatedMes != null) {
             GeneratedMessageLite.defaultInstanceMap.put(p0, generatedMes);
          }else {
             throw new IllegalStateException();
          }
       }
       return generatedMes;
    }
    public static Method getMethodOrDie(Class p0,String p1,Class[] p2){
       try{
          return p0.getMethod(p1, p2);
       }catch(java.lang.NoSuchMethodException e5){
          throw new RuntimeException("Generated message class \""+p0.getName()+"\" missing method \""+p1+"\".", e5);
       }
    }
    public static Object invokeOrDie(Method p0,Object p1,Object[] p2){
       try{
          return p0.invoke(p1, p2);
       }catch(java.lang.IllegalAccessException e0){
          throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", e0);
       }catch(java.lang.reflect.InvocationTargetException e0){
          Throwable cause = e0.getCause();
          if (cause instanceof RuntimeException) {
             throw cause;
          }
          if (cause instanceof Error) {
             throw cause;
          }
          throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
       }
    }
    public static final boolean isInitialized(GeneratedMessageLite p0,boolean p1){
       boolean b = p0.dynamicMethod(GeneratedMessageLite$MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED).byteValue();
       boolean b1 = true;
       if (b == b1) {
          return b1;
       }
       if (!b) {
          return false;
       }
       b = Protobuf.getInstance().schemaFor(p0).isInitialized(p0);
       if (p1) {
          GeneratedMessageLite$MethodToInvoke sET_MEMOIZED = GeneratedMessageLite$MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED;
          Object obj = (b)? p0: null;
          p0.dynamicMethod(sET_MEMOIZED, obj);
       }
       return b;
    }
    public static Internal$BooleanList mutableCopy(Internal$BooleanList p0){
       int i = p0.size();
       i = (!i)? 10: i * 2;
       return p0.mutableCopyWithCapacity(i);
    }
    public static Internal$DoubleList mutableCopy(Internal$DoubleList p0){
       int i = p0.size();
       i = (!i)? 10: i * 2;
       return p0.mutableCopyWithCapacity(i);
    }
    public static Internal$FloatList mutableCopy(Internal$FloatList p0){
       int i = p0.size();
       i = (!i)? 10: i * 2;
       return p0.mutableCopyWithCapacity(i);
    }
    public static Internal$IntList mutableCopy(Internal$IntList p0){
       int i = p0.size();
       i = (!i)? 10: i * 2;
       return p0.mutableCopyWithCapacity(i);
    }
    public static Internal$LongList mutableCopy(Internal$LongList p0){
       int i = p0.size();
       i = (!i)? 10: i * 2;
       return p0.mutableCopyWithCapacity(i);
    }
    public static Internal$ProtobufList mutableCopy(Internal$ProtobufList p0){
       int i = p0.size();
       i = (!i)? 10: i * 2;
       return p0.mutableCopyWithCapacity(i);
    }
    public static Object newMessageInfo(MessageLite p0,String p1,Object[] p2){
       return new RawMessageInfo(p0, p1, p2);
    }
    public static GeneratedMessageLite$GeneratedExtension newRepeatedGeneratedExtension(MessageLite p0,MessageLite p1,Internal$EnumLiteMap p2,int p3,WireFormat$FieldType p4,boolean p5,Class p6){
       GeneratedMessageLite$ExtensionDescriptor uExtensionDe = new GeneratedMessageLite$ExtensionDescriptor(p2, p3, p4, true, p5);
       GeneratedMessageLite$GeneratedExtension generatedExt = new GeneratedMessageLite$GeneratedExtension(p0, Collections.emptyList(), p1, v4, p6);
       return v6;
    }
    public static GeneratedMessageLite$GeneratedExtension newSingularGeneratedExtension(MessageLite p0,Object p1,MessageLite p2,Internal$EnumLiteMap p3,int p4,WireFormat$FieldType p5,Class p6){
       GeneratedMessageLite$ExtensionDescriptor uExtensionDe = new GeneratedMessageLite$ExtensionDescriptor(p3, p4, p5, false, false);
       GeneratedMessageLite$GeneratedExtension generatedExt = new GeneratedMessageLite$GeneratedExtension(p0, p1, p2, v7, p6);
       return v6;
    }
    public static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite p0,InputStream p1){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialDelimitedFrom(p0, p1, ExtensionRegistryLite.getEmptyRegistry()));
    }
    public static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite p0,InputStream p1,ExtensionRegistryLite p2){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialDelimitedFrom(p0, p1, p2));
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,ByteString p1){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parseFrom(p0, p1, ExtensionRegistryLite.getEmptyRegistry()));
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,ByteString p1,ExtensionRegistryLite p2){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(p0, p1, p2));
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,CodedInputStream p1){
       return GeneratedMessageLite.parseFrom(p0, p1, ExtensionRegistryLite.getEmptyRegistry());
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,CodedInputStream p1,ExtensionRegistryLite p2){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(p0, p1, p2));
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,InputStream p1){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(p0, CodedInputStream.newInstance(p1), ExtensionRegistryLite.getEmptyRegistry()));
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,InputStream p1,ExtensionRegistryLite p2){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(p0, CodedInputStream.newInstance(p1), p2));
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,ByteBuffer p1){
       return GeneratedMessageLite.parseFrom(p0, p1, ExtensionRegistryLite.getEmptyRegistry());
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,ByteBuffer p1,ExtensionRegistryLite p2){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parseFrom(p0, CodedInputStream.newInstance(p1), p2));
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,byte[] p1){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(p0, p1, 0, p1.length, ExtensionRegistryLite.getEmptyRegistry()));
    }
    public static GeneratedMessageLite parseFrom(GeneratedMessageLite p0,byte[] p1,ExtensionRegistryLite p2){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(p0, p1, 0, p1.length, p2));
    }
    public static GeneratedMessageLite parsePartialDelimitedFrom(GeneratedMessageLite p0,InputStream p1,ExtensionRegistryLite p2){
       try{
          int i = p1.read();
          if (i == -1) {
             return null;
          }
          CodedInputStream uCodedInputS = CodedInputStream.newInstance(new AbstractMessageLite$Builder$LimitedInputStream(p1, CodedInputStream.readRawVarint32(i, p1)));
          p0 = GeneratedMessageLite.parsePartialFrom(p0, uCodedInputS, p2);
          try{
             int i1 = 0;
             uCodedInputS.checkLastTagWas(i1);
             return p0;
          }catch(com.google.protobuf.InvalidProtocolBufferException e3){
             throw e3.setUnfinishedMessage(p0);
          }
       }catch(java.io.IOException e2){
          throw new InvalidProtocolBufferException(e2.getMessage());
       }
    }
    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite p0,ByteString p1,ExtensionRegistryLite p2){
       try{
          CodedInputStream uCodedInputS = p1.newCodedInput();
          p0 = GeneratedMessageLite.parsePartialFrom(p0, uCodedInputS, p2);
          try{
             int i = 0;
             uCodedInputS.checkLastTagWas(i);
             return p0;
          }catch(com.google.protobuf.InvalidProtocolBufferException e1){
             throw e1.setUnfinishedMessage(p0);
          }
       }catch(com.google.protobuf.InvalidProtocolBufferException e0){
          throw e0;
       }
    }
    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite p0,CodedInputStream p1){
       return GeneratedMessageLite.parsePartialFrom(p0, p1, ExtensionRegistryLite.getEmptyRegistry());
    }
    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite p0,CodedInputStream p1,ExtensionRegistryLite p2){
       p0 = p0.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
       try{
          Schema schema = Protobuf.getInstance().schemaFor(p0);
          schema.mergeFrom(p0, CodedInputStreamReader.forCodedInput(p1), p2);
          schema.makeImmutable(p0);
          return p0;
       }catch(java.io.IOException e2){
          if (e2.getCause() instanceof InvalidProtocolBufferException) {
             throw e2.getCause();
          }
          throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(p0);
       }catch(java.lang.RuntimeException e1){
          if (e1.getCause() instanceof InvalidProtocolBufferException) {
             throw e1.getCause();
          }
          throw e1;
       }
    }
    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite p0,byte[] p1,int p2,int p3,ExtensionRegistryLite p4){
       p0 = p0.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
       try{
          Schema schema = Protobuf.getInstance().schemaFor(p0);
          schema.mergeFrom(p0, p1, p2, (p2 + p3), new ArrayDecoders$Registers(p4));
          schema.makeImmutable(p0);
          if (p0.memoizedHashCode == null) {
             return p0;
          }
          throw new RuntimeException();
       }catch(java.io.IOException e8){
          if (e8.getCause() instanceof InvalidProtocolBufferException) {
             throw e8.getCause();
          }
          throw new InvalidProtocolBufferException(e8.getMessage()).setUnfinishedMessage(p0);
       }catch(java.lang.IndexOutOfBoundsException e0){
          throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(p0);
       }
    }
    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite p0,byte[] p1,ExtensionRegistryLite p2){
       return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(p0, p1, 0, p1.length, p2));
    }
    public static void registerDefaultInstance(Class p0,GeneratedMessageLite p1){
       GeneratedMessageLite.defaultInstanceMap.put(p0, p1);
    }
    public Object buildMessageInfo(){
       return this.dynamicMethod(GeneratedMessageLite$MethodToInvoke.BUILD_MESSAGE_INFO);
    }
    public final GeneratedMessageLite$Builder createBuilder(){
       return this.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
    }
    public final GeneratedMessageLite$Builder createBuilder(GeneratedMessageLite p0){
       return this.createBuilder().mergeFrom(p0);
    }
    public Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0){
       return this.dynamicMethod(p0, null, null);
    }
    public Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1){
       return this.dynamicMethod(p0, p1, null);
    }
    public abstract Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2);
    public final void ensureUnknownFieldsInitialized(){
       if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
          this.unknownFields = UnknownFieldSetLite.newInstance();
       }
       return;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!this.getDefaultInstanceForType().getClass().isInstance(p0)) {
          return false;
       }
       return Protobuf.getInstance().schemaFor(this).equals(this, p0);
    }
    public final GeneratedMessageLite getDefaultInstanceForType(){
       return this.dynamicMethod(GeneratedMessageLite$MethodToInvoke.GET_DEFAULT_INSTANCE);
    }
    public MessageLite getDefaultInstanceForType(){
       return this.getDefaultInstanceForType();
    }
    public int getMemoizedSerializedSize(){
       return this.memoizedSerializedSize;
    }
    public final Parser getParserForType(){
       return this.dynamicMethod(GeneratedMessageLite$MethodToInvoke.GET_PARSER);
    }
    public int getSerializedSize(){
       if (this.memoizedSerializedSize == -1) {
          this.memoizedSerializedSize = Protobuf.getInstance().schemaFor(this).getSerializedSize(this);
       }
       return this.memoizedSerializedSize;
    }
    public int hashCode(){
       AbstractMessageLite tmemoizedHas = this.memoizedHashCode;
       if (tmemoizedHas != null) {
          return tmemoizedHas;
       }
       int i = Protobuf.getInstance().schemaFor(this).hashCode(this);
       this.memoizedHashCode = i;
       return i;
    }
    public final boolean isInitialized(){
       return GeneratedMessageLite.isInitialized(this, true);
    }
    public void makeImmutable(){
       Protobuf.getInstance().schemaFor(this).makeImmutable(this);
    }
    public void mergeLengthDelimitedField(int p0,ByteString p1){
       this.ensureUnknownFieldsInitialized();
       this.unknownFields.mergeLengthDelimitedField(p0, p1);
    }
    public final void mergeUnknownFields(UnknownFieldSetLite p0){
       this.unknownFields = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, p0);
    }
    public void mergeVarintField(int p0,int p1){
       this.ensureUnknownFieldsInitialized();
       this.unknownFields.mergeVarintField(p0, p1);
    }
    public final GeneratedMessageLite$Builder newBuilderForType(){
       return this.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
    }
    public MessageLite$Builder newBuilderForType(){
       return this.newBuilderForType();
    }
    public boolean parseUnknownField(int p0,CodedInputStream p1){
       if (WireFormat.getTagWireType(p0) == 4) {
          return false;
       }
       this.ensureUnknownFieldsInitialized();
       return this.unknownFields.mergeFieldFrom(p0, p1);
    }
    public void setMemoizedSerializedSize(int p0){
       this.memoizedSerializedSize = p0;
    }
    public final GeneratedMessageLite$Builder toBuilder(){
       GeneratedMessageLite$Builder uBuilder = this.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
       uBuilder.mergeFrom(this);
       return uBuilder;
    }
    public MessageLite$Builder toBuilder(){
       return this.toBuilder();
    }
    public String toString(){
       return MessageLiteToString.toString(this, super.toString());
    }
    public void writeTo(CodedOutputStream p0){
       Protobuf.getInstance().schemaFor(this).writeTo(this, CodedOutputStreamWriter.forCodedOutput(p0));
    }
}
