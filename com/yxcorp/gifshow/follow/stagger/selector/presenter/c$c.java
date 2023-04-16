package com.yxcorp.gifshow.follow.stagger.selector.presenter.c$c;
import com.yxcorp.gifshow.follow.stagger.selector.FollowFilterAction;
import java.lang.Enum;

public class c$c	// class@001240
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FollowFilterAction.values().length];
       try{
          c$c.a = ointArray;
          ointArray[FollowFilterAction.IMMEDIATE_COLLAPSE.ordinal()] = 1;
          try{
             c$c.a[FollowFilterAction.SMOOTH_COLLAPSE.ordinal()] = 2;
             try{
                c$c.a[FollowFilterAction.SMOOTH_COLLAPSE_NO_RADIO_ANIM.ordinal()] = 3;
                try{
                   c$c.a[FollowFilterAction.SMOOTH_EXPAND.ordinal()] = 4;
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
