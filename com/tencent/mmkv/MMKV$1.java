package com.tencent.mmkv.MMKV$1;
import com.tencent.mmkv.MMKVLogLevel;
import java.lang.Enum;

public class MMKV$1	// class@000fdb
{
    public static final int[] $SwitchMap$com$tencent$mmkv$MMKVLogLevel;

    static {
       int[] ointArray = new int[MMKVLogLevel.values().length];
       try{
          MMKV$1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel = ointArray;
          ointArray[MMKVLogLevel.LevelDebug.ordinal()] = 1;
          try{
             MMKV$1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelWarning.ordinal()] = 2;
             try{
                MMKV$1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelError.ordinal()] = 3;
                try{
                   MMKV$1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelNone.ordinal()] = 4;
                   try{
                      MMKV$1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelInfo.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
