package com.kuaishou.live.gzone.treasurebox.presenter.r$g;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel$BoxListTipsStatus;
import java.lang.Enum;

public class r$g	// class@001c98
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TreasureBoxCommonModel$BoxListTipsStatus.values().length];
       try{
          r$g.a = ointArray;
          ointArray[TreasureBoxCommonModel$BoxListTipsStatus.LOADING.ordinal()] = 1;
          try{
             r$g.a[TreasureBoxCommonModel$BoxListTipsStatus.FAILED.ordinal()] = 2;
             try{
                r$g.a[TreasureBoxCommonModel$BoxListTipsStatus.UN_LOGIN.ordinal()] = 3;
                try{
                   r$g.a[TreasureBoxCommonModel$BoxListTipsStatus.EMPTY.ordinal()] = 4;
                   try{
                      r$g.a[TreasureBoxCommonModel$BoxListTipsStatus.SUCCESS.ordinal()] = 5;
                      try{
                         r$g.a[TreasureBoxCommonModel$BoxListTipsStatus.NONE.ordinal()] = 6;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
