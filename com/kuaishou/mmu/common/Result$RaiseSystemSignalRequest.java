package com.kuaishou.mmu.common.Result$RaiseSystemSignalRequest;
import gn4.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.mmu.common.Result$RaiseSystemSignalRequest$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import gn4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Result$RaiseSystemSignalRequest extends GeneratedMessageLite implements b	// class@000a08
{
    public int signal_;
    public static final Result$RaiseSystemSignalRequest DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Result$RaiseSystemSignalRequest raiseSystemS = new Result$RaiseSystemSignalRequest();
       Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE = raiseSystemS;
       GeneratedMessageLite.registerDefaultInstance(Result$RaiseSystemSignalRequest.class, raiseSystemS);
    }
    public void Result$RaiseSystemSignalRequest(){
       super();
    }
    public static Result$RaiseSystemSignalRequest getDefaultInstance(){
       return Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE;
    }
    public static Result$RaiseSystemSignalRequest$a newBuilder(){
       return Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static Result$RaiseSystemSignalRequest$a newBuilder(Result$RaiseSystemSignalRequest p0){
       return Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Result$RaiseSystemSignalRequest parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0);
    }
    public static Result$RaiseSystemSignalRequest parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0);
    }
    public static Result$RaiseSystemSignalRequest parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearSignal(){
       this.signal_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new Result$RaiseSystemSignalRequest();
           case 2:
             return new Result$RaiseSystemSignalRequest$a(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "signal_";
             return GeneratedMessageLite.newMessageInfo(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x00", objArray);
           case 4:
             return Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Result$RaiseSystemSignalRequest.PARSER;
             if (pARSER == null) {
                _monitor_enter(Result$RaiseSystemSignalRequest.class);
                pARSER = Result$RaiseSystemSignalRequest.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Result$RaiseSystemSignalRequest.DEFAULT_INSTANCE);
                   Result$RaiseSystemSignalRequest.PARSER = pARSER;
                }
                _monitor_exit(Result$RaiseSystemSignalRequest.class);
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
    public int getSignal(){
       return this.signal_;
    }
    public void setSignal(int p0){
       this.signal_ = p0;
    }
}
