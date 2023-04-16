package com.yxcorp.gifshow.visible.PhotoVisibilityController$b;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import java.lang.Enum;

public class PhotoVisibilityController$b	// class@0016b1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PhotoVisibility.values().length];
       try{
          PhotoVisibilityController$b.a = ointArray;
          ointArray[PhotoVisibility.PUBLIC.ordinal()] = 1;
          try{
             PhotoVisibilityController$b.a[PhotoVisibility.PRIVATE.ordinal()] = 2;
             try{
                PhotoVisibilityController$b.a[PhotoVisibility.FRIENDS.ordinal()] = 3;
                try{
                   PhotoVisibilityController$b.a[PhotoVisibility.PART_INVISIBLE.ordinal()] = 4;
                   try{
                      PhotoVisibilityController$b.a[PhotoVisibility.PART_VISIBLE.ordinal()] = 5;
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
