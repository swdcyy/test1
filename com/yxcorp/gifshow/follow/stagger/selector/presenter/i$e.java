package com.yxcorp.gifshow.follow.stagger.selector.presenter.i$e;
import com.yxcorp.gifshow.follow.stagger.selector.FollowFilterAction;
import java.lang.Enum;

public class i$e	// class@00124b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FollowFilterAction.values().length];
       try{
          i$e.a = ointArray;
          ointArray[FollowFilterAction.SMOOTH_EXPAND.ordinal()] = 1;
          try{
             i$e.a[FollowFilterAction.SMOOTH_COLLAPSE.ordinal()] = 2;
             try{
                i$e.a[FollowFilterAction.IMMEDIATE_COLLAPSE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
