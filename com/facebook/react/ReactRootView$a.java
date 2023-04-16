package com.facebook.react.ReactRootView$a;
import com.facebook.react.common.LifecycleState;
import java.lang.Enum;

public class ReactRootView$a	// class@00116a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LifecycleState.values().length];
       try{
          ReactRootView$a.a = ointArray;
          ointArray[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
          try{
             ReactRootView$a.a[LifecycleState.BEFORE_RESUME.ordinal()] = 2;
             try{
                ReactRootView$a.a[LifecycleState.RESUMED.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
