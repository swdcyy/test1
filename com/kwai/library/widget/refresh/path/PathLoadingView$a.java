package com.kwai.library.widget.refresh.path.PathLoadingView$a;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import java.lang.Enum;

public class PathLoadingView$a	// class@0009dd
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LoadingStyle.values().length];
       try{
          PathLoadingView$a.a = ointArray;
          ointArray[LoadingStyle.GRAY.ordinal()] = 1;
          try{
             PathLoadingView$a.a[LoadingStyle.GRAY_LIGHT.ordinal()] = 2;
             try{
                PathLoadingView$a.a[LoadingStyle.GRAY_DARK.ordinal()] = 3;
                try{
                   PathLoadingView$a.a[LoadingStyle.WHITE.ordinal()] = 4;
                   try{
                      PathLoadingView$a.a[LoadingStyle.GRADIENT.ordinal()] = 5;
                      try{
                         PathLoadingView$a.a[LoadingStyle.CUSTOM.ordinal()] = 6;
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
