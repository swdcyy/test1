package com.kuaishou.live.gzone.treasurebox.widget.TreasureBoxV2StyleCellView$b;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import java.lang.Enum;

public class TreasureBoxV2StyleCellView$b	// class@001ca9
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveTreasureBoxModel$BoxStatus.values().length];
       try{
          TreasureBoxV2StyleCellView$b.a = ointArray;
          ointArray[LiveTreasureBoxModel$BoxStatus.OPENED.ordinal()] = 1;
          try{
             TreasureBoxV2StyleCellView$b.a[LiveTreasureBoxModel$BoxStatus.WAITING.ordinal()] = 2;
             try{
                TreasureBoxV2StyleCellView$b.a[LiveTreasureBoxModel$BoxStatus.COUNTING_DOWN.ordinal()] = 3;
                try{
                   TreasureBoxV2StyleCellView$b.a[LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN.ordinal()] = 4;
                   try{
                      TreasureBoxV2StyleCellView$b.a[LiveTreasureBoxModel$BoxStatus.OPENING.ordinal()] = 5;
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
