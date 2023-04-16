package com.kuaishou.krn.model.KrnBundleLoadInfo$a;
import com.kuaishou.krn.model.LoadingStateTrack$LoadType;
import java.lang.Enum;

public class KrnBundleLoadInfo$a	// class@0008ff
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LoadingStateTrack$LoadType.values().length];
       try{
          KrnBundleLoadInfo$a.a = ointArray;
          ointArray[LoadingStateTrack$LoadType.PRE_BASIC_BUNDLE.ordinal()] = 1;
          try{
             KrnBundleLoadInfo$a.a[LoadingStateTrack$LoadType.PRE_BUSINESS_BUNDLE.ordinal()] = 2;
             try{
                KrnBundleLoadInfo$a.a[LoadingStateTrack$LoadType.NORMAL_BUSINESS_BUNDLE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
