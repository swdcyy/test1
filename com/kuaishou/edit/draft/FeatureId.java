package com.kuaishou.edit.draft.FeatureId;
import z30.g0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.FeatureId$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.FeatureId$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.InternalFeatureId;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class FeatureId extends GeneratedMessageLite implements g0	// class@0017a2
{
    public String external_;
    public int internal_;
    public static final FeatureId DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FeatureId uFeatureId = new FeatureId();
       FeatureId.DEFAULT_INSTANCE = uFeatureId;
       GeneratedMessageLite.registerDefaultInstance(FeatureId.class, uFeatureId);
    }
    public void FeatureId(){
       super();
       this.external_ = "";
    }
    public static FeatureId getDefaultInstance(){
       return FeatureId.DEFAULT_INSTANCE;
    }
    public static FeatureId$b newBuilder(){
       return FeatureId.DEFAULT_INSTANCE.createBuilder();
    }
    public static FeatureId$b newBuilder(FeatureId p0){
       return FeatureId.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FeatureId parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FeatureId.DEFAULT_INSTANCE, p0);
    }
    public static FeatureId parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FeatureId.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureId parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0);
    }
    public static FeatureId parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureId parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0);
    }
    public static FeatureId parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureId parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0);
    }
    public static FeatureId parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureId parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0);
    }
    public static FeatureId parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureId parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0);
    }
    public static FeatureId parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureId.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FeatureId.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearExternal(){
       this.external_ = FeatureId.getDefaultInstance().getExternal();
    }
    public void clearInternal(){
       this.internal_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FeatureId$a.a[p0.ordinal()]){
           case 1:
             return new FeatureId();
           case 2:
             return new FeatureId$b(p2);
           case 3:
             Object[] objArray = new Object[]{"internal_","external_"};
             return GeneratedMessageLite.newMessageInfo(FeatureId.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x00", objArray);
           case 4:
             return FeatureId.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FeatureId.PARSER;
             if (pARSER == null) {
                _monitor_enter(FeatureId.class);
                pARSER = FeatureId.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FeatureId.DEFAULT_INSTANCE);
                   FeatureId.PARSER = pARSER;
                }
                _monitor_exit(FeatureId.class);
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
    public String getExternal(){
       return this.external_;
    }
    public ByteString getExternalBytes(){
       return ByteString.copyFromUtf8(this.external_);
    }
    public InternalFeatureId getInternal(){
       InternalFeatureId internalFeat = InternalFeatureId.forNumber(this.internal_);
       if (internalFeat == null) {
          internalFeat = InternalFeatureId.UNRECOGNIZED;
       }
       return internalFeat;
    }
    public int getInternalValue(){
       return this.internal_;
    }
    public void setExternal(String p0){
       Objects.requireNonNull(p0);
       this.external_ = p0;
    }
    public void setExternalBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.external_ = p0.toStringUtf8();
    }
    public void setInternal(InternalFeatureId p0){
       Objects.requireNonNull(p0);
       this.internal_ = p0.getNumber();
    }
    public void setInternalValue(int p0){
       this.internal_ = p0;
    }
}
