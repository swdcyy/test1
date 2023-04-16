package com.yxcorp.gifshow.follow.slide.detail.data.f$a;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Enum;

public class f$a	// class@00110a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PhotoType.values().length];
       try{
          f$a.a = ointArray;
          ointArray[PhotoType.VIDEO.ordinal()] = 1;
          try{
             f$a.a[PhotoType.IMAGE.ordinal()] = 2;
             try{
                f$a.a[PhotoType.LIVESTREAM.ordinal()] = 3;
                try{
                   f$a.a[PhotoType.REMINDER_FRIEND_PYMK_BIGCARD_FEED.ordinal()] = 4;
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
