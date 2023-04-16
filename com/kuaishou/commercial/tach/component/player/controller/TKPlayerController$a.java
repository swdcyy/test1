package com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$a;
import com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$PlayerDataType;
import java.lang.Enum;

public class TKPlayerController$a	// class@001672
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TKPlayerController$PlayerDataType.values().length];
       try{
          TKPlayerController$a.a = ointArray;
          ointArray[TKPlayerController$PlayerDataType.Q_PHOTO.ordinal()] = 1;
          try{
             TKPlayerController$a.a[TKPlayerController$PlayerDataType.URL.ordinal()] = 2;
             try{
                TKPlayerController$a.a[TKPlayerController$PlayerDataType.FILE_PATH.ordinal()] = 3;
                try{
                   TKPlayerController$a.a[TKPlayerController$PlayerDataType.ASSET.ordinal()] = 4;
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
