package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$SkillType extends Enum implements Internal$EnumLite	// class@000db8
{
    public final int value;
    public static final StentorMMU$SkillType[] $VALUES;
    public static final StentorMMU$SkillType MUSIC;
    public static final StentorMMU$SkillType PK;
    public static final StentorMMU$SkillType SKILL_TYPE_UNKNOWN;
    public static final StentorMMU$SkillType UNKNOWN_SKILL;
    public static final StentorMMU$SkillType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$SkillType skillType = new StentorMMU$SkillType("SKILL_TYPE_UNKNOWN", 0, 0);
       StentorMMU$SkillType.SKILL_TYPE_UNKNOWN = skillType;
       StentorMMU$SkillType skillType1 = new StentorMMU$SkillType("MUSIC", 1, 1);
       StentorMMU$SkillType.MUSIC = skillType1;
       StentorMMU$SkillType skillType2 = new StentorMMU$SkillType("PK", 2, 2);
       StentorMMU$SkillType.PK = skillType2;
       StentorMMU$SkillType skillType3 = new StentorMMU$SkillType("UNKNOWN_SKILL", 3, 3);
       StentorMMU$SkillType.UNKNOWN_SKILL = skillType3;
       StentorMMU$SkillType skillType4 = new StentorMMU$SkillType("UNRECOGNIZED", 4, -1);
       StentorMMU$SkillType.UNRECOGNIZED = skillType4;
       StentorMMU$SkillType[] skillTypeArr = new StentorMMU$SkillType[]{skillType,skillType1,skillType2,skillType3,skillType4};
       StentorMMU$SkillType.$VALUES = skillTypeArr;
       StentorMMU$SkillType.internalValueMap = new StentorMMU$SkillType$a();
    }
    public void StentorMMU$SkillType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$SkillType forNumber(int p0){
       if (!p0) {
          return StentorMMU$SkillType.SKILL_TYPE_UNKNOWN;
       }
       if (p0 == 1) {
          return StentorMMU$SkillType.MUSIC;
       }
       if (p0 == 2) {
          return StentorMMU$SkillType.PK;
       }
       if (p0 != 3) {
          return null;
       }
       return StentorMMU$SkillType.UNKNOWN_SKILL;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$SkillType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$SkillType$b.a;
    }
    public static StentorMMU$SkillType valueOf(int p0){
       return StentorMMU$SkillType.forNumber(p0);
    }
    public static StentorMMU$SkillType valueOf(String p0){
       return Enum.valueOf(StentorMMU$SkillType.class, p0);
    }
    public static StentorMMU$SkillType[] values(){
       return StentorMMU$SkillType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$SkillType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
