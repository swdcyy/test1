package com.facebook.imagepipeline.core.ImagePipeline$i;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import java.lang.Enum;

public class ImagePipeline$i	// class@0010f6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ImageRequest$CacheChoice.values().length];
       try{
          ImagePipeline$i.a = ointArray;
          ointArray[ImageRequest$CacheChoice.DEFAULT.ordinal()] = 1;
          try{
             ImagePipeline$i.a[ImageRequest$CacheChoice.SMALL.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
