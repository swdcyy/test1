package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotMusicInfo;
import hr4.f;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotMusicInfo$a;
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
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlot;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import hr4.n;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$MusicActionType;

public final class StentorMMU$RobotMusicInfo extends GeneratedMessageLite implements f	// class@000d96
{
    public String musicList_;
    public String musicName_;
    public Internal$ProtobufList skillslots_;
    public int type_;
    public static final StentorMMU$RobotMusicInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RobotMusicInfo robotMusicIn = new StentorMMU$RobotMusicInfo();
       StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE = robotMusicIn;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RobotMusicInfo.class, robotMusicIn);
    }
    public void StentorMMU$RobotMusicInfo(){
       super();
       this.musicName_ = "";
       this.skillslots_ = GeneratedMessageLite.emptyProtobufList();
       this.musicList_ = "";
    }
    public static StentorMMU$RobotMusicInfo getDefaultInstance(){
       return StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RobotMusicInfo$a newBuilder(){
       return StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RobotMusicInfo$a newBuilder(StentorMMU$RobotMusicInfo p0){
       return StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RobotMusicInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotMusicInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RobotMusicInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllSkillslots(Iterable p0){
       this.ensureSkillslotsIsMutable();
       AbstractMessageLite.addAll(p0, this.skillslots_);
    }
    public void addSkillslots(int p0,StentorMMU$SkillSlot p1){
       Objects.requireNonNull(p1);
       this.ensureSkillslotsIsMutable();
       this.skillslots_.add(p0, p1);
    }
    public void addSkillslots(StentorMMU$SkillSlot p0){
       Objects.requireNonNull(p0);
       this.ensureSkillslotsIsMutable();
       this.skillslots_.add(p0);
    }
    public void clearMusicList(){
       this.musicList_ = StentorMMU$RobotMusicInfo.getDefaultInstance().getMusicList();
    }
    public void clearMusicName(){
       this.musicName_ = StentorMMU$RobotMusicInfo.getDefaultInstance().getMusicName();
    }
    public void clearSkillslots(){
       this.skillslots_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RobotMusicInfo();
           case 2:
             return new StentorMMU$RobotMusicInfo$a(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","musicName_","skillslots_",StentorMMU$SkillSlot.class,"musicList_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\f\x02\x02\x02\x03\x1b\x04\x02\x02\x00", objArray);
           case 4:
             return StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RobotMusicInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RobotMusicInfo.class);
                pARSER = StentorMMU$RobotMusicInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE);
                   StentorMMU$RobotMusicInfo.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RobotMusicInfo.class);
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
    public final void ensureSkillslotsIsMutable(){
       if (!this.skillslots_.isModifiable()) {
          this.skillslots_ = GeneratedMessageLite.mutableCopy(this.skillslots_);
       }
       return;
    }
    public String getMusicList(){
       return this.musicList_;
    }
    public ByteString getMusicListBytes(){
       return ByteString.copyFromUtf8(this.musicList_);
    }
    public String getMusicName(){
       return this.musicName_;
    }
    public ByteString getMusicNameBytes(){
       return ByteString.copyFromUtf8(this.musicName_);
    }
    public StentorMMU$SkillSlot getSkillslots(int p0){
       return this.skillslots_.get(p0);
    }
    public int getSkillslotsCount(){
       return this.skillslots_.size();
    }
    public List getSkillslotsList(){
       return this.skillslots_;
    }
    public n getSkillslotsOrBuilder(int p0){
       return this.skillslots_.get(p0);
    }
    public List getSkillslotsOrBuilderList(){
       return this.skillslots_;
    }
    public StentorMMU$MusicActionType getType(){
       StentorMMU$MusicActionType musicActionT = StentorMMU$MusicActionType.forNumber(this.type_);
       if (musicActionT == null) {
          musicActionT = StentorMMU$MusicActionType.UNRECOGNIZED;
       }
       return musicActionT;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void removeSkillslots(int p0){
       this.ensureSkillslotsIsMutable();
       this.skillslots_.remove(p0);
    }
    public void setMusicList(String p0){
       Objects.requireNonNull(p0);
       this.musicList_ = p0;
    }
    public void setMusicListBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.musicList_ = p0.toStringUtf8();
    }
    public void setMusicName(String p0){
       Objects.requireNonNull(p0);
       this.musicName_ = p0;
    }
    public void setMusicNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.musicName_ = p0.toStringUtf8();
    }
    public void setSkillslots(int p0,StentorMMU$SkillSlot p1){
       Objects.requireNonNull(p1);
       this.ensureSkillslotsIsMutable();
       this.skillslots_.set(p0, p1);
    }
    public void setType(StentorMMU$MusicActionType p0){
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
