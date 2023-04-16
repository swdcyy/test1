package com.smile.gifmaker.mvps.presenter.PresenterV2$a;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import java.lang.Enum;

public class PresenterV2$a	// class@000c22
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PresenterStateMachine$PresenterState.values().length];
       try{
          PresenterV2$a.a = ointArray;
          ointArray[PresenterStateMachine$PresenterState.INIT.ordinal()] = 1;
          try{
             PresenterV2$a.a[PresenterStateMachine$PresenterState.CREATE.ordinal()] = 2;
             try{
                PresenterV2$a.a[PresenterStateMachine$PresenterState.BIND.ordinal()] = 3;
                try{
                   PresenterV2$a.a[PresenterStateMachine$PresenterState.UNBIND.ordinal()] = 4;
                   try{
                      PresenterV2$a.a[PresenterStateMachine$PresenterState.DESTROY.ordinal()] = 5;
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
