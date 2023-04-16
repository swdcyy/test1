package com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$b;
import com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$WorkMode;
import java.lang.Enum;

public class LiveMmuSoundManager$b	// class@000fc6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMmuSoundManager$WorkMode.values().length];
       try{
          LiveMmuSoundManager$b.a = ointArray;
          ointArray[LiveMmuSoundManager$WorkMode.DETECTING.ordinal()] = 1;
          try{
             LiveMmuSoundManager$b.a[LiveMmuSoundManager$WorkMode.PROCESSING.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
