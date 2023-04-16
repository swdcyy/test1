package com.kuaishou.share.ResultPackageForSync$InternalCustomProtoEvent;
import com.kuaishou.share.ResultPackageForSync$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.share.ResultPackageForSync$InternalCustomProtoEvent$a;
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
import com.kuaishou.share.ResultPackageForSync$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.share.ResultPackage;
import java.util.Objects;
import com.kuaishou.share.ResultPackage$b;
import com.google.protobuf.AbstractMessageLite;

public final class ResultPackageForSync$InternalCustomProtoEvent extends GeneratedMessageLite implements ResultPackageForSync$c	// class@000f25
{
    public ResultPackage payload_;
    public String type_;
    public static final ResultPackageForSync$InternalCustomProtoEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ResultPackageForSync$InternalCustomProtoEvent internalCust = new ResultPackageForSync$InternalCustomProtoEvent();
       ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE = internalCust;
       GeneratedMessageLite.registerDefaultInstance(ResultPackageForSync$InternalCustomProtoEvent.class, internalCust);
    }
    public void ResultPackageForSync$InternalCustomProtoEvent(){
       super();
       this.type_ = "";
    }
    public static ResultPackageForSync$InternalCustomProtoEvent getDefaultInstance(){
       return ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE;
    }
    public static ResultPackageForSync$InternalCustomProtoEvent$a newBuilder(){
       return ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static ResultPackageForSync$InternalCustomProtoEvent$a newBuilder(ResultPackageForSync$InternalCustomProtoEvent p0){
       return ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync$InternalCustomProtoEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearPayload(){
       this.payload_ = null;
    }
    public void clearType(){
       this.type_ = ResultPackageForSync$InternalCustomProtoEvent.getDefaultInstance().getType();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ResultPackageForSync$a.a[p0.ordinal()]){
           case 1:
             return new ResultPackageForSync$InternalCustomProtoEvent();
           case 2:
             return new ResultPackageForSync$InternalCustomProtoEvent$a(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","payload_"};
             return GeneratedMessageLite.newMessageInfo(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t\x00", objArray);
           case 4:
             return ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ResultPackageForSync$InternalCustomProtoEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(ResultPackageForSync$InternalCustomProtoEvent.class);
                pARSER = ResultPackageForSync$InternalCustomProtoEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE);
                   ResultPackageForSync$InternalCustomProtoEvent.PARSER = pARSER;
                }
                _monitor_exit(ResultPackageForSync$InternalCustomProtoEvent.class);
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
    public ResultPackage getPayload(){
       ResultPackageForSync$InternalCustomProtoEvent tpayload_ = this.payload_;
       if (tpayload_ == null) {
          tpayload_ = ResultPackage.getDefaultInstance();
       }
       return tpayload_;
    }
    public String getType(){
       return this.type_;
    }
    public ByteString getTypeBytes(){
       return ByteString.copyFromUtf8(this.type_);
    }
    public boolean hasPayload(){
       boolean b = (this.payload_ != null)? true: false;
       return b;
    }
    public void mergePayload(ResultPackage p0){
       Objects.requireNonNull(p0);
       ResultPackageForSync$InternalCustomProtoEvent tpayload_ = this.payload_;
       this.payload_ = (tpayload_ != null && tpayload_ != ResultPackage.getDefaultInstance())? ResultPackage.newBuilder(this.payload_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setPayload(ResultPackage$b p0){
       this.payload_ = p0.build();
    }
    public void setPayload(ResultPackage p0){
       Objects.requireNonNull(p0);
       this.payload_ = p0;
    }
    public void setType(String p0){
       Objects.requireNonNull(p0);
       this.type_ = p0;
    }
    public void setTypeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.type_ = p0.toStringUtf8();
    }
}
