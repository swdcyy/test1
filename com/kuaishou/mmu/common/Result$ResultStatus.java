package com.kuaishou.mmu.common.Result$ResultStatus;
import gn4.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.mmu.common.Result$ResultStatus$a;
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
import com.kuaishou.mmu.common.Result$ResultCode;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class Result$ResultStatus extends GeneratedMessageLite implements c	// class@000a0d
{
    public int code_;
    public String msg_;
    public static final Result$ResultStatus DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Result$ResultStatus resultStatus = new Result$ResultStatus();
       Result$ResultStatus.DEFAULT_INSTANCE = resultStatus;
       GeneratedMessageLite.registerDefaultInstance(Result$ResultStatus.class, resultStatus);
    }
    public void Result$ResultStatus(){
       super();
       this.msg_ = "";
    }
    public static Result$ResultStatus getDefaultInstance(){
       return Result$ResultStatus.DEFAULT_INSTANCE;
    }
    public static Result$ResultStatus$a newBuilder(){
       return Result$ResultStatus.DEFAULT_INSTANCE.createBuilder();
    }
    public static Result$ResultStatus$a newBuilder(Result$ResultStatus p0){
       return Result$ResultStatus.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Result$ResultStatus parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0);
    }
    public static Result$ResultStatus parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$ResultStatus parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0);
    }
    public static Result$ResultStatus parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$ResultStatus parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0);
    }
    public static Result$ResultStatus parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$ResultStatus parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0);
    }
    public static Result$ResultStatus parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$ResultStatus parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0);
    }
    public static Result$ResultStatus parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$ResultStatus parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0);
    }
    public static Result$ResultStatus parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$ResultStatus.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Result$ResultStatus.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearCode(){
       this.code_ = 0;
    }
    public void clearMsg(){
       this.msg_ = Result$ResultStatus.getDefaultInstance().getMsg();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new Result$ResultStatus();
           case 2:
             return new Result$ResultStatus$a(p2);
           case 3:
             Object[] objArray = new Object[]{"code_","msg_"};
             return GeneratedMessageLite.newMessageInfo(Result$ResultStatus.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x00", objArray);
           case 4:
             return Result$ResultStatus.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Result$ResultStatus.PARSER;
             if (pARSER == null) {
                _monitor_enter(Result$ResultStatus.class);
                pARSER = Result$ResultStatus.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Result$ResultStatus.DEFAULT_INSTANCE);
                   Result$ResultStatus.PARSER = pARSER;
                }
                _monitor_exit(Result$ResultStatus.class);
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
    public Result$ResultCode getCode(){
       Result$ResultCode resultCode = Result$ResultCode.forNumber(this.code_);
       if (resultCode == null) {
          resultCode = Result$ResultCode.UNRECOGNIZED;
       }
       return resultCode;
    }
    public int getCodeValue(){
       return this.code_;
    }
    public String getMsg(){
       return this.msg_;
    }
    public ByteString getMsgBytes(){
       return ByteString.copyFromUtf8(this.msg_);
    }
    public void setCode(Result$ResultCode p0){
       this.code_ = p0.getNumber();
    }
    public void setCodeValue(int p0){
       this.code_ = p0;
    }
    public void setMsg(String p0){
       Objects.requireNonNull(p0);
       this.msg_ = p0;
    }
    public void setMsgBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.msg_ = p0.toStringUtf8();
    }
}
