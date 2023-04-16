package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlotType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlotType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlotType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$SkillSlotType extends Enum implements Internal$EnumLite	// class@000db5
{
    public final int value;
    public static final StentorMMU$SkillSlotType[] $VALUES;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_CANCLE_LIKE;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_LIKE;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_PLAYBACK_START;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_PLAY_SINGER;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_PLAY_SONG;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_PLAY_TAG;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_STOP;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_UNLIKE;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_VOLUME_DEC;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_MUSIC_VOLUME_INC;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_PK_FRIEND;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_PK_RANDOM;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_PK_SAME_CITY;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_PK_TALENT;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_ROBOT_MUSIC_PLAT_NEXT;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_ROBOT_MUSIC_PLAYBACK_START;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_ROBOT_MUSIC_PLAYBACK_STOP;
    public static final StentorMMU$SkillSlotType SKILL_SLOT_UNKNOWN_TYPE;
    public static final StentorMMU$SkillSlotType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$SkillSlotType skillSlotTyp = new StentorMMU$SkillSlotType("SKILL_SLOT_UNKNOWN_TYPE", 0, 0);
       StentorMMU$SkillSlotType.SKILL_SLOT_UNKNOWN_TYPE = skillSlotTyp;
       StentorMMU$SkillSlotType skillSlotTyp1 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_PLAY_SONG", 1, 1);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_PLAY_SONG = skillSlotTyp1;
       StentorMMU$SkillSlotType skillSlotTyp2 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_PLAY_SINGER", 2, 2);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_PLAY_SINGER = skillSlotTyp2;
       StentorMMU$SkillSlotType skillSlotTyp3 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_PLAY_TAG", 3, 3);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_PLAY_TAG = skillSlotTyp3;
       StentorMMU$SkillSlotType skillSlotTyp4 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_STOP", 4, 4);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_STOP = skillSlotTyp4;
       StentorMMU$SkillSlotType skillSlotTyp5 = new StentorMMU$SkillSlotType("SKILL_SLOT_PK_SAME_CITY", 5, 5);
       StentorMMU$SkillSlotType.SKILL_SLOT_PK_SAME_CITY = skillSlotTyp5;
       StentorMMU$SkillSlotType skillSlotTyp6 = new StentorMMU$SkillSlotType("SKILL_SLOT_PK_FRIEND", 6, 6);
       StentorMMU$SkillSlotType.SKILL_SLOT_PK_FRIEND = skillSlotTyp6;
       StentorMMU$SkillSlotType skillSlotTyp7 = new StentorMMU$SkillSlotType("SKILL_SLOT_PK_RANDOM", 7, 7);
       StentorMMU$SkillSlotType.SKILL_SLOT_PK_RANDOM = skillSlotTyp7;
       StentorMMU$SkillSlotType skillSlotTyp8 = new StentorMMU$SkillSlotType("SKILL_SLOT_PK_TALENT", 8, 8);
       StentorMMU$SkillSlotType.SKILL_SLOT_PK_TALENT = skillSlotTyp8;
       StentorMMU$SkillSlotType skillSlotTyp9 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_LIKE", 9, 9);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_LIKE = skillSlotTyp9;
       StentorMMU$SkillSlotType skillSlotTyp10 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_CANCLE_LIKE", 10, 10);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_CANCLE_LIKE = skillSlotTyp10;
       StentorMMU$SkillSlotType skillSlotTyp11 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_UNLIKE", 11, 11);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_UNLIKE = skillSlotTyp11;
       StentorMMU$SkillSlotType skillSlotTyp12 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_PLAYBACK_START", 12, 12);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_PLAYBACK_START = skillSlotTyp12;
       StentorMMU$SkillSlotType skillSlotTyp13 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_VOLUME_INC", 13, 13);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_VOLUME_INC = skillSlotTyp13;
       StentorMMU$SkillSlotType skillSlotTyp14 = skillSlotTyp13;
       StentorMMU$SkillSlotType skillSlotTyp15 = new StentorMMU$SkillSlotType("SKILL_SLOT_MUSIC_VOLUME_DEC", 14, 14);
       StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_VOLUME_DEC = skillSlotTyp15;
       StentorMMU$SkillSlotType skillSlotTyp16 = skillSlotTyp15;
       StentorMMU$SkillSlotType skillSlotTyp17 = new StentorMMU$SkillSlotType("SKILL_SLOT_ROBOT_MUSIC_PLAYBACK_START", 15, 15);
       StentorMMU$SkillSlotType.SKILL_SLOT_ROBOT_MUSIC_PLAYBACK_START = skillSlotTyp17;
       StentorMMU$SkillSlotType skillSlotTyp18 = skillSlotTyp17;
       skillSlotTyp13 = new StentorMMU$SkillSlotType("SKILL_SLOT_ROBOT_MUSIC_PLAYBACK_STOP", 16, 16);
       StentorMMU$SkillSlotType.SKILL_SLOT_ROBOT_MUSIC_PLAYBACK_STOP = skillSlotTyp13;
       StentorMMU$SkillSlotType skillSlotTyp19 = skillSlotTyp13;
       skillSlotTyp15 = new StentorMMU$SkillSlotType("SKILL_SLOT_ROBOT_MUSIC_PLAT_NEXT", 17, 17);
       StentorMMU$SkillSlotType.SKILL_SLOT_ROBOT_MUSIC_PLAT_NEXT = skillSlotTyp15;
       StentorMMU$SkillSlotType skillSlotTyp20 = skillSlotTyp15;
       StentorMMU$SkillSlotType skillSlotTyp21 = skillSlotTyp12;
       skillSlotTyp17 = new StentorMMU$SkillSlotType("UNRECOGNIZED", 18, -1);
       StentorMMU$SkillSlotType.UNRECOGNIZED = skillSlotTyp17;
       StentorMMU$SkillSlotType[] skillSlotTyp22 = new StentorMMU$SkillSlotType[19];
       skillSlotTyp22[0] = skillSlotTyp;
       skillSlotTyp22[1] = skillSlotTyp1;
       skillSlotTyp22[2] = skillSlotTyp2;
       skillSlotTyp22[3] = skillSlotTyp3;
       skillSlotTyp22[4] = skillSlotTyp4;
       skillSlotTyp22[5] = skillSlotTyp5;
       skillSlotTyp22[6] = skillSlotTyp6;
       skillSlotTyp22[7] = skillSlotTyp7;
       skillSlotTyp22[8] = skillSlotTyp8;
       skillSlotTyp22[9] = skillSlotTyp9;
       skillSlotTyp22[10] = skillSlotTyp10;
       skillSlotTyp22[11] = skillSlotTyp11;
       skillSlotTyp22[12] = skillSlotTyp21;
       skillSlotTyp22[13] = skillSlotTyp14;
       skillSlotTyp22[14] = skillSlotTyp16;
       skillSlotTyp22[15] = skillSlotTyp18;
       skillSlotTyp22[16] = skillSlotTyp19;
       skillSlotTyp22[17] = skillSlotTyp20;
       skillSlotTyp22[18] = skillSlotTyp17;
       StentorMMU$SkillSlotType.$VALUES = skillSlotTyp22;
       StentorMMU$SkillSlotType.internalValueMap = new StentorMMU$SkillSlotType$a();
    }
    public void StentorMMU$SkillSlotType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$SkillSlotType forNumber(int p0){
       switch (p0){
           case 0:
             return StentorMMU$SkillSlotType.SKILL_SLOT_UNKNOWN_TYPE;
           case 1:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_PLAY_SONG;
           case 2:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_PLAY_SINGER;
           case 3:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_PLAY_TAG;
           case 4:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_STOP;
           case 5:
             return StentorMMU$SkillSlotType.SKILL_SLOT_PK_SAME_CITY;
           case 6:
             return StentorMMU$SkillSlotType.SKILL_SLOT_PK_FRIEND;
           case 7:
             return StentorMMU$SkillSlotType.SKILL_SLOT_PK_RANDOM;
           case 8:
             return StentorMMU$SkillSlotType.SKILL_SLOT_PK_TALENT;
           case 9:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_LIKE;
           case 10:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_CANCLE_LIKE;
           case 11:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_UNLIKE;
           case 12:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_PLAYBACK_START;
           case 13:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_VOLUME_INC;
           case 14:
             return StentorMMU$SkillSlotType.SKILL_SLOT_MUSIC_VOLUME_DEC;
           case 15:
             return StentorMMU$SkillSlotType.SKILL_SLOT_ROBOT_MUSIC_PLAYBACK_START;
           case 16:
             return StentorMMU$SkillSlotType.SKILL_SLOT_ROBOT_MUSIC_PLAYBACK_STOP;
           case 17:
             return StentorMMU$SkillSlotType.SKILL_SLOT_ROBOT_MUSIC_PLAT_NEXT;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$SkillSlotType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$SkillSlotType$b.a;
    }
    public static StentorMMU$SkillSlotType valueOf(int p0){
       return StentorMMU$SkillSlotType.forNumber(p0);
    }
    public static StentorMMU$SkillSlotType valueOf(String p0){
       return Enum.valueOf(StentorMMU$SkillSlotType.class, p0);
    }
    public static StentorMMU$SkillSlotType[] values(){
       return StentorMMU$SkillSlotType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$SkillSlotType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
