package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotInstruction;
import hr4.e;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotInstruction$a;
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
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotMusicInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotPkInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillType;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotMusicInfo$a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotPkInfo$a;

public final class StentorMMU$RobotInstruction extends GeneratedMessageLite implements e	// class@000d94
{
    public StentorMMU$RobotMusicInfo musicInfo_;
    public StentorMMU$RobotPkInfo pkInfo_;
    public int skillType_;
    public static final StentorMMU$RobotInstruction DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RobotInstruction robotInstruc = new StentorMMU$RobotInstruction();
       StentorMMU$RobotInstruction.DEFAULT_INSTANCE = robotInstruc;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RobotInstruction.class, robotInstruc);
    }
    public void StentorMMU$RobotInstruction(){
       super();
    }
    public static StentorMMU$RobotInstruction getDefaultInstance(){
       return StentorMMU$RobotInstruction.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RobotInstruction$a newBuilder(){
       return StentorMMU$RobotInstruction.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RobotInstruction$a newBuilder(StentorMMU$RobotInstruction p0){
       return StentorMMU$RobotInstruction.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RobotInstruction parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotInstruction parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotInstruction parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotInstruction parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotInstruction parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotInstruction parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotInstruction parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotInstruction parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotInstruction parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotInstruction parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotInstruction parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotInstruction parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RobotInstruction.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearMusicInfo(){
       this.musicInfo_ = null;
    }
    public void clearPkInfo(){
       this.pkInfo_ = null;
    }
    public void clearSkillType(){
       this.skillType_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RobotInstruction();
           case 2:
             return new StentorMMU$RobotInstruction$a(p2);
           case 3:
             Object[] objArray = new Object[]{"skillType_","musicInfo_","pkInfo_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RobotInstruction.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\t\x03\t\x00", objArray);
           case 4:
             return StentorMMU$RobotInstruction.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RobotInstruction.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RobotInstruction.class);
                pARSER = StentorMMU$RobotInstruction.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RobotInstruction.DEFAULT_INSTANCE);
                   StentorMMU$RobotInstruction.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RobotInstruction.class);
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
    public StentorMMU$RobotMusicInfo getMusicInfo(){
       StentorMMU$RobotInstruction tmusicInfo_ = this.musicInfo_;
       if (tmusicInfo_ == null) {
          tmusicInfo_ = StentorMMU$RobotMusicInfo.getDefaultInstance();
       }
       return tmusicInfo_;
    }
    public StentorMMU$RobotPkInfo getPkInfo(){
       StentorMMU$RobotInstruction tpkInfo_ = this.pkInfo_;
       if (tpkInfo_ == null) {
          tpkInfo_ = StentorMMU$RobotPkInfo.getDefaultInstance();
       }
       return tpkInfo_;
    }
    public StentorMMU$SkillType getSkillType(){
       StentorMMU$SkillType skillType = StentorMMU$SkillType.forNumber(this.skillType_);
       if (skillType == null) {
          skillType = StentorMMU$SkillType.UNRECOGNIZED;
       }
       return skillType;
    }
    public int getSkillTypeValue(){
       return this.skillType_;
    }
    public boolean hasMusicInfo(){
       boolean b = (this.musicInfo_ != null)? true: false;
       return b;
    }
    public boolean hasPkInfo(){
       boolean b = (this.pkInfo_ != null)? true: false;
       return b;
    }
    public void mergeMusicInfo(StentorMMU$RobotMusicInfo p0){
       Objects.requireNonNull(p0);
       StentorMMU$RobotInstruction tmusicInfo_ = this.musicInfo_;
       this.musicInfo_ = (tmusicInfo_ != null && tmusicInfo_ != StentorMMU$RobotMusicInfo.getDefaultInstance())? StentorMMU$RobotMusicInfo.newBuilder(this.musicInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePkInfo(StentorMMU$RobotPkInfo p0){
       Objects.requireNonNull(p0);
       StentorMMU$RobotInstruction tpkInfo_ = this.pkInfo_;
       this.pkInfo_ = (tpkInfo_ != null && tpkInfo_ != StentorMMU$RobotPkInfo.getDefaultInstance())? StentorMMU$RobotPkInfo.newBuilder(this.pkInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setMusicInfo(StentorMMU$RobotMusicInfo p0){
       Objects.requireNonNull(p0);
       this.musicInfo_ = p0;
    }
    public void setPkInfo(StentorMMU$RobotPkInfo p0){
       Objects.requireNonNull(p0);
       this.pkInfo_ = p0;
    }
    public void setSkillType(StentorMMU$SkillType p0){
       this.skillType_ = p0.getNumber();
    }
    public void setSkillTypeValue(int p0){
       this.skillType_ = p0;
    }
}
