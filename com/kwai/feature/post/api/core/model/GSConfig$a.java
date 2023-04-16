package com.kwai.feature.post.api.core.model.GSConfig$a;
import com.kwai.feature.post.api.core.model.GSConfig$SizeType;
import java.lang.Enum;

public class GSConfig$a	// class@001306
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GSConfig$SizeType.values().length];
       try{
          GSConfig$a.a = ointArray;
          ointArray[GSConfig$SizeType.PHOTO_MOVIE.ordinal()] = 1;
          try{
             GSConfig$a.a[GSConfig$SizeType.SINGLE_PICTURE.ordinal()] = 2;
             try{
                GSConfig$a.a[GSConfig$SizeType.PICTURES.ordinal()] = 3;
                try{
                   GSConfig$a.a[GSConfig$SizeType.IMPORTED_VIDEO.ordinal()] = 4;
                   try{
                      GSConfig$a.a[GSConfig$SizeType.VIDEO.ordinal()] = 5;
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
