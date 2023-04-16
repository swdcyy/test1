package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlot;
import hr4.n;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlot$a;
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
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlotType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$SkillSlot extends GeneratedMessageLite implements n	// class@000db2
{
    public String text_;
    public int type_;
    public static final StentorMMU$SkillSlot DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$SkillSlot skillSlot = new StentorMMU$SkillSlot();
       StentorMMU$SkillSlot.DEFAULT_INSTANCE = skillSlot;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$SkillSlot.class, skillSlot);
    }
    public void StentorMMU$SkillSlot(){
       super();
       this.text_ = "";
    }
    public static StentorMMU$SkillSlot getDefaultInstance(){
       return StentorMMU$SkillSlot.DEFAULT_INSTANCE;
    }
    public static StentorMMU$SkillSlot$a newBuilder(){
       return StentorMMU$SkillSlot.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$SkillSlot$a newBuilder(StentorMMU$SkillSlot p0){
       return StentorMMU$SkillSlot.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$SkillSlot parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SkillSlot parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SkillSlot parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SkillSlot parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SkillSlot parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SkillSlot parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SkillSlot parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SkillSlot parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SkillSlot parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SkillSlot parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SkillSlot parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SkillSlot parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SkillSlot.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$SkillSlot.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearText(){
       this.text_ = StentorMMU$SkillSlot.getDefaultInstance().getText();
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$SkillSlot();
           case 2:
             return new StentorMMU$SkillSlot$a(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","text_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$SkillSlot.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x00", objArray);
           case 4:
             return StentorMMU$SkillSlot.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$SkillSlot.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$SkillSlot.class);
                pARSER = StentorMMU$SkillSlot.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$SkillSlot.DEFAULT_INSTANCE);
                   StentorMMU$SkillSlot.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$SkillSlot.class);
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
    public String getText(){
       return this.text_;
    }
    public ByteString getTextBytes(){
       return ByteString.copyFromUtf8(this.text_);
    }
    public StentorMMU$SkillSlotType getType(){
       StentorMMU$SkillSlotType skillSlotTyp = StentorMMU$SkillSlotType.forNumber(this.type_);
       if (skillSlotTyp == null) {
          skillSlotTyp = StentorMMU$SkillSlotType.UNRECOGNIZED;
       }
       return skillSlotTyp;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void setText(String p0){
       Objects.requireNonNull(p0);
       this.text_ = p0;
    }
    public void setTextBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.text_ = p0.toStringUtf8();
    }
    public void setType(StentorMMU$SkillSlotType p0){
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
