package com.yxcorp.gifshow.follow.stagger.d$a;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Enum;

public class d$a	// class@001164
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PhotoType.values().length];
       try{
          d$a.a = ointArray;
          ointArray[PhotoType.IMAGE.ordinal()] = 1;
          try{
             d$a.a[PhotoType.VIDEO.ordinal()] = 2;
             try{
                d$a.a[PhotoType.LIVESTREAM.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
