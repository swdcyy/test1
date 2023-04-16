package com.kuaishou.protobuf.livestream.stentor.StentorMMU$Instruction;
import hr4.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$Instruction$a;
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
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotActionType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotSkillType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$Instruction extends GeneratedMessageLite implements c	// class@000d8a
{
    public int action_;
    public int skill_;
    public String slots_;
    public static final StentorMMU$Instruction DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$Instruction instruction = new StentorMMU$Instruction();
       StentorMMU$Instruction.DEFAULT_INSTANCE = instruction;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$Instruction.class, instruction);
    }
    public void StentorMMU$Instruction(){
       super();
       this.slots_ = "";
    }
    public static StentorMMU$Instruction getDefaultInstance(){
       return StentorMMU$Instruction.DEFAULT_INSTANCE;
    }
    public static StentorMMU$Instruction$a newBuilder(){
       return StentorMMU$Instruction.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$Instruction$a newBuilder(StentorMMU$Instruction p0){
       return StentorMMU$Instruction.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$Instruction parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$Instruction parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$Instruction parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$Instruction parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$Instruction parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$Instruction parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$Instruction parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$Instruction parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$Instruction parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$Instruction parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$Instruction parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$Instruction parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$Instruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$Instruction.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAction(){
       this.action_ = 0;
    }
    public void clearSkill(){
       this.skill_ = 0;
    }
    public void clearSlots(){
       this.slots_ = StentorMMU$Instruction.getDefaultInstance().getSlots();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$Instruction();
           case 2:
             return new StentorMMU$Instruction$a(p2);
           case 3:
             Object[] objArray = new Object[]{"skill_","action_","slots_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$Instruction.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\f\x03\x02\x02\x00", objArray);
           case 4:
             return StentorMMU$Instruction.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$Instruction.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$Instruction.class);
                pARSER = StentorMMU$Instruction.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$Instruction.DEFAULT_INSTANCE);
                   StentorMMU$Instruction.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$Instruction.class);
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
    public StentorMMU$SpeechRobotActionType getAction(){
       StentorMMU$SpeechRobotActionType speechRobotA = StentorMMU$SpeechRobotActionType.forNumber(this.action_);
       if (speechRobotA == null) {
          speechRobotA = StentorMMU$SpeechRobotActionType.UNRECOGNIZED;
       }
       return speechRobotA;
    }
    public int getActionValue(){
       return this.action_;
    }
    public StentorMMU$SpeechRobotSkillType getSkill(){
       StentorMMU$SpeechRobotSkillType speechRobotS = StentorMMU$SpeechRobotSkillType.forNumber(this.skill_);
       if (speechRobotS == null) {
          speechRobotS = StentorMMU$SpeechRobotSkillType.UNRECOGNIZED;
       }
       return speechRobotS;
    }
    public int getSkillValue(){
       return this.skill_;
    }
    public String getSlots(){
       return this.slots_;
    }
    public ByteString getSlotsBytes(){
       return ByteString.copyFromUtf8(this.slots_);
    }
    public void setAction(StentorMMU$SpeechRobotActionType p0){
       this.action_ = p0.getNumber();
    }
    public void setActionValue(int p0){
       this.action_ = p0;
    }
    public void setSkill(StentorMMU$SpeechRobotSkillType p0){
       this.skill_ = p0.getNumber();
    }
    public void setSkillValue(int p0){
       this.skill_ = p0;
    }
    public void setSlots(String p0){
       Objects.requireNonNull(p0);
       this.slots_ = p0;
    }
    public void setSlotsBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.slots_ = p0.toStringUtf8();
    }
}
