package com.kuaishou.mmu.common.Result$StringResponse;
import gn4.d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.mmu.common.Result$StringResponse$a;
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
import gn4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.mmu.common.Result$ResultStatus;
import java.util.Objects;
import com.kuaishou.mmu.common.Result$ResultStatus$a;
import com.google.protobuf.AbstractMessageLite;

public final class Result$StringResponse extends GeneratedMessageLite implements d	// class@000a0f
{
    public String resullt_;
    public Result$ResultStatus status_;
    public static final Result$StringResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Result$StringResponse stringRespon = new Result$StringResponse();
       Result$StringResponse.DEFAULT_INSTANCE = stringRespon;
       GeneratedMessageLite.registerDefaultInstance(Result$StringResponse.class, stringRespon);
    }
    public void Result$StringResponse(){
       super();
       this.resullt_ = "";
    }
    public static Result$StringResponse getDefaultInstance(){
       return Result$StringResponse.DEFAULT_INSTANCE;
    }
    public static Result$StringResponse$a newBuilder(){
       return Result$StringResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static Result$StringResponse$a newBuilder(Result$StringResponse p0){
       return Result$StringResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Result$StringResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Result$StringResponse.DEFAULT_INSTANCE, p0);
    }
    public static Result$StringResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Result$StringResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$StringResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0);
    }
    public static Result$StringResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$StringResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0);
    }
    public static Result$StringResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$StringResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0);
    }
    public static Result$StringResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$StringResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0);
    }
    public static Result$StringResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$StringResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0);
    }
    public static Result$StringResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$StringResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Result$StringResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearResullt(){
       this.resullt_ = Result$StringResponse.getDefaultInstance().getResullt();
    }
    public void clearStatus(){
       this.status_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new Result$StringResponse();
           case 2:
             return new Result$StringResponse$a(p2);
           case 3:
             Object[] objArray = new Object[]{"status_","resullt_"};
             return GeneratedMessageLite.newMessageInfo(Result$StringResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\x02\x02\x00", objArray);
           case 4:
             return Result$StringResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Result$StringResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(Result$StringResponse.class);
                pARSER = Result$StringResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Result$StringResponse.DEFAULT_INSTANCE);
                   Result$StringResponse.PARSER = pARSER;
                }
                _monitor_exit(Result$StringResponse.class);
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
    public String getResullt(){
       return this.resullt_;
    }
    public ByteString getResulltBytes(){
       return ByteString.copyFromUtf8(this.resullt_);
    }
    public Result$ResultStatus getStatus(){
       Result$StringResponse tstatus_ = this.status_;
       if (tstatus_ == null) {
          tstatus_ = Result$ResultStatus.getDefaultInstance();
       }
       return tstatus_;
    }
    public boolean hasStatus(){
       boolean b = (this.status_ != null)? true: false;
       return b;
    }
    public void mergeStatus(Result$ResultStatus p0){
       Objects.requireNonNull(p0);
       Result$StringResponse tstatus_ = this.status_;
       this.status_ = (tstatus_ != null && tstatus_ != Result$ResultStatus.getDefaultInstance())? Result$ResultStatus.newBuilder(this.status_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setResullt(String p0){
       Objects.requireNonNull(p0);
       this.resullt_ = p0;
    }
    public void setResulltBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.resullt_ = p0.toStringUtf8();
    }
    public void setStatus(Result$ResultStatus p0){
       Objects.requireNonNull(p0);
       this.status_ = p0;
    }
}
