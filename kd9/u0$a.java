package kd9.u0$a;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Enum;

public class u0$a	// class@002c6d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CameraFramePageType.values().length];
       try{
          u0$a.a = ointArray;
          ointArray[CameraFramePageType.KTV.ordinal()] = 1;
          try{
             u0$a.a[CameraFramePageType.LIVE_ENTRY.ordinal()] = 2;
             try{
                u0$a.a[CameraFramePageType.PHOTO.ordinal()] = 3;
                try{
                   u0$a.a[CameraFramePageType.LIVE_COVER.ordinal()] = 4;
                   try{
                      u0$a.a[CameraFramePageType.LIVE_AVATAR.ordinal()] = 5;
                      try{
                         u0$a.a[CameraFramePageType.STATE_SHOOT.ordinal()] = 6;
                         try{
                            u0$a.a[CameraFramePageType.FOLLOW_SHOOT.ordinal()] = 7;
                            try{
                               u0$a.a[CameraFramePageType.SAME_FRAME.ordinal()] = 8;
                               try{
                                  u0$a.a[CameraFramePageType.RECORD.ordinal()] = 9;
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
