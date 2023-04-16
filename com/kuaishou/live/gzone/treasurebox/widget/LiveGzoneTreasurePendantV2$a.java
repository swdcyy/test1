package com.kuaishou.live.gzone.treasurebox.widget.LiveGzoneTreasurePendantV2$a;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import java.lang.Enum;

public class LiveGzoneTreasurePendantV2$a	// class@001ca6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveTreasureBoxModel$BoxStatus.values().length];
       try{
          LiveGzoneTreasurePendantV2$a.a = ointArray;
          ointArray[LiveTreasureBoxModel$BoxStatus.WAITING.ordinal()] = 1;
          try{
             LiveGzoneTreasurePendantV2$a.a[LiveTreasureBoxModel$BoxStatus.COUNTING_DOWN.ordinal()] = 2;
             try{
                LiveGzoneTreasurePendantV2$a.a[LiveTreasureBoxModel$BoxStatus.OPENED.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
