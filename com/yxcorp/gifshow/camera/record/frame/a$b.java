package com.yxcorp.gifshow.camera.record.frame.a$b;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Enum;

public class a$b	// class@000dd6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CameraFramePageType.values().length];
       try{
          a$b.a = ointArray;
          ointArray[CameraFramePageType.SAME_FRAME.ordinal()] = 1;
          try{
             a$b.a[CameraFramePageType.KTV.ordinal()] = 2;
             try{
                a$b.a[CameraFramePageType.RECORD.ordinal()] = 3;
                try{
                   a$b.a[CameraFramePageType.FOLLOW_SHOOT.ordinal()] = 4;
                   try{
                      a$b.a[CameraFramePageType.LIVE_AVATAR.ordinal()] = 5;
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
