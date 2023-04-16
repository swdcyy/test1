package com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMaskOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.FieldMask$Builder;
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
import com.google.protobuf.FieldMask$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class FieldMask extends GeneratedMessageLite implements FieldMaskOrBuilder	// class@000420
{
    public Internal$ProtobufList paths_;
    public static final FieldMask DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FieldMask uFieldMask = new FieldMask();
       FieldMask.DEFAULT_INSTANCE = uFieldMask;
       GeneratedMessageLite.registerDefaultInstance(FieldMask.class, uFieldMask);
    }
    public void FieldMask(){
       super();
       this.paths_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static FieldMask getDefaultInstance(){
       return FieldMask.DEFAULT_INSTANCE;
    }
    public static FieldMask$Builder newBuilder(){
       return FieldMask.DEFAULT_INSTANCE.createBuilder();
    }
    public static FieldMask$Builder newBuilder(FieldMask p0){
       return FieldMask.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FieldMask parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FieldMask.DEFAULT_INSTANCE, p0);
    }
    public static FieldMask parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FieldMask.DEFAULT_INSTANCE, p0, p1);
    }
    public static FieldMask parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0);
    }
    public static FieldMask parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0, p1);
    }
    public static FieldMask parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0);
    }
    public static FieldMask parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0, p1);
    }
    public static FieldMask parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0);
    }
    public static FieldMask parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0, p1);
    }
    public static FieldMask parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0);
    }
    public static FieldMask parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0, p1);
    }
    public static FieldMask parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0);
    }
    public static FieldMask parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FieldMask.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllPaths(Iterable p0){
       this.ensurePathsIsMutable();
       AbstractMessageLite.addAll(p0, this.paths_);
    }
    public void addPaths(String p0){
       Objects.requireNonNull(p0);
       this.ensurePathsIsMutable();
       this.paths_.add(p0);
    }
    public void addPathsBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensurePathsIsMutable();
       this.paths_.add(p0.toStringUtf8());
    }
    public void clearPaths(){
       this.paths_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FieldMask$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FieldMask();
           case 2:
             return new FieldMask$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "paths_";
             return GeneratedMessageLite.newMessageInfo(FieldMask.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x00", objArray);
           case 4:
             return FieldMask.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FieldMask.PARSER;
             if (pARSER == null) {
                _monitor_enter(FieldMask.class);
                pARSER = FieldMask.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FieldMask.DEFAULT_INSTANCE);
                   FieldMask.PARSER = pARSER;
                }
                _monitor_exit(FieldMask.class);
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
    public final void ensurePathsIsMutable(){
       if (!this.paths_.isModifiable()) {
          this.paths_ = GeneratedMessageLite.mutableCopy(this.paths_);
       }
       return;
    }
    public String getPaths(int p0){
       return this.paths_.get(p0);
    }
    public ByteString getPathsBytes(int p0){
       return ByteString.copyFromUtf8(this.paths_.get(p0));
    }
    public int getPathsCount(){
       return this.paths_.size();
    }
    public List getPathsList(){
       return this.paths_;
    }
    public void setPaths(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensurePathsIsMutable();
       this.paths_.set(p0, p1);
    }
}
