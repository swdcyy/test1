package com.yxcorp.gifshow.music.utils.CloudMusicViewFactory$a;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory$ElementType;
import java.lang.Enum;

public class CloudMusicViewFactory$a	// class@002089
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CloudMusicViewFactory$ElementType.values().length];
       try{
          CloudMusicViewFactory$a.a = ointArray;
          ointArray[CloudMusicViewFactory$ElementType.FAVORITE.ordinal()] = 1;
          try{
             CloudMusicViewFactory$a.a[CloudMusicViewFactory$ElementType.SCISSORS.ordinal()] = 2;
             try{
                CloudMusicViewFactory$a.a[CloudMusicViewFactory$ElementType.DELETE.ordinal()] = 3;
                try{
                   CloudMusicViewFactory$a.a[CloudMusicViewFactory$ElementType.OFFLINE.ordinal()] = 4;
                   try{
                      CloudMusicViewFactory$a.a[CloudMusicViewFactory$ElementType.RETRY.ordinal()] = 5;
                      try{
                         CloudMusicViewFactory$a.a[CloudMusicViewFactory$ElementType.BILLBOARD.ordinal()] = 6;
                         try{
                            CloudMusicViewFactory$a.a[CloudMusicViewFactory$ElementType.TAG.ordinal()] = 7;
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
