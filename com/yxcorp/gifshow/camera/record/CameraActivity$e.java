package com.yxcorp.gifshow.camera.record.CameraActivity$e;
import com.yxcorp.gifshow.edit.draft.DraftUtils$DraftRecoverFlag;
import java.lang.Enum;

public class CameraActivity$e	// class@001c89
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DraftUtils$DraftRecoverFlag.values().length];
       try{
          CameraActivity$e.a = ointArray;
          ointArray[DraftUtils$DraftRecoverFlag.EDIT.ordinal()] = 1;
          try{
             CameraActivity$e.a[DraftUtils$DraftRecoverFlag.CREATE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
