package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotSkillType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotSkillType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotSkillType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$SpeechRobotSkillType extends Enum implements Internal$EnumLite	// class@000dc7
{
    public final int value;
    public static final StentorMMU$SpeechRobotSkillType[] $VALUES;
    public static final StentorMMU$SpeechRobotSkillType SKILL_CHAT;
    public static final StentorMMU$SpeechRobotSkillType SKILL_FUNCTION;
    public static final StentorMMU$SpeechRobotSkillType SKILL_JOKE;
    public static final StentorMMU$SpeechRobotSkillType SKILL_MAGIC;
    public static final StentorMMU$SpeechRobotSkillType SKILL_MUSIC;
    public static final StentorMMU$SpeechRobotSkillType SKILL_PACKET;
    public static final StentorMMU$SpeechRobotSkillType SKILL_PET;
    public static final StentorMMU$SpeechRobotSkillType SKILL_PK;
    public static final StentorMMU$SpeechRobotSkillType SKILL_REPORT;
    public static final StentorMMU$SpeechRobotSkillType SKILL_STORY;
    public static final StentorMMU$SpeechRobotSkillType SKILL_UNKNOWN;
    public static final StentorMMU$SpeechRobotSkillType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$SpeechRobotSkillType speechRobotS = new StentorMMU$SpeechRobotSkillType("SKILL_UNKNOWN", 0, 0);
       StentorMMU$SpeechRobotSkillType.SKILL_UNKNOWN = speechRobotS;
       StentorMMU$SpeechRobotSkillType speechRobotS1 = new StentorMMU$SpeechRobotSkillType("SKILL_MUSIC", 1, 1);
       StentorMMU$SpeechRobotSkillType.SKILL_MUSIC = speechRobotS1;
       StentorMMU$SpeechRobotSkillType speechRobotS2 = new StentorMMU$SpeechRobotSkillType("SKILL_PK", 2, 2);
       StentorMMU$SpeechRobotSkillType.SKILL_PK = speechRobotS2;
       StentorMMU$SpeechRobotSkillType speechRobotS3 = new StentorMMU$SpeechRobotSkillType("SKILL_JOKE", 3, 3);
       StentorMMU$SpeechRobotSkillType.SKILL_JOKE = speechRobotS3;
       StentorMMU$SpeechRobotSkillType speechRobotS4 = new StentorMMU$SpeechRobotSkillType("SKILL_STORY", 4, 4);
       StentorMMU$SpeechRobotSkillType.SKILL_STORY = speechRobotS4;
       StentorMMU$SpeechRobotSkillType speechRobotS5 = new StentorMMU$SpeechRobotSkillType("SKILL_PACKET", 5, 5);
       StentorMMU$SpeechRobotSkillType.SKILL_PACKET = speechRobotS5;
       StentorMMU$SpeechRobotSkillType speechRobotS6 = new StentorMMU$SpeechRobotSkillType("SKILL_MAGIC", 6, 6);
       StentorMMU$SpeechRobotSkillType.SKILL_MAGIC = speechRobotS6;
       StentorMMU$SpeechRobotSkillType speechRobotS7 = new StentorMMU$SpeechRobotSkillType("SKILL_FUNCTION", 7, 7);
       StentorMMU$SpeechRobotSkillType.SKILL_FUNCTION = speechRobotS7;
       StentorMMU$SpeechRobotSkillType speechRobotS8 = new StentorMMU$SpeechRobotSkillType("SKILL_CHAT", 8, 8);
       StentorMMU$SpeechRobotSkillType.SKILL_CHAT = speechRobotS8;
       StentorMMU$SpeechRobotSkillType speechRobotS9 = new StentorMMU$SpeechRobotSkillType("SKILL_REPORT", 9, 9);
       StentorMMU$SpeechRobotSkillType.SKILL_REPORT = speechRobotS9;
       StentorMMU$SpeechRobotSkillType speechRobotS10 = new StentorMMU$SpeechRobotSkillType("SKILL_PET", 10, 10);
       StentorMMU$SpeechRobotSkillType.SKILL_PET = speechRobotS10;
       StentorMMU$SpeechRobotSkillType speechRobotS11 = new StentorMMU$SpeechRobotSkillType("UNRECOGNIZED", 11, -1);
       StentorMMU$SpeechRobotSkillType.UNRECOGNIZED = speechRobotS11;
       StentorMMU$SpeechRobotSkillType[] speechRobotS12 = new StentorMMU$SpeechRobotSkillType[12];
       speechRobotS12[0] = speechRobotS;
       speechRobotS12[1] = speechRobotS1;
       speechRobotS12[2] = speechRobotS2;
       speechRobotS12[3] = speechRobotS3;
       speechRobotS12[4] = speechRobotS4;
       speechRobotS12[5] = speechRobotS5;
       speechRobotS12[6] = speechRobotS6;
       speechRobotS12[7] = speechRobotS7;
       speechRobotS12[8] = speechRobotS8;
       speechRobotS12[9] = speechRobotS9;
       speechRobotS12[10] = speechRobotS10;
       speechRobotS12[11] = speechRobotS11;
       StentorMMU$SpeechRobotSkillType.$VALUES = speechRobotS12;
       StentorMMU$SpeechRobotSkillType.internalValueMap = new StentorMMU$SpeechRobotSkillType$a();
    }
    public void StentorMMU$SpeechRobotSkillType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$SpeechRobotSkillType forNumber(int p0){
       switch (p0){
           case 0:
             return StentorMMU$SpeechRobotSkillType.SKILL_UNKNOWN;
           case 1:
             return StentorMMU$SpeechRobotSkillType.SKILL_MUSIC;
           case 2:
             return StentorMMU$SpeechRobotSkillType.SKILL_PK;
           case 3:
             return StentorMMU$SpeechRobotSkillType.SKILL_JOKE;
           case 4:
             return StentorMMU$SpeechRobotSkillType.SKILL_STORY;
           case 5:
             return StentorMMU$SpeechRobotSkillType.SKILL_PACKET;
           case 6:
             return StentorMMU$SpeechRobotSkillType.SKILL_MAGIC;
           case 7:
             return StentorMMU$SpeechRobotSkillType.SKILL_FUNCTION;
           case 8:
             return StentorMMU$SpeechRobotSkillType.SKILL_CHAT;
           case 9:
             return StentorMMU$SpeechRobotSkillType.SKILL_REPORT;
           case 10:
             return StentorMMU$SpeechRobotSkillType.SKILL_PET;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$SpeechRobotSkillType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$SpeechRobotSkillType$b.a;
    }
    public static StentorMMU$SpeechRobotSkillType valueOf(int p0){
       return StentorMMU$SpeechRobotSkillType.forNumber(p0);
    }
    public static StentorMMU$SpeechRobotSkillType valueOf(String p0){
       return Enum.valueOf(StentorMMU$SpeechRobotSkillType.class, p0);
    }
    public static StentorMMU$SpeechRobotSkillType[] values(){
       return StentorMMU$SpeechRobotSkillType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$SpeechRobotSkillType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
