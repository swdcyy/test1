package com.yxcorp.gifshow.camera.record.sameframe.SameFrameActivity$b;
import com.yxcorp.gifshow.edit.draft.DraftUtils$DraftRecoverFlag;
import java.lang.Enum;

public class SameFrameActivity$b	// class@000f00
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DraftUtils$DraftRecoverFlag.values().length];
       try{
          SameFrameActivity$b.a = ointArray;
          ointArray[DraftUtils$DraftRecoverFlag.EDIT.ordinal()] = 1;
          try{
             SameFrameActivity$b.a[DraftUtils$DraftRecoverFlag.CREATE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
