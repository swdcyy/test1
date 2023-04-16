package com.yxcorp.gifshow.camera.record.frame.n$a;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Enum;

public class n$a	// class@000dec
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CameraFramePageType.values().length];
       try{
          n$a.a = ointArray;
          ointArray[CameraFramePageType.FOLLOW_SHOOT.ordinal()] = 1;
          try{
             n$a.a[CameraFramePageType.KTV.ordinal()] = 2;
             try{
                n$a.a[CameraFramePageType.SAME_FRAME.ordinal()] = 3;
                try{
                   n$a.a[CameraFramePageType.LIVE_COVER.ordinal()] = 4;
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
