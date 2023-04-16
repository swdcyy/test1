package com.yxcorp.gateway.pay.loading.PathLoadingView$a;
import com.yxcorp.gateway.pay.loading.LoadingStyle;
import java.lang.Enum;

public class PathLoadingView$a	// class@001227
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
