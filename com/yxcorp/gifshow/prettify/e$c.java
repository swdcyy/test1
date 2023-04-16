package com.yxcorp.gifshow.prettify.e$c;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import java.lang.Enum;

public class e$c	// class@001143
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CameraPageType.values().length];
       try{
          e$c.a = ointArray;
          ointArray[CameraPageType.PHOTO.ordinal()] = 1;
          try{
             e$c.a[CameraPageType.VIDEO.ordinal()] = 2;
             try{
                e$c.a[CameraPageType.WHATS_UP.ordinal()] = 3;
                try{
                   e$c.a[CameraPageType.TIE_TIE.ordinal()] = 4;
                   try{
                      e$c.a[CameraPageType.LIVE_COVER.ordinal()] = 5;
                      try{
                         e$c.a[CameraPageType.LIVE.ordinal()] = 6;
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
