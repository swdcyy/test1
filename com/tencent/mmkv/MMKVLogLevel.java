package com.tencent.mmkv.MMKVLogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MMKVLogLevel extends Enum	// class@000fe1
{
    public static final MMKVLogLevel[] $VALUES;
    public static final MMKVLogLevel LevelDebug;
    public static final MMKVLogLevel LevelError;
    public static final MMKVLogLevel LevelInfo;
    public static final MMKVLogLevel LevelNone;
    public static final MMKVLogLevel LevelWarning;

    static {
       MMKVLogLevel mMKVLogLevel = new MMKVLogLevel("LevelDebug", 0);
       MMKVLogLevel.LevelDebug = mMKVLogLevel;
       MMKVLogLevel mMKVLogLevel1 = new MMKVLogLevel("LevelInfo", 1);
       MMKVLogLevel.LevelInfo = mMKVLogLevel1;
       MMKVLogLevel mMKVLogLevel2 = new MMKVLogLevel("LevelWarning", 2);
       MMKVLogLevel.LevelWarning = mMKVLogLevel2;
       MMKVLogLevel mMKVLogLevel3 = new MMKVLogLevel("LevelError", 3);
       MMKVLogLevel.LevelError = mMKVLogLevel3;
       MMKVLogLevel mMKVLogLevel4 = new MMKVLogLevel("LevelNone", 4);
       MMKVLogLevel.LevelNone = mMKVLogLevel4;
       MMKVLogLevel[] mMKVLogLevel5 = new MMKVLogLevel[]{mMKVLogLevel,mMKVLogLevel1,mMKVLogLevel2,mMKVLogLevel3,mMKVLogLevel4};
       MMKVLogLevel.$VALUES = mMKVLogLevel5;
    }
    public void MMKVLogLevel(String p0,int p1){
       super(p0, p1);
    }
    public static MMKVLogLevel valueOf(String p0){
       return Enum.valueOf(MMKVLogLevel.class, p0);
    }
    public static MMKVLogLevel[] values(){
       return MMKVLogLevel.$VALUES.clone();
    }
}
