package com.kuaishou.protobuf.livestream.stentor.StentorMMU$MusicActionType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$MusicActionType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$MusicActionType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$MusicActionType extends Enum implements Internal$EnumLite	// class@000d8f
{
    public final int value;
    public static final StentorMMU$MusicActionType[] $VALUES;
    public static final StentorMMU$MusicActionType MUSIC_ACTION_UNKNOWN;
    public static final StentorMMU$MusicActionType MUSIC_CANCLE_LIKE;
    public static final StentorMMU$MusicActionType MUSIC_LIKE;
    public static final StentorMMU$MusicActionType MUSIC_PLAY;
    public static final StentorMMU$MusicActionType MUSIC_PLAYBACK_START;
    public static final StentorMMU$MusicActionType MUSIC_PLAYBACK_STOP;
    public static final StentorMMU$MusicActionType MUSIC_PLAY_NEXT;
    public static final StentorMMU$MusicActionType MUSIC_QUIT;
    public static final StentorMMU$MusicActionType MUSIC_UNLIKE;
    public static final StentorMMU$MusicActionType MUSIC_VOLUME_DEC;
    public static final StentorMMU$MusicActionType MUSIC_VOLUME_INC;
    public static final StentorMMU$MusicActionType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$MusicActionType musicActionT = new StentorMMU$MusicActionType("MUSIC_ACTION_UNKNOWN", 0, 0);
       StentorMMU$MusicActionType.MUSIC_ACTION_UNKNOWN = musicActionT;
       StentorMMU$MusicActionType musicActionT1 = new StentorMMU$MusicActionType("MUSIC_PLAY", 1, 1);
       StentorMMU$MusicActionType.MUSIC_PLAY = musicActionT1;
       StentorMMU$MusicActionType musicActionT2 = new StentorMMU$MusicActionType("MUSIC_QUIT", 2, 2);
       StentorMMU$MusicActionType.MUSIC_QUIT = musicActionT2;
       StentorMMU$MusicActionType musicActionT3 = new StentorMMU$MusicActionType("MUSIC_PLAYBACK_START", 3, 3);
       StentorMMU$MusicActionType.MUSIC_PLAYBACK_START = musicActionT3;
       StentorMMU$MusicActionType musicActionT4 = new StentorMMU$MusicActionType("MUSIC_PLAYBACK_STOP", 4, 4);
       StentorMMU$MusicActionType.MUSIC_PLAYBACK_STOP = musicActionT4;
       StentorMMU$MusicActionType musicActionT5 = new StentorMMU$MusicActionType("MUSIC_LIKE", 5, 5);
       StentorMMU$MusicActionType.MUSIC_LIKE = musicActionT5;
       StentorMMU$MusicActionType musicActionT6 = new StentorMMU$MusicActionType("MUSIC_CANCLE_LIKE", 6, 6);
       StentorMMU$MusicActionType.MUSIC_CANCLE_LIKE = musicActionT6;
       StentorMMU$MusicActionType musicActionT7 = new StentorMMU$MusicActionType("MUSIC_UNLIKE", 7, 7);
       StentorMMU$MusicActionType.MUSIC_UNLIKE = musicActionT7;
       StentorMMU$MusicActionType musicActionT8 = new StentorMMU$MusicActionType("MUSIC_VOLUME_INC", 8, 8);
       StentorMMU$MusicActionType.MUSIC_VOLUME_INC = musicActionT8;
       StentorMMU$MusicActionType musicActionT9 = new StentorMMU$MusicActionType("MUSIC_VOLUME_DEC", 9, 9);
       StentorMMU$MusicActionType.MUSIC_VOLUME_DEC = musicActionT9;
       StentorMMU$MusicActionType musicActionT10 = new StentorMMU$MusicActionType("MUSIC_PLAY_NEXT", 10, 10);
       StentorMMU$MusicActionType.MUSIC_PLAY_NEXT = musicActionT10;
       StentorMMU$MusicActionType musicActionT11 = new StentorMMU$MusicActionType("UNRECOGNIZED", 11, -1);
       StentorMMU$MusicActionType.UNRECOGNIZED = musicActionT11;
       StentorMMU$MusicActionType[] musicActionT12 = new StentorMMU$MusicActionType[12];
       musicActionT12[0] = musicActionT;
       musicActionT12[1] = musicActionT1;
       musicActionT12[2] = musicActionT2;
       musicActionT12[3] = musicActionT3;
       musicActionT12[4] = musicActionT4;
       musicActionT12[5] = musicActionT5;
       musicActionT12[6] = musicActionT6;
       musicActionT12[7] = musicActionT7;
       musicActionT12[8] = musicActionT8;
       musicActionT12[9] = musicActionT9;
       musicActionT12[10] = musicActionT10;
       musicActionT12[11] = musicActionT11;
       StentorMMU$MusicActionType.$VALUES = musicActionT12;
       StentorMMU$MusicActionType.internalValueMap = new StentorMMU$MusicActionType$a();
    }
    public void StentorMMU$MusicActionType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$MusicActionType forNumber(int p0){
       switch (p0){
           case 0:
             return StentorMMU$MusicActionType.MUSIC_ACTION_UNKNOWN;
           case 1:
             return StentorMMU$MusicActionType.MUSIC_PLAY;
           case 2:
             return StentorMMU$MusicActionType.MUSIC_QUIT;
           case 3:
             return StentorMMU$MusicActionType.MUSIC_PLAYBACK_START;
           case 4:
             return StentorMMU$MusicActionType.MUSIC_PLAYBACK_STOP;
           case 5:
             return StentorMMU$MusicActionType.MUSIC_LIKE;
           case 6:
             return StentorMMU$MusicActionType.MUSIC_CANCLE_LIKE;
           case 7:
             return StentorMMU$MusicActionType.MUSIC_UNLIKE;
           case 8:
             return StentorMMU$MusicActionType.MUSIC_VOLUME_INC;
           case 9:
             return StentorMMU$MusicActionType.MUSIC_VOLUME_DEC;
           case 10:
             return StentorMMU$MusicActionType.MUSIC_PLAY_NEXT;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$MusicActionType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$MusicActionType$b.a;
    }
    public static StentorMMU$MusicActionType valueOf(int p0){
       return StentorMMU$MusicActionType.forNumber(p0);
    }
    public static StentorMMU$MusicActionType valueOf(String p0){
       return Enum.valueOf(StentorMMU$MusicActionType.class, p0);
    }
    public static StentorMMU$MusicActionType[] values(){
       return StentorMMU$MusicActionType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$MusicActionType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
