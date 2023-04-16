package com.kwai.library.groot.slide.filter.a$a;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import java.lang.Enum;

public class a$a	// class@00083e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SlideMediaType.values().length];
       try{
          a$a.a = ointArray;
          ointArray[SlideMediaType.LIVE.ordinal()] = 1;
          try{
             a$a.a[SlideMediaType.PHOTO.ordinal()] = 2;
             try{
                a$a.a[SlideMediaType.VIDEO.ordinal()] = 3;
                try{
                   a$a.a[SlideMediaType.AUTO_MODE.ordinal()] = 4;
                   try{
                      a$a.a[SlideMediaType.IGNORE_STANDARD_LIVE.ordinal()] = 5;
                      try{
                         a$a.a[SlideMediaType.ALL.ordinal()] = 6;
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
