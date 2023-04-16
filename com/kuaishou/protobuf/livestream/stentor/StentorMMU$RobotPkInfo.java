package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotPkInfo;
import hr4.g;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotPkInfo$a;
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
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$PKActionType;

public final class StentorMMU$RobotPkInfo extends GeneratedMessageLite implements g	// class@000d98
{
    public int type_;
    public static final StentorMMU$RobotPkInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RobotPkInfo robotPkInfo = new StentorMMU$RobotPkInfo();
       StentorMMU$RobotPkInfo.DEFAULT_INSTANCE = robotPkInfo;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RobotPkInfo.class, robotPkInfo);
    }
    public void StentorMMU$RobotPkInfo(){
       super();
    }
    public static StentorMMU$RobotPkInfo getDefaultInstance(){
       return StentorMMU$RobotPkInfo.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RobotPkInfo$a newBuilder(){
       return StentorMMU$RobotPkInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RobotPkInfo$a newBuilder(StentorMMU$RobotPkInfo p0){
       return StentorMMU$RobotPkInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RobotPkInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotPkInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotPkInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotPkInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotPkInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotPkInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotPkInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotPkInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotPkInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotPkInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotPkInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotPkInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RobotPkInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RobotPkInfo();
           case 2:
             return new StentorMMU$RobotPkInfo$a(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "type_";
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x00", objArray);
           case 4:
             return StentorMMU$RobotPkInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RobotPkInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RobotPkInfo.class);
                pARSER = StentorMMU$RobotPkInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RobotPkInfo.DEFAULT_INSTANCE);
                   StentorMMU$RobotPkInfo.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RobotPkInfo.class);
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
    public StentorMMU$PKActionType getType(){
       StentorMMU$PKActionType pKActionType = StentorMMU$PKActionType.forNumber(this.type_);
       if (pKActionType == null) {
          pKActionType = StentorMMU$PKActionType.UNRECOGNIZED;
       }
       return pKActionType;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void setType(StentorMMU$PKActionType p0){
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
