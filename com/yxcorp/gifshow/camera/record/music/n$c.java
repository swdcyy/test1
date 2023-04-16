package com.yxcorp.gifshow.camera.record.music.n$c;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Enum;

public class n$c	// class@000e88
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MusicType.values().length];
       try{
          n$c.a = ointArray;
          ointArray[MusicType.KARA.ordinal()] = 1;
          try{
             n$c.a[MusicType.LIP.ordinal()] = 2;
             try{
                n$c.a[MusicType.BGM.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
