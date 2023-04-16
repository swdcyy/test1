package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotActionType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotActionType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotActionType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$SpeechRobotActionType extends Enum implements Internal$EnumLite	// class@000dbb
{
    public final int value;
    public static final StentorMMU$SpeechRobotActionType[] $VALUES;
    public static final StentorMMU$SpeechRobotActionType ACTION_CHAT_CHAT_PLAY;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_EXIT_PLAY;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_FUNCTION_CLOSE;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_FUNCTION_OPEN;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_MAX_VOLUME;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_MIN_VOLUME;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_PLAY_ON;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_PLAY_STOP;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_VOLUME_DOWN;
    public static final StentorMMU$SpeechRobotActionType ACTION_FUNCTION_VOLUME_UP;
    public static final StentorMMU$SpeechRobotActionType ACTION_JOKE_JOKE_PLAY;
    public static final StentorMMU$SpeechRobotActionType ACTION_MAGIC_MAGIC_CHANGE;
    public static final StentorMMU$SpeechRobotActionType ACTION_MAGIC_MAGIC_CLOSE;
    public static final StentorMMU$SpeechRobotActionType ACTION_MAGIC_MAGIC_OPEN;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_CHANGE_SONG;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_LAST_SONG;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_LIKE;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_NEXT_SONG;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_PLAY;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_PLAY_SINGER;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_PLAY_SINGER_SONG;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_PLAY_SONG;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_PLAY_STYLE;
    public static final StentorMMU$SpeechRobotActionType ACTION_MUSIC_UNLIKE;
    public static final StentorMMU$SpeechRobotActionType ACTION_PACKET_PACKET_OPEN;
    public static final StentorMMU$SpeechRobotActionType ACTION_PET_ACTION_OPEN;
    public static final StentorMMU$SpeechRobotActionType ACTION_PK_CASUAL_PK;
    public static final StentorMMU$SpeechRobotActionType ACTION_PK_CITY_PK;
    public static final StentorMMU$SpeechRobotActionType ACTION_PK_FRIEND_PK;
    public static final StentorMMU$SpeechRobotActionType ACTION_PK_TALENT_PK;
    public static final StentorMMU$SpeechRobotActionType ACTION_REPORT_BLACK_LIST;
    public static final StentorMMU$SpeechRobotActionType ACTION_STORY_STORY_LAY;
    public static final StentorMMU$SpeechRobotActionType ACTION_UNKNOWN;
    public static final StentorMMU$SpeechRobotActionType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$SpeechRobotActionType speechRobotA = new StentorMMU$SpeechRobotActionType("ACTION_UNKNOWN", 0, 0);
       StentorMMU$SpeechRobotActionType.ACTION_UNKNOWN = speechRobotA;
       StentorMMU$SpeechRobotActionType speechRobotA1 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_PLAY_SONG", 1, 1001);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY_SONG = speechRobotA1;
       StentorMMU$SpeechRobotActionType speechRobotA2 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_PLAY_SINGER", 2, 1002);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY_SINGER = speechRobotA2;
       StentorMMU$SpeechRobotActionType speechRobotA3 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_PLAY_STYLE", 3, 1003);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY_STYLE = speechRobotA3;
       StentorMMU$SpeechRobotActionType speechRobotA4 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_PLAY_SINGER_SONG", 4, 1004);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY_SINGER_SONG = speechRobotA4;
       StentorMMU$SpeechRobotActionType speechRobotA5 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_PLAY", 5, 1005);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY = speechRobotA5;
       StentorMMU$SpeechRobotActionType speechRobotA6 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_LIKE", 6, 1008);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_LIKE = speechRobotA6;
       StentorMMU$SpeechRobotActionType speechRobotA7 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_UNLIKE", 7, 1009);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_UNLIKE = speechRobotA7;
       StentorMMU$SpeechRobotActionType speechRobotA8 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_LAST_SONG", 8, 1013);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_LAST_SONG = speechRobotA8;
       StentorMMU$SpeechRobotActionType speechRobotA9 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_NEXT_SONG", 9, 1014);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_NEXT_SONG = speechRobotA9;
       StentorMMU$SpeechRobotActionType speechRobotA10 = new StentorMMU$SpeechRobotActionType("ACTION_MUSIC_CHANGE_SONG", 10, 1015);
       StentorMMU$SpeechRobotActionType.ACTION_MUSIC_CHANGE_SONG = speechRobotA10;
       StentorMMU$SpeechRobotActionType speechRobotA11 = new StentorMMU$SpeechRobotActionType("ACTION_PK_CASUAL_PK", 11, 2001);
       StentorMMU$SpeechRobotActionType.ACTION_PK_CASUAL_PK = speechRobotA11;
       StentorMMU$SpeechRobotActionType speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_PK_CITY_PK", 12, 2002);
       StentorMMU$SpeechRobotActionType.ACTION_PK_CITY_PK = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA13 = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_PK_FRIEND_PK", 13, 2003);
       StentorMMU$SpeechRobotActionType.ACTION_PK_FRIEND_PK = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA15 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_PK_TALENT_PK", 14, 2004);
       StentorMMU$SpeechRobotActionType.ACTION_PK_TALENT_PK = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA16 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_JOKE_JOKE_PLAY", 15, 3001);
       StentorMMU$SpeechRobotActionType.ACTION_JOKE_JOKE_PLAY = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA17 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_STORY_STORY_LAY", 16, 4001);
       StentorMMU$SpeechRobotActionType.ACTION_STORY_STORY_LAY = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA18 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_PACKET_PACKET_OPEN", 17, 5001);
       StentorMMU$SpeechRobotActionType.ACTION_PACKET_PACKET_OPEN = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA19 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_MAGIC_MAGIC_OPEN", 18, 6001);
       StentorMMU$SpeechRobotActionType.ACTION_MAGIC_MAGIC_OPEN = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA20 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_MAGIC_MAGIC_CLOSE", 19, 6002);
       StentorMMU$SpeechRobotActionType.ACTION_MAGIC_MAGIC_CLOSE = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA21 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_MAGIC_MAGIC_CHANGE", 20, 6003);
       StentorMMU$SpeechRobotActionType.ACTION_MAGIC_MAGIC_CHANGE = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA22 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_FUNCTION_OPEN", 21, 7001);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_FUNCTION_OPEN = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA23 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_FUNCTION_CLOSE", 22, 7002);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_FUNCTION_CLOSE = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA24 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_VOLUME_UP", 23, 7005);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_VOLUME_UP = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA25 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_VOLUME_DOWN", 24, 7006);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_VOLUME_DOWN = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA26 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_PLAY_STOP", 25, 7003);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_PLAY_STOP = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA27 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_PLAY_ON", 26, 7004);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_PLAY_ON = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA28 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_EXIT_PLAY", 27, 7007);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_EXIT_PLAY = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA29 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_MAX_VOLUME", 28, 7008);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_MAX_VOLUME = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA30 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_FUNCTION_MIN_VOLUME", 29, 7009);
       StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_MIN_VOLUME = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA31 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_CHAT_CHAT_PLAY", 30, 8001);
       StentorMMU$SpeechRobotActionType.ACTION_CHAT_CHAT_PLAY = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA32 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("ACTION_REPORT_BLACK_LIST", 31, 9001);
       StentorMMU$SpeechRobotActionType.ACTION_REPORT_BLACK_LIST = speechRobotA14;
       StentorMMU$SpeechRobotActionType speechRobotA33 = speechRobotA14;
       speechRobotA12 = new StentorMMU$SpeechRobotActionType("ACTION_PET_ACTION_OPEN", 32, 0x2711);
       StentorMMU$SpeechRobotActionType.ACTION_PET_ACTION_OPEN = speechRobotA12;
       StentorMMU$SpeechRobotActionType speechRobotA34 = speechRobotA12;
       speechRobotA14 = new StentorMMU$SpeechRobotActionType("UNRECOGNIZED", 33, -1);
       StentorMMU$SpeechRobotActionType.UNRECOGNIZED = speechRobotA14;
       StentorMMU$SpeechRobotActionType[] speechRobotA35 = new StentorMMU$SpeechRobotActionType[34];
       speechRobotA35[0] = speechRobotA;
       speechRobotA35[1] = speechRobotA1;
       speechRobotA35[2] = speechRobotA2;
       speechRobotA35[3] = speechRobotA3;
       speechRobotA35[4] = speechRobotA4;
       speechRobotA35[5] = speechRobotA5;
       speechRobotA35[6] = speechRobotA6;
       speechRobotA35[7] = speechRobotA7;
       speechRobotA35[8] = speechRobotA8;
       speechRobotA35[9] = speechRobotA9;
       speechRobotA35[10] = speechRobotA10;
       speechRobotA35[11] = speechRobotA11;
       speechRobotA35[12] = speechRobotA13;
       speechRobotA35[13] = speechRobotA15;
       speechRobotA35[14] = speechRobotA16;
       speechRobotA35[15] = speechRobotA17;
       speechRobotA35[16] = speechRobotA18;
       speechRobotA35[17] = speechRobotA19;
       speechRobotA35[18] = speechRobotA20;
       speechRobotA35[19] = speechRobotA21;
       speechRobotA35[20] = speechRobotA22;
       speechRobotA35[21] = speechRobotA23;
       speechRobotA35[22] = speechRobotA24;
       speechRobotA35[23] = speechRobotA25;
       speechRobotA35[24] = speechRobotA26;
       speechRobotA35[25] = speechRobotA27;
       speechRobotA35[26] = speechRobotA28;
       speechRobotA35[27] = speechRobotA29;
       speechRobotA35[28] = speechRobotA30;
       speechRobotA35[29] = speechRobotA31;
       speechRobotA35[30] = speechRobotA32;
       speechRobotA35[31] = speechRobotA33;
       speechRobotA35[32] = speechRobotA34;
       speechRobotA35[33] = speechRobotA14;
       StentorMMU$SpeechRobotActionType.$VALUES = speechRobotA35;
       StentorMMU$SpeechRobotActionType.internalValueMap = new StentorMMU$SpeechRobotActionType$a();
    }
    public void StentorMMU$SpeechRobotActionType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$SpeechRobotActionType forNumber(int p0){
       if (!p0) {
          return StentorMMU$SpeechRobotActionType.ACTION_UNKNOWN;
       }
       if (p0 == 3001) {
          return StentorMMU$SpeechRobotActionType.ACTION_JOKE_JOKE_PLAY;
       }
       if (p0 == 4001) {
          return StentorMMU$SpeechRobotActionType.ACTION_STORY_STORY_LAY;
       }
       if (p0 == 5001) {
          return StentorMMU$SpeechRobotActionType.ACTION_PACKET_PACKET_OPEN;
       }
       if (p0 == 8001) {
          return StentorMMU$SpeechRobotActionType.ACTION_CHAT_CHAT_PLAY;
       }
       if (p0 == 9001) {
          return StentorMMU$SpeechRobotActionType.ACTION_REPORT_BLACK_LIST;
       }
       if (p0 == 0x2711) {
          return StentorMMU$SpeechRobotActionType.ACTION_PET_ACTION_OPEN;
       }
       if (p0 == 1008) {
          return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_LIKE;
       }
       if (p0 == 1009) {
          return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_UNLIKE;
       }
       switch (p0){
           case 1001:
             return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY_SONG;
           case 1002:
             return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY_SINGER;
           case 1003:
             return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY_STYLE;
           case 1004:
             return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY_SINGER_SONG;
           case 1005:
             return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_PLAY;
           default:
             switch (p0){
                 case 1013:
                   return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_LAST_SONG;
                 case 1014:
                   return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_NEXT_SONG;
                 case 1015:
                   return StentorMMU$SpeechRobotActionType.ACTION_MUSIC_CHANGE_SONG;
                 default:
                   switch (p0){
                       case 2001:
                         return StentorMMU$SpeechRobotActionType.ACTION_PK_CASUAL_PK;
                       case 2002:
                         return StentorMMU$SpeechRobotActionType.ACTION_PK_CITY_PK;
                       case 2003:
                         return StentorMMU$SpeechRobotActionType.ACTION_PK_FRIEND_PK;
                       case 2004:
                         return StentorMMU$SpeechRobotActionType.ACTION_PK_TALENT_PK;
                       default:
                         switch (p0){
                             case 6001:
                               return StentorMMU$SpeechRobotActionType.ACTION_MAGIC_MAGIC_OPEN;
                             case 6002:
                               return StentorMMU$SpeechRobotActionType.ACTION_MAGIC_MAGIC_CLOSE;
                             case 6003:
                               return StentorMMU$SpeechRobotActionType.ACTION_MAGIC_MAGIC_CHANGE;
                             default:
                               switch (p0){
                                   case 7001:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_FUNCTION_OPEN;
                                   case 7002:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_FUNCTION_CLOSE;
                                   case 7003:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_PLAY_STOP;
                                   case 7004:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_PLAY_ON;
                                   case 7005:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_VOLUME_UP;
                                   case 7006:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_VOLUME_DOWN;
                                   case 7007:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_EXIT_PLAY;
                                   case 7008:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_MAX_VOLUME;
                                   case 7009:
                                     return StentorMMU$SpeechRobotActionType.ACTION_FUNCTION_MIN_VOLUME;
                                   default:
                                     return null;
                               }
                         }
                   }
             }
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$SpeechRobotActionType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$SpeechRobotActionType$b.a;
    }
    public static StentorMMU$SpeechRobotActionType valueOf(int p0){
       return StentorMMU$SpeechRobotActionType.forNumber(p0);
    }
    public static StentorMMU$SpeechRobotActionType valueOf(String p0){
       return Enum.valueOf(StentorMMU$SpeechRobotActionType.class, p0);
    }
    public static StentorMMU$SpeechRobotActionType[] values(){
       return StentorMMU$SpeechRobotActionType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$SpeechRobotActionType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
