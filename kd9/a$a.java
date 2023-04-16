package kd9.a$a;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Enum;

public class a$a	// class@002c44
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CameraFramePageType.values().length];
       try{
          a$a.a = ointArray;
          ointArray[CameraFramePageType.KTV.ordinal()] = 1;
          try{
             a$a.a[CameraFramePageType.LIVE_ENTRY.ordinal()] = 2;
             try{
                a$a.a[CameraFramePageType.PHOTO.ordinal()] = 3;
                try{
                   a$a.a[CameraFramePageType.LIVE_AVATAR.ordinal()] = 4;
                   try{
                      a$a.a[CameraFramePageType.STATE_SHOOT.ordinal()] = 5;
                      try{
                         a$a.a[CameraFramePageType.LIVE_COVER.ordinal()] = 6;
                         try{
                            a$a.a[CameraFramePageType.FOLLOW_SHOOT.ordinal()] = 7;
                            try{
                               a$a.a[CameraFramePageType.SAME_FRAME.ordinal()] = 8;
                               try{
                                  a$a.a[CameraFramePageType.RECORD.ordinal()] = 9;
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
