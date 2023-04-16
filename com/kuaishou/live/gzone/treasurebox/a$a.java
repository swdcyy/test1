package com.kuaishou.live.gzone.treasurebox.a$a;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import java.lang.Enum;

public class a$a	// class@001c53
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveTreasureBoxModel$BoxStatus.values().length];
       try{
          a$a.a = ointArray;
          ointArray[LiveTreasureBoxModel$BoxStatus.OPENED.ordinal()] = 1;
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
