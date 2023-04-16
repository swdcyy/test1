package com.yxcorp.gifshow.camera.record.frame.c$c;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Enum;

public class c$c	// class@000ddb
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CameraFramePageType.values().length];
       try{
          c$c.a = ointArray;
          ointArray[CameraFramePageType.FOLLOW_SHOOT.ordinal()] = 1;
          try{
             c$c.a[CameraFramePageType.KTV.ordinal()] = 2;
             try{
                c$c.a[CameraFramePageType.RECORD.ordinal()] = 3;
                try{
                   c$c.a[CameraFramePageType.SAME_FRAME.ordinal()] = 4;
                   try{
                      c$c.a[CameraFramePageType.PHOTO.ordinal()] = 5;
                      try{
                         c$c.a[CameraFramePageType.LIVE_ENTRY.ordinal()] = 6;
                         try{
                            c$c.a[CameraFramePageType.LIVE_COVER.ordinal()] = 7;
                            try{
                               c$c.a[CameraFramePageType.LIVE_AVATAR.ordinal()] = 8;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
