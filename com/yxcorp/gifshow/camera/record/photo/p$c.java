package com.yxcorp.gifshow.camera.record.photo.p$c;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.lang.Enum;

public class p$c	// class@000ef7
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TakePictureType.values().length];
       try{
          p$c.a = ointArray;
          ointArray[TakePictureType.SHOOT_IMAGE.ordinal()] = 1;
          try{
             p$c.a[TakePictureType.LIVE_ENTRY.ordinal()] = 2;
             try{
                p$c.a[TakePictureType.LIVE_PLAY.ordinal()] = 3;
                try{
                   p$c.a[TakePictureType.SEND_IMAGE.ordinal()] = 4;
                   try{
                      p$c.a[TakePictureType.MOMENT.ordinal()] = 5;
                      try{
                         p$c.a[TakePictureType.PROFILE.ordinal()] = 6;
                         try{
                            p$c.a[TakePictureType.SHARE.ordinal()] = 7;
                            try{
                               p$c.a[TakePictureType.LIVE_AVATAR.ordinal()] = 8;
                               try{
                                  p$c.a[TakePictureType.STATE_IMAGE.ordinal()] = 9;
                                  try{
                                     p$c.a[TakePictureType.MIX.ordinal()] = 10;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
