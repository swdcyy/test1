package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtNLUResponse;
import hr4.h;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtNLUResponse$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$Instruction;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$Instruction$a;

public final class StentorMMU$RtNLUResponse extends GeneratedMessageLite implements h	// class@000da0
{
    public StentorMMU$Instruction instruction_;
    public static final StentorMMU$RtNLUResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RtNLUResponse rtNLURespons = new StentorMMU$RtNLUResponse();
       StentorMMU$RtNLUResponse.DEFAULT_INSTANCE = rtNLURespons;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RtNLUResponse.class, rtNLURespons);
    }
    public void StentorMMU$RtNLUResponse(){
       super();
    }
    public static StentorMMU$RtNLUResponse getDefaultInstance(){
       return StentorMMU$RtNLUResponse.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RtNLUResponse$a newBuilder(){
       return StentorMMU$RtNLUResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RtNLUResponse$a newBuilder(StentorMMU$RtNLUResponse p0){
       return StentorMMU$RtNLUResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RtNLUResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtNLUResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtNLUResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtNLUResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtNLUResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtNLUResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtNLUResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtNLUResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtNLUResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtNLUResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtNLUResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtNLUResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RtNLUResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearInstruction(){
       this.instruction_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RtNLUResponse();
           case 2:
             return new StentorMMU$RtNLUResponse$a(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "instruction_";
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x00", objArray);
           case 4:
             return StentorMMU$RtNLUResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RtNLUResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RtNLUResponse.class);
                pARSER = StentorMMU$RtNLUResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RtNLUResponse.DEFAULT_INSTANCE);
                   StentorMMU$RtNLUResponse.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RtNLUResponse.class);
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
    public StentorMMU$Instruction getInstruction(){
       StentorMMU$RtNLUResponse tinstruction = this.instruction_;
       if (tinstruction == null) {
          tinstruction = StentorMMU$Instruction.getDefaultInstance();
       }
       return tinstruction;
    }
    public boolean hasInstruction(){
       boolean b = (this.instruction_ != null)? true: false;
       return b;
    }
    public void mergeInstruction(StentorMMU$Instruction p0){
       Objects.requireNonNull(p0);
       StentorMMU$RtNLUResponse tinstruction = this.instruction_;
       this.instruction_ = (tinstruction != null && tinstruction != StentorMMU$Instruction.getDefaultInstance())? StentorMMU$Instruction.newBuilder(this.instruction_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setInstruction(StentorMMU$Instruction p0){
       Objects.requireNonNull(p0);
       this.instruction_ = p0;
    }
}
