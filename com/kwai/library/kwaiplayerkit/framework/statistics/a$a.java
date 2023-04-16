package com.kwai.library.kwaiplayerkit.framework.statistics.a$a;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Enum;

public class a$a	// class@00088e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PlayerState.values().length];
       try{
          a$a.a = ointArray;
          ointArray[PlayerState.Idle.ordinal()] = 1;
          try{
             a$a.a[PlayerState.Released.ordinal()] = 2;
             try{
                a$a.a[PlayerState.Error.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
