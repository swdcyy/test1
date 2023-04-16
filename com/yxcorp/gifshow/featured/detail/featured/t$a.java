package com.yxcorp.gifshow.featured.detail.featured.t$a;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Enum;

public class t$a	// class@000f92
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RefreshType.values().length];
       try{
          t$a.a = ointArray;
          ointArray[RefreshType.BOTTOM_TAB_CLICK.ordinal()] = 1;
          try{
             t$a.a[RefreshType.PULL_DOWN.ordinal()] = 2;
             try{
                t$a.a[RefreshType.BACK_CLICK.ordinal()] = 3;
                try{
                   t$a.a[RefreshType.FOREGROUND2.ordinal()] = 4;
                   try{
                      t$a.a[RefreshType.RESUME.ordinal()] = 5;
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
