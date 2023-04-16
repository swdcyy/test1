package com.yxcorp.gifshow.camera.record.followshoot.FollowShootActivity$b;
import com.yxcorp.gifshow.edit.draft.DraftUtils$DraftRecoverFlag;
import java.lang.Enum;

public class FollowShootActivity$b	// class@000dc3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DraftUtils$DraftRecoverFlag.values().length];
       try{
          FollowShootActivity$b.a = ointArray;
          ointArray[DraftUtils$DraftRecoverFlag.EDIT.ordinal()] = 1;
          try{
             FollowShootActivity$b.a[DraftUtils$DraftRecoverFlag.CREATE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
